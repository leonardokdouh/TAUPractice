package web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class asd {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        List<int[]> thisArrayList = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int[] theList = new int[n];
            thisArrayList.add(theList);

            for (int k = 0; k < n; k++) {
                if (k == 0) {
                    theList[k] = a + (int) (Math.pow(2, k) * b);
                } else {
                    theList[k] = (int) ((Math.pow(2, k)) * b + theList[k - 1]);
                }
            }
            }
        thisArrayList.stream().forEach(listas->{
            Arrays.stream(listas).forEach(numerosss-> {
                System.out.print(numerosss + " ");
            });
            System.out.println("");
        });


        in.close();

        System.out.println("Hola");


    }




}
