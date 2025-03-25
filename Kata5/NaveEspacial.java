package practico_3.Kata5;

public class NaveEspacial {
    String nombre;
    int combustible;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }
    public void despegar(){
        if(combustible<10){
            System.out.println("No se puede despegar");
        }else {
            System.out.println("despegue iniciado");
            combustible-=10;
        }
    }
    public void avanzar(int distancia){
        if (combustible<distancia){
            System.out.println("No se puede avanzar "+distancia+" unidades de distancia debido a falta de combustible.");

        }else{
            System.out.println("Nave avanzando "+distancia+" unidades de distancia.");
            combustible-=distancia;
        }
    }

    public void recargarCombustible(int cantidad){
        combustible+=cantidad;
        if(combustible>100){
            combustible=100;
        }

    }
    public String mostrarEstado(){
        return ("Nave: "+nombre+"\nCantidad de combustible disponible actualmente: "+combustible);
    }
}
