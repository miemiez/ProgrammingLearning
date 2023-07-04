package Day0609;

public class Language {

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    public static void main(String[] args) {
        Language spanish = new Language("Spanish",555000000,"Spain","subject-verb-object");
        spanish.getInfo();
        System.out.println();
        Mayan mayan = new Mayan("Ki'che'",2330000);
        mayan.getInfo();
        System.out.println();
        SinoTibetan sinoTibetan = new SinoTibetan("Chinese",1400000000);
        sinoTibetan.getInfo();
    }

    public Language(String name,int numSpeakers,String regionsSpoken,
                    String wordOrder) {
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
    }

    public void getInfo() {
        System.out.println(name + "is spoken by" + numSpeakers +
                "people mainly in" + regionsSpoken + "." +
                "\nThe language follows the word order: " + wordOrder +".");
    }

}
