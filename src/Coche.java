public class Coche extends Vehiculo {
    private boolean picoYPlaca;
    private String numEjes;
    @Override
    public void detener() {
        System.out.println("El Coche se ha detenido");
    }
    public void arrancar(){
        System.out.println("El coche ha arrancado");

    }
    public boolean isPicoYPlaca() {
        return picoYPlaca;
    }
    public void setPicoYPlaca(boolean picoYPlaca) {
        this.picoYPlaca = picoYPlaca;
    }
    public String getNumEjes() {
        return numEjes;
    }
    public void setNumEjes(String numEjes) {
        this.numEjes = numEjes;
    }
    
}
