/*Es el punto de entrada del programa.
Crea una instancia de Mascotas, imprime la lista, la ordena por edad y guarda los datos en un archivo usando GestionFicheros.*/
public class Main {
    public static void main(String[] args) {
        Mascotas misMascotas = new Mascotas();
        System.out.println(misMascotas);
        //misMascotas.listar("gato"); para que me liste cada gato solo
        misMascotas.ordenar();
        System.out.println(misMascotas);
        GestionFicheros.escribirFichero(Constantes.MASCOTAS_FILE, misMascotas.getMascotas());

    }
}