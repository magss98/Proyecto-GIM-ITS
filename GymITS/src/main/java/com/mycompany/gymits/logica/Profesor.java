
package com.mycompany.gymits.logica;

import java.time.LocalTime;

public class Profesor {
    
    private int idProfesor;
    private int cedulaProf;
    private String nombreProf;
    private String direccionProf;
    private String emailProf;
    private String especialidadProf;
    private LocalTime horarioProf;
    private int sueldoProf;

    public Profesor() {
    }

    public Profesor(int idProfesor, int cedulaProf, String nombreProf, String direccionProf, String emailProf, String especialidadProf, LocalTime horarioProf, int sueldoProf) {
        this.idProfesor = idProfesor;
        this.cedulaProf = cedulaProf;
        this.nombreProf = nombreProf;
        this.direccionProf = direccionProf;
        this.emailProf = emailProf;
        this.especialidadProf = especialidadProf;
        this.horarioProf = horarioProf;
        this.sueldoProf = sueldoProf;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public int getCedulaProf() {
        return cedulaProf;
    }

    public void setCedulaProf(int cedulaProf) {
        this.cedulaProf = cedulaProf;
    }

    public String getNombreProf() {
        return nombreProf;
    }

    public void setNombreProf(String nombreProf) {
        this.nombreProf = nombreProf;
    }

    public String getDireccionProf() {
        return direccionProf;
    }

    public void setDireccionProf(String direccionProf) {
        this.direccionProf = direccionProf;
    }

    public String getEmailProf() {
        return emailProf;
    }

    public void setEmailProf(String emailProf) {
        this.emailProf = emailProf;
    }

    public String getEspecialidadProf() {
        return especialidadProf;
    }

    public void setEspecialidadProf(String especialidadProf) {
        this.especialidadProf = especialidadProf;
    }

    public LocalTime getHorarioProf() {
        return horarioProf;
    }

    public void setHorarioProf(LocalTime horarioProf) {
        this.horarioProf = horarioProf;
    }

    public int getSueldoProf() {
        return sueldoProf;
    }

    public void setSueldoProf(int sueldoProf) {
        this.sueldoProf = sueldoProf;
    }
    
    
    
    
}
