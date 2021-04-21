public class MascotaSimple {
    private int edad = 8;
    private String nombre;
    MascotaSimple(){
        this.nombre = "kitty";
    }
    MascotaSimple(String n) {
            this.nombre = n;
        }
    MascotaSimple(String nn, int e) {
        this.nombre = nn;
        this.edad = e;
    }
    public String getNombre() {
        return this.nombre;
    }
    public int getEdad() {
        return this.edad;
    }
}