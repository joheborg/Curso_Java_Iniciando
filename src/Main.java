import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        desafio1();
        desafio2();
        desafio3();
        desafio4a();
        desafio4b();
        desafio6();
        desafio7();
        desafio8();
        desafio9();
    }

    public static void desafio9() {
        System.out.print("Digite o num1 op num2 (2 * 4):");
        Scanner sc = new Scanner(System.in);
        try {
            String[] arrayCalc = sc.nextLine().split(" ", 3);
            String op = arrayCalc[1];
            Double num1 = Double.parseDouble(arrayCalc[0]);
            Double num2 = Double.parseDouble(arrayCalc[2]);
            Double result = op.equals("+") ? num1 + num2 : (op.equals("-") ? num1 - num2 : (op.equals("*") ? num1 * num2 : num1 / num2));
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Format invalid");
            System.out.println(e.getMessage());
        }
    }

    public static void desafio8() {
        System.out.print("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2 != 0) {
            System.out.println("Impar");
            return;
        }
        if (number >= 2 && number <= 5) {
            System.out.println("A");
            return;
        }
        if (number >= 6 && number <= 20) {
            System.out.println("B");
            return;
        }
        if (number > 20) {
            System.out.println("C");
        }
    }

    public static void desafio7() {
        System.out.print("Digite o primeiro numero:");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo numero:");
        int num2 = scanner.nextInt();
        System.out.print("Digite o terceiro numero:");
        int num3 = scanner.nextInt();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }

    public static void desafio6() {
        Cars cars = new Cars("X6", "BMX", 2024, 120000);
        System.out.println(cars.getMarca());
        System.out.println(cars.getModelo());
        System.out.println(cars.getAno());
        System.out.println("Valor de venda: " + cars.getValorVenda());
    }

    public static void desafio4b() {
        String palavra = "Hello World";
        for (int i = 0; i < palavra.length(); i++) {
            System.out.print(palavra.charAt(i) + " ");
        }
    }

    public static void desafio4a() {
        for (int i = 0; i <= 100; i += 2) System.out.print(i + " ");
        for (int i = 0; i <= 100; i++)
            if (i % 2 != 0)
                System.out.print(i + " ");
    }

    public static void desafio3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = sc.nextInt();
        String tamanho = String.valueOf(num);
        System.out.println(
                "Este número tem " + (tamanho.length() >= 5 ?
                        "5 digitos ou mais" :
                        num == 1 ?
                                "1 digito" :
                                tamanho.length() + " digitos"
                )
        );
    }

    public static void desafio2() {
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456
        };
        String[] my_array2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };

        System.out.println("Array 1 - Original: " + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Array 1 - Ordem: " + Arrays.toString(my_array1));

        System.out.println("Array 2 - Original: " + Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Array 2 - Ordem: " + Arrays.toString(my_array2));
    }

    public static void desafio1() {
        Scanner numberInput1 = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        double num1 = numberInput1.nextDouble();
        System.out.println("Digite o primeiro número:");
        Scanner numberInput2 = new Scanner(System.in);
        double num2 = numberInput2.nextDouble();
        System.out.println("Resultado: " + sum(num1, num2));
    }

    public static double sum(double a, double b) {
        return a + b;
    }
}