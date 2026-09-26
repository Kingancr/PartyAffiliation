import java.util.Scanner;
public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Are you a Democrat, Republican, or Independent: ");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("D") || input.equalsIgnoreCase("Democrat")) {
            System.out.println("You get a Democratic Donkey");
        } else if (input.equalsIgnoreCase("R") || input.equalsIgnoreCase("Republican")) {
            System.out.println("You get a Republican Elephant");
        } else if (input.equalsIgnoreCase("I") || input.equalsIgnoreCase("Independent")) {
            System.out.println("You are an Independent person");
        } else {
            System.out.println("You have another political affiliation: " + input);
        }

    }
}
