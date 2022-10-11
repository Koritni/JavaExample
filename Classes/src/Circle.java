public class Circle 
{
	
	private int position_x;
	private int position_y;
	private int angle;
	private float Radius;
	
	
	//�����������
	Circle()
	{
		position_x=0;
		position_y=0;
		angle=0;
		Radius=10;
	}
	//�������
	void setPositionX(int x)
	{
		this.position_x=x;
	}
	
	void setPositionY(int x)
	{
		this.position_y=x;
	}
	
	void setRadius(float x)
	{
		if(x<0)
		{
			System.out.println("�������� �������� ������ ��� 0, ���������� �� ��������.\n");
			return;
		}
		this.Radius=x;
	}
	
	void setAngle(int x)
	{
		x=x%360;
		this.angle=x;
	}
	//������
	float getRadius()
	{
		return Radius;
	}
	
	int getAngle()
	{
		return angle;
	}
	
	int getPosition_x()
	{
		return position_x;
	}
	
	int getPosition_y()
	{
		return position_y;
	}
	
	
}
