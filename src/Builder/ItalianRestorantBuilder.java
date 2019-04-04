package Builder;

public class ItalianRestorantBuilder extends RestorantBuilder {
    @Override
    void buildName() {
        restorant.setName("Venice");
    }

    @Override
    void buildService() {
        restorant.setService(Service.Good);
    }

    @Override
    void BuildAverageCheck() {
        restorant.setAverageCheck(50);
    }
}
