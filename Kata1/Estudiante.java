package practico_3.Kata1;

public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    double calificacion;

    public Estudiante(String nombre, String apellido, String curso, double calificacion){
        this.nombre=nombre;
        this.apellido=apellido;
        this.curso=curso;
        this.calificacion=calificacion;
    }

    public void mostrarInfo(){
        System.out.println("apellido: "+apellido+"\nnombre: "+nombre+"\ncurso: "+curso+"\ncalificación: "+calificacion);

    }
    public double subirCalificacion(double puntos){
       double resultado;
       resultado=calificacion+puntos;
        if ((calificacion+puntos)>10){
            resultado=10;
        }
        return resultado;
    }
    public double bajarCalificacion(double puntos){
        double resultado;
        resultado=calificacion-puntos;
        if((calificacion-puntos)<=0){
            resultado=0;
        }
        return resultado;
    }
}
