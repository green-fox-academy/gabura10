package GreenFoxInheritance.GardenTask;

public class Tree extends Plant {
    private String name;
    public Tree(String color){
        setWaterNeeds(10);
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
        return 0.4;
    }
}

