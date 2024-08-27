import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String patente;
        int tipoDeEstacionamiento = 0, horasDeEstacionamiento, totalJornadaPorHora = 0, totalMediaJorndad = 0,
                totalJorndaCompleta = 0, horas = 0;
        boolean bandera = false;
        double costoEstacionamiento, total = 0, constoMediaJornada = 15, costoJornadaCompleta = 30, costoPorHora = 3;
        double descuentoMediaJornada = 0.05, descuentoJornadaCompleta = 0.10, descuento = 0;

        while (bandera == false) {// mientras la bandera es falsa se va a ejecutar el ciclo
            scanner = new Scanner(System.in);
            costoEstacionamiento = 0; // se limpia el costo de estacionamiento
            System.out.println("Para salir escriba fin el la patente del vehiculo");
            System.out.println("Ingrese la patente del vehiculo");
            patente = scanner.nextLine();
            if (patente.equalsIgnoreCase("fin")) {// si la matricula es fin o FIN se cierra el programa
                bandera = true;// si la condicion es verdadera se la bandera se hace verdadera para salir del
                               // ciclo
                System.out.println("Salimos del programa");
                break;
            }
            System.out.println("Seleccione el tipo de estacionamiento");
            System.out.println("1. Por hora $3 USD por hora ");
            System.out.println("2. Por Media Jornada $15 USD (5 horas) Descuento del 5%");
            System.out.println("3. Por Jornada Completa $30 USD (10 Horas) Descuento del 10%");
            scanner = new Scanner(System.in);// se reinicia el scaner

            try {
                tipoDeEstacionamiento = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("El valor ingresado no es un numero de opcion:" + e.getMessage());
            }

            if (tipoDeEstacionamiento <= 0 || tipoDeEstacionamiento > 3) {// si el valor de tipo de estacionamiento es
                                                                          // menor a cero y mayor a 3 muestra un error
                System.out.println("=======================================");
                System.out.println("Ingreso un valor no valido");
                System.out.println("==========================================");
                continue;
            }

            switch (tipoDeEstacionamiento) {// opciones para el tipo de estacionamiento
                case 1:// Por hora
                    System.out.println("Cuantas horas dejara su vehiculo?");
                    scanner = new Scanner(System.in);// se reinicia el escaner
                    horasDeEstacionamiento = scanner.nextInt();// se toman las horas de estacionamiento
                    costoEstacionamiento = horasDeEstacionamiento * costoPorHora; // se multiplica el coste por hora por
                                                                                  // el total de horas
                    total = total + costoEstacionamiento;// se suma al total global
                    horas = horas + horasDeEstacionamiento;// se lleva un registro del total global de horas
                    totalJornadaPorHora++;// se suma al contador para ver cuantas veces se selecciono esta opcion
                    System.out.println("El costo es de $" + costoEstacionamiento + "USD");
                    break;
                case 2:// por media jornada
                    System.out.println("Se le hara el cobro por media jornada");
                    costoEstacionamiento = 0;// se reinicia el costo de estacionamiento para realizar las operaciones
                    descuento = constoMediaJornada * descuentoMediaJornada;// se calcula el descuento
                    costoEstacionamiento = constoMediaJornada - descuento;// se aplica el descuento al costo de media
                                                                          // jornada
                    total = total + costoEstacionamiento; // se registra en el total global para saber cuanto se genero
                                                          // en el dia
                    totalMediaJorndad++; // se suma al contador para ver cuantas veces se selecciono esta opcion
                    System.out.println("El costo es de $" + costoEstacionamiento + "USD");
                case 3:// por jornada completa
                    System.out.println("Se le hara el cobro por jornada completa");
                    costoEstacionamiento = 0;// se reinicia el costo de estacionamiento para realizar las operaciones
                    descuento = costoJornadaCompleta * descuentoJornadaCompleta;// se calcula el descuento
                    costoEstacionamiento = costoJornadaCompleta - descuento;// se aplica el descuento al costo de
                                                                            // jornada completa
                    total = total + costoEstacionamiento; // se registra en el total global para saber cuanto se genero
                                                          // en el dia

                    totalJorndaCompleta++;// se suma al contador para ver cuantas veces se selecciono esta opcion
                    System.out.println("El costo es de $" + costoEstacionamiento + "USD");
                default:
                    break;
            }

            System.out.println("================MUCHAS GRACIAS POR SU COMPRA ===========================");
        }
        System.out.println("El total de recaudaciones en el dia fue: $ " + total + " USD");
        System.out.println("La cantidad de por hora fue: " + totalJornadaPorHora + " Hrs");
        System.out.println("Y las horas cobradas en total son: " + horas + " Hrs");
        System.out.println("El total de medias jornadas son: " + totalMediaJorndad);
        System.out.println("El total de jornadas completas fue: " + totalJorndaCompleta);

    }
}
