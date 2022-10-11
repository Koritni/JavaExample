import java.io.*;
public class Main {

	public static void main(String[] args) 
	throws IOException
	{
	
		String Enter;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
		
		 
		do 
		{
			System.out.println("\n=================================");
			System.out.println("C - ���� ��� �����.");
			System.out.println("S - ���� ��� ��������");
			System.out.println("R - ���� ��� ��������������");
			System.out.println("E - ��� ������ �� ���������");
			System.out.println("=================================\n");
			
			System.out.print("������� �����: ");
			Enter=in.readLine();
			switch(Enter)
			{
				case "C":
					Circle C = new Circle();
					System.out.println("������ ���� ������, �������.");
					String EnterC;
					do
					{
						System.out.println("\n=================================");
						System.out.println("P - �������� ������� �����.");
						System.out.println("A - �������� ������ �����.");
						System.out.println("R - ��������� ����.");
						System.out.println("E - ��� ������ �� ���������.");
						System.out.println("=================================\n");
						
						System.out.print("������� �����: ");
						EnterC=in.readLine();
						int x;
						switch(EnterC)
						{
							case "P":
								System.out.print("������� ������� X �����:");
								x=Integer.parseInt(in.readLine());
								C.setPositionX(x);
								
								System.out.print("������� ������� Y �����:");
								x=Integer.parseInt(in.readLine());
								C.setPositionY(x);
								
								break;
							
							case "A":
								System.out.print("������� ������ �����:");
								float y=Float.parseFloat(in.readLine());
								C.setRadius(y);
								break;
							
							case "R":
								System.out.print("������� ����� ���� �������� � ����� �� ������� �������:");
								x=Integer.parseInt(in.readLine());
								C.setAngle(x);
								break;
								
							case "E":
								
								break;
								
							default:System.out.println("�� ������� ����� �����");
						}
					}while(!EnterC.equals("E")); 
					
					System.out.println("\n Circle\n\n Position\n x:"+ C.getPosition_x() + " y:" + C.getPosition_y() + "\n\n Rotation\n Angle:" + C.getAngle() + "\n\n Radius:" + C.getRadius());
					
					break;
					
				case "S":
					Square S = new Square();
					System.out.println("������ ������� ������, �������.");
					
					String EnterS;
					do
					{
						System.out.println("\n=================================");
						System.out.println("P - �������� ������� ��������.");
						System.out.println("A - �������� ������� ��������.");
						System.out.println("R - ��������� �������.");
						System.out.println("E - ��� ������ �� ���� ��������.");
						System.out.println("=================================\n");
						
						System.out.print("������� �����: ");
						EnterS = in.readLine();
						int x;
						switch(EnterS)
						{
							case "P":
								System.out.print("������� ������� X ��������:");
								x=Integer.parseInt(in.readLine());
								S.setPositionX(x);
								
								System.out.print("������� ������� Y ��������:");
								x=Integer.parseInt(in.readLine());
								S.setPositionY(x);
								break;
								
							case "A":
								System.out.print("������� ������� ��������:");
								x=Integer.parseInt(in.readLine());
								S.setArea(x);
								break;
								
							case "R":
								System.out.print("������� ����� ���� �������� � �������� �� ������� �������:");
								x=Integer.parseInt(in.readLine());
								S.setAngle(x);
								break;
								
							case "E":
								break;
								
							default: System.out.println("�� ������� ����� �����!");
						}
					}while(!EnterS.equals("E"));
					

					System.out.println("\n Square\n\n Position\n x:"+ S.getPosition_x() + " y:" + S.getPosition_y() + "\n\n Rotation\n Angle:" + S.getAngle() + "\n\n Area:" + S.getArea());
					break;
					
				case "R":
					Rectangle R = new Rectangle();
					System.out.println("������ ������������� ������, �������.");
					String EnterR;
					do
					{
						System.out.println("\n=================================");
						System.out.println("P - �������� ������� ��������������.");
						System.out.println("A - �������� ������ � ������ ��������������.");
						System.out.println("R - ��������� �������������.");
						System.out.println("E - ��� ������ �� ���� ��������������.");
						System.out.println("=================================\n");
						
						System.out.print("������� �����: ");
						EnterR = in.readLine();
						int x;
						switch(EnterR)
						{
							case "P":
								System.out.print("������� ������� X ��������������:");
								x=Integer.parseInt(in.readLine());
								R.setPositionX(x);
								
								System.out.print("������� ������� Y ��������������:");
								x=Integer.parseInt(in.readLine());
								R.setPositionY(x);
								
								break;
								
							case "A":
								System.out.print("������� ������ ��������������:");
								x=Integer.parseInt(in.readLine());
								R.setLength(x);
								
								System.out.print("������� ������ ��������������:");
								x=Integer.parseInt(in.readLine());
								R.setWidth(x);
								
								break;
								
							case "R":
								System.out.print("������� ����� ���� �������� � �������������� �� ������� �������:");
								x=Integer.parseInt(in.readLine());
								R.setAngle(x);
								
								break;
								
							case "E":
								break;
								
							default:System.out.println("�� ������� ����� �����!");
						}
					}
					while(!EnterR.equals("E"));
					

					System.out.println("\n Rectangle\n\n Position\n x:"+ R.getPosition_x() + " y:" + R.getPosition_y() + "\n\n Rotation\n Angle:" + R.getAngle() + "\n\n Width:" + R.getWidth() + " Length:" + R.getLength());
					break;
					
				case "E":
					return;
					
				default:
					System.out.println("�� ������� ����� �����");
			}
		}
		while(!Enter.equals("E"));
	}

}
