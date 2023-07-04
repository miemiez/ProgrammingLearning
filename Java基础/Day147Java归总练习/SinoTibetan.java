package Day0609;

public class SinoTibetan extends Language {
    public SinoTibetan(String name,int numSpeakers) {
        super(name,numSpeakers,"Asia","Subject-object-verb");
        if (name == "Chinese") {
           wordOrder = "subject-verb-object";
        }
    }
}
