package Factury;

public class HumanWarriorFactury implements WarriorFactury{
    @Override
    public Warrior createWarrior() {
        return new HumanWarrior();
    }
}
