package AbstractFactury.horde;

import AbstractFactury.Leader;

public class Warchief implements Leader {

    private static Warchief warchief;

    @Override
    public void motivate(){
        System.out.println("For our ancestors!");
    }

    @Override
    public void useSuperPower(){
        System.out.println("Get reinforced by the power of earth, water and fire");
    }

    private Warchief(){}

    static synchronized Warchief getWarchief(){
        if (warchief == null){
            warchief = new Warchief();
        }
        return warchief;
    }
}
