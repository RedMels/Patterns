package Adapter;

public class DataBaseRunner
{
    public static void main(String[] args) {
        Database database = new AdapterAppToDatabase();

        database.insert();
        database.update();
        database.select();
        database.revove();
    }
}
