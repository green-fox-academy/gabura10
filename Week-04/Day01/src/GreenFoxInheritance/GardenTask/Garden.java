package GreenFoxInheritance.GardenTask;

import java.util.ArrayList;

public class Garden {
    public Garden(){
    }
    private ArrayList<Flower> flowers = new ArrayList<>();
    private ArrayList<Tree> trees = new ArrayList<>();

    public void addFlowers(Flower a) {
        flowers.add(a);
    }

    public void addTrees(Tree a) {
        trees.add(a);
    }
    public void status(){
        for (int i = 0; i <flowers.size() ; i++) {
            if(flowers.get(i).isThirsty()){
                System.out.println("The "+flowers.get(i).getName()+" Flower needs water");
            }else{
                System.out.println("The "+flowers.get(i).getName()+" Flower doesnt need water");
            }
        }
        for (int i = 0; i <trees.size() ; i++) {
            if (trees.get(i).isThirsty()){
                System.out.println("The "+trees.get(i).getName()+" Tree needs water");
            }else{
                System.out.println("The "+trees.get(i).getName()+" Tree doesnt need water");
            }
        }
    }
    public void gardenWatering(double amount){
        for (int i = 0; i < flowers.size(); i++) {
            flowers.get(i).watering(amount);
        }
        for (int i = 0; i <trees.size() ; i++) {
            trees.get(i).watering(amount);
        }
    }
}

