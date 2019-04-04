package Prototype;

public class VersionControlRunner
{
    public static void main(String[] args) {
        Project master = new Project(0.9, "Test", "010101110101010101001010101010...10101001");

        System.out.println(master);

        System.out.println("\n ==============================\n");

        ProjectFactory factory = new ProjectFactory(master);

        Project version0 = factory.copy();

        System.out.println(version0);

        System.out.println("\n ==============================\n");

        master.setProjectName("Prototype");
        master.setVersion(1);
        master.setSourceCode("01010100101.....010101110101010101001010101010...10101001");

        System.out.println(master);


        System.out.println("\n ==============================\n");

        System.out.println(version0);

    }
}
