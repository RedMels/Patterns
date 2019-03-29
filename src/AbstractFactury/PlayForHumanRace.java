package AbstractFactury;

import AbstractFactury.HumanRace.HumanAllianceFactury;

public class PlayForHumanRace {
    public static void main(String[] args) {
        AbstractFactury factury = new HumanAllianceFactury();

        Leader leader = factury.getLeader();
        Warrior warrior = factury.getWarrior();
        Worker worker = factury.getWorker();

        System.out.println("let the battle begin..");

        leader.motivate();
        worker.collectResources();
        worker.makeBuildings();
        warrior.defead();
        leader.useSuperPower();
        warrior.attack();
    }
}
