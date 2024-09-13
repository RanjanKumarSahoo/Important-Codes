
public class Employee {
	int salary;
	Employee(int s)
	{
		this.salary=s;
	}
	@Override
	public String toString() {
		return this.salary+" ";
	}

	public static void main(String[] args) {
		Employee e1=new Employee(700000);
		Employee e2=new Employee(600000);
		Employee e3=new Employee(500000);
		Employee e4=new Employee(900000);
Employee e[]= {e1,e2,e3,e4};
for(int i=0;i<=3;i++)
{
	System.out.println(e[i]);
}

	}

}
