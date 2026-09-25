import java.util.InputMismatchException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        List<Empleado> todos = new ArrayList<>();

        int op = 0;
        Scanner input = new Scanner(System.in);

        String menu = "1. Agregar Empleado por Horas"+
                "\n2. Agregar Empleado Asalariado"+
                "\n3. Agregar Gerente"+
                "\n4. Salir";

        while (op != 4){
            try{
                System.out.println(menu);
                op = input.nextInt();
                switch (op){
                    case 1:
                        input.nextLine();
                        System.out.print("Ingrese el nombre: ");
                        String nombre = input.nextLine();
                        System.out.print("Ingrese el ID: ");
                        String id = input.nextLine();
                        System.out.print("Ingrese el número de teléfono: ");
                        String tlf = input.nextLine();
                        System.out.print("Ingrese las horas trabajadas: ");
                        int horas = input.nextInt();
                        System.out.print("Ingrese el valor por hora: $");
                        double valor = input.nextDouble();

                        Empleado empleadoPorHora = new EmpleadoPorHoras(nombre,id,tlf,true,horas,valor);
                        System.out.println(empleadoPorHora.mostrarInfo()); // REVISAR ESTO Y POR QUÉ NO FUNCIONA
                        break;
                    case 2:
                        System.out.println("Asalariado");
                        break;
                    case 3:
                        System.out.println("Gerente");
                        break;
                    case 4:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
            }catch (InputMismatchException error){
                System.out.println("Opción inválida.");
                input.next();
            }
        }

        for (Empleado employee : todos){
            employee.mostrarInfo();
        }



    }
}
