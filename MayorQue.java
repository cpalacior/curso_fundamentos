public class MayorQue{
    public static void mayor(int[] a){
        int i = 0;
        int contador = a.length;
        while (i < a.length){
            if (a[i] > a[0]){
                System.out.println(a[i]);
            }
            else{
                contador = contador - 1;
            }
            i = i + 1;
        }
        if(contador == 0){
            System.out.println("No hay ningun numero mayor que el primero");
        }
    }
}