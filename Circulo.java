public class Circulo{ 
    private double radio;
    private double radio1;
   
    public double getRadio() {
        return this.radio;
    }
    
    public double getPerimetro() {
        return 2 * this.radio * Math.PI;
    }
    
    public void setRadio(double r) {
        this.radio = r;
    }
    
    public double getRadio1() {
        return this.radio;
    }
    
    public void setRadio1(double r) {
        this.radio = r;
    }
}