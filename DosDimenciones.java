import java.util.Scanner;
public class DosDimenciones{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[][] arr_empresas_edades = new int[2][5];
        for(int i=0; i<arr_empresas_edades.length; i++){
            System.out.println("--Ingresando datos de la empresa "+i+"--");
            for(int j=0; j<arr_empresas_edades[0].length; j++){
                System.out.print("Ingresando edad empleado "+j+" - ");
                System.out.println("empresa "+i+" :");
                arr_empresas_edades[i][j] = scan.nextInt();
            }
        }

        for(int i=0; i<arr_empresas_edades.length; i++){
            System.out.println("--Empresa "+i+"--");
            double suma = 0;
            for(int j=0; j<arr_empresas_edades[0].length; j++){
                suma = suma + arr_empresas_edades[i][j];
                System.out.print("Edad empleado "+j+" :");
                System.out.println(arr_empresas_edades[i][j]);
            }
            double prom = suma/arr_empresas_edades[0].length;
            System.out.println("Edad promedio: "+prom);
        }
    }
}