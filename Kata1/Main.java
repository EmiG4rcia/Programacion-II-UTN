package practico_3.Kata1;

public class Main {
    public static void main(String[] args) {
        Estudiante mohamed = new Estudiante("Mohamed","Silvestre","Matematica",8.7);

        mohamed.mostrarInfo();
        System.out.println("calificacion subida: "+mohamed.subirCalificacion(1.1));
        System.out.println("calificacion bajada: "+mohamed.bajarCalificacion(7.3));
    }
}
