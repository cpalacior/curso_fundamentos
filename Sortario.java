public class Sortario{
    public static boolean detectorDeMalaSuerte(int[] a){
        int i = 0;
        int cont = 0;
        while(i < a.length){
            if(a[i] == 1){
                int o = 0;
                while(o < a.length){
                    if(a[o] == 3){
                        cont = cont + 1;
                        break;
                    }
                    o = o + 1;
                }
            }
            else if(a[i] == 13){
                cont = cont + 1;
                        break;
            }
            i = i + 1;
        }
        if(cont == 1){
            return true;
        }
        else{
            return false;
        }
    }
}