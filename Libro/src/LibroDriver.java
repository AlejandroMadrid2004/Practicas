public class LibroDriver {

    public static void main(String[]args) {
        Libro book = new Libro("La divina comedia", "$300", "Sigue el camino desde el centro de la tierran, donde se halla Lucifer, hasta el dominio de dios");
        System.out.println(book);
        book.guardar();
    }

}
