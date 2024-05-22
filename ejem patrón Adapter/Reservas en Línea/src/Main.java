import java.util.Scanner;


public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static TransWorld transworld; 
    
    public static void main(String[] args) {
        
        int opcion;
        do {  
            opcion= Opcion();
        switch (opcion) {
            case 1:
                transworld = new SkyWingsAdapter(new SkyWings());
                Transporte();
                break;
            case 2:
                transworld = new RailExpress();
                Transporte();
                break;
            case 3:
                transworld = new ViaBus();
                Transporte();
                break;
            case 4:
                System.out.println("Cerrar programa");
                break;
            default:
                System.out.println("Opción no válida");
            }  
            System.out.println("");
        } while (4 != opcion);
    }
    private static int Opcion(){
        System.out.println("\nSeleccione la empresa de transporte:\n"
        + "1. Aerolíneas\n"
        + "2. Ferrocarriles\n"
        + "3. Autobuses\n"
        + "4. Cerrar programa\n"
        + "Seleccione opcion: ");
        
        return Integer.parseInt(scanner.nextLine());
    }
    private static void Transporte(){
        transworld.verificarDisponibilidad();
        transworld.hacerReserva();
        transworld.cancelarReserva();
        
    }
}
    

