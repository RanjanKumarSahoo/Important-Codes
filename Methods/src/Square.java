
public class Square 
{
void area(float side)
{
	float areaofasquare=side*side;
	System.out.println("Area of a square = "+areaofasquare);
}
void cube(float length)
{
	float cubeofasquare=length*length*length;
	System.out.println("Cube of a square = "+cubeofasquare);
}
	public static void main(String[] args)
	{
Square s=new Square();
s.area(7.32f);
s.area(9.08f);
s.cube(9.3f);
s.cube(5.8f);
	}

}
