
package com.mycompany.gymits.logica;


public class ActividadMenor {
    
    private String basket = "Basket";
    private String gimnasia = "Gimnasia";
    private String babyFootball = "Baby FootBall";
    private String danza = "Danza";
    private String natacion = "Natacion";
    private String categoria;

    public ActividadMenor(String categoria) {
        this.categoria = categoria;
    }

    public ActividadMenor() {
    }

    public String getBasket() {
        return basket;
    }

    public void setBasket(String basket) {
        this.basket = basket;
    }

    public String getGimnasia() {
        return gimnasia;
    }

    public void setGimnasia(String gimnasia) {
        this.gimnasia = gimnasia;
    }

    public String getBabyFootball() {
        return babyFootball;
    }

    public void setBabyFootball(String babyFootball) {
        this.babyFootball = babyFootball;
    }

    public String getDanza() {
        return danza;
    }

    public void setDanza(String danza) {
        this.danza = danza;
    }

    public String getNatacion() {
        return natacion;
    }

    public void setNatacion(String natacion) {
        this.natacion = natacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
    
    
}
