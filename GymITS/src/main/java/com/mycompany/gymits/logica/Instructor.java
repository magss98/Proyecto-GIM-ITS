
package com.mycompany.gymits.logica;

import java.time.LocalTime;


public class Instructor extends Profesor{
    
    private String disciplinas;

    public Instructor() {
    }

    public Instructor(int idProfesor, int cedulaProf, String nombreProf, String direccionProf, String emailProf, String especialidadProf, LocalTime horarioProf, int sueldoProf) {
        super(idProfesor, cedulaProf, nombreProf, direccionProf, emailProf, especialidadProf, horarioProf, sueldoProf);
    }

    public Instructor(String disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    
    
    
    
}
