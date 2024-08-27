import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String patente;
        int tipoDeEstacionamiento;
        int horasDeEstacionamiento;
        boolean bandera = false;
        double costoEstacionamiento;
        double total = 0;
        double constoMediaJornada = 15;
        double costoJornadaCompleta = 30;
        double costoPorHora = 3;
        double descuentoMediaJornada = 0.05;
        double descuentoJornadaCompleta = 0.10;
        int totalJornadaPorHora = 0;
        int totalMediaJorndad = 0;
        int totalJorndaCompleta = 0;
        int horas = 0;
        double descuento = 0;

        while (bandera == false) {
            costoEstacionamiento = 0;
            System.out.println("Para salir escriba fin el la patente del vehiculo");
            System.out.println("Ingrese la patente del vehiculo");
            patente = scanner.next();
            if (patente.equals("fin")) {
                bandera = true;
                System.out.println("Salimos del programa");
                break;
            }
            System.out.println("Seleccione el tipo de estacionamiento");
            System.out.println("1. Por hora");
            System.out.println("2. Por Media Jornada");
            System.out.println("3. Por Jornada Completa");
            tipoDeEstacionamiento = scanner.nextInt();
            switch (tipoDeEstacionamiento) {
                case 1:
                    System.out.println("Cuantas horas dejara su vehiculo?");
                    horasDeEstacionamiento = scanner.nextInt();
                    costoEstacionamiento = horasDeEstacionamiento * costoPorHora;
                    total = total + costoEstacionamiento;
                    horas = horas + horasDeEstacionamiento;
                    totalJornadaPorHora++;
                    break;
                case 2:
                    System.out.println("Se le hara el cobro por media jornada");
                    costoEstacionamiento = 0;
                    descuento = constoMediaJornada * descuentoMediaJornada;
                    costoEstacionamiento = constoMediaJornada - descuento;
                    total = total + costoEstacionamiento;
                    totalMediaJorndad++;

                case 3:
                    System.out.println("Se le hara el cobro por jornada completa");
                    costoEstacionamiento = 0;
                    descuento = costoJornadaCompleta * descuentoJornadaCompleta;
                    costoEstacionamiento = costoJornadaCompleta - descuento;
                    total = total + costoEstacionamiento;
                    totalJorndaCompleta++;
                default:
                    break;
            }
        }
        System.out.println("El total de recaudaciones en el dia fue: " + total);
        System.out.println("La cantidad de por hora fue: " + totalJornadaPorHora);
        System.out.println("Y las horas cobradas en total son: " + horas);
        System.out.println("El total de medias jornadas son: " + totalMediaJorndad);
        System.out.println("El total de jornadas completas fue: " + totalJorndaCompleta);

    }
}
