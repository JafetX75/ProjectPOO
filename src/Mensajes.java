import java.util.Scanner;


public class Mensajes {

    Scanner entrada = new Scanner(System.in);

    private String mensaje;
    private int numeroPosicion;

    public String getmensaje(){
        return mensaje;
    }
    public int getnumeroPosicion(){
        return numeroPosicion;
    }
    public void datosMensaje(){
        System.out.println("Ingrensa el mensaje a codificar: ");
        mensaje = entrada.nextLine();

        System.out.println("Ingrensa el numero de posicio a recorrer: ");
        numeroPosicion = entrada.nextInt();
    }



}
