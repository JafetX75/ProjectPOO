import java.io.Serializable;

public class ObjetoX implements Serializable {
    private static final long serialVersionUID = 1L;

    private int idObjeto;
    private double numeroRandom;
    private String cadena;

    public ObjetoX(int idObjeto, double numeroRandom, String cadena){
        this.idObjeto = idObjeto;
        this.numeroRandom = numeroRandom;
        this.cadena = cadena;
    }

    public void mostrarContenido(){
        System.out.println(idObjeto);
        System.out.println(numeroRandom);
        System.out.println(cadena);
    }

}
