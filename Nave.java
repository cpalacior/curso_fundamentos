import java.util.ArrayList;
public class Nave{
    private int codigo;
    private int salud;
    private int ataque;

    public Nave(){
        this(1010, 4, 8);
    }

    public Nave(int cod, int sal, int ata){
        this.codigo = cod;
        this.salud = sal;
        this.ataque = ata;
    }

    public void setCodigo(int cod){
        this.codigo = cod;
    } 

    public void setSalud(int sal){
        this.salud = sal;
    } 

    public void setAtaque(int ata){
        if(ata >= 0){
            this.ataque = ata;
        }
    } 

    public int getCodigo(){
        return codigo;
    }

    public int getSalud(){
        return salud;
    }

    public int getAtaque(){
        return ataque;
    }

    public static void ataque(Nave n1, Nave n2){
        n2.setSalud(n2.getSalud() - n1.getAtaque());
        if(n2.getSalud() <= 0){
            System.out.println("Nave " + n2.getCodigo() + " destruida");
        }
    }

    public String toString(){
        String infoCodigo = ("Codigo " + getCodigo() + ", ");
        String infoSalud = ("Salud " + getSalud() + ", ");
        String infoAtaque = ("Ataque " + getAtaque());
        String info = infoCodigo.concat(infoSalud);
        info = info.concat(infoAtaque);
        return info;
    }
    
    public static void mostrarNavesVivas(ArrayList a){
        int i = 0;
        while(i < a.size()){
            if(PpalNave.arr.get(i).getSalud() > 0){
                System.out.println(PpalNave.arr.get(i).toString());
            }
            i++;
        }
    }
}