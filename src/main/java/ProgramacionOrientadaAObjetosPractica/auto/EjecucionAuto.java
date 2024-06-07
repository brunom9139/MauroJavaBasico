package ProgramacionOrientadaAObjetosPractica.auto;

import ProgramacionOrientadaAObjetosPractica.auto.Auto;

public class EjecucionAuto {
    public static void main(String[] args) {


        Auto honda= new Auto();

        honda.setColor("Azul");
        honda.setModelo("civic");
        honda.setRueda(4);

        System.out.println("Color = " + honda.getColor());
        System.out.println("Modelo = " + honda.getModelo());
        System.out.println("Ruedas = " + honda.getRueda());
        System.out.println("Informacion gral = " + honda.detalleAuto());
        System.out.println("##########################################");
        System.out.println("##########################################");
        System.out.println("##########################################");
        System.out.println("##########################################");


        Auto fiat = new Auto("Chronos");
        fiat.setColor("Rojo");
        fiat.setRueda(4);
        System.out.println("Modelo = " + fiat.getModelo());
        System.out.println("Color = " + fiat.getColor());
        System.out.println("Ruedas " + fiat.getRueda());
        System.out.println("Informacion gral " + fiat.detalleAuto());
        System.out.println("##########################################");


        Auto palio = new Auto("polio", "blanco");
        palio.setRueda(4);
        System.out.println("Modelo = " + palio.getModelo());
        System.out.println("Color = " + palio.getColor());
        System.out.println("Ruedas = " + palio.getRueda());
        System.out.println("Detalle gral = " + palio.detalleAuto());
        System.out.println("##########################################");



        Auto honda2 = new Auto("Supra", "Blanco", 4);
        System.out.println("Modelo = " + honda2.getModelo());
        System.out.println("Color = " + honda2.getColor());
        System.out.println("Rueda = " + honda2.getRueda());
        System.out.println("Informacion gral = " + honda2.detalleAuto());
    }
}
