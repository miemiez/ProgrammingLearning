package Day0609;

public class EqualNotEqual {
    public static void main(String[] args) {
        int songA = 9;
        int songB = 9;
        int albumLengthA = 41;
        int albumLengthB = 53;

        boolean sameNumberOfSongs = songA == songB;
        boolean differentLength = albumLengthA != albumLengthB;

        System.out.println(sameNumberOfSongs);
        System.out.println(differentLength);


    }
}
