import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {


        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To save the result of your list.");
        System.out.println("\t 7 - to quit the application.");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scan.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Current item item: ");
        String itemNum = scan.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scan.nextLine();
        groceryList.modifyGroceryItem(itemNum, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item name: ");
        String itemNum = scan.nextLine();
        groceryList.removeGroceryItem(itemNum);
    }

    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scan.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.print("Found " + searchItem + " in our grocery list.");
        } else {
            System.out.print(searchItem + " is not in the shopping list.");
        }
    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());
        System.out.println(newArray);

        //ArrayList<String> nexArray = new ArrayList<>(groceryList.getGroceryList()); // creating brand-new list (nextArray) and saves the result of groceryList.getGroceryList()
/*        String [] myArray = new String[groceryList.getGroceryList().size()]; // next two lines of code is another way to store your array
        myArray = groceryList.getGroceryList().toArray(myArray);*/
    }










       /* String[] fruits = {"Apple", "Pear", "Banana"};
        for (String i: fruits){
            System.out.println(i);
        }

        int[] fullArray = {1, 2, 3};
        for (int i : fullArray){ // print our full array
            System.out.println(i);
        }

        // creating new array and adding values via for loop;
        int[] newArray = new int[5]; // empty array with capacity of 5 values;
        for (int i = 0; i < newArray.length; i++) {  // getting the length of an newArray
            newArray[i] = i * 10; // multiplying i after each iteration by 10
        }
        printArray(newArray);


*//*        int [] myArray = new int [10]; // creating an array with capacity of 10 values
        myArray[1] = 12; // saving value 12 at index 1
        myArray[8] = 200; // saving value 200 at index 8
        System.out.println(myArray.length); // will print out the length of array
        System.out.println(myArray[6]); // will print our 0 as we haven't set a value at index 6
        System.out.println(myArray[8]);

       double [] myDoubleArray = new double[10];
       myDoubleArray[2] = 23;
        System.out.println(myDoubleArray[2]);
    *//*
    }
    public static void printArray(int [] array){
        for (int i =0; i<array.length; i++){ // going through the loop again to assign values of previous loop to indices
            System.out.println("Element "+ i + ", values is "+ array[i]); // printing each iteration
        }
*/

}