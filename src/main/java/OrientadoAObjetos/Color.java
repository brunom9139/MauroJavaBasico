package OrientadoAObjetos;

public enum Color {
    BLANCO("Blanco"),
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    VERDE("Verde"),
    AZUL("Azul"),
    GRIS("Gris");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
