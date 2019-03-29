package AbstractFactury.HumanRace;

import AbstractFactury.Warrior;

public class Soldier implements Warrior {
    @Override
    public void attack() {
        System.out.println("Sword Strike");
    }

    @Override
    public void defead() {
        System.out.println("Rise shield");
    }
}
