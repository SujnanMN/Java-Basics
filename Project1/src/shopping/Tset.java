package shopping;

public class Tset {
public static void main(String[] args) {
	Customer CustRam = new Customer();
	CustRam.walking();
	Security SecBhim = new Security();
	boolean isCustomer = SecBhim.scan();
	if (isCustomer)
		CustRam.shop();
	Cashier CashKam = new Cashier();
	CashKam.estimate();
	SecBhim.checkout();
	CustRam.left();	
}
}
