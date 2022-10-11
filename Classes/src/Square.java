public class Square 
{
	private	int position_x;
	private int position_y;
	private	int angle;
	private	int area; // ѕлощадь
	
	Square()
	{
		position_x=0;
		position_y=0;
		angle=0;
		area=10;
	}
	

	void setPositionX(int x)
	{
		this.position_x=x;
	}
			
	void setPositionY(int x)
	{
		this.position_y=x;
	}
			
	void setArea(int x)
	{
		if(x<0)
		{
			System.out.println("¬ведЄнное значение меньше чем 0, переменна€ не изменена.\n");
			return;
		}
		this.area=x;
	}
			
	void setAngle(int x)
	{
		x=x%360;
		this.angle=x;
	}
	
	int getPosition_x()
	{
		return position_x;
	}
	
	int getPosition_y()
	{
		return position_y;
	}
	
	int getAngle()
	{
		return angle;
	}
	
	int getArea()
	{
		return area;
	}
	
	
}
