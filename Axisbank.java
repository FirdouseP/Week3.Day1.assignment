package week3.Day1Assign;

public class Axisbank extends BankInfo {
	public void deposit(String string1)
	{
		System.out.println(string1);
	}

	public static void main(String[] args) {
		Axisbank bacAxisBank=new Axisbank();
		bacAxisBank.deposit("No Deposit 'XXXX'");
		bacAxisBank.saving();
	}

}


