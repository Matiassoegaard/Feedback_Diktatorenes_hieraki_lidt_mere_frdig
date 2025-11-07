public class MilitaryDictator extends Leader implements PowerActions{
    private String militaryRank;


    //Constructor til MilitaryDictator klasse.
    public MilitaryDictator(String name, String country, int yearInPower, String militaryRank) {
        super(name, country, yearInPower);
        this.militaryRank = militaryRank;
    }

    //Metoder der er blevet implementeret fra super klassen Leader
    @Override
    public void giveSpeech() {
        System.out.println( name + " gives a fearful speech");
    }
    //Metoder der er blevet implementeret fra super klassen Leader
    @Override
    public void printDetails() {
        System.out.println("\nName: " + name +
                            "\nCountry: " + country +
                            "\nYear In Power: " + yearInPower +
                            "\nMilitary Rank: " + militaryRank);
    }

    //Metoder der er blevet implementeret og override fra interfacen PowerActions
    @Override
    public void implementPolicy(String newPolicy) {
        System.out.println(name + " dictator implements a new policy: " + newPolicy); ;
    }

    //Metoder der er blevet implementeret og override fra interfacen PowerActions
    @Override
    public void repressOpposition() {
        System.out.println(name + " dictator represses opposition");
    }

    //Metoder der er blevet implementeret og override fra interfacen PowerActions
    @Override
    public void holdParade() {
        System.out.println(name + " holds a big military parade");
    }
}
