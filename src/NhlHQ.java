public class NhlHQ {


    public static void main(String[] args) {
        NhlHQ myFactory = new NhlHQ();
    }


    public NhlHQ(){

        Nhl Debrusk;
        Debrusk = new Nhl();
        Debrusk.team= "Bruins";
        Debrusk.position= "Left Wing";
        Debrusk.playerNum= 74;
        Debrusk.shotHand= false;
        Debrusk.roundDraft= 1;
        Debrusk.printInfo();


       Nhl Halak;
       Halak = new Nhl();
       Halak.team= "Rangers";
       Halak.position= "Goalie";
       Halak.playerNum=41;
       Halak.shotHand=true;
       Halak.roundDraft=9;
       Halak.printInfo();




    }

}
