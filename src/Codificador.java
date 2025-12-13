import java.util.Arrays;
public class Codificador {
    //Variables para guardar el mensaje y la distancia
    private String mensaje;
    private int numeroPosicion;

    public Codificador(String mensaje, int numeroPosicion){
        this.mensaje = mensaje;
        this.numeroPosicion = numeroPosicion;
    }
    //Metodo que elimina lo innecesario en el mensaje como (Espacios, tabs, etc)
    private static void eliminarCaracteres(){

    }
    //Parte que codigica el mensaje
    private String Codificador(){

        //Creamos variables para almacenar la longitud del abcedario y 3 contadores
         int abcLongitud, menLongitud, contaMen = 0, contaAbc = 0;
         //le agrege dos veces el avecedario por que si escribimo un z y espacio 3 da error por que ya no hay nada despues de eso
         String abcd = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
         //Array en donde guardaremos el mensaje y el abcedario
         char[] caracAbc;
         char[] caracMen;

         //Volvemos el mensaje en minusculas
        mensaje = mensaje.toLowerCase();


        //mensaje = mensaje.trim();
        //Guardammos el num de caracteres del abc
        abcLongitud = abcd.length();
        //Guardamos el num de carecteres del mensaje
        menLongitud = mensaje.length();
        //Aqui guardamos los contenido de estas dos variables en el Array de tipo caracter
        caracAbc =  abcd.toCharArray();
        caracMen = mensaje.toCharArray();
        //Creamos una variable en donde guardaremos el mensaje ya encriptado
        char[] codifiMen = new char[menLongitud];

        //Hacemos un ciclo para recorrer todo el array donde guardamos el mensaje

        do{
            //Aqui validamos si la primera letra es la que buscamos si a = a
            if(caracAbc[contaAbc] == caracMen[contaMen]){
                //Si encontro la letra, este agarra el valor de el contarAbc y le suma el numero de posicion que elegimos para recorrer; para despues guardarlo en el array <-
                //-> llamado codifiMen.
                codifiMen[contaMen] = caracAbc[contaAbc + numeroPosicion];

                //Reinicia el abc para que empiece desde a de nuevo
                contaAbc = 0;
                //Aumenta 1 cada vez que se cumple para guardar el caracter en otro espacio y tambien aunmenta para cuando llegue al valor de la cant de caract del nmensaje
                contaMen++;

            }
            //Si no se cumple pasa al otro valor guardado ejem: pasa de un A a un B asi consecutivamente hasta que se cumpla la condisional
            else{
                contaAbc++;
            }
        }
        //El ciclo solo termina hasta haber pasado por la el numero de ceracteres que tiene el mensaje
        while(contaMen < menLongitud);
        //Aqui regresamo convertimos el array en un String para devolver el mensaje
        return Arrays.toString(codifiMen);
    }
    //Aqui obtenemos el mensaje del metodo y lo enviamos al usuario sin llamar al metodo Codificacion directamente.
    public String getmensaje(){
        return Codificador();
    }
}
