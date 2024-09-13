
public class Student2
{
int phy;
int chem;
int math;
void perc()
{
	int total=this.phy+this.chem+this.math;
	double per=total/300.0*100.0;
	System.out.println("Percentage of students are "+per+" %");
}
	public static void main(String[] args) {
Student2 s1=new Student2();
s1.phy=80;
s1.chem=80;
s1.math=80;
s1.perc();
Student2 s2=new Student2();
s2.phy=69;
s2.chem=69;
s2.math=69;
s2.perc();
	}

}
