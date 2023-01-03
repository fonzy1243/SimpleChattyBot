import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String stringInput = scanner.nextLine();
        int range1 = scanner.nextInt();
        int range2 = scanner.nextInt();

        for (int i = range1; i <= range2; i++)
            System.out.print(stringInput.charAt(i));
    }
}