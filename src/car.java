package feature;

class car{
    public String color;
    public String marca;
    public String modelo;

    public car() {}

    public car(String color, String marca, String modelo) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }
    public void acelerate() {
        System.out.println("Acelerando");
    }
    public void stop() {
        System.out.println("Stop");
    }
}
