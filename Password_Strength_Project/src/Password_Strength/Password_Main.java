package Password_Strength;
import java.util.Scanner;
import java.util.ArrayList;
public class Password_Main {
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
	        ArrayList<User_input> users = new ArrayList<>();
	        int choice;

	        do {
	            System.out.println("\n==== Cybersecurity Simulator ====");
	            System.out.println("1. Create Account");
	            System.out.println("2. Analyze Password Strength");
	            System.out.println("3. Simulate Brute Force Attack");
	            System.out.println("4. Exit");
	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();
	            sc.nextLine();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter username: ");
	                    String uname = sc.nextLine();
	                    System.out.print("Enter password: ");
	                    String pwd = sc.nextLine();
	                   // users.add(new User_input(uname, pwd));
	                    System.out.println("Account created.");
	                    break;

	                case 2:
	                    System.out.print("Enter password to analyze: ");
	                    String pass = sc.nextLine();
	                    System.out.println("Strength: " + Password_Analyser .Check_Strength(pass));
	                    long time = Password_Analyser .guessBruteForceAttackTime(pass);
	                    System.out.println("Estimated time to brute-force (in seconds): " + time);
	                    break;

	                case 3:
	                    System.out.print("Enter password to simulate attack: ");
	                    String target = sc.nextLine();
	                    Password_Simulator.attack(target);
	                    break;

	                case 4:
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice.");
	            }

	        } while (choice != 4);

	        sc.close();

		}

	}

