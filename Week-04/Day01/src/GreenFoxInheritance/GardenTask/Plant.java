package GreenFoxInheritance.GardenTask;

import java.awt.*;
import java.util.Random;

public class Plant {
    public static int numberOfPlants = 0;
    public int waterNeeds = 0;
    private double waterAmount = 0;
    private String color;
    private boolean thirsty = true;
    public Plant(String color){
        this.color = color;
        numberOfPlants++;
    }
    public Plant(){
        Random random = new Random();
        Color color = new Color(random.nextInt());
        numberOfPlants++;
    }
    public double specificAmount() {
        return 1;
    }
    public void watering(double amount){
        if (thirsty){
            waterAmount += (amount/numberOfPlants)*specificAmount();
        }
        if (waterAmount>=waterNeeds){
            setThirsty(false);
        }
    }
    public double getWaterAmount() {
        return waterAmount;
    }
    public void setWaterAmount(double waterAmount) {
        this.waterAmount = waterAmount;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isThirsty() {
        return thirsty;
    }
    public void setThirsty(boolean thirsty) {
        this.thirsty = thirsty;
    }
    public int getWaterNeeds() {
        return waterNeeds;
    }
    public void setWaterNeeds(int waterNeeds) {
        this.waterNeeds = waterNeeds;
    }
}
