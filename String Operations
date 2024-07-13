import java.util.Scanner;

class Strings {

    public static void strLen(String var) {
        System.out.println("Length of string is: " + var.length());
    }

    public static void strUpperCase(String var) {
        System.out.println("In Upper Case: " + var.toUpperCase());
    }

    public static void strLowerCase(String var) {
        System.out.println("In Lower Case: " + var.toLowerCase());
    }

    public static void strIndex(String var, String var2) {
        System.out.println("Index of \"" + var2 + "\" in \"" + var + "\" is: " + var.indexOf(var2));
    }

    public static void strConcat(String var, String var2) {
        System.out.println("Concatenate: " + var.concat(var2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string 1: ");
        String var = sc.nextLine();

        while (true) {
            System.out.println("Enter:\n1. Length\n2. Uppercase\n3. Lowercase\n4. Index\n5. Concat\n6. Exit");
            int s = sc.nextInt();
            sc.nextLine(); // consume newline

            if (s == 6) {
                System.out.println("Exiting...");
                break;
            }

            switch (s) {
                case 1:
                    strLen(var);
                    break;
                case 2:
                    strUpperCase(var);
                    break;
                case 3:
                    strLowerCase(var);
                    break;
                case 4:
                    System.out.println("Enter string 2 for index operation: ");
                    String var2Index = sc.nextLine();
                    strIndex(var, var2Index);
                    break;
                case 5:
                    System.out.println("Enter string 2 for concat operation: ");
                    String var2Concat = sc.nextLine();
                    strConcat(var, var2Concat);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        sc.close();
    }
}
