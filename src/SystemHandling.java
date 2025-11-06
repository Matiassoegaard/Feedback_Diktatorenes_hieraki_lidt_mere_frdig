import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SystemHandling {

    //Her får man listen af leaders
    public List<Leader> listOfLeaders(){

            Leader politicalLeader = new PoliticalDictator("Palpatine","Galactic Empire",20,"Sith Party");
            Leader militaryLeader = new MilitaryDictator("Zod","Krypton",15,"General");

            List<Leader> listOfLeaders = new ArrayList<>();
            listOfLeaders.add(politicalLeader);
            listOfLeaders.add(militaryLeader);
            return listOfLeaders;
    }

    //Her håndterer vi menu og mulighed for vælge hvad man ville se.
    public void handleSystem(){
        Scanner input = new Scanner(System.in);

        listOfLeaders();

        while(true){
            System.out.println("---------------------" +
                    "\n1) Vis alle diktatorer" +
                    "\n2) Vis kun politisk diktator" +
                    "\n3) Vis kun militær diktator" +
                    "\n0) Afslut");

            String choice = input.nextLine().trim();

            switch(choice){
                case "0" -> {
                    System.out.println("Tak for denn gang!");
                    return;
                }
                case "1" -> {
                    for(Leader leader : listOfLeaders()){
                        leader.printDetails();
                        leader.giveSpeech();
                        if (leader instanceof PoliticalDictator){
                            System.out.println(((PoliticalDictator)leader).repressOpposition());
                            System.out.println(((PoliticalDictator)leader).implementPolicy("New Policy"));
                            System.out.println(((PoliticalDictator)leader).holdParade());
                        }
                        if (leader instanceof MilitaryDictator){
                            System.out.println(((MilitaryDictator)leader).repressOpposition());
                            System.out.println(((MilitaryDictator)leader).implementPolicy("New Policy"));
                            System.out.println(((MilitaryDictator)leader).holdParade());
                        }
                    }
                }
                case "2" -> {
                    for (Leader leader : listOfLeaders()){
                        if(leader instanceof PoliticalDictator){
                            leader.printDetails();
                            leader.giveSpeech();
                            System.out.println(((PoliticalDictator)leader).repressOpposition());
                            System.out.println(((PoliticalDictator)leader).implementPolicy("New Policy"));
                            System.out.println(((PoliticalDictator)leader).holdParade());
                        }
                    }
                }
                case "3" -> {
                    for(Leader leader : listOfLeaders()){
                        if(leader instanceof MilitaryDictator){
                            leader.printDetails();
                            leader.giveSpeech();
                            System.out.println(((MilitaryDictator)leader).repressOpposition());
                            System.out.println(((MilitaryDictator)leader).implementPolicy("New Policy"));
                            System.out.println(((MilitaryDictator)leader).holdParade());
                        }
                    }
                }
            }



        }
    }



}
