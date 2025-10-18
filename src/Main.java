
public class Main {
    public static void main(String[] args) {
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
