package ProgramacionOrientadaAObjetosPractica.auto;

import javax.swing.*;

public class Auto {

  private String color;
  private int rueda;
  private String modelo;

    public Auto() {
    }

    public Auto(String modelo){
        this.modelo = modelo;
    }

    public Auto(String modelo, String color){
        this(modelo);// this.modelo = modelo;
        this.color = color;
    }

    public Auto(String modelo, String color, int cantidadRuedas){
        this(modelo, color);
        this.rueda = cantidadRuedas;
    }

    public void setColor(String color){
        this.color = color;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setRueda(int rueda){
        this.rueda = rueda;
    }

    public String getModelo(){
        return color;
    }
    public String getColor(){
        return modelo;
    }
    public int getRueda(){
        return rueda;
    }

    public String detalleAuto(){
        return  "El auto tiene el color " + color +
                " Posee " +  rueda +  "  ruedas " +
                " Y su modelo es " + modelo;
    }


}

