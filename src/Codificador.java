import java.util.Arrays;
public class Codificador {
    Mensajes mnj = new Mensajes();

    private String mensaje;
    private int numeroPosicion;

    public Codificador(String mensaje, int numeroPosicion){
        this.mensaje = mensaje;
        this.numeroPosicion = numeroPosicion;
    }
    private String Codificador(){
         int abcLongitud, menLongitud, contaMen = 0, contaAbc = 0;
         String abcd = "abcdefghijklmnñopqrstuvwxyz";
         char[] caracAbc;
         char[] caracMen;

        mensaje = mensaje.toLowerCase();
        abcLongitud = abcd.length();
        menLongitud = mensaje.length();
        caracAbc =  abcd.toCharArray();
        caracMen = mensaje.toCharArray();
        char[] codifiMen = new char[menLongitud];


        System.out.println();
        do{
            if(caracAbc[contaAbc] == caracMen[contaMen]){
                codifiMen[contaMen] = caracAbc[contaAbc + numeroPosicion];

                contaAbc = 0;
                contaMen++;

            }else{
                contaAbc++;
            }
        }while(contaMen < menLongitud);
        return Arrays.toString(codifiMen);
    }
    public String getmensaje(){
        return Codificador();
    }
}
