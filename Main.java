import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;






public class Main {




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        while (true) {
            printMenu();
            int choice = getUserChoice(scanner);




            switch (choice) {
                case 0 -> {
                    System.out.println("Exiting the calculator.");
                    System.exit(0);
                }
                case 1 -> performAddition(scanner);
                case 2 -> performSubtraction(scanner);
                case 3 -> performMultiplication(scanner);
                case 4 -> performDivision(scanner);
                case 5 -> performMergeSort(scanner);
                case 6 -> performBinarySearch(scanner);
                case 7 -> performFactorial(scanner);
                case 8 -> performExponent(scanner);
                case 9 -> performSquareRoot(scanner);
                case 10 -> performPiOperation(scanner);
                case 11 -> performSquare(scanner);
                case 12 -> performCube(scanner);
                case 13 -> PreformScientificNotation(scanner);




                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }




    // Display the menu options
    private static void printMenu() {
        System.out.println("Type the corresponding number for the function you would like to use.");
        System.out.println("0 - Quit");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.println("5 - Sort a list");
        System.out.println("6 - Search a sorted list");
        System.out.println("7 - Factorial");
        System.out.println("8 - Exponent");
        System.out.println("9 - Square root ");
        System.out.println("10 - Pi ");
        System.out.println("11 - Square ");
        System.out.println("13 - Scientific Notation ");







    }




    // Get user's choice from the menu
    public static int getUserChoice(Scanner scanner) {
        System.out.print("Enter your choice: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Consume the invalid input
        }
        return scanner.nextInt();
    }


    // Helper method to get valid numeric input from the user
    private static double getValidNumberInput(Scanner scanner) {
        while (true) {
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Consume the invalid input
            }
        }
    }


    // Addition operation
    private static void performAddition(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = getValidNumberInput(scanner);




        System.out.print("Enter the second number: ");
        double num2 = getValidNumberInput(scanner);




        double result = num1 + num2;
        System.out.println("Result: " + result);
        System.out.println();
    }


    // Subtraction operation
    private static void performSubtraction(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = getValidNumberInput(scanner);




        System.out.print("Enter the second number: ");
        double num2 = getValidNumberInput(scanner);




        double result = num1 - num2;
        System.out.println("Result: " + result);
        System.out.println();
    }




    // Multiplication operation
    private static void performMultiplication(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = getValidNumberInput(scanner);




        System.out.print("Enter the second number: ");
        double num2 = getValidNumberInput(scanner);




        double result = num1 * num2;
        System.out.println("Result: " + result);
        System.out.println();
    }




    // Division operation
    private static void performDivision(Scanner scanner) {
        System.out.print("Enter the top number: ");
        double top = getValidNumberInput(scanner);




        System.out.print("Enter the bottom number: ");
        double bottom = getValidNumberInput(scanner);




        if (bottom != 0) {
            double result = top / bottom;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Cannot divide by zero. Please enter a non-zero digit.");
        }
        System.out.println();
    }




    // Merge sort operation
    private static void performMergeSort(Scanner scanner) {
        System.out.println("Enter the list of numbers separated by spaces (2 33 44 55 66 77 8 9): ");
        scanner.nextLine();  // Consume the newline character from the previous input
        String input = scanner.nextLine();




        // Parse the input into a list of doubles
        List<Double> numberList = new ArrayList<>();
        for (String str : input.split("\\s+")) {
            try {
                double num = Double.parseDouble(str);
                numberList.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid numbers separated by spaces.");
                return;
            }
        }




        // Perform merge sort
        mergeSort(numberList);




        // Display the sorted list
        System.out.println("Sorted List: " + numberList);
        System.out.println();
    }




    // Recursive merge sort algorithm
    private static void mergeSort(List<Double> list) {
        if (list.size() > 1) {
            int mid = list.size() / 2;
            List<Double> left = new ArrayList<>(list.subList(0, mid));
            List<Double> right = new ArrayList<>(list.subList(mid, list.size()));




            mergeSort(left);
            mergeSort(right);




            merge(list, left, right);
        }
    }




    // Merge two sorted lists
    private static void merge(List<Double> result, List<Double> left, List<Double> right) {
        int i = 0, j = 0, k = 0;




        while (i < left.size() && j < right.size()) {
            if (left.get(i) < right.get(j)) {
                result.set(k++, left.get(i++));
            } else {
                result.set(k++, right.get(j++));
            }
        }




        while (i < left.size()) {
            result.set(k++, left.get(i++));
        }




        while (j < right.size()) {
            result.set(k++, right.get(j++));
        }
    }




    // Binary search operation
    private static void performBinarySearch(Scanner scanner) {
        System.out.print("Enter the sorted list of numbers (1,2,3,4,5,6,7): ");
        scanner.nextLine(); // Consume the newline character left by previous nextDouble()
        String input = scanner.nextLine();




        // Parse the input string into an array of doubles
        double[] sortedList = Arrays.stream(input.split(","))
                .mapToDouble(Double::parseDouble)
                .toArray();




        System.out.print("Enter the number to search: ");
        double target = scanner.nextDouble();




        int index = binarySearch(sortedList, target, 0, sortedList.length - 1);




        if (index != -1) {
            System.out.println(target + " found at index " + index + ".");
        } else {
            System.out.println(target + " not found in the list.");
        }




        System.out.println();
    }




    // Recursive binary search algorithm
    private static int binarySearch(double[] sortedList, double target, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;




            if (sortedList[mid] == target) {
                return mid;
            } else if (sortedList[mid] < target) {
                return binarySearch(sortedList, target, mid + 1, high); // Search in the right half
            } else {
                return binarySearch(sortedList, target, low, mid - 1); // Search in the left half
            }
        }




        return -1; // if element not found
    }




    // Factorial operation
    private static void performFactorial(Scanner scanner) {
        System.out.print("Enter the number.  eg 5!: ");
        double num1 = getValidNumberInput(scanner);


        int i = 1, fact = 1;
        while (i <= num1) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of the number: " + fact);
        System.out.println();
    }




    // Exponentiation operation
    private static void performExponent(Scanner scanner) {
        System.out.print("Enter the base ");
        double num1 = getValidNumberInput(scanner);




        System.out.print("Enter the exponent ");
        double num2 = getValidNumberInput(scanner);




        double result = Math.pow(num1, num2);
        System.out.println(": " + result);
        System.out.println();
    }




    // Square root operation
    private static void performSquareRoot(Scanner scanner) {
        System.out.print("Enter a number to find its square root: ");
        double number = getValidNumberInput(scanner);




        if (number >= 0) {
            double result = Math.sqrt(number);
            System.out.println("Square Root: " + result);
        } else {
            System.out.println("Error: Cannot find square root of a negative number.");
        }
        System.out.println();
    }


    // Perform arithmetic operations with Pi
    private static void performPiOperation(Scanner scanner) {
        System.out.print("Enter the operation (add/subtract/multiply/divide) for Pi: ");
        String operation = scanner.next().toLowerCase();
        System.out.println();


        double pi = Math.PI;




        switch (operation) {
            case "add" -> performArithmeticOperation(scanner, "add", pi);
            case "subtract" -> performArithmeticOperation(scanner, "subtract", pi);
            case "multiply" -> performArithmeticOperation(scanner, "multiply", pi);
            case "divide" -> performArithmeticOperation(scanner, "divide", pi);
            default -> System.out.println("Invalid operation. Please enter add/subtract/multiply/divide.");
        }
    }




    // Perform arithmetic operations with Pi
    private static void performArithmeticOperation(Scanner scanner, String operation, double pi) {
        System.out.print("Enter the number: ");
        double num = getValidNumberInput(scanner);




        double result = 0;




        // Handle other cases if needed
        if ("add".equals(operation)) {
            result = num + pi;
        } else if ("subtract".equals(operation)) {
            result = num - pi;
        } else if ("multiply".equals(operation)) {
            result = num * pi;
        } else if ("divide".equals(operation)) {
            if (pi != 0) {
                result = num / pi;
            } else {
                System.out.println("Cannot divide by zero.");
                return;
            }
        }




        System.out.println("Result of " + operation + " with Pi: " + result);
        System.out.println();
    }




    private static void performSquare(Scanner scanner) {
        System.out.print("Enter the number you want to square: ");
        double num1 = getValidNumberInput(scanner);




        double result = num1 * num1;
        System.out.println("Result: " + result);
        System.out.println();


    }


    private static void performCube(Scanner scanner) {
        System.out.print("Enter the number you want to cube: ");
        double num1 = getValidNumberInput(scanner);




        double result = num1 * num1 * num1;
        System.out.println("Result: " + result);
        System.out.println();
    }


// make and read a Scientific notation in the same function
    private static void PreformScientificNotation(Scanner scanner) {

        Scanner look = new Scanner(System.in);
        System.out.println("Convert to (1) or from (2) scientific notation?");
        int choice = scanner.nextInt();



        if (choice == 1) {

            System.out.println("Enter a number to convert to scientific notation:"); // make to sci notation
            double number = scanner.nextDouble();



        } else if (choice == 2) {// expands a sci notation

            System.out.print("Enter the coefficient (a):");
            System.out.println("a10^n");
            double coefficient = scanner.nextDouble();
            System.out.print("Enter the exponent (n):");
            System.out.println("a10^n");
            int exponent = scanner.nextInt();
            scanner.close();

        } else {
            System.out.println("Invalid choice. Please choose 1 or 2.");
            return ;
        }


    }
}

