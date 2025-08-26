
package com.mycompany.gymits.logica;

import java.time.LocalTime;


public class Supervisor extends Profesor{
    
    private LocalTime turnoACargo;
    private String insASupervisar;

    public Supervisor() {
    }

    
    public Supervisor(int idProfesor, int cedulaProf, String nombreProf, String direccionProf, String emailProf, String especialidadProf, LocalTime horarioProf, int sueldoProf) {
        super(idProfesor, cedulaProf, nombreProf, direccionProf, emailProf, especialidadProf, horarioProf, sueldoProf);
    }

    public Supervisor(LocalTime turnoACargo, String insASupervisar) {
        this.turnoACargo = turnoACargo;
        this.insASupervisar = insASupervisar;
    }

    public LocalTime getTurnoACargo() {
        return turnoACargo;
    }

    public void setTurnoACargo(LocalTime turnoACargo) {
        this.turnoACargo = turnoACargo;
    }

    public String getInsASupervisar() {
        return insASupervisar;
    }

    public void setInsASupervisar(String insASupervisar) {
        this.insASupervisar = insASupervisar;
    }
    
    
    
}
