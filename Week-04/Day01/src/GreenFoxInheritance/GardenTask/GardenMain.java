package GreenFoxInheritance.GardenTask;

public class GardenMain {
    public static void main(String[] args) {
        Flower yellow = new Flower("yellow");
        Flower blue = new Flower("blue");
        Tree purple = new Tree("purple");
        Tree orange = new Tree("orange");
        Garden garden = new Garden();
        garden.addFlowers(yellow);
        garden.addFlowers(blue);
        garden.addTrees(purple);
        garden.addTrees(orange);
        garden.status();
        garden.gardenWatering(40);
        garden.status();
        garden.gardenWatering(70);
        garden.status();


    }
}
