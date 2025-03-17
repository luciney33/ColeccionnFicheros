public class Main {
    public static void main(String[] args) {
        Mascotas misMascotas = new Mascotas();
        System.out.println(misMascotas);
        //misMascotas.listar("gato"); // para que me liste con gato solo
        misMascotas.ordenar();
        System.out.println(misMascotas);
        GestionFicheros.escribirFichero(Constantes.MASCOTAS_FILE, misMascotas.getMascotas());

    }
}