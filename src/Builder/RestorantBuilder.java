package Builder;

public abstract class RestorantBuilder {

    Restorant restorant;

    void createRestorant(){
        restorant = new Restorant();
    }

    abstract void buildName();

    abstract void buildService();

    abstract void BuildAverageCheck();

    Restorant getRestorant(){
        return restorant;
    }
}
