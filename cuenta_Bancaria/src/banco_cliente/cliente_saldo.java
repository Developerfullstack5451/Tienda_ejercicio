
package banco_cliente;

 import java.util.Scanner;

public class cliente_saldo {
    // Variables para almacenar los saldos de las cuentas
    private double saldoCuenta1;
    private double saldoCuenta2;

    // Constructor para inicializar los saldos
    public cliente_saldo(double saldoInicialCuenta1, double saldoInicialCuenta2) {
        this.saldoCuenta1 = saldoInicialCuenta1;
        this.saldoCuenta2 = saldoInicialCuenta2;
    }

    // Método para depositar dinero en una cuenta
    public void depositar(int cuenta, double cantidad) {
        if (cuenta == 1) {
            saldoCuenta1 += cantidad;
            System.out.println("Depósito realizado. Nuevo saldo de la cuenta 1: " + saldoCuenta1);
        } else if (cuenta == 2) {
            saldoCuenta2 += cantidad;
            System.out.println("Depósito realizado. Nuevo saldo de la cuenta 2: " + saldoCuenta2);
        } else {
            System.out.println("Número de cuenta inválido.");
        }
    }

    // Método para debitar dinero de una cuenta
    public void debitar(int cuenta, double cantidad) {
        if (cuenta == 1) {
            if (cantidad <= saldoCuenta1) {
                saldoCuenta1 = cantidad;
                System.out.println("Retiro realizado. Nuevo saldo de la cuenta 1: " + saldoCuenta1);
            } else {
                System.out.println("Saldo insuficiente en la cuenta 1.");
            }
        } else if (cuenta == 2) {
            if (cantidad <= saldoCuenta2) {
                saldoCuenta2 -= cantidad;
                System.out.println("Retiro realizado. Nuevo saldo de la cuenta 2: " + saldoCuenta2);
            } else {
                System.out.println("Saldo insuficiente en la cuenta 2.");
            }
        } else {
            System.out.println("Número de cuenta inválido.");
        }
    }

    // Método para consultar el saldo de una cuenta
    public void consultarSaldo(int cuenta) {
        if (cuenta == 1) {
            System.out.println("Saldo de la cuenta 1: " + saldoCuenta1);
        } else if (cuenta == 2) {
            System.out.println("Saldo de la cuenta 2: " + saldoCuenta2);
        } else {
            System.out.println("Número de cuenta inválido.");
        }
    }

    // Método principal para ejecutar el programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una instancia del objeto CuentasBancarias
        cliente_saldo cuentas = new cliente_saldo(1000.0, 2000.0); // Saldos iniciales

        boolean continuar = true;

        while (continuar) {
            // Menú de opciones
            System.out.println("\nMenú_opcion:");
            System.out.println("1. Depositar en cuenta");
            System.out.println("2. Retirar de cuenta");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número de cuenta (1 o 2): ");
                    int cuentaDeposito = scanner.nextInt();
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double cantidadDeposito = scanner.nextDouble();
                    cuentas.depositar(cuentaDeposito, cantidadDeposito);
                    break;
                case 2:
                    System.out.print("Ingrese el número de cuenta (1 o 2): ");
                    int cuentaDebito = scanner.nextInt();
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double cantidadDebito = scanner.nextDouble();
                    cuentas.debitar(cuentaDebito, cantidadDebito);
                    break;
                case 3:
                    System.out.print("Ingrese el número de cuenta (1 o 2): ");
                    int cuentaConsulta = scanner.nextInt();
                    cuentas.consultarSaldo(cuentaConsulta);
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        
        scanner.close();
    }


    
}
