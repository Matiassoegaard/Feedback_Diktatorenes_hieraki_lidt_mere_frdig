import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SystemHandling {

    private List<Leader> leaders;

    //Constructor til klassen SystemHandling
    public SystemHandling() {
        this.leaders = listOfLeaders();
    }

    //Her får man listen af leaders
    public List<Leader> listOfLeaders(){
            //Laver et objekt "PoliticalDictator" som har "Leader" klassen som variable.
            //Dette virker på grund af "PoliticalDictator" er en subklasse af "Leader"
            Leader politicalLeader = new PoliticalDictator("Palpatine","Galactic Empire",20,"Sith Party");
            //Det samme sker her bare med "MilitaryDictator" klassen.
            Leader militaryLeader = new MilitaryDictator("Zod","Krypton",15,"General");

            List<Leader> listOfLeaders = new ArrayList<>();
            listOfLeaders.add(politicalLeader);
            listOfLeaders.add(militaryLeader);
            return listOfLeaders;
    }


    //Metode der viser informationen om diktatorene
    public void displayInfo(Leader leader){
        //Kalder på 2 metoder der tilhører klassen Leader
        leader.printDetails();
        leader.giveSpeech();

        //Tjekker om objektet er en instance af PowerAction (I denne opgave er begge objekter en instance af PowerActions, så det gør den lige meget)
        if (leader instanceof PowerActions){
            //Hvis objektet er en instance af PowerAction, caster den leader objekt, fra Leader typen til typen PowerAction.
            //så nu kan leader objektet kalde på de metoder som PowerAction har.
            PowerActions powerActions = (PowerActions) leader;

            powerActions.repressOpposition();
            powerActions.implementPolicy("New Policy");
            powerActions.holdParade();
        }
    }


    //Denne metode håndterer menu'en og muligheden for at vælge hvad man ville se.
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
                //Hvis input er "0" så stopper programmet.
                case "0" -> {
                    System.out.println("Tak for denne gang!");
                    isDone = true;
                }
                //Hvis input er "1". Kalder den på metdoen "displayInfo()" som viser lidt informationen og tjekker om den skal kalde PowerAction's metoder.
                case "1" -> {
                    for(Leader leader : listOfLeaders()){
                        displayInfo(leader);
                    }
                }
                case "2" -> {
                //Hvis input er "2". Så tjekker den om objektet er en instance af PoliticalDictator,
                    // Hvis den er printer den kun information om PoliticalDictator
                    for (Leader leader : listOfLeaders()){
                        if(leader instanceof PoliticalDictator){
                            displayInfo(leader);
                        }
                    }
                }
                //Hvis input er "3". Så tjekker den om objektet er en instance af MilitaryDictator,
                    // Hvis den er printer den kun information om MilitaryDictator
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
