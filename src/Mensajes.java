import java.util.Scanner;

public class Mensajes {
    Scanner Entrada = new Scanner(System.in);
    //atributos
    private String Mensaje;
    private int Numero;

    public void Mensaje(){
        System.out.println("Escribe el mensaje a cifrar: ");
        Mensaje = Entrada.nextLine();

        System.out.println("Escribe el numero de posicion");
        Numero = Entrada.nextInt();


    }
}
