package Day147Java归总练习;

public class SinoTibetan extends Language {
    public SinoTibetan(String name,int numSpeakers) {
        super(name,numSpeakers,"Asia","Subject-object-verb");
        if (name == "Chinese") {
           wordOrder = "subject-verb-object";
        }
    }
}
