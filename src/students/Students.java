package students;

import java.util.Scanner;

public class Students {

    public static void main(String[] args) {
        // __ __ __ __
        Person[] people = new Person[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            people[i] = new Person();
            System.out.println("\nEnter the name of the person");
            people[i].name = sc.nextLine();
            System.out.println("Enter the age of the person");
            people[i].age = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the address of the person");
            people[i].address = sc.nextLine();
        }

        Person person1 = new Person();
        person1.name = "Viktoriya";
        person1.age = 21;
        person1.address = "Isperih";


       /* Person person1 = new Person();
        person1.name = "Viktoriya";
        person1.age = 21;
        person1.address = "Isperih";

        Person person2 = new Person();
        person2.name = "Stanislava";
        person2.age = 20;
        person2.address = "Dobrich";

        Person person3 = new Person();
        person3.name = "Silviq";
        person3.age = 20;
        person3.address = "Teteven";

        if (person1.age > person2.age){
            if (person1.age > person3.age){
                System.out.println("Oldest is " + person1.name);
            } else {
                System.out.println("Oldest is " + person3.name);
            }
        } else if (person2.age > person3.age){
            System.out.println("Oldest is " + person2.name);
        } else {
            System.out.println("Oldest is " + person3.name);
        }
        */





     /*   String[] studentNames = new String[3];
        int[] studentAges = new int[3];
        String[] studentEmails = new String[3];





        System.out.println(person1.name);

        Student student1 = new Student();
        student1.name = "John";
        student1.age = 18;
        student1.email = "john@gmail.com";

        System.out.println(student1.name + " " + student1.age + " " + student1.email);

        Scanner input = new Scanner(System.in);

        //Input data from console for 3 students
        for (int counter = 0; counter < 3; counter++) {

            System.out.println("Enter student's name: ");
            studentNames[counter] = input.nextLine();

            System.out.println("Enter student's age: ");
            studentAges[counter] = input.nextInt();
            input.nextLine();

            System.out.println("Enter student's email: ");
            studentEmails[counter] = input.nextLine();
        }
         //  21   20    29
        //   __   __    __
        //  find the oldest student
        int maxAge = studentAges[0];
        int indexOfMaxAge = 0;
        for (int counter = 1; counter < 3; counter++) {
            if (studentAges[counter] > maxAge) {
                maxAge = studentAges[counter];
                indexOfMaxAge = counter;

            }
        }

        System.out.println("The oldest student is " + studentNames[indexOfMaxAge]);
        System.out.println("Their email: " + studentEmails[indexOfMaxAge]);
        System.out.println("Their age: " + maxAge);



*/


    }
}
