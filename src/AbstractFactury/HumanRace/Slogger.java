package AbstractFactury.HumanRace;

import AbstractFactury.Worker;

public class Slogger implements Worker {
    @Override
    public void collectResources() {
        System.out.println("Sun is still high..");
    }

    @Override
    public void makeBuildings() {
        System.out.println("Will be done!");
    }
}
