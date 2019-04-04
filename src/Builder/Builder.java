package Builder;

public class Builder {
    RestorantBuilder builder;

    public void setBuilder(RestorantBuilder builder) {
        this.builder = builder;
    }

    Restorant buildRestorant(){
        builder.createRestorant();
        builder.buildName();
        builder.buildService();
        builder.BuildAverageCheck();

        return builder.getRestorant();
    }
}
