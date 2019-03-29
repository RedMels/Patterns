package AbstractFactury.horde;

import AbstractFactury.Worker;

public class Peon implements Worker {
    @Override
    public void collectResources(){
        System.out.println("work-work!");
    }

    @Override
    public void makeBuildings(){
        System.out.println("okay..");
    }
}
