
public class App {

	public static void main(String[] args) {
		//examples of real life data
		
		double itemPrice = 10.99;
		double moneyInWallet = 15.25;
		int numberOfFriends = 200;
		int ageInYears = 25;
		String firstName = "Cruz";
		String lastName = "Gonzalez";
		char middleInitial = 'H';
		
		//performing operations
		double moneyAfterBuyingItem = moneyInWallet - itemPrice;
		int friendsPerYear = numberOfFriends / ageInYears;
		String fullName = firstName + " " + middleInitial + " " + lastName;
		
		System.out.println("The price of the item is " + itemPrice);
		System.out.println("The money in my wallet " + moneyInWallet);
		System.out.println("How many friends I have " + numberOfFriends);
		System.out.println("How old I am " + ageInYears);
		System.out.println("My first name " + firstName);
		System.out.println("My last name " + lastName);
		System.out.println("My middle initial " + middleInitial);
		System.out.println("Money left after making purchase " + moneyAfterBuyingItem);
		System.out.println("Average friends made each year " + friendsPerYear);
		System.out.println("My full name is " + fullName);
		
	}

}
