
import java.awt.*;

public class Perro {


    //Atributos
    private String raza;
    private String tamaño;
    private Color color;

    //Contructor por defecto
    public Perro() {
    }

    //Constructor sobrecargado
    public Perro(String raza, String tamaño, Color color) {
        this.raza = raza;
        this.tamaño = tamaño;
        this.color = color;
    }

    //Getters and Setters
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    //ToString
    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                ", tamaño='" + tamaño + '\'' +
                ", color=" + color +
                '}';
    }

    //Metodos
    public void ladrar(){
        boolean ladrar = Math.random() > 0.5;
        if(ladrar == true){
            System.out.println("El perro esta ladrando...");
        }else{
            System.out.println("El perro no esta ladrando");
        }
    }

    public int dormir(){
        int sleepEntero = 5;
        System.out.print("El perro a dormido: " + sleepEntero);
        return sleepEntero;
    }

    public void comer(){
        boolean comiendo = Math.random() > 0.5;
        if(comiendo == true){
            System.out.println("El perro a comido...");
        }else{
            System.out.println("El perro NO a comido...");
        }
    }


}
