package practico_3.Kata4;

public class Gallina {
    private static int idContador=0;
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina (int edad, int huevosPuestos){
        idContador++;
        //this.idContador=idContador++;
        this.idGallina=idContador;
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

