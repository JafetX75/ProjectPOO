import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        int x, y, N, LogAbc, x3,N2, x4 = 0;

        String abcd = "abcdefghijklmnñopqrstuvwxyz";
        String Text;

        System.out.println("Escribe el texto a cifrar");
        Text = S.nextLine();

        char[] abc = abcd.toCharArray();
        char[] Car = Text.toCharArray();

        x = Text.length();
        LogAbc = abcd.length();
        char[] abc2 = new char[LogAbc];
        for(y = 0; y<x; y++){
            System.out.println(Car[y]);
        }

        //Cambio de position de palabras
        System.out.println("Escribe el numero de cambio de posicion de letras: ");
        x3 = S.nextInt();

        x4 = x4+x3;

        System.out.println(x4);

        try{
            for(N = 0;N<LogAbc;N++){
                abc[N] = abc2[x4];
                x4 = x4+1;
            }
        }catch (Exception e){
            System.out.println("Hola");
        }
        System.out.println("hola "+ abc[0]);
        for(N2 = 0;N2<LogAbc;N2++){

            System.out.println("hola "+ abc2[N2]);

        }
        //Encriptacion

   }
}