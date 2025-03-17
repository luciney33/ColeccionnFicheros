import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Mascotas {
    private List<Mascota> mascotas; // se pone list y no arraylist, porque puede que queramos crear una instancia de vector, arraylist...
    public Mascotas() {
        File file = new File(Constantes.MASCOTAS_FILE);
        if (file.exists()) {
            mascotas = GestionFicheros.leerFichero(Constantes.MASCOTAS_FILE);
        }else {
            mascotas = new ArrayList<Mascota>();
            for (int i = 0; i < 10; i++) {
                mascotas.add(new Mascota());
            }
        }
    }
    public List<Mascota> getMascotas() {
        return mascotas;
    }
    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
    public void listar(String especie){
        for (int i = 0; i < mascotas.size(); i++) {
            if (mascotas.get(i).getEspecie().equalsIgnoreCase(especie)) {
                System.out.println(mascotas.get(i).toString());
            }
        }
    }
    public void modificarMascota(String nombre){
        for (int i = 0; i < mascotas.size(); i++) {
            if (mascotas.get(i).getNombre().equalsIgnoreCase(nombre)) {
                mascotas.set(i, new Mascota());// cambiar el animal
                mascotas.get(i).setEdad(mascotas.get(i).getEdad() + 1); //cambiar la edad de una animal
            }
        }
    }
    public void ordenar(){
        //Arrays.sort(Lista)
        Collections.sort(mascotas);
    }

    @Override
    public String toString() {
        return "Mascotas{" +
                "mascotas=" + mascotas +
                '}';
    }
}
