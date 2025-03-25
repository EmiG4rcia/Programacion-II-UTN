package practico_3.Kata3;

public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro("Sherlock Holmes", "Arthur Conan Doyle",1897);

        System.out.println("Libro: "+l1.getTitulo());
        System.out.println("Autor:"+l1.getAutor());
        System.out.println("Año  de publicación: "+l1.getAnioPublicacion()+"\nSe produce el primer cambio de año de publicación: ");
        l1.setAnioPublicacion(1899);
        //Modificación Inválida
        System.out.println("Año de publicación: "+l1.getAnioPublicacion()+"\n Se produce el segundo cambio de año de publicación: ");
        l1.setAnioPublicacion(1997);
        //Modificación válida
        System.out.println("Año de publicación: "+l1.getAnioPublicacion());
    }
}
