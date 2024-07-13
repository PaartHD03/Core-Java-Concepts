import java.util.*;

class Mathmethods {
    public static int maximum(List<Integer> digits) {
        int max = Collections.max(digits);
        System.out.println("Max number is: " + max);
        return max;
    }

    public static int minimum(List<Integer> digits) {
        int min = Collections.min(digits);
        System.out.println("Min number is: " + min);
        return min;
    }

    public static void squareRoot(List<Integer> digits) {
        System.out.println("Square roots are:");
        for (int digit : digits) {
            System.out.println("Square root of " + digit + " is: " + Math.sqrt(digit));
        }
    }

    public static void randomNumbers() {
        Random rand = new Random();
        System.out.println("Random numbers are:");
        for (int i = 0; i < 5; i++) {
            System.out.println(rand.nextInt(100)); // Generating random numbers between 0 and 99
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numeric inputs you want to enter: ");
        int x = sc.nextInt();

        List<Integer> digits = new ArrayList<>();

        for (int i = 1; i <= x; i++) {
            System.out.println("Enter digit " + i + " : ");
            int digit = sc.nextInt();
            digits.add(digit);
        }

        System.out.println("Choose operation: \n1. Maximum\n2. Minimum\n3. Square Roots\n4. Random Numbers");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                maximum(digits);
                break;
            case 2:
                minimum(digits);
                break;
            case 3:
                squareRoot(digits);
                break;
            case 4:
                randomNumbers();
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
