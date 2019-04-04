package AbstractFactury.horde;

import AbstractFactury.*;

public class OrcClanFactury implements AbstractFactury {
    @Override
    public Warrior getWarrior() {
        return new Grunt();
    }

    @Override
    public Worker getWorker() {
        return new Peon();
    }

    @Override
    public Leader getLeader() {
        return Warchief.getWarchief();
    }
}
