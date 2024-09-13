
public class Area
{
 void circle(float radius)
 {
	 float pi=22.0f/7.0f;
	 float areaofacircle=pi*radius*radius;
	 System.out.println("Area of the circle = "+areaofacircle);
	
	 	 
 }
	public static void main(String[] args)
	{
   Area a=new Area();
		   a.circle(875.90f);
		   a.circle(90.78f);
	}

}
