import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        input1 = input1.replace(" ", "");
        input2 = input2.replace(" ", "");

        System.out.println(input1.equals(input2));
    }
}