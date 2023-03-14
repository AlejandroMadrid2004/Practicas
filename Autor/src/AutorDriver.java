public class AutorDriver {

    public static void main(String[]args) {
        Autor autor = new Autor("Stephen King", "Richard Bachman", "E.U");
        System.out.println(autor);
        autor.escribir();
        autor.promociones();
    }

}
