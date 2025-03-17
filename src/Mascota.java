import java.util.Random;

public class Mascota implements Comparable<Mascota>{
    private String nombre;
    private int edad;
    private String especie;
    public Mascota() {
        Random rand = new Random();
        this.nombre = Constantes.NOMBRES[rand.nextInt(Constantes.NOMBRES.length)];
        this.edad = rand.nextInt(15);
        this.especie = Constantes.ESPECIES[rand.nextInt(Constantes.ESPECIES.length)];
    }
    public Mascota(String linea) { // para encontar
        String[] tokens = linea.split(";");
        this.nombre = tokens[0];
        this.edad = Integer.parseInt(tokens[1]);
        this.especie = tokens[2];
    }
    public Mascota(String nombre, int edad, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", especie='" + especie + '\'' +
                '}'+"\n";
    }

    public String toStringFichero() {
        return nombre + ";" + edad + ";" + especie;
    }

    @Override
    public int compareTo(Mascota mascota) {
        return Integer.compare(this.getEdad(), mascota.getEdad());// eso es por edad pero podria ser por especie, nombre
    }
}
