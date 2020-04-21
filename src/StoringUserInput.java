import java.util.Scanner;

public class StoringUserInput {
    public static void main (String args[]) {
        Scanner Input = new Scanner(System.in);
        System.out.println("What is the First Initial?" );
        String firstInitial = Input.nextLine();
        System.out.println("What is the Last Name? ");
        String lastName = Input.nextLine();
        System.out.println( "What is the House Number? ");
        int houseNumber = Input.nextInt();
        System.out.println("What is the Street Name? ");
        Input.nextLine();
        String streetName = Input.nextLine();
        System.out.println("What is the Street Type? ");
        String streetType = Input.nextLine();
        System.out.println("What is the City? ");
        String city = Input.nextLine();
        System.out.println("Your First Letter of the Name is: " + firstInitial + "\n" + "Your Last Name is: " + lastName + "\n" + "Your house number is: " + houseNumber);
        System.out.println("Your Street Name is: " + streetName + "\n" + "Your Street Type is: " + "\n" + "Your city is: " + city);
    }
}
