package AbstractFactury.HumanRace;

import AbstractFactury.*;

public class HumanAllianceFactury implements AbstractFactury {
    @Override
    public Warrior getWarrior() {
        return new Soldier();
    }

    @Override
    public Worker getWorker() {
        return new Slogger();
    }

    @Override
    public Leader getLeader() {
        return Milord.getMilord();
    }
}
