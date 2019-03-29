package Factury;

public class Game {
    public static void main(String[] args) {
        WarriorFactury warriorFactury = CreateByRace ("Gnome");
        Warrior warrior = warriorFactury.createWarrior();

        warrior.goToWar();
    }

    public static WarriorFactury CreateByRace(String race){
        if (race.equalsIgnoreCase("Human")){
            return new HumanWarriorFactury();
        }
        else if (race.equalsIgnoreCase("Orc")){
            return new OrcWarriorFactury();
        }
        else if (race.equalsIgnoreCase("Elf")){
            return new ElvenWarriorFacrury();
        }
        else throw new RuntimeException("Race doesn't exist!");
    }
}
