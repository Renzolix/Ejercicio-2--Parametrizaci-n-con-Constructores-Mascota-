public class Mascota {
    String nombre;
    String especie;
    int edad;

    // Constructor explícito parametrizado
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public static void main(String[] args) {
        // Instanciación invocando al constructor parametrizado
        Mascota mascota1 = new Mascota("Firulais", "Perro", 4);
        Mascota mascota2 = new Mascota("Mishuca", "Gato", 2);
        Mascota mascota3 = new Mascota("Paco", "Loro", 5);

        // Impresión utilizando String.format()
        System.out.println(String.format("Mascota 1: %s es un %s y tiene %d años.", mascota1.nombre, mascota1.especie, mascota1.edad));
        System.out.println(String.format("Mascota 2: %s es un %s y tiene %d años.", mascota2.nombre, mascota2.especie, mascota2.edad));
        System.out.println(String.format("Mascota 3: %s es un %s y tiene %d años.", mascota3.nombre, mascota3.especie, mascota3.edad));
    }
}