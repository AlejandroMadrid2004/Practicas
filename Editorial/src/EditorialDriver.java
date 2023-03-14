public class EditorialDriver {

    public static void main(String[]args) {

        Editorial ed = new Editorial("DEBOLSILLO", "México", "Blvd. Miguel de Cervantes Saavedra 301 piso 1");
        System.out.println(ed);
        ed.Publicar();
        ed.Vender();
    }
}
