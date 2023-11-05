public class Nhl {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    //variable declarations

    public String team;
    public String position;
    public int playerNum;
    public boolean shotHand;
    public int roundDraft;


    public void printInfo() {

        System.out.println("This player plays for the " + team);
        System.out.println("This player is a " + position);
        System.out.println("This player wears number " + playerNum);
        if (shotHand == true) {
            System.out.println("This player is right handed ");
        } else {
            System.out.println("He is left handed ");
        }
        System.out.println("This player was drafted in round " + roundDraft);


    }

}
