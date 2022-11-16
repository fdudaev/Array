package com.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class TestArray {

    public static void main(String[] args) {

        System.out.println(reverse(45678));

        int [] scores = {23, 45, 67, 89, 90, 99};

        scores[1] = 77;

/*        for (int i = 0; i < scores.length; i++){
            System.out.println(Math.floor(scores[i]));
        }*/


        String [] house = new String[3];
        house [1] = "Livingroom";
        house[0] =  "Kitchen";
        System.out.println(house[2]);

        ArrayList<String> household = new ArrayList<>();
        household.add(0, "fridge");
        household.add(1, "sink");
        household.add(2, "door");

        System.out.println(household);

        ArrayList<String> leavingroom = new ArrayList<>(Arrays.asList("TV", "sofa", "remote", "chair", "rug"));

        leavingroom.set(4, "remote"); // replacing rug with remote
        leavingroom.add(2, "tvStand");
        leavingroom.add("stairs");
        leavingroom.remove(0);
        System.out.println(leavingroom.contains("rug"));
        System.out.println(leavingroom.contains("chair"));
        System.out.println(leavingroom.size());
        System.out.println(leavingroom);

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 22, 45, 78));
        System.out.println(leavingroom.get(1) +" "+list.get(2));

        System.out.println(leavingroom +"__"+list);

        LinkedList<Integer> numbers = new LinkedList<>();




        ArrayList<String> manchesterUnited = new ArrayList<>(Arrays.asList("DDG", "Varane","Martinez"));
        manchesterUnited.add("Rashford");
        manchesterUnited.add("Antony");
        manchesterUnited.set(1, "CR7");
        System.out.println(manchesterUnited);


    }
    private static int reverse(int array){

         int revArr =  0;
         while (array != 0){
             int reminder = array % 10;
             revArr = (revArr*10) + reminder;
             array /= 10;
         }
         return revArr;

    }
}
