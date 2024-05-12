import java.util.Random;

class Coche {
    private String modelo;
    private String marca;
    private int cv;
    private int velocidad;
    private double km;

    public Coche(String modelo, String marca, int cv) {
        this.modelo = modelo;
        this.marca = marca;
        this.cv = cv;
        this.velocidad = 0;
        this.km = 0;
    }

    public void acelerar(int cantidad) {
        this.velocidad += cantidad;
        if (this.velocidad > 180) {
            this.velocidad = 180;
        }
        Random rand = new Random();
        this.km += this.velocidad * (this.cv * (rand.nextInt(10) + 1));
    }

    public void frenar(int cantidad) {
        this.velocidad -= cantidad;
        if (this.velocidad < 0) {
            this.velocidad = 0;
        }
    }

    public void resetear() {
        this.velocidad = 0;
        this.km = 0;
    }

    public void mostrarDatos() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Marca: " + this.marca);
        System.out.println("CV: " + this.cv);
        System.out.println("Velocidad: " + this.velocidad);
        System.out.println("KM: " + this.km);
    }

    public double getKm() {
        return this.km;
    }
}