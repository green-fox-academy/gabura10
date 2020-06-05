package Pirate;

public class Pirate {
    private String name;
    private static int drinkCounter = 0;
    private double chance = Math.random();
    private boolean isCaptain = false;
    private boolean isCrewmate = false;
    private boolean alive = true;
    private boolean sleep = false;

    public Pirate() {
        this.name = "Jack";
    }

    public Pirate(String name) {

        this.name = name;
    }
    public int drinkSomeRum() {
        if (alive = true) {
            drinkCounter++;
        }
        return drinkCounter;
    }

    public void howsItGoingMate() {
        if (alive = true && drinkCounter <= 4) {
            System.out.println("Pour me anudder");
            drinkCounter++;
        } else {
            System.out.println("Arghh,I'ma Pirate. How d'ya d'ink its goin?");
            drinkCounter++;
            sleep = true;
        }
    }

    public boolean die() {
        return alive = false;
    }

    public void brawl(Pirate a) {
        if (chance < 0.33) {
            alive = false;
        } else if (chance < 0.66) {
            a.alive = false;
        } else {
            a.sleep = true;
            sleep = true;
        }
    }
    public String isSleep() {
        if(sleep==true) {
            return "Passed out";
        }else{
            return "Awake";
        }
    }

    public int getDrinkCounter() {
        return drinkCounter;
    }

    public void setDrinkCounter(int drinkCounter) {
        Pirate.drinkCounter = drinkCounter;
    }

    public String getName() {
        return name;


    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCaptain() {
        isCaptain = true;
    }

    public boolean isCaptain() {
        return isCaptain;
    }

    public String isAlive() {
        if (alive==true) {
            return "Alive";
        }else{
            return "Died";
        }
    }
}



