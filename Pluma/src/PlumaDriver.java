import java.awt.*;

public class PlumaDriver {
public static void main (String[]args) {
    Pluma pen = new Pluma("bic", "Abc", Color.BLACK, "fina");
    System.out.println(pen);
    pen.escribir();
  }

 }
