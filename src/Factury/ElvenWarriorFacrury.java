package Factury;

public class ElvenWarriorFacrury implements WarriorFactury {
    @Override
    public Warrior createWarrior() {
        return new ElvenWarrior();
    }
}
