import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        int num;
        String mn,mnCifrado;
        Mensajes Msj = new Mensajes();
        Msj.datosMensaje();

        mn = Msj.getmensaje();
        num = Msj.getnumeroPosicion();

        Codificador Cod = new Codificador(mn, num);

        mnCifrado = Cod.getmensaje();

        System.out.println(mnCifrado);

        ManejoArchivosTexto archivosTexto = new ManejoArchivosTexto();
        ManejoArchivosBinarios archivosBinarios = new ManejoArchivosBinarios();

        archivosTexto.leerArchivo("mensajeEncriptado.txt");
        archivosTexto.escribirArchivo("mensajeEncriptado.txt", mnCifrado);

        ObjetoX objx = new ObjetoX(1,Math.random(), mnCifrado);
        System.out.println("Este es el binario Escribir");

        archivosBinarios.writeObjectToFile(objx,"ArchivoBinario.bin");

        ObjetoX obj2 = (ObjetoX) archivosBinarios.readObjectFromFile("ArchivoBinario.bin");
        System.out.println("Este es el binario read");
        obj2.mostrarContenido();
    }
}
