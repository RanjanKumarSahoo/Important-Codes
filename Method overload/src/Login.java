
public class Login 
{
void data(String name)
{
	System.out.println("Login by name ");
}
void data(float n)
{
	System.out.println("Loin by phone ");

}
void data (float n,int otp)
{
	System.out.println("Loin by phone with otp ");
}
void data (float n,int otp,String name)
{
	System.out.println("Loin by phone with otp and name ");
}
public static void main(String[] args) {
Login l1=new Login();
l1.data("ranjan");
l1.data(9090408763f,9087);
l1.data(828767278876f,9086,"ranjan");

	}

}
