public abstract class Leader {
    protected String name;
    protected String country;
    protected int yearInPower;

    public Leader(String name, String country, int yearInPower) {
        this.name = name;
        this.country = country;
        this.yearInPower = yearInPower;
    }

    public abstract void giveSpeech();

    //Viser detailer i console.
    public void printDetails(){
        System.out.println("Name: " + name +
                            "\nCountry: " + country +
                            "\nYear In Power: " + yearInPower);
    }


}
