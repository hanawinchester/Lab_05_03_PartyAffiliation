public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Please enter your party affiliation (Democrat: D, Republican: R, Independent: I): ");
        String affiliation = "Other";

        if (affiliation == "D") {
            System.out.println("You get a democrat donkey!");
        } else if (affiliation == "R") {
            System.out.println("You get a republican elephant!");
        } else if (affiliation == "I") {
            System.out.println("You get an independent person!");
        }
        else {
            System.out.println("You are other");
        }
    }
}