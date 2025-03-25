package practico_3.Kata2;

public class Mascota {
    String nombre;
    String especie;
    int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarInfo(){
        System.out.println("nombre: "+nombre+"\nespecie: "+especie+"\nedad: "+edad);
    }
    public void  cumpliranios(){
        edad++;
    }
}
