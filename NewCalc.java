
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            while (true) {
                printMenu();
                int choice = getUserChoice(scanner);


                switch (choice) {
                    case 0:
                        System.out.println("Exiting the calculator.");
                        System.exit(0);
                        break;
                    case 1:
                        performAddition(scanner);
                        break;
                    case 2:
                        performSubtraction(scanner);
                        break;
                    case 3:
                        performMultiplication(scanner);
                        break;
                    case 4:
                        performDivision(scanner);
                        break;
                    case 5:
                        sciNotation(scanner);
                        break;// runs scientific notation
                    default:
                        System.out.println("Invalid choice. Please try again.");

                }
            }
        }


        private static void printMenu() {
            System.out.println("Type the corresponding number for the function would you like to use.");
            System.out.println("0 - Quit");
            System.out.println("1 - Addition");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Multiplication");
            System.out.println("4 - Division");
            System.out.println("5 - Sort a list");
            System.out.println("6 - Search a sorted list");
            System.out.println("7 - Square root");
            System.out.println("8 - Exponent");
            System.out.println("9 - Factorial ");
            System.out.println("10 - Pi ");
            System.out.println("11 - E ");
            System.out.println("12 - 10x ");
            System.out.println("13 - E ");
            System.out.println("14 - E ");




        }




        private static int getUserChoice(Scanner scanner) {
            System.out.print("Enter your choice: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Consume the invalid input
            }
            return scanner.nextInt();
        }




        private static void performAddition(Scanner scanner) {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();


            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();


            double result = num1 + num2;
            System.out.println("Result: " + result);
        }




        private static void performSubtraction(Scanner scanner) {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();


            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();


            double result = num1 - num2;
            System.out.println("Result: " + result);
        }




        private static void performMultiplication(Scanner scanner) {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();


            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();


            double result = num1 * num2;

            System.out.println(" " );
            System.out.println("Result: " + result);
            System.out.println(" " );
        }


        private static void sciNotation(Scanner scanner){
            System. out.println("convert to(1) or from(2) scientific notation");
            double an1= scanner.nextDouble();
            


        }


        private static void performDivision(Scanner scanner) {
            System.out.print("Enter the top number: ");
            double top = scanner.nextDouble();


            System.out.print("Enter the bottom number: ");
            double bottom = scanner.nextDouble();


            if (bottom != 0) {
                double result = top / bottom;
                System.out.println("Result: " + result);


            } else {
                System.out.println("Cannot divide by zero. Please enter a non-zero digit.");
            }
        }
    }
