public class PrincipalPropiedad{
    public static void main(String[]args){
        Propiedad p1 = new Propiedad("nueva");
        p1.aumentarVisitas();
        p1.aumentarVisitas();
        p1.aumentarVisitas();
        p1.setCondicion("usada");
        p1.aumentarVisitas();
        p1.aumentarVisitas();
        p1.aumentarVisitas();
        System.out.println(p1.getVisitas());
    }
}