public class Propiedad{
    private String condicion;
    private int visitas;

    public Propiedad(String c){
        this.condicion = c;
        this.visitas = 0;
    }

    public void setCondicion(String palabra){
        while(true){
            if (palabra.equals("nueva")){
                this.condicion = "nueva";
                break;
            }
            else if (palabra.equals("usada")){
                this.condicion = "usada";
                break;
            }
            else {
                continue;
            }
        }
    }

    public String getCondicion(){
        return this.condicion;
    }

    public int getVisitas(){
        return this.visitas;
    }

    public void aumentarVisitas(){
        if(this.condicion.equals("nueva")){
            this.visitas = this.visitas + 2;
        }
        else {
            this.visitas = this.visitas + 1;
        }
    }
}