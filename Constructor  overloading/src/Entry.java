
public class Entry
{
	String name;
	String address;
	float phone;
Entry(float p)
{
	this.phone=p;
	System.out.println("Silver class "+this.phone);
}
Entry(String n,String a)
{
	this.name=n;
	this.address=a;
	System.out.println("Gold class "+this.name+" "+this.address);
}
Entry(String n,String a,float p)
{
	this.name=n;
	this.address=a;
	this.phone=p;
	System.out.println("Platinum class "+this.name+" "+this.address+" "+this.phone);
}
	public static void main(String[] args) {
Entry e1=new Entry(7278829969f);
Entry e2=new Entry("ranjan","cuttack");
Entry e3=new Entry ("ranjan","cuttack",7876545435f);


	}

}
