public class App {
    public static void main(String[] args) throws Exception {
        Coche miCoche= new Coche();
        miCoche.setNumEjes("3");
        miCoche.setNumRuedas("6");
        Moto miMoto= new Moto();
        miCoche.arrancar();
        miMoto.arrancar();
        miMoto.hacerCaballito();
        miMoto.detener();
        miCoche.detener();

        System.out.println("El coche tiene "+miCoche.getNumEjes()+
        " Ejes y "+miCoche.getNumRuedas()+" ruedas");

        


    }
}
