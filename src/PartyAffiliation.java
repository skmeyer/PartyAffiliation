import java.util.Scanner;

public class PartyAffiliation
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String partyAffiliation = "";

        System.out.print("Enter your party affiliation (Democrat, Republican, or Independent) with the corresponding first letter: ");
        partyAffiliation = in.nextLine();

        if (partyAffiliation.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democratic Donkey!");
        }
        else if(partyAffiliation.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Elephant!");
        }
        else if(partyAffiliation.equalsIgnoreCase("I"))
        {
            System.out.println("You get an Independent Man!");
        }
        else
            System.out.println("Your party is Other, and not listed here.");

    }
}