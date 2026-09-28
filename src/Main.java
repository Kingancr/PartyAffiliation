import java.util.Scanner;
public class Main {
    /*
    class PartyAffiliation
    main()
        // Declare variables
        String partyChoice
        // Input section
        output "Are you a Democrat, Republican, or Independent: "
        input partyChoice
        // Conditional logic cascade
        if partyChoice == "D" || "Democrat" then
            output "You get a Democratic Donkey."
        else if partyChoice == "R" || "Republican" then
            output "You get a Republican Elephant."

        else if partyChoice == "I" || "Independent" then
            output "You get an Independent Man."
        else
            output "You have Another Political Affiliation: " + partyChoice
        end if
        return
    end class
     */
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Are you a Democrat, Republican, or Independent: ");
        String partyChoice = scanner.nextLine();

        if (partyChoice.equalsIgnoreCase("D") || partyChoice.equalsIgnoreCase("Democrat")) {
            System.out.println("You get a Democratic Donkey");
        } else if (partyChoice.equalsIgnoreCase("R") || partyChoice.equalsIgnoreCase("Republican")) {
            System.out.println("You get a Republican Elephant");
        } else if (partyChoice.equalsIgnoreCase("I") || partyChoice.equalsIgnoreCase("Independent")) {
            System.out.println("You are an Independent Person");
        } else {
            System.out.println("You have Another Political Affiliation: " + partyChoice);
        }

    }
}
