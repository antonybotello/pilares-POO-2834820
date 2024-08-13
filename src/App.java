import java.util.Scanner;

public class App {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        while (true) {
            System.out.println("################# MENÚ ###############");
            System.out.println("### 1. Agregar un moto            ####");
            System.out.println("### 2. Agregar un coche           ####");
            System.out.println("### 0. Salir                      ####");
            System.out.println("######################################");
            String opcion = teclado.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Ingrese el modelo de la moto:");
                    String modelo = teclado.nextLine();
                    System.out.println("Ingrese el número de ruedas de la moto:");
                    String numRuedas = teclado.nextLine();
                    System.out.println("Ingrese el color de la moto:");
                    String color = teclado.nextLine();
                    System.out.println("Ingrese el tipo de manillar de la moto:");
                    String manillar = teclado.nextLine();
                    Moto miMoto = new Moto(modelo, numRuedas, color, manillar);
                    System.out.println("Modelo: " + modelo + ", Número de ruedas: " + numRuedas +
                            ", Color: " + color + ", Tipo de manillar: " + manillar);
                    miMoto.arrancar();
                    miMoto.hacerCaballito();
                    miMoto.detener();
                    break;
                case "2":
                    Coche miCoche = new Coche();
                    miCoche.setNumEjes("3");
                    miCoche.setNumRuedas("6");
                    miCoche.arrancar();

                    miCoche.detener();

                    System.out.println("El coche tiene " + miCoche.getNumEjes() +
                            " Ejes y " + miCoche.getNumRuedas() + " ruedas");
                    break;
                case "0":
                    System.out.println("Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            if (opcion.equals("0")) {
                break;
            }
        }

    }
}
