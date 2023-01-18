import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        int res;

        System.out.print("Дейстаие: ");
        String action = scanner.nextLine();
        action = scanner.nextLine();

        switch (action) {
            case "+":
                res = num1 + num2;
                System.out.println("Результат: " + res);
                break;

            case "-":
                res = num1 - num2;
                System.out.println("Результат: " + res);
                break;

            case "*":
                res = num1 * num2;
                System.out.println("Результат: " + res);
                break;

            case "/":
                if(num2 == 0)
                    System.out.println("Error");
                else {
                    res = num1 / num2;
                    System.out.println("Результат: " + res);
                }
                break;
            default:
                System.out.println("Вы что-то не то ввели.");



        }

    }
}
