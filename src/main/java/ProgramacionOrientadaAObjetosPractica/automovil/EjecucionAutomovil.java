package ProgramacionOrientadaAObjetosPractica.automovil;

public class EjecucionAutomovil {
    public static void main(String[] args) {


        AutoMovil honda = new AutoMovil();

        boolean enciende = honda.encenderAuto();

        if (!enciende){
            honda.cargarNafta(30);
        }




    }

}
