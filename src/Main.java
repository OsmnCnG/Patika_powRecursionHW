
import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {



    static double powerRecursive(int base,int power){

        if (power==0)
        return 1;
        else
        return base* powerRecursive(base,power-1);
    }

    /*
        1^1=1
        1^2=1*1
        2^3=2*2*2=2*(2^2)
    */


    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        System.out.println("enter the base value:");
        int taban=keyboard.nextInt();
        System.out.println("enter the power:");
        int üs=keyboard.nextInt();
        System.out.println(powerRecursive(taban,üs));

    }
}