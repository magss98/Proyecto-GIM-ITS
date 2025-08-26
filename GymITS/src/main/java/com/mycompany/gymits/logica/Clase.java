
package com.mycompany.gymits.logica;

import java.time.LocalTime;

public class Clase {
    
    private String tipoDeClaseAdultos;
    private String tipoDeClaseMenores;
    private String instructorCargo;
    private LocalTime horario;
    private int cuposMaximos;

    public Clase() {
    }

    public Clase(String tipoDeClaseAdultos, String tipoDeClaseMenores, String instructorCargo, LocalTime horario, int cuposMaximos) {
        this.tipoDeClaseAdultos = tipoDeClaseAdultos;
        this.tipoDeClaseMenores = tipoDeClaseMenores;
        this.instructorCargo = instructorCargo;
        this.horario = horario;
        this.cuposMaximos = cuposMaximos;
    }

    public String getTipoDeClaseAdultos() {
        return tipoDeClaseAdultos;
    }

    public void setTipoDeClaseAdultos(String tipoDeClaseAdultos) {
        this.tipoDeClaseAdultos = tipoDeClaseAdultos;
    }

    public String getTipoDeClaseMenores() {
        return tipoDeClaseMenores;
    }

    public void setTipoDeClaseMenores(String tipoDeClaseMenores) {
        this.tipoDeClaseMenores = tipoDeClaseMenores;
    }

    public String getInstructorCargo() {
        return instructorCargo;
    }

    public void setInstructorCargo(String instructorCargo) {
        this.instructorCargo = instructorCargo;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public int getCuposMaximos() {
        return cuposMaximos;
    }

    public void setCuposMaximos(int cuposMaximos) {
        this.cuposMaximos = cuposMaximos;
    }
    
    
    
}
