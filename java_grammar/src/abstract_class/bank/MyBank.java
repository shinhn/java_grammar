package abstract_class.bank;

public class MyBank extends Bank{
	
	public MyBank(String name, String account, int totalAmount) {
		super(name, account, totalAmount);
	}
	
	@Override
	public void installmentSavings() {
		System.out.println("installmentSavings()");
	}
	
	@Override
	public void cancellation() {
		System.out.println("cancellation()");
	}
}
