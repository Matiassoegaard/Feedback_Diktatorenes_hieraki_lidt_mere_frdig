import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Leader politicalLeader = new PoliticalDictator("Palpatine","Galactic palpatine",20,"Sith Party");
        Leader militaryLeader = new MilitaryDictator("Zod","Krypton",15,"General");

        List<Leader> listOfLeaders = new ArrayList<>();
        listOfLeaders.add(politicalLeader);
        listOfLeaders.add(militaryLeader);

        for(Leader leader : listOfLeaders){
            leader.printDetails();
            if (leader instanceof PoliticalDictator){
                ((PoliticalDictator)leader).giveSpeach();
                ((PoliticalDictator)leader).repressOpposition();
                ((PoliticalDictator)leader).implementPolicy();
                ((PoliticalDictator)leader).holdParade();
            }
            if (leader instanceof MilitaryDictator){
                ((MilitaryDictator)leader).giveSpeach();
                ((MilitaryDictator)leader).repressOpposition();
                ((MilitaryDictator)leader).implementPolicy();
                ((MilitaryDictator)leader).holdParade();
            }
        }



    }
}
