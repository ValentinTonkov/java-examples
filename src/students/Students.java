package students;

import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        String[] studentNames = new String[3];
        int[] studentAges = new int[3];
        String[] studentEmails = new String[3];

        Scanner input = new Scanner(System.in);

        for (int counter = 0; counter < 3; counter++) {

            System.out.println("Enter student's name: ");
            studentNames[counter] = input.nextLine();

            System.out.println("Enter student's age: ");
            studentAges[counter] = input.nextInt();
            input.nextLine();

            System.out.println("Enter student's email: ");
            studentEmails[counter] = input.nextLine();
        }


    }
}
