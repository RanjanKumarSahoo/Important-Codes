
public class Dmart 
{
void payment(int cash)
{
	System.out.println("Payment by cash");
}
int payment(int cardno,int cvv)
{
	System.out.println("Payment by card");
	return 10;
}
int payment(String upiidd,int otp)
{
	System.out.println("Payment by upi");
	return 67;

}
public static void main(String[] args) {
	Dmart d1=new Dmart();
	d1.payment(5265);
	d1.payment(655766,786);
	d1.payment("786447@ybl",767);
	
	
	
}
}
