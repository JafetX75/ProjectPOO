import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        int x, y, N, LogAbc, x3, l,N2 = 0;
        String abcd = "abcdefghijklmnñopqrstuvwxyz";
        String Text;
        char[] Cesar = new char[27];

        System.out.println("Escribe el texto a cifrar");
        Text = S.nextLine();

        char[] abc = abcd.toCharArray();
        char[] Car = Text.toCharArray();
        x = Text.length();
        LogAbc = abcd.length();
        for(y = 0; y<x; y++){
            System.out.println(Car[y]);
        }

        //Cambio de position de palabras
        System.out.println("Escribe el numero de cambio de posicion de letras: ");
        x3 = S.nextInt();

        for(N = 0; N<LogAbc; N++){
            System.out.println(abc[N]);
            abc[N] = Cesar[N2 + x3];
            Cesar[N2] = abc[N];
        }
        for(int x4 = 0;x4<LogAbc;x4++){
            System.out.println("letras: \n" + abc[x4]);
        }
        do{
            l = 0;
            System.out.println("Modificacion"+abc[l]);
            l = l+1;
        }while(l== LogAbc);
   }
}