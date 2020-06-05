package Pirate;


import java.util.ArrayList;

public class PirateMain {
    public static void main(String[] args) {
       Pirate Andi = new Pirate();
       Pirate Alex = new Pirate();
       Ship ship = new Ship();
       Ship secondShip = new Ship();
       ship.fillShip();
       secondShip.fillShip();
       ship.battle(secondShip);




        }

    }
