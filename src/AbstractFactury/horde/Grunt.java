package AbstractFactury.horde;

import AbstractFactury.Warrior;

public class Grunt implements Warrior {
    @Override
    public void attack() {
        System.out.println("Brandish Axes");
    }

    @Override
    public void defead() {
        System.out.println("Parry");
    }
}
