package practico_3.Kata5;

public class Main {
    public static void main(String[] args) {
        NaveEspacial n1 = new NaveEspacial("Ishimura",50);
        //inciso 3
        n1.avanzar(60);
        //inciso 4
        n1.recargarCombustible(40);
        //inciso 5
        n1.avanzar(60);
        //inciso 6
        System.out.println("Cargando diagnóstico del estado de la Nave...\n"+n1.mostrarEstado()+"\n \nCerrando diagnóstico... \n");

        //Segunda Nave
        NaveEspacial n2 = new NaveEspacial("Enterprise",5);
        n2.despegar();
        n2.recargarCombustible(70);
        n2.avanzar(47);
        n2.avanzar(50);
        System.out.println("Cargando diagnóstico del estado de la Nave...\n"+n2.mostrarEstado()+"\n \nCerrando diagnóstico... \n");
    }
}
