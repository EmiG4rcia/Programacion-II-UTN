package practico_3.Kata4;

public class Gallina {
    static int idGallina=0;
    private int edad;
    private int huevosPuestos;

    public Gallina (int edad, int huevosPuestos){
        idGallina++;
        this.edad=edad;
        this.huevosPuestos=huevosPuestos;
    }
    public void ponerHuevo(){
        huevosPuestos++;
    }
    public void envejecer(){
        edad++;
    }
    public String mostrarEstado(){
        return ("idGallina: "+idGallina+"\nEdad de la gallina: "+edad+"\nHuevos puestos: "+huevosPuestos);
    }
}

