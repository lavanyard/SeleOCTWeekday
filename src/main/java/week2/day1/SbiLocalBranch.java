package week2.day1;

public class SbiLocalBranch extends Sbi{

	public void fixedDeposit(int a) {
		System.out.println(a + " ");

	}
	public void savingsAccount(int a) {
		System.out.println(a + " ");

	}


	public static void main(String[] args) {
		SbiLocalBranch aa = new SbiLocalBranch();
		aa.fixedDeposit(21);
		aa.savingsAccount(4);
	

	}

}
