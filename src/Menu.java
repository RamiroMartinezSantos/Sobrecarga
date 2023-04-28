import java.util.Scanner;

public class Menu {
    public void menu() {
        Operaciones operaciones = new Operaciones();
        Scanner scanner = new Scanner(System.in);


        int menu;
        do {
            System.out.println("--MENU DE OPERACIONES--");
            System.out.println(" [1] Suma");
            System.out.println(" [2] Resta");
            System.out.println(" [3] Multiplicacion");
            System.out.println(" [4] Divicion");
            System.out.println(" [5] Salir");
            menu = scanner.nextInt();
            switch (menu) {
                case 1 -> {
                    System.out.println("INGRESA LOS NUMEROS QUE DESEES SUMAR");
                    System.out.println("Numero 1: ");
                    int num1 = scanner.nextInt();
                    System.out.println("Numero 2: ");
                    int num2 = scanner.nextInt();
                    int suma = operaciones.operacion(num1, num2);
                    System.out.println(" Resultado = " + suma);
                }
                case 2 -> {
                    System.out.println("INGRESA LOS NUMEROS QUE DESEES SUMAR");
                    System.out.println("Numero 1: ");
                    Integer res1 = scanner.nextInt();
                    System.out.println("Numero 2: ");
                    Integer res2 = scanner.nextInt();
                    Integer resta = operaciones.operacion(res1, res2);
                    System.out.println(" Resultado = " + resta);
                }
                case 3 -> {
                    System.out.println("INGRESA LOS NUMEROS QUE DESEES SUMAR");
                    System.out.println("Numero 1: ");
                    Float mul1 = scanner.nextFloat();
                    System.out.println("Numero 2: ");
                    Float mul2 = scanner.nextFloat();
                    Float multi = operaciones.operacion(mul1, mul2);
                    System.out.println(" Resultado = " + multi);
                }
                case 4 -> {
                    System.out.println("INGRESA LOS NUMEROS QUE DESEES SUMAR");
                    System.out.println("Numero 1: ");
                    Double div1 = scanner.nextDouble();
                    System.out.println("Numero 2: ");
                    Double div2 = scanner.nextDouble();
                    Double divi = operaciones.operacion(div1, div2);
                    System.out.println(" Resultado = " + divi);
                }
                default -> {
                }
            }
        }while (menu != 5);
    }
}
