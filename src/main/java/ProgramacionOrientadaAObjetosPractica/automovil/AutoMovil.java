package ProgramacionOrientadaAObjetosPractica.automovil;

public class AutoMovil {

    private String modelo;
    private String color;
    private int cantidadDeRuedas;
    private int capacidadTanque = 50;
    private int kmRecorrido;
    private boolean ruedaAuxilio = true;
    private int velocidadMax = 180;

    //////////////////////
    //SETER.

    public void setModelo(String modeloMain) {
        this.modelo = modeloMain;
    }
    public void setColor(String colorMain){
        this.color = colorMain;
    }
    public void setCantidadDeRuedas(int ruedasMain){
        this.cantidadDeRuedas = ruedasMain;
    }
    public void setCapacidadTanque(int tanqueMain){
        this.capacidadTanque = tanqueMain;
    }
    public void setKmRecorrido(int kmMain){
        this.kmRecorrido = kmMain;
    }
    public void setRuedaAuxilio(boolean ruedaAuxilioMain){
        this.ruedaAuxilio = ruedaAuxilioMain;
    }

   public void setVelocidadMax(int velocidadMaxMain){
        this.velocidadMax = velocidadMaxMain;
   }


   ////////////////
    //GETER


    public String getModelo() {
        return modelo;
    }
    public String getColor(){
        return color;
    }
    public int getCantidadDeRuedas(){
        return cantidadDeRuedas;
    }
    public int getCapacidadTanque(){
        return capacidadTanque;
    }
    public int getKmRecorrido() {
        return kmRecorrido;
    }
    public boolean getruedadAuxilio(){
        return ruedaAuxilio;
    }

    public int getVelocidadMax(){
        return velocidadMax;
    }

    /////////////////////////////////////////////////////////////////
    //CONSTRUCTOR

    public AutoMovil(){

    }

    public boolean encenderAuto(){
        if(capacidadTanque == 50){
            return false;
        }else {
            return true;
        }
    }


    public void cargarNafta(int naftaCargar){
        this.capacidadTanque = this.capacidadTanque - naftaCargar;
        System.out.println("La capacidad del tanque es : " + this.capacidadTanque);
        System.out.println("ingresando al metodo cargar nafta");
    }

}
