public class MilitaryDictator extends Leader implements PowerActions{
    private String militaryRank;

    public MilitaryDictator(String name, String country, int yearInPower, String militaryRank) {
        super(name, country, yearInPower);
        this.militaryRank = militaryRank;
    }

    //Metoder der er blevet implementeret fra super klassen Leader
    @Override
    public void giveSpeach() {
        System.out.println("Military dictator gives speach");
    }
    //Metoder der er blevet implementeret fra super klassen Leader
    @Override
    public void printDetails() {
        System.out.println("Name: " + name +
                "\nCountry: " + country +
                "\nYear In Power: " + yearInPower +
                "\nMilitary Rank: " + militaryRank);
    }

    @Override
    public void implementPolicy(String newPolicy) {
        System.out.println(name + " dictator implements a new policy: " + newPolicy);
    }

    @Override
    public void repressOpposition() {
        System.out.println(name + " dictator represses opposition");
    }

    @Override
    public void holdParade() {
        System.out.println(name + " holds a big military parade");
    }


}
