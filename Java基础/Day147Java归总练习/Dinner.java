package Day147Java归总练习;

class Dinner {

    private void makeNoodles(Noodle05 noodle, String sauce) {

        noodle.cook();

        System.out.println("Mixing " + noodle.texture + " noodles made from " + noodle.ingredients + " with " + sauce + ".");
        System.out.println("Dinner is served!");

    }

    public static void main(String[] args) {

        Dinner noodlesDinner = new Dinner();

        Noodle05 biangBiang = new BiangBiang();
        noodlesDinner.makeNoodles(biangBiang, "soy sauce and chili oil");

    }

}
