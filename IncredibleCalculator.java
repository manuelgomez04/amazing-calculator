import java.util.Scanner;

public class IncredibleCalculator {
    String aux;
    int num1, num2, sum, resta, product, division, productDecim;
    double num3, num4;

    public static void main(String[] args) {

        System.out.println("Selecciona la operación que prefieras realizar: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir (división entera)");
        System.out.println("5. Dividir (división con decimales)");

        int opcion = leerEnteroEntrada();


        switch (opcion) {
            case 1: 
                //Sumar. Debes leer dos numeros enteros de entrada e imprimir su suma
                System.out.println ("Diga número 1");
                aux=sc.nextLine();
                num1= Integer.parseInt(aux);
                System.out.println ("Diga número 2");
                aux=sc.nextLine();
                num2= Integer.parseInt(aux);

                sum = num1+num2;

                System.out.println ("El resultado de la suma es"+ suma);

                    break;
            case 2: // Restar. Debes leer dos números enteros de entrada e imprimir su resta
                System.out.println ("Diga número 1");
                aux=sc.nextLine();
                num1= Integer.parseInt(aux);
                System.out.println ("Diga número 2");
                aux=sc.nextLine();
                num2= Integer.parseInt(aux);

                resta = num1-num2;

                System.out.println ("El resultado de la suma es"+ resta);
                    break;
            case 3: // Multiplicar. Debes leer dos números enteros de entrada e imprimir su producto.

                System.out.println ("Diga número 1");
                aux=sc.nextLine();
                num1= Integer.parseInt(aux);
                System.out.println ("Diga número 2");
                aux=sc.nextLine();
                num2= Integer.parseInt(aux);

                produc = num1*num2;

                System.out.println ("El resultado del producto es "+ produc);
                    break;
            case 4: // Multiplicar. Debes leer dos números enteros de entrada e imprimir su división entera.
                System.out.println ("Diga número 1");
                aux=sc.nextLine();
                num1= Integer.parseInt(aux);
                System.out.println ("Diga número 2");
                aux=sc.nextLine();
                num2= Integer.parseInt(aux);

                division = num1/num2;

                 System.out.println ("El resultado de la division es"+ division);
                    break;
           /* case 5: // Multiplicar. Debes leer dos números enteros de entrada e imprimir su división con decimales.
                System.out.println ("Diga número 1");
                aux=sc.nextLine();
                num3= Double.parseDouble(aux);
                System.out.println ("Diga número 2");
                aux=sc.nextLine();
                num4= Double.parseDouble(aux);

                productDecim = num3 * num4;

                 System.out.printf ("El resultado de la multiplicación de enteros es %.2f", productDecim) ;
                    break;

        }

    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static int divisionEntera(int a, int b) {
        return a / b;
    }

    public static double divisionConDecimales(int a, int b) {
        return a / (b * 1.0);
    }

    public static int leerEnteroEntrada() {
        try {
            Scanner sc = new Scanner(System.in);
            int result = Integer.parseInt(sc.next());
            sc.close();
            return result;
        } catch (NumberFormatException ex) {
            System.err.println("Lo que has introducido no es un número entero!");
            System.exit(1);
            return -1;
        }*/

    } 

}