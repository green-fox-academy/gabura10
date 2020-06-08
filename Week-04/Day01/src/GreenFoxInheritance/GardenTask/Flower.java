package GreenFoxInheritance.GardenTask;

public class Flower extends Plant {
    private String name;
    public Flower(String color){
        setWaterNeeds(5);
        setName(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double specificAmount(){
        return 0.75;
    }
}
