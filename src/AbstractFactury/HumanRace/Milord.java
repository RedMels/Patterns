package AbstractFactury.HumanRace;

import AbstractFactury.Leader;

public class Milord implements Leader {

    private static Milord milord;

    @Override
    public void motivate() {
        System.out.println("We will be covered with glory!");
    }

    @Override
    public void useSuperPower() {
        System.out.println("Pray for Gods blessing");
    }

    private Milord(){}

    public static synchronized Milord getMilord(){
        if (milord == null){
            milord = new Milord();
        }
        return milord;
    }
}
