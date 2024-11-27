import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int res;

        System.out.print("Введите перове целое число: ");
        int num1 = sc.nextInt();

        System.out.print("Выберите + - * /;");
        String ac = sc.nextLine();
        ac = sc.nextLine();
        System.out.print("Введите перове целое число: ");
        int num2 = sc.nextInt();
        if (num1< 1 || num1 > 10 || num2 < 1 || num2 > 10)return; {
            System.out.print ("");
        }



        switch (ac) {
            case "+":
                res = num1 + num2;
                System.out.println("Результат:" + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Результат:" + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Результат:" + res);
                break;
            case "/":
                if (num2 == 0)
                    System.out.println("На 0 делить нельзя");
                else {
                    res = num1 / num2;
                    System.out.println("Результат::" + res);

                }
                break;
            default:

                System.out.println("Что-ьо пошло не так");



        }
    }
}

