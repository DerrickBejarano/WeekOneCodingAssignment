
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int PriceOfApple = 1;
		double PriceOfBanana = 1.75;
		System.out.println("The price of an apple is $" + PriceOfApple);
		System.out.println("The price of a Banana is $" + PriceOfBanana);
		
		int MoneyInWalletMonday = 40;
		double MoneyInWalletSaturday = 15.75;
		System.out.println("I started my week with $" + MoneyInWalletMonday);
		System.out.println("I ended my week with $" + MoneyInWalletSaturday);
		
		int NumberOfFriendsAge3 = 24;
		int NumberOfFriendsAge21 = 6;
		System.out.println("The number of friends I had when I was 3 was: " + NumberOfFriendsAge3);
		System.out.println("The number of friends I have now is : " + NumberOfFriendsAge21);
		
		int MyAgeInYears = 21;
		int FemaleAgeInYears = 25;
		System.out.println("My age is: " + MyAgeInYears);
		System.out.println("The age of a random female is: " + FemaleAgeInYears);
		
		String MyFirstName = "Derrick";
		String BrothersFirstName = "Michael";
		System.out.println("My first name is: " + MyFirstName);
		System.out.println("My brother's first name is: " + BrothersFirstName);
		
		String MyLastName = "Bejarano";
		String BrothersLastName = "Bejarano";
		System.out.println("My last name is: " + MyLastName);
		System.out.println("My brother's last name is: " + BrothersLastName);
		
		char MyMiddleInitial = 'A';
		char BrothersMiddleInitial = 'A';
		System.out.println("My middle initial is: " + MyMiddleInitial);
		System.out.println("My brother's middle initial is: " + BrothersMiddleInitial);
		
		int NewMoneyInWalletAfterItem = MoneyInWalletMonday - 10; //I bought a new pair of $10 earbuds
		System.out.println("My new balance after my purchase is: $" + NewMoneyInWalletAfterItem);
		
		int NumberOfFriendsPerYear = (NumberOfFriendsAge21 - NumberOfFriendsAge3) / 18; //I lost 1 friend per year since age 3
		System.out.println("Number of friends I added per year is: " + NumberOfFriendsPerYear);
		
		String MyFullName = MyFirstName + " " + MyMiddleInitial + " " + MyLastName;
		System.out.println("My full name is: " + MyFullName);
	}

}
