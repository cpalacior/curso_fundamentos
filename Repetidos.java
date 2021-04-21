import java.util.ArrayList;
public class Repetidos{
    public static int detectorDeRepetidos(ArrayList<Integer> a){
        int i = 1;
        int cont = 0;
        while(i < a.size()){ 
            if(a.get(i) == a.get(i - 1)){
                cont = cont + 1;
            }
            while(a.get(i) == a.get(i - 1)){
                i = i + 1;
                if(i == a.size()){
                    break;
                }
            }
            i = i + 1;
        }
        return cont;
    }
}