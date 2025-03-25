package practico_3.Kata4;

public class Main {
    public static void main(String[] args) {
        Gallina g1 =new Gallina(2,7);
        Gallina g2 = new Gallina(1,4);
        for (int i = 0;i<3;i++){
            g1.ponerHuevo();
            g2.ponerHuevo();
        }
        g1.envejecer();
        g2.envejecer();

        System.out.println("Gallina 1: \n"+g1.mostrarEstado()+"\nGallina 2: \n"+g2.mostrarEstado());
    }
}
