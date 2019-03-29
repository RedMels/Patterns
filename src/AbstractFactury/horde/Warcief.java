package AbstractFactury.horde;

import AbstractFactury.Leader;

public class Warcief implements Leader {

    private static Warcief warcief;

    @Override
    public void motivate(){
        System.out.println("For our ancestors!");
    }

    @Override
    public void useSuperPower(){
        System.out.println("Get reinforced by the power of earth, water and fire");
    }

    private Warcief(){}

    public static Warcief getWarcief(){
        if (warcief == null){
            warcief = new Warcief();
        }
        return warcief;
    }
}
