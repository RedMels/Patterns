package Builder;

public class Restorant {

    private String name;
    private Service service;
    private double averageCheck;

    public void setName(String name) {
        this.name = name;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public void setAverageCheck(double averageCheck) {
        this.averageCheck = averageCheck;
    }

    @Override
    public String toString() {
        return "Restorant{" +
                "name='" + name + '\'' +
                ", service=" + service +
                ", averageCheck=" + averageCheck +
                '}';
    }
}
