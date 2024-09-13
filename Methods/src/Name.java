
public class Name
{
String fname (String f)
{
	return f;
}
String lname(String l)
{
	return l;
}
void fullname(String f,String l)
{
	String fullname=f+" "+l;
	System.out.println("MY NAME IS "+fullname);
}
	public static void main(String[] args) {
Name n1=new Name();
String x=n1.fname("Ranjan");
String y=n1.lname("Sahoo");
n1.fullname(x,y);
	}

}
