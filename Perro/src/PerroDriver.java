import java.awt.*;

public class PerroDriver {

    public static void main(String[]args){

        Perro perrito = new Perro("Chihuahua", "Chico", Color.DARK_GRAY);
        System.out.println(perrito);
        perrito.ladrar();
        System.out.println(perrito.dormir());
        perrito.comer();
    }

}
