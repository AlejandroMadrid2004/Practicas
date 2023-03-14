public class Libro {

    //Atributos

    private String titulo;
    private String precio;
    private String sinopsis;

    //Contructor por defecto
    public Libro() {
    }

    //Constructor sobrecargado
    public Libro(String titulo, String precio, String sinopsis) {
        this.titulo = titulo;
        this.precio = precio;
        this.sinopsis = sinopsis;
    }

    //Getters and Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    //ToString
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio='" + precio + '\'' +
                ", sinopsis='" + sinopsis + '\'' +
                '}';
    }

    //Metodos
    public void guardar(){
        System.out.println("El libro a sido guardado");
    }

}
