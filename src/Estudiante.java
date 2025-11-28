public class Estudiante {
    private String nombre;
    private int idEstudiante;
    private int calificacionActual;

    public Estudiante(String nombre, int idEstudiante, int calificacionActual){
        this.nombre = nombre;
        this.idEstudiante = idEstudiante;
        this.calificacionActual = calificacionActual;
    }

    public void mostrarMensajeBienvenida(){
        System.out.println("Bienvenido: "+ nombre + " ID: "+ idEstudiante + " Tu calificacion Acasdatual es: "+ calificacionActual+"%");
    }
    public boolean verificarSiAprobado(){

        return AyudanteEstudiante.esCalificacionAprobatoria(calificacionActual);
    }
    public String obtenerMensajeMotivacional(){
        return AyudanteEstudiante.obtenerMensajeCalificacion(calificacionActual);
    }
    public void actualizarCalificacion(int nuevaCalificacion){
        this.calificacionActual = nuevaCalificacion;
    }
}
