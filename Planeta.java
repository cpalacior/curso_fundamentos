public class Planeta{
    private static String nombre;
    private static double masa;
    public int contador = 0;
    public Planeta(){
        this("Tierra",5.972);
    }

    public Planeta(String n, double m){
        this.nombre = n;
        this.masa = m;
    }

    public String getNombre(){
        return this.nombre;
    }

    public double getMasa(){
        return this.masa;
    }

    public void setNombre(String n){
        this.nombre = n;
    }

    public void setMasa(double m){
        this.masa = m;
    }

    public static Planeta planetaMedio(Planeta p){
        Planeta.nombre = p.getNombre();
        double medioMasa = p.getMasa()/2;
        p.setNombre(Planeta.nombre);
        p.setMasa(medioMasa);
        return p;
    }
}
