import java.util.Scanner;

public class Reverse {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("\nPlease enter a string to be reversed:\n");
        String[] input = in.next().split("");
        String output = "";
        for (int i = input.length - 1; i >= 0; i--) {
            output += input[i];
        }
        System.out.println('\n' + output);
        in.close();
    }
}
