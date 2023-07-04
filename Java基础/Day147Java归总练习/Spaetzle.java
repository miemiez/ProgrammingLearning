package Day147Java归总练习;

class Spaetzle extends Noodle04 {

    Spaetzle() {

        super(3.0, 1.5, "irregular", "eggs, flour, salt");
        this.texture = "lumpy and liquid";

    }

    @Override
    public void cook() {

        System.out.println("Grinding or scraping dough.");
        System.out.println("Boiling.");
        this.texture = "cooked";

    }

}
