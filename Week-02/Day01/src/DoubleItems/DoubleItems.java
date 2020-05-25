package DoubleItems;

public class DoubleItems {
    static int doubling (int x){
        return x*2;
    }
    public static void main(String[] args) {
        int[] numList = {3, 4, 5, 6, 7};
        for (int i = 0; i < numList.length; i++) {
            System.out.println(doubling(numList[i]));
        }

        }

    }



