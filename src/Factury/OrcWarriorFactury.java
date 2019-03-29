package Factury;

public class OrcWarriorFactury implements WarriorFactury{
    @Override
    public Warrior createWarrior(){
        return new OrcWarrior();
    }
}
