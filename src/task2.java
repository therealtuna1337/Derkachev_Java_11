import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        t1();
        t2();
        t3();
    }

    public static void t1() {
        System.out.println("1)");

        Scanner scanner = new Scanner(System.in);

        int a, b;
        System.out.print("Введите число a: ");
        a = scanner.nextInt();
        System.out.print("Введите число b: ");
        b = scanner.nextInt();

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a / b = " + ((float) a / (float) b));
        System.out.println("a * b = " + (a * b));
    }

    public static void t2() {
        System.out.println("\n2)");

        Scanner scanner = new Scanner(System.in);

        String a, b;
        System.out.print("Введите строку a: ");
        a = scanner.nextLine();
        System.out.print("Введите строку b: ");
        b = scanner.nextLine();

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }

    public static void t3() {
        System.out.println("\n3)");

        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}