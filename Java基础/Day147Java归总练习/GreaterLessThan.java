package Day147Java归总练习;

public class GreaterLessThan {
    public static void main(String[] args) {
        double creditsEarned = 176.5;
        double creditsOfSeminar = 8;
        double creditsToGraduate = 180;

        System.out.println(creditsEarned > creditsToGraduate);

        double creditsAfterSeminar = creditsEarned + creditsToGraduate;

        System.out.println(creditsToGraduate < creditsAfterSeminar);

    }
}
