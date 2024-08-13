public abstract class Vehiculo {
    private String modelo;
    private String numRuedas;
    private String color;


    public Vehiculo(){
        
    }
    public Vehiculo(String modelo, String numRuedas, String color) {
        this.modelo = modelo;
        this.numRuedas = numRuedas;
        this.color = color;
    }

    public void arrancar(){
        System.out.println("El vehículo ha arrancado");
    }
    public abstract void detener();
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getNumRuedas() {
        return numRuedas;
    }
    public void setNumRuedas(String numRuedas) {
        this.numRuedas = numRuedas;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
}
