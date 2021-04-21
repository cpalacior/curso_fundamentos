import java.util.Scanner;
public class ExtraccionProfesional{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String texto = scan.nextLine();
        String nombre = texto.substring(texto.indexOf("'name'>") + 7, texto.indexOf("</div><"));
        String apellido = texto.substring(texto.indexOf("'lastname'>") + 11, texto.lastIndexOf("</div>"));
        String nombrecompleto = nombre.concat(apellido);
        System.out.println(nombrecompleto);
    }
}