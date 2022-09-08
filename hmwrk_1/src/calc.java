import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            do {
                double num1;
                double num2;
                double answer;
                char op;
                Scanner reader = new Scanner(System.in);
                System.out.print("Добро пожаловать в калькулятор\n");
                System.out.print("Введите первое число: ");
                num1 = reader.nextDouble();
                System.out.print("Введите второе число: ");
                num2 = reader.nextDouble();
                System.out.print("Введите операцию (+, -, *, /): ");
                op = reader.next().charAt(0);
                switch (op) {
                    case '+' -> answer = num1 + num2;
                    case '-' -> answer = num1 - num2;
                    case '*' -> answer = num1 * num2;
                    case '/' -> answer = num1 / num2;
                    default -> {
                        System.out.print("Такой операции нет, программа завершена");
                        return;
                    }
                }
                System.out.print("\nРезультат:\n");
                System.out.printf(num1 + " " + op + " " + num2 + " = " + answer);
            } while (check(s));
        }
    }
    static boolean check(Scanner s) {
        boolean check;
        System.out.print("\nПосчитаем ещё? (Да/Нет): ");
        String ch = s.next();
        check = ch.equalsIgnoreCase("Да");
        return check;
    }
}