public class PoliticalDictator extends Leader implements PowerActions{
    private String partyName;

    //Constructor til PoliticalDictator klasse.
    public PoliticalDictator(String name, String country, int yearInPower,String partyName) {
        super(name, country, yearInPower);
        this.partyName = partyName;
    }

    //Metoder der er blevet implementeret fra super klassen Leader
    @Override
    public void giveSpeech(){
        System.out.println(name + " gives a beautiful political speech.");
    }

    //Metoder der er blevet implementeret fra super klassen Leader
    @Override
    public void printDetails(){
        System.out.println("\nName: " + name +
                "\nCountry: " + country +
                "\nYear In Power: " + yearInPower +
                "\nParty Name: " + partyName);
    }

    //Metoder der er blevet implementeret fra interfacen PowerActions
    @Override
    public String implementPolicy(String newPolicy){
        return name + " is implementing a new policy: " + newPolicy;
    }

    //Metoder der er blevet implementeret fra interfacen PowerActions
    @Override
    public String repressOpposition(){
        return name + " is repressing the opposition through political mean.";
    }

    //Metoder der er blevet implementeret fra interfacen PowerActions.
    @Override
    public String holdParade(){
        return name + " is holding a political parade.";
    }





}
