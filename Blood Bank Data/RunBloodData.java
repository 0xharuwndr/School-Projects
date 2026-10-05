import java.util.Scanner;

public class RunBloodData {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BloodData bd = new BloodData();

		System.out.print("Enter blood type of patient: ");
		String bloodType = sc.nextLine();

		System.out.print("Enter the Rhesus factor (+ or -): ");
		String rhFactor = sc.nextLine();

		if (!bloodType.isEmpty() && !rhFactor.isEmpty()) {
			bd.setBloodType(bloodType);
			bd.setRhFactor(rhFactor);
		}

		bd.display();

		sc.close();
	}
}