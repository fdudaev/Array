import java.util.ArrayList;
import java.util.LinkedList;

public class Arrays {
    public static void main(String[] args) {

        String name = "farrukh";
        String reversIt = "";

        for (int i = 0; i<name.length(); i++){
            reversIt = name.charAt(i) + reversIt;
        }
        System.out.println(reversIt);

        int zero = 0;
        int y = 2345;

        while (y != 0){
            int reminder = y % 10;
            zero = (zero * 10) + reminder;
            y /= 10;
        }
        System.out.println(zero);









        LinkedList<String> firstNames = new LinkedList<>();
        firstNames.add("Aisha");
        firstNames.add("Aliya");
        firstNames.add("Bilal");

        ArrayList<String> lastNames = new ArrayList<>();
        lastNames.add("Farrukhi");
        lastNames.add("Zaripova");
        lastNames.add("Zaripov");
        System.out.println(firstNames.get(0) +" "+lastNames.get(0));





    }
}
