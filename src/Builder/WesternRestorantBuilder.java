package Builder;

public class WesternRestorantBuilder extends RestorantBuilder {

    @Override
    void buildName() {
        restorant.setName("Eastwood's");
    }

    @Override
    void buildService() {
        restorant.setService(Service.Evil);
    }

    @Override
    void BuildAverageCheck() {
        restorant.setAverageCheck(0.25);
    }
}
