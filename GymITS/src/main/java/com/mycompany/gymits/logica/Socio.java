
package com.mycompany.gymits.logica;

import java.util.Date;

public class Socio {
    
    private int idSocio;
    private String tipoSocio;
    private int cedulaSocio;
    private String nombreSocio;
    private String direccionSocio;
    private int telSocio;
    private String emailSocio;
    private Date fechaInicio;
    private int contEmergenciaSocio;
    private String enfermedadesSocio;
    private String nombreRef;
    private int cedulaRef;
    private int telRef;

    public Socio() {
    }

    public Socio(int idSocio, String tipoSocio, int cedulaSocio, String nombreSocio, String direccionSocio, int telSocio, String emailSocio, Date fechaInicio, int contEmergenciaSocio, String enfermedadesSocio, String nombreRef, int cedulaRef, int telRef) {
        this.idSocio = idSocio;
        this.tipoSocio = tipoSocio;
        this.cedulaSocio = cedulaSocio;
        this.nombreSocio = nombreSocio;
        this.direccionSocio = direccionSocio;
        this.telSocio = telSocio;
        this.emailSocio = emailSocio;
        this.fechaInicio = fechaInicio;
        this.contEmergenciaSocio = contEmergenciaSocio;
        this.enfermedadesSocio = enfermedadesSocio;
        this.nombreRef = nombreRef;
        this.cedulaRef = cedulaRef;
        this.telRef = telRef;
    }

    public int getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    public String getTipoSocio() {
        return tipoSocio;
    }

    public void setTipoSocio(String tipoSocio) {
        this.tipoSocio = tipoSocio;
    }

    public int getCedulaSocio() {
        return cedulaSocio;
    }

    public void setCedulaSocio(int cedulaSocio) {
        this.cedulaSocio = cedulaSocio;
    }

    public String getNombreSocio() {
        return nombreSocio;
    }

    public void setNombreSocio(String nombreSocio) {
        this.nombreSocio = nombreSocio;
    }

    public String getDireccionSocio() {
        return direccionSocio;
    }

    public void setDireccionSocio(String direccionSocio) {
        this.direccionSocio = direccionSocio;
    }

    public int getTelSocio() {
        return telSocio;
    }

    public void setTelSocio(int telSocio) {
        this.telSocio = telSocio;
    }

    public String getEmailSocio() {
        return emailSocio;
    }

    public void setEmailSocio(String emailSocio) {
        this.emailSocio = emailSocio;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getContEmergenciaSocio() {
        return contEmergenciaSocio;
    }

    public void setContEmergenciaSocio(int contEmergenciaSocio) {
        this.contEmergenciaSocio = contEmergenciaSocio;
    }

    public String getEnfermedadesSocio() {
        return enfermedadesSocio;
    }

    public void setEnfermedadesSocio(String enfermedadesSocio) {
        this.enfermedadesSocio = enfermedadesSocio;
    }

    public String getNombreRef() {
        return nombreRef;
    }

    public void setNombreRef(String nombreRef) {
        this.nombreRef = nombreRef;
    }

    public int getCedulaRef() {
        return cedulaRef;
    }

    public void setCedulaRef(int cedulaRef) {
        this.cedulaRef = cedulaRef;
    }

    public int getTelRef() {
        return telRef;
    }

    public void setTelRef(int telRef) {
        this.telRef = telRef;
    }


}
