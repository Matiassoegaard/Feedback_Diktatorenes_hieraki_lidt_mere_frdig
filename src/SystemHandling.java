import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SystemHandling {

    private List<Leader> leaders;

    public SystemHandling() {
        this.leaders = listOfLeaders();
    }

    //Her får man listen af leaders
    public List<Leader> listOfLeaders(){

            Leader politicalLeader = new PoliticalDictator("Palpatine","Galactic Empire",20,"Sith Party");
            Leader militaryLeader = new MilitaryDictator("Zod","Krypton",15,"General");

            List<Leader> listOfLeaders = new ArrayList<>();
            listOfLeaders.add(politicalLeader);
            listOfLeaders.add(militaryLeader);
            return listOfLeaders;
    }



    public void displayInfo(Leader leader){
        leader.printDetails();
        leader.giveSpeech();

        //Tjekker om vi skal cast
        if (leader instanceof PowerActions){
            //Caster leader objebt, fra Leader typen til typen PowerAction
            PowerActions powerActions = (PowerActions) leader;
            powerActions.repressOpposition();
            powerActions.implementPolicy("New Policy");
            powerActions.holdParade();
        }
    }


    //Denne håndterer menu'en og mulighed for at vælge hvad man ville se.
    public void handleSystem(){
        Scanner input = new Scanner(System.in);


        boolean isDone = false;
        while(!isDone){
            System.out.println("---------------------" +
                    "\n1) Vis alle diktatorer" +
                    "\n2) Vis kun politisk diktator" +
                    "\n3) Vis kun militær diktator" +
                    "\n0) Afslut");

            String choice = input.nextLine().trim();

            switch(choice){
                case "0" -> {
                    System.out.println("Tak for denne gang!");
                    isDone = true;
                }
                case "1" -> {
                    for(Leader leader : listOfLeaders()){
                        displayInfo(leader);
                    }
                }
                case "2" -> {
                    for (Leader leader : listOfLeaders()){
                        if(leader instanceof PoliticalDictator){
                            displayInfo(leader);
                        }
                    }
                }
                case "3" -> {
                    for(Leader leader : listOfLeaders()){
                        if(leader instanceof MilitaryDictator){
                            displayInfo(leader);
                        }
                    }
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }



}
