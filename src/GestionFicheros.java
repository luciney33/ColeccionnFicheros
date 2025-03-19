import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Se encarga de la gestión de archivos.
Tiene un método escribirFichero(String fichero, List<Mascota> lista) que escribe una lista de mascotas en un archivo de texto.
Tiene un método leerFichero(String fichero) que lee un archivo y devuelve una lista de objetos Mascota.*/


//PARA ESCRIBIR Y GUARDAR UNA COPIA DE SEGURIDAD DEL FICHERO
public class GestionFicheros {
    public static void escribirFichero(String fichero, List<Mascota> lista)  {
        PrintWriter escribir = null;
        try {
            escribir = new PrintWriter(fichero); //con el new abre el fichero
            for (int i = 0; i < lista.size(); i++) {
                escribir.println(lista.get(i).toStringFichero()); //tostring modificado en mascota
                escribir.close();// SI o SI cerrarlo en cada fichero que se toque
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se puede escribir el fichero, no se pudo encontrar");
        }
    }

    // PARA LEER FICHERO Y GUARDAR UNA COPIA DE SEGURIDAD DEL FICHERO
    public static List<Mascota> leerFichero(String fichero){
        List<Mascota> lista = new ArrayList<Mascota>();
        try {
            Scanner leer = new Scanner(new File(fichero));
            while (leer.hasNextLine()) { // hay otra linea?
                String linea = leer.nextLine();//pues entonces lees
                lista.add(new Mascota(linea));//y la añades
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        }
        return lista;
    }
}
