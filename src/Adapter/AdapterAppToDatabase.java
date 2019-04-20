package Adapter;

public class AdapterAppToDatabase extends ExampleApp implements Database
{

    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void revove() {
        deleteObject();
    }
}
