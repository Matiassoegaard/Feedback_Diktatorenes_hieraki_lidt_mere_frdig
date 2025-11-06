public class PoliticalDictator extends Leader implements PowerActions{
    private String partyName;

    public PoliticalDictator(String name, String country, int yearInPower,String partyName) {
        super(name, country, yearInPower);
        this.partyName = partyName;
    }

    @Override
    public void giveSpeach(){
        System.out.println(partyName + " gives a beautiful political speach.");
    }

    @Override
    public void printDetails(){
        System.out.println("Name: " + name +
                "\nCountry: " + country +
                "\nYear In Power: " + yearInPower +
                "\nParty Name: " + partyName);
    }

    @Override
    public void implementPolicy(){
        System.out.println(name + " is implementing a new policy.");
    }

    @Override
    public void repressOpposition(){
        System.out.println(name + " is repressing the opposition through political mean.");
    }

    @Override
    public void holdParade(){
        System.out.println(name + " is holding a political parade.");
    }





}
