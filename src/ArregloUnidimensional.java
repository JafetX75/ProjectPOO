public class ArregloUnidimensional {

    private int[] arreglo;

    public void llenarCeros(){
        for(int i = 0; i< arreglo.length; i++){
            arreglo[i] = 0;
        }
    }
    public void mostrarArreglo(){
        for(int y = 0; y< arreglo.length; y++){
            System.out.println(arreglo[y]);
        }
    }
}
