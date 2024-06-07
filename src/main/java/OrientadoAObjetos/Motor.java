package OrientadoAObjetos;

public class Motor {
    private double cilindrada;
    private MotorTipo tipo;

    public Motor(double cilindrada, MotorTipo tipo) {
        this.cilindrada = cilindrada;
        this.tipo = tipo;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public MotorTipo getTipo() {
        return tipo;
    }

    public void setTipo(MotorTipo tipo) {
        this.tipo = tipo;
    }
}
