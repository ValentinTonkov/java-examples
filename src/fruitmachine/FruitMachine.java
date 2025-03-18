package fruitmachine;

import java.util.Scanner;

public class FruitMachine {

    public static void main(String[] args) {

        int[] availableQuantity = {8, 5, 4, 7, 3};
        String[] fruitNames = {"apple", "orange", "grape", "banana", "pineapple"};
        Scanner scanner = new Scanner(System.in);

        // Apple   Orange   Grape   Banana  Pineapple
        //  8        5        4       7         3

        /*
         * Choose fruit:
         * apple(0), orange(1),  grape(2),  banana(3),  pineapple(4)
         * */

        String option;
        while (1 == 1){
            System.out.println("Choose a fruit:");
            System.out.println("apple, orange,  grape,  banana,  pineapple");
            option = scanner.nextLine();
            for (int i = 0; i < fruitNames.length; i++){
                if (fruitNames[i].equals(option)){
                    if (availableQuantity[i] == 0){
                        System.out.println(fruitNames[i] + " not available");
                        break;
                    }
                    availableQuantity[i]--;
                    break;
                }
            }



            if (option.equals("apple")){
                if (availableQuantity[0] > 0) {
                    availableQuantity[0]--;
                } else {
                    System.out.println("Not available!");
                }
            } else if (option.equals("orange")){
                availableQuantity[1]--;
            } else if (option.equals("grape")){
                availableQuantity[2]--;
            } else if (option.equals("banana")){
                availableQuantity[3]--;
            } else if (option.equals("pineapple")){
                availableQuantity[4]--;
            } else {
                System.out.println("Invalid option");
            }

        }


    }
}
