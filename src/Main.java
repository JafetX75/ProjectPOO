
public class Main {
    public static void main(String[] args) {
       // AyudanteEstudiante AyudanteEStudiante = new AyudaEstudiante();
        System.out.println("Es 85 Calificacion aprobatoria: " + AyudanteEstudiante.esCalificacionAprobatoria(85));

        System.out.println(AyudanteEstudiante.obtenerMensajeCalificacion(85));
        AyudanteEstudiante.imprimirRecordatorioEstudio();
        System.out.println("El puntuaje promedio es " + AyudanteEstudiante.calcularPromedio(85,85,85));

        Estudiante Estudiante1 = new Estudiante("Yael", 251,60);
        Estudiante Estudiante2 = new Estudiante("Ivan",25,75);
        Estudiante1.mostrarMensajeBienvenida();
        System.out.println("¿Yael está aprobado? " + Estudiante1.verificarSiAprobado());
        System.out.println("Mensaje motivacional para Yael: "+Estudiante1.obtenerMensajeMotivacional());
        Estudiante1.actualizarCalificacion(80);
        System.out.println("=== DESPUÉS DE ACTUALIZAR LA CALIFICACIÓN  ===");
        Estudiante1.mostrarMensajeBienvenida();
        System.out.println("¿Yael está aprobado? " + Estudiante1.verificarSiAprobado());
        System.out.println("Mensaje motivacional para Yael: "+Estudiante1.obtenerMensajeMotivacional());

        System.out.println("===   ===");

        Estudiante2.mostrarMensajeBienvenida();
        System.out.println("¿Ivan está aprobado? " + Estudiante2.verificarSiAprobado());
        System.out.println("Mensaje motivacional para Ivan: "+Estudiante2.obtenerMensajeMotivacional());
        Estudiante2.actualizarCalificacion(90);
        System.out.println("=== DESPUÉS DE ACTUALIZAR LA CALIFICACIÓN  ===");
        Estudiante2.mostrarMensajeBienvenida();
        System.out.println("¿Ivan está aprobado? " + Estudiante2.verificarSiAprobado());
        System.out.println("Mensaje motivacional para Ivan: "+Estudiante2.obtenerMensajeMotivacional());

   }
}