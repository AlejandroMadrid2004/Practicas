public class Autor {

    //Atributos
    private String nombre;
    private String pseudonimo;
    private String pais;

    //Contructor por defecto
    public Autor() {
    }

    //Constructor sobrecargado
    public Autor(String nombre, String pseudonimo, String pais) {
        this.nombre = nombre;
        this.pseudonimo = pseudonimo;
        this.pais = pais;
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPseudonimo() {
        return pseudonimo;
    }

    public void setPseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    //ToString
    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", pseudonimo='" + pseudonimo + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }

    //Metodos
    public void escribir(){
        System.out.println("El autor esta escribiendo...");
    }

    public void promociones(){
        System.out.println("El autor esta promocionando su libro");
    }

}
