
public class Student1 
{
void percentage(int p,int c,int m)
{
	int total=p+c+m;
	double per=total/300.0*100.0;
	System.out.println("Percentage in class is "+per+"%");
}
	public static void main(String[] args) {
Student1 s1=new Student1();
s1.percentage(67, 67, 67);
	}

}
