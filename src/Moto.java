public class Moto extends Vehiculo {
    private String tipoManillar;

    public void hacerCaballito(){
        System.out.println("la moto esta haciendo un caballito");
    }

    @Override
    public void detener() {
        System.out.println("La moto se ha detenido");
    }
    
}
