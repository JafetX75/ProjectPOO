public class AyudanteEstudiante {

    public static boolean esCalificacionAprobatoria(int calificacion){
        if(calificacion >= 70){
            return true;
        }else{
            return false;
        }
    }
    public static String obtenerMensajeCalificacion(int calificacion){
        if(calificacion >= 90){
            return "Exelente";
        }else if(calificacion > 70 && calificacion < 90){
            return "Buen Trabajo";
        }else{
            return "Necesitas estudiar mas";
        }
    }
    public static void imprimirRecordatorioEstudio(){
        System.out.println("¡Recuerda repasar tus apuntes y practicar programación a diario!");
    }
    public static double calcularPromedio(double puntuaje1, double puntuaje2, double puntuaje3) {
        return (puntuaje1 + puntuaje2 + puntuaje3)/3;
    }


}
