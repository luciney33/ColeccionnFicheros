import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//PARA ESCRIBIR Y GUARDAR UNA COPIA DE SEGURIDAD DEL FICHERO
public class GestionFicheros {
    public static void escribirFichero(String fichero, List<Mascota> lista)  {
        PrintWriter escribir = null;// con el new abre el fichero
        try {
            escribir = new PrintWriter(fichero);
        } catch (FileNotFoundException e) {
            System.out.println("No se puede escribir el fichero, no se pudo encontrar");
        }
        for (int i = 0; i < lista.size(); i++) {
            escribir.println(lista.get(i).toStringFichero()); //tostring modificado en mascotas
            escribir.close();// SI o SI cerrarlo en cada fichero que se toque
        }

    }
    // PARA LEER FICHERO Y GUARDAR UNA COPIA DE SEGURIDAD DEL FICHERO
    public static List<Mascota> leerFichero(String fichero){
        List<Mascota> lista = new ArrayList<Mascota>();
        try {
            Scanner leer = new Scanner(new File(fichero));
            while (leer.hasNextLine()) { // hay otra linea?
                String linea = leer.nextLine();
                lista.add(new Mascota(linea));//pues entonces lees
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        }
        return lista;
    }
}
