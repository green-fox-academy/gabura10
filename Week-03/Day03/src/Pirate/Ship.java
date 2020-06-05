package Pirate;

import java.util.ArrayList;
import java.util.Random;

public class Ship {
    private int alivePirates;
    ArrayList<Pirate> crew = new ArrayList<>();
    Random random = new Random();
    int addPirates = random.nextInt(11);

    public void fillShip() {
        if (addPirates == 0){
            addPirates++;
        }
        for (int i = 0; i < addPirates; i++) {
            crew.add(new Pirate());
            alivePirates++;
        }
        crew.get(random.nextInt(addPirates)).setCaptain();
        ;

    }

    public void status() {
        for (int i = 0; i < crew.size(); i++) {
            if (crew.get(i).isCaptain() == true) {
                System.out.println("The captain is: " + crew.get(i).getName());
                System.out.println("The state of the captain is: " + crew.get(i).isAlive() + " / " + crew.get(i).isSleep());
                System.out.println("The captain consumed " + crew.get(i).getDrinkCounter() + " rum");
            }

        }
        System.out.println("The number of alive pirates: " + alivePirates);
    }

    public boolean battle(Ship a) {
        boolean victory = this.calculate(a);
        this.crew = crew;
        Random random = new Random();
        int rumParty = random.nextInt(crew.size());
        if (rumParty==0){
            rumParty++;
        }
        int death = random.nextInt(crew.size());
        if (death == 0){
            death++;
        }
        if (victory==true){
            System.out.println("You win");
            System.out.println("Lets party");
            for (int i = 0; i <crew.size() ; i++) {
                if(crew.get(i).isCaptain()==true){
                    crew.get(i).setDrinkCounter(rumParty);
                }

            }
        }else{
            System.out.println("You lost");
            for (int i = 0; i <death ; i++) {
                crew.get(i).die();
            }
            System.out.println(death+" pirate died from your crew");


        }return victory;
    }

    public boolean calculate(Ship a) {
        int captainRum = 0;
        int theirCaptainRum = 0;
        int ourScore = 0;
        int theirScore = 0;
        for (Pirate crewmember : crew) {
            if (crewmember.isAlive().equals("Alive") && crewmember.isSleep().equals("Awake")) {
                ourScore++;
            }
        }
        for (int i = 0; i < crew.size(); i++) {
            if (crew.get(i).isCaptain() == true) {
                captainRum = crew.get(i).getDrinkCounter();
            }

        }

        for (Pirate enemyCrewMember : a.crew) {
            if (enemyCrewMember.isAlive().equals("Alive") && enemyCrewMember.isSleep().equals("Awake")) {
                theirScore++;
            }
        }
        for (int i = 0; i < a.crew.size(); i++) {
            if (a.crew.get(i).isCaptain() == true) {
                theirCaptainRum = a.crew.get(i).getDrinkCounter();
            }
        }if (ourScore - captainRum > theirScore - theirCaptainRum) {
                    return true;
                } else {
                    return false;
        }
    }

}


