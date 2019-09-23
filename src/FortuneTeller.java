import java.util.Scanner;

public class FortuneTeller {

	private static Scanner userinput = new Scanner(System.in);

	public static void main(String[] args) {

		String firstName = askForFirstName();

		String lastName = askForLastName();

		int userAge = askForUserAge();

		int userBirthMonth = askForBirthMonth();

		String favouriteColor = askForFavouriteColor();

		int siblingCount = askForSiblingCount();

		int retirementYears = determineRetirementYears(userAge);

		String vacationHome = determineVacationHome(siblingCount);

		String modeOfTransit = determineModeOfTransit(favouriteColor);

		String amountBankBalance = determineBankBalance(userBirthMonth);

		giveFortune(firstName, lastName, retirementYears, vacationHome, modeOfTransit, amountBankBalance);
	}

	private static void giveFortune(String firstName, String lastName, int retirementYears, String vacationHome,
			String modeOfTransit, String amountBankBalance) {
		System.out.println(firstName + " " + lastName + " " + "will retire in " + retirementYears + " years, "
				+ "a vacation home in " + vacationHome + ", " + "and travel by " + modeOfTransit + ", "
				+ "and will make a balance of " + amountBankBalance + ".");

	}

	private static String determineBankBalance(int userBirthMonth) {
		if (userBirthMonth > 12) {
			return "$0.00";
		} else if (userBirthMonth >= 9) {
			return "$86.23";
		} else if (userBirthMonth >= 5) {
			return "$3,687,105.42";
		} else if (userBirthMonth >= 1) {
			return "$256,000.76";
		} else {
			return "$0.00";
		}

	}

	private static String determineModeOfTransit(String favouriteColor) {
		switch (favouriteColor) {

		case "red":
			return "Maserati";

		case "orange":
			return "Stallion";

		case "yellow":
			return "Chariot";

		case "green":
			return "Taxi";

		case "blue":
			return "rickshaw";

		case "indigo":
			return "motor scooter";

		case "violet":
			return "flying saucer";

		default:
			return "oops";
		}
	}

	private static String determineVacationHome(int siblingCount) {

		if (siblingCount == 0) {
			return "Boca Raton, FL";
		} else if (siblingCount == 1) {
			return "Nassau Bahamas";
		} else if (siblingCount == 2) {
			return "Ponta Negra, Brazil";
		} else if (siblingCount == 3) {
			return "Portland, OR";
		} else if (siblingCount > 3) {
			return "Baton Rouge, LA";
		} else {
			return "Chernobyl, Ukraine";
		}
	}

	private static int determineRetirementYears(int userAge) {
		if (userAge % 2 == 0) {
			return 12;
		} else {
			return 14;
		}

	}

	private static int askForSiblingCount() {
		System.out.println("How many siblings?");
		int siblingCount = userinput.nextInt();
		userinput.hasNextLine();
		return siblingCount;
	}

	private static String askForFavouriteColor() {

		String favouriteColor;
		{
			System.out.println("What is your favorite color?");
			System.out.println("Type \"help\" to list options");
			favouriteColor = userinput.nextLine();
			if (favouriteColor.equals("help")) {
				System.out.println("Options: red, orange, yellow, green, blue, indigo, violet");
			}
			while (favouriteColor.equals("help"))
				favouriteColor = userinput.nextLine();
			return favouriteColor.toLowerCase();
		}
	}

	private static int askForBirthMonth() {
		System.out.println("What month were you born in?");
		int userBirthMonth = userinput.nextInt();
		userinput.nextLine();
		System.out.println(userBirthMonth);
		return userBirthMonth;
	}

	private static int askForUserAge() {
		System.out.println("What is your age?");
		int userAge = userinput.nextInt();

		return userAge;
	}

	private static String askForFirstName() {
		System.out.println("What is your first name?");

		String firstName = userinput.nextLine();

		return firstName;
	}

	private static String askForLastName() {
		System.out.println("What is your last name?");

		String lastName = userinput.nextLine();

		return lastName;
	}

}
