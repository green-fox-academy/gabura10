package VariableMutation;

import javax.swing.*;
import java.io.PrintStream;

public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        System.out.println(a+10);
        int b = 100;
        System.out.println(b-7);
        int c = 44;
        System.out.println(c*2);
        int d = 125;
        System.out.println(d/5);
        int e = 8;
        System.out.println(e^=3);

        int f1 = 123;
        int f2 = 345;
        boolean x = false;
        if ( f1>f2 == x ) {
            System.out.println(x);
        }
        int g1 = 350;
        int g2 = 200;
        boolean y = true;
        if ( (g2*2)>g1 == y ){
            System.out.println(y);
        }

        int h = 135798745;
        boolean hi = false;
        if ( h%11 > 0) {
            System.out.println(hi);
        }
        int i1 = 10;
        int i2 = 3;
        int i3 = i2*i2;
        int i4 = i2*i2*i2;
        boolean i = true;
        if (i1>i3 && i1<i4 == true){
            System.out.println(i);
        }
        int j = 1521;
        boolean j1 = false;
        if (j%3==0 || j%5==0 ){
            System.out.println(j1);
        }
        }
        }




