public class Moto extends Vehiculo {
    private String tipoManillar;
    
    

    public Moto(String modelo, String numRuedas, String color, String tipoManillar) {
        super(modelo, numRuedas, color);
        this.tipoManillar = tipoManillar;
    }

    public void hacerCaballito(){
        System.out.println("la moto esta haciendo un caballito");
    }

    @Override
    public void detener() {
        System.out.println("La moto se ha detenido");
    }
    
}
