package Calculator;

    import java.util.Scanner;

    public class Calculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введіть перше число: ");
            double num1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Введіть друге число: ");
            double num2 = Double.parseDouble(scanner.nextLine());

            System.out.print("Виберіть операцію (+, -, *, /): ");
            String operator = scanner.nextLine();

            double result = 0;

            try {
                switch (operator) {
                    case "+":
                        result = add(num1, num2);
                        break;
                    case "-":
                        result = sub(num1, num2);
                        break;
                    case "*":
                        result = mul(num1, num2);
                        break;
                    case "/":
                        result = div(num1, num2);
                        break;
                    default:
                        throw new IllegalArgumentException("Некоректна операція.");
                }

                System.out.println("Результат: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Помилка: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Помилка: " + e.getMessage());
            }
        }

        public static double add(double num1, double num2) {
            return num1 + num2;
        }

        public static double sub(double num1, double num2) {
            return num1 - num2;
        }

        public static double mul(double num1, double num2) {
            return num1 * num2;
        }

        public static double div(double num1, double num2) {
            if (num2 == 0) {
                throw new ArithmeticException("Ділення на нуль недопустиме.");
            }
            return num1 / num2;
        }
}

