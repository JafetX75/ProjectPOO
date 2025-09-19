import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int x4 = 0;
        int y2 = 0;
        int y3 = 0;
        int y4 = 0;
        int y5 = 0;
        int y6 = 0,y7 = 0;
        String abcd = "abcdefghijklmnñopqrstuvwxyz";
        System.out.println("Escribe el texto a cifrar");
        String Text = S.nextLine();
        Text = Text.toLowerCase();
        char[] Car = new char[27];
        char[] abc = abcd.toCharArray();
        Car = Text.toCharArray();
        int x = Text.length();
        int LogAbc = abcd.length();
        char[] abc2 = new char[LogAbc];
        char[] NewChar = new char[x];

        for(int y = 0; y < x; ++y) {
            System.out.println(Car[y]);
        }

        System.out.println("Escribe el numero de cambio de posicion de letras: ");
        int x3 = S.nextInt();
        y2 = x3;
        System.out.println(y2);

        do {
            if (abc[y3] == Car[x4]) {
                System.out.println("Se a encontrado la primera letra letras creo : " + Car[x4] + "Con: " + abc[y3]);

                NewChar[y5] = abc[y6];
                y6 = y3 + y2;
                System.out.println("LELTRA: " + NewChar[y5]);
                y3 = 0;
                ++x4;
                ++y4;
                ++y5;
            } else {
                System.out.println("NO se encontraron " + Car[x4] + abc[y3] + x4 + y3);
                ++y3;
                ++y7;
            }
        } while(y4 < x);

    }
}
