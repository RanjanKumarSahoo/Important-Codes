
public class Profile
{
String name(String n)
{
	return n;
}
float phone(float p)
{
	return p;
}
String blood(String b)
{
	return b;
}
void profile(String n,float p,String b)
{
	String details=n+" , "+p+" , "+b;
	System.out.println("MY DETAILS FOR ID : "+details);
	
}
public static void main(String[] args) {
	Profile p1=new Profile();
	String x=p1.name("Ranjan kumar sahoo");
	float y=p1.phone(7008381817f);
	String z=p1.blood("A+");
	p1.profile(x, y,z);
	
}
}
