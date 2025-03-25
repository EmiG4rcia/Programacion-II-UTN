package practico_3.Kata2;

public class Main {
    public static void main(String[] args) {
        Mascota m1 = new Mascota("princesa","araña",7);

        m1.mostrarInfo();
        m1.cumpliranios();
        //volvemos a llamar a mostrarinfo() luego de aumentar la edad
        m1.mostrarInfo();
    }
}
