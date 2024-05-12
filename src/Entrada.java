public class Entrada {
    /*
    public static void main(String[] args) {
        Coche coche1 = new Coche("Ford", "Focus", 100);
        Coche coche2 = new Coche("Wolkswagen", "Golf", 120);

        coche1.acelerar(50);
        coche2.acelerar(60);

        coche1.mostrarDatos();
        coche2.mostrarDatos();

        if (coche1.getKm() > coche2.getKm()) {
            System.out.println("El ganador es el coche 1");
        } else if (coche1.getKm() < coche2.getKm()) {
            System.out.println("El ganador es el coche 2");
        } else {
            System.out.println("Es un empate");
        }

        // Simulación de la carrera
        while (coche1.getKm() < 100000 && coche2.getKm() < 100000) {
            coche1.acelerar(10);
            coche2.acelerar(10);
        }
    }
}