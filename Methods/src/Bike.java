
public class Bike 
{
 String name;
 String color;
 int showroomprice;
 int tax;

	 Bike(String n,String c,int p,int t)
	 {
		 this.name=n;
		 this.color=c;
		 this.showroomprice=p;
		 this.tax=t;
 }
	
	 void details()
	 {
		 System.out.println("Name : " +this.name);
		 
		 System.out.println("Color : " +this.color);
		
		 System.out.println("Sprice : " + (this.showroomprice + this.tax));
		 System.out.println();
	 }
	 
	public static void main(String[] args) 
	{
		Bike b1 = new Bike("R15","Blue",178000,30000);
		Bike b2=new Bike ("Duke","Oraange",190000,32000);
		Bike b3=new Bike("Splendor","BLACK",70000,20000);
		b1.details();
		
		b2.details();
		b3.details();
		}

}
