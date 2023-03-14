public class Editorial {


    //Atributos
    private String nombre;
    private String pais;
    private String direccion;

    //Contructor por defecto
    public Editorial() {
    }


    //Constructor sobrecargado
    public Editorial(String nombre, String pais, String direccion) {
        this.nombre = nombre;
        this.pais = pais;
        this.direccion = direccion;
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //ToString
    @Override
    public String toString() {
        return "Editorial{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    //Metodos

    public void Publicar(){

        boolean publicar = Math.random() > 0.5;
        if(publicar == true) {
            System.out.println("Se ha publicado un libro...");
        }else{
            System.out.println("NO se ha publicado ningun libro...");
        }
    }

    public void Vender(){
        boolean vendido = Math.random() > 0.5;
        if(vendido == true){
            System.out.println("Se ha vendido un libro...");
        }else{
            System.out.println("N0 se ha vendido ningun libro...");
        }


    }

}
