package OrientadoAObjetos;

public class Deportivo {

    private static int capacidadTanqueStatic;
    private String fabricante = "";
    private String modelo = "";
    private Color color = Color.ROJO;
    private Motor motor;
    private Tanque tanque;
    private Persona persona;
    private TipoAuto tipo;
    private static double capacidadTanqueEstatic = 40;

    private static String colorPatente = "Blanco";

    public static final int VELOCIDAD_MAXIMA_RUTA = 180;

    public static final int VELOCIDAD_MAXIMA_CIUDAD = 70;




    public Deportivo(String fabricante) {
        this.fabricante = fabricante;
    }

    public Deportivo(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }


    public Deportivo(String fabricante, String modelo, Color color){
        this(fabricante, modelo);
        this.color = color;

    }

    public Deportivo(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public Deportivo(String fabricante, String modelo, Color color, Motor motor, Tanque capacidadTanque) {
        this(fabricante, modelo, color, motor);
        this.tanque = tanque;
    }

    public Deportivo(String fabricante, String modelo, Color color, Motor motor, Tanque tanque, Persona persona, TipoAuto tipo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
        this.tanque = tanque;
        this.persona = persona;
        this.tipo = tipo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor(String s) {
        return color;
    }

    public void setColor(Color color) {this.color = color;
    }

    public Motor getMotor(double v) {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Tanque getCapacidadTanque() {
        return tanque;
    }

    public void setCapacidadTanque(Tanque capacidadTanque) {
        this.tanque = capacidadTanque;
    }

    public static String getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(String colorPatente) {
        Deportivo.colorPatente = colorPatente;
    }

    public TipoAuto getTipo() {
        return tipo;
    }

    public void setTipo(TipoAuto tipo) {
        this.tipo = tipo;
    }

    public String detalle(){
       return "Fabricante del auto : " + this.fabricante +
               "\n Modelo del auto : " + this.modelo +
               "\n Tipo auto : " + this.getTipo().getDescripcion() +
               "\n Con su color : " + this.color +
               "\n Y su motor de : " + this.motor +
               "\n patente de color : " + Deportivo.colorPatente;
   }


   public String acelera(int rpm){
       return "El auto " + modelo + " acelera a " + rpm + "rpm";
   }
   public String frenando(){
       return fabricante  +  modelo + " Frenando!";
   }
   public String acelerarFrenar(int rpm){
       String acelerar = this.acelera(4000);
       String frenar = this.frenando();
       return acelerar + "\n" + frenar;
   }
    public float calcularConsumoEstatico(int km, int porcentajeNafta){
        return km/(Deportivo.capacidadTanqueStatic*(porcentajeNafta/100f));
    }
    @Override
    public boolean equals(Object obj) {
        Deportivo a = (Deportivo) obj;
        return (this.fabricante.equals(a.getFabricante()) && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return this.fabricante + " " + this.modelo;
    }
}
