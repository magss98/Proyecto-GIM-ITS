#!/bin/bash

DB="socios.db"

# Función para mostrar el menú
menu() {
    echo "===== GESTIÓN DE SOCIOS ====="
    echo "1. Alta de socio"
    echo "2. Baja de socio"
    echo "3. Modificación de socio"
    echo "4. Consulta de socio"
    echo "5. Listar todos"
    echo "6. Salir"
    echo "============================="
}

# Función para dar de alta un socio
alta() {
    read -p "Cédula: " cedula
    if grep -q "^$cedula|" "$DB"; then
        echo "❌ El socio con cédula $cedula ya existe."
        return
    fi

    read -p "Nombre: " nombre
    read -p "Dirección: " direccion
    read -p "Teléfonos: " telefonos
    read -p "E-mail: " email
    read -p "Tipo de socio (adulto/liceal/escolar/preescolar): " tipo
    read -p "Fecha de inicio de membresía (AAAA-MM-DD): " fecha
    read -p "Contacto de emergencia (nombre - teléfono): " emergencia
    read -p "Información médica (enfermedades, alergias, lesiones): " medica

    if [[ "$tipo" != "adulto" ]]; then
        echo "Socio menor de edad. Se requieren datos de referente adulto."
        read -p "Nombre del referente: " ref_nombre
        read -p "Cédula del referente: " ref_cedula
        read -p "Teléfono del referente: " ref_tel
    else
        ref_nombre="N/A"
        ref_cedula="N/A"
        ref_tel="N/A"
    fi

    read -p "Carné de salud al día (si/no): " carne

    # Guardamos todo en el archivo
    echo "$cedula|$nombre|$direccion|$telefonos|$email|$tipo|$fecha|$emergencia|$medica|$ref_nombre|$ref_cedula|$ref_tel|$carne" >> "$DB"
    echo "✅ Socio agregado con éxito."
}

# Función para baja de socio
baja() {
    read -p "Cédula a eliminar: " cedula
    if grep -q "^$cedula|" "$DB"; then
        grep -v "^$cedula|" "$DB" > tmp.db && mv tmp.db "$DB"
        echo "🗑️ Socio eliminado."
    else
        echo "❌ No existe socio con esa cédula."
    fi
}

# Función para modificación de socio
modificacion() {
    read -p "Cédula del socio a modificar: " cedula
    if ! grep -q "^$cedula|" "$DB"; then
        echo "❌ No existe socio con esa cédula."
        return
    fi

    # Eliminamos el registro anterior
    grep -v "^$cedula|" "$DB" > tmp.db && mv tmp.db "$DB"
    echo "⚠️ Ingrese los nuevos datos:"
    alta
}

# Función para consulta
consulta() {
    read -p "Cédula a consultar: " cedula
    if grep -q "^$cedula|" "$DB"; then
        grep "^$cedula|" "$DB" | awk -F"|" '{
            print "Cédula: " $1
            print "Nombre: " $2
            print "Dirección: " $3
            print "Teléfonos: " $4
            print "E-mail: " $5
            print "Tipo de socio: " $6
            print "Fecha inicio: " $7
            print "Emergencia: " $8
            print "Información médica: " $9
            print "Referente adulto: " $10 " (Cédula: " $11 ", Tel: " $12 ")"
            print "Carné de salud: " $13
        }'
    else
        echo "❌ No existe socio con esa cédula."
    fi
}

# Función para listar todos
listar() {
    echo "📋 Listado de socios:"
    awk -F"|" '{print $1 " - " $2 " (" $6 ")"}' "$DB"
}

# Loop principal
while true; do
    menu
    read -p "Seleccione una opción: " opcion
    case $opcion in
        1) alta ;;
        2) baja ;;
        3) modificacion ;;
        4) consulta ;;
        5) listar ;;
        6) echo "👋 Saliendo..."; break ;;
        *) echo "❌ Opción inválida." ;;
    esac
done

