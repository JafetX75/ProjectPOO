import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ManejoArchivosTexto archivosTexto = new ManejoArchivosTexto();
        ManejoArchivosBinarios archivosBinarios = new ManejoArchivosBinarios();

        archivosTexto.leerArchivo("hola2.txt");
        archivosTexto.escribirArchivo("hola2.txt", "hola mundo");


        ObjetoX objx = new ObjetoX(1,Math.random(), "Nada");

        archivosBinarios.writeObjectToFile(objx,"ArchivoBinario.bin");

        ObjetoX obj2 = (ObjetoX) archivosBinarios.readObjectFromFile("ArchivoBinario.bin");
        obj2.mostrarContenido();

        int num;
        String mn,mnCifrado;
        Mensajes Msj = new Mensajes();
        Msj.datosMensaje();

        mn = Msj.getmensaje();
        num = Msj.getnumeroPosicion();

        Codificador Cod = new Codificador(mn, num);

        mnCifrado = Cod.getmensaje();

        System.out.println(mnCifrado);



    }
}
