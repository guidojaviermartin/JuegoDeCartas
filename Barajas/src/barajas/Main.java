package barajas;

import java.util.Scanner;

public class Main{
    
public static void main(String[] args) {
    System.out.println("Ingrese opcion");
    Scanner leer = new Scanner(System.in);
    Barajas baraja = new Barajas();
    int opcion = 10;
    while (opcion != 0) {
            System.out.println("MENU");
            System.out.println("1. Barajar");
            System.out.println("2. Siguiente carta");
            System.out.println("3. Cartas disponibles");
            System.out.println("4. Dar cartas");
            System.out.println("5. Cartas Monton");
            System.out.println("6. Mostrar baraja");
            System.out.println("7. Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Baraja creada:");
                    baraja.mostrarBaraja();

                    System.out.println("\nBarajando...");
                    baraja.barajar();
                    System.out.println("Baraja barajada:");
                    baraja.mostrarBaraja();
                    break;
                case 2:
                    System.out.println("\nSiguiente carta:");
                    System.out.println(baraja.siguienteCarta());
                    break;
                case 3:
                    System.out.println("Los controles son: ");
//                    opcion = 0;
                    break;
                case 7:
                    System.out.println("¿Está seguro que desea salir (S/N)?");
                    leer.nextLine();
                    String salida = leer.nextLine();
                    if (salida.toUpperCase().equals("S")) {
                        System.out.println("Saliendo del programa...");
                        opcion = 0;
                        break;
                    } else {
                        if (!salida.toUpperCase().equals("N")) {
                            System.out.print("\u001B[31m");
                            System.out.println( "Error. Opcion incorrecta");
                            break;
                        }
                        break;
                    }
                default : 
                    System.out.println("Error vuelva a ingresar la opcion");
            }
        }
    
    
        

        

        System.out.println("\nCartas disponibles: " + baraja.cartasDisponibles());

        System.out.println("\nDando 5 cartas:");
        System.out.println(baraja.darCartas(5));

        System.out.println("\nCartas en el montón:");
        baraja.cartasMonton();
    }

}