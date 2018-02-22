import java.util.*;
public class DMV extends License
{
	static Scanner scan = new Scanner(System.in);
	static ArrayList<License> licArray = new ArrayList<License>();

	public static void main(String args[])
	{
		int count = 0;
		boolean run = true;
		System.out.println("Welcome to the DMV!");
		
		System.out.println("What is your first name: ");
		String first = scan.nextLine();
		System.out.println("What is your middle name: ");
		String mid = scan.nextLine();
		System.out.println("What is your last name: ");
		String last = scan.nextLine();
		System.out.println("What is your date of birth: ");
		String dOB = scan.nextLine();

		License person = new License(last, mid, first, dOB);
		licArray.add(person);

		System.out.println("------------------------------------------");
		System.out.println("California Drivers License");
		System.out.println("LIC# " + licArray.get(0).getLicNumber() + "\n");
		System.out.println("LN " + licArray.get(0).getLastName());
		System.out.println("FN " + licArray.get(0).getFirstName());
		System.out.println("MN " + licArray.get(0).getMidName());
		System.out.println("DOB " + licArray.get(0).getDateOB());
		System.out.println("EXP " + licArray.get(0).getExDate());
		System.out.println("------------------------------------------" + "\n");

		while(run == true){
			System.out.println("1. Issue a new license");
			System.out.println("2. List all Licensed drivers");
			System.out.println("3. List info of particular driver, need LIC#");
			System.out.println("4. Change name of driver, need LIC#");
			System.out.println("5. Exit");
			int decision = scan.nextInt();

			if(decision == 1){
				count++;
				System.out.println("What is your first name: ");
				first = scan.nextLine();
				System.out.println("What is your middle name: ");
				mid = scan.nextLine();
				System.out.println("What is your last name: ");
				last = scan.nextLine();
				System.out.println("What is your date of birth: ");
				dOB = scan.nextLine();

				License person1 = new License(last, mid, first, dOB);
				licArray.add(person1);

				System.out.println("------------------------------------------");
				System.out.println("California Drivers License");
				System.out.println("LIC# " + licArray.get(count).getLicNumber() + "\n");
				System.out.println("LN " + licArray.get(count).getLastName());
				System.out.println("FN " + licArray.get(count).getFirstName());
				System.out.println("MN " + licArray.get(count).getMidName());
				System.out.println("DOB " + licArray.get(count).getDateOB());
				System.out.println("EXP " + licArray.get(count).getExDate());
				System.out.println("------------------------------------------" + "\n");
				}
			else if(decision == 2){
				for(int i = 0; i < licArray.size();i++){
					System.out.println(licArray.get(i) + "\n");
					}
				}
			else if(decision == 3){
				System.out.println("Please enter the LIC#");
				String input = scan.nextLine();
				input = scan.nextLine();
				for(int z = 0; z < licArray.size();z++){
					if(input.equals(licArray.get(z).getLicNumber())){
						System.out.println(licArray.get(z));
					}
				}
			}
			else if(decision == 4){
				System.out.println("Please enter the LIC#");
				String input2 = scan.nextLine();
				input2 = scan.nextLine();
				for(int k = 0;k < licArray.size();k++){
					if(input2.equals(licArray.get(k).getLicNumber())){
						System.out.println("Change first name: ");
						first = scan.nextLine();
						System.out.println("Change middle name: ");
						mid = scan.nextLine();
						System.out.println("Change last name: ");
						last = scan.nextLine();
						licArray.get(k).setFirstName(first);
						licArray.get(k).setMidName(mid);
						licArray.get(k).setLastName(last);
						licArray.get(k).setLicNumber(last);
				}
			}
		}
	}
}
}

