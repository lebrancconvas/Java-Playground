public class Condition_02 {
	public static void main(String[] args) {
		int balance = 100;
		int kapraoPrice = 50;
		int kapraoAmount = 3;
		int allPrice = kapraoPrice * kapraoAmount;

		if(balance >= allPrice) {
			balance -= allPrice;
			System.out.println("Payment Success!!");
			System.out.println("Balance: " + balance);
		}
		else {
			System.out.println("Payment Failed!!");
			System.out.println("Please Check your account.");
		}
	}
}
