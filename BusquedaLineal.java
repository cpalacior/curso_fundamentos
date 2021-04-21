public class BusquedaLineal{
    public static void main(String[] args){
        int[] arr_edades = new int[5];
        arr_edades[0] = 50; arr_edades[1] = 20;
        arr_edades[2] = 30; arr_edades[3] = 10;
        arr_edades[4] = 30;
        int pos = -1;
        int buscar = 30;
        int i = 0;
        while(i<arr_edades.length){
            if(buscar==arr_edades[i]){
                pos = i;
                break;
            }
            i++;
        }
        System.out.print("La posición en la que se encuentra ");
        System.out.print(buscar+" es: "+pos);
    }
}