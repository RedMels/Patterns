package Builder;

public class BuilderRunner {

    public static void main(String[] args) {
        Builder builder = new Builder();
        Restorant restorant;

        builder.setBuilder(new WesternRestorantBuilder());

        restorant = builder.buildRestorant();

        System.out.println(restorant);
    }
}
