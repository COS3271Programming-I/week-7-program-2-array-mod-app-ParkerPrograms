package Week_7;
import java.util.Arrays;
import java.util.Scanner;
public class Array_Mod_App {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		int number_of_integers = 0;
		while (number_of_integers<1 || number_of_integers>20) {
			System.out.print("How many numbers (up to 20) do you want to enter? ");
			number_of_integers = userinput.nextInt();
		}
		int[] integers = new int[number_of_integers];
		System.out.print("Enter " + number_of_integers + " integers: ");
		for (int i=0; i<number_of_integers; i++) {integers[i] = userinput.nextInt();}
		System.out.print("Do you want to change a number from the list? (y or n): ");
		userinput.nextLine();
		String answer = userinput.nextLine();
		int location, new_number;
		while (answer.equals("y")) {
			System.out.println("Here is the current list: " + Arrays.toString(integers));
			System.out.print("Enter the location of the number you want to change (1-" + number_of_integers + "): ");
			location = userinput.nextInt();
			System.out.print("Enter the new number: ");
			new_number = userinput.nextInt();
			integers[location-1] = new_number;
			System.out.print("Do you want to change another number from the list? (y or n): ");
			userinput.nextLine();
			answer = userinput.nextLine();
		}
		
		Arrays.sort(integers,0,number_of_integers);
		System.out.println("Here is the final list from lowest to highest: " + Arrays.toString(integers));
	}

}
