package Day147Java归总练习;

class Noodle01 {

    double lengthInCentimeters;
    String shape;
    String texture = "brittle";

    public void cook() {

        this.texture = "cooked";

    }

    public static void main(String[] args) {

        Spaghetti spaghettiPomodoro = new Spaghetti();
        System.out.println(spaghettiPomodoro.texture);

    }

}
