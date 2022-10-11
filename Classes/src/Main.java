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
			System.out.println("C - Меню для круга.");
			System.out.println("S - Меню для квадрата");
			System.out.println("R - Меню для прямоугольника");
			System.out.println("E - Для выхода из программы");
			System.out.println("=================================\n");
			
			System.out.print("Введите букву: ");
			Enter=in.readLine();
			switch(Enter)
			{
				case "C":
					Circle C = new Circle();
					System.out.println("Объект круг создан, успешно.");
					String EnterC;
					do
					{
						System.out.println("\n=================================");
						System.out.println("P - Изменить позицию круга.");
						System.out.println("A - Изменить радиус круга.");
						System.out.println("R - Повернуть круг.");
						System.out.println("E - Для выхода из программы.");
						System.out.println("=================================\n");
						
						System.out.print("Введите букву: ");
						EnterC=in.readLine();
						int x;
						switch(EnterC)
						{
							case "P":
								System.out.print("Введите позицию X круга:");
								x=Integer.parseInt(in.readLine());
								C.setPositionX(x);
								
								System.out.print("Введите позицию Y круга:");
								x=Integer.parseInt(in.readLine());
								C.setPositionY(x);
								
								break;
							
							case "A":
								System.out.print("Введите Радиус круга:");
								float y=Float.parseFloat(in.readLine());
								C.setRadius(y);
								break;
							
							case "R":
								System.out.print("Введите новый угол поворота у круга по часовой стрелке:");
								x=Integer.parseInt(in.readLine());
								C.setAngle(x);
								break;
								
							case "E":
								
								break;
								
							default:System.out.println("Вы неверно ввели букву");
						}
					}while(!EnterC.equals("E")); 
					
					System.out.println("\n Circle\n\n Position\n x:"+ C.getPosition_x() + " y:" + C.getPosition_y() + "\n\n Rotation\n Angle:" + C.getAngle() + "\n\n Radius:" + C.getRadius());
					
					break;
					
				case "S":
					Square S = new Square();
					System.out.println("Объект квадрат создан, успешно.");
					
					String EnterS;
					do
					{
						System.out.println("\n=================================");
						System.out.println("P - Изменить позицию квадрата.");
						System.out.println("A - Изменить площадь квадрата.");
						System.out.println("R - Повернуть квадрат.");
						System.out.println("E - Для выхода из меню квадрата.");
						System.out.println("=================================\n");
						
						System.out.print("Введите букву: ");
						EnterS = in.readLine();
						int x;
						switch(EnterS)
						{
							case "P":
								System.out.print("Введите позицию X квадрата:");
								x=Integer.parseInt(in.readLine());
								S.setPositionX(x);
								
								System.out.print("Введите позицию Y квадрата:");
								x=Integer.parseInt(in.readLine());
								S.setPositionY(x);
								break;
								
							case "A":
								System.out.print("Введите площадь квадрата:");
								x=Integer.parseInt(in.readLine());
								S.setArea(x);
								break;
								
							case "R":
								System.out.print("Введите новый угол поворота у квадрата по часовой стрелке:");
								x=Integer.parseInt(in.readLine());
								S.setAngle(x);
								break;
								
							case "E":
								break;
								
							default: System.out.println("Вы неверно ввели букву!");
						}
					}while(!EnterS.equals("E"));
					

					System.out.println("\n Square\n\n Position\n x:"+ S.getPosition_x() + " y:" + S.getPosition_y() + "\n\n Rotation\n Angle:" + S.getAngle() + "\n\n Area:" + S.getArea());
					break;
					
				case "R":
					Rectangle R = new Rectangle();
					System.out.println("Объект прямоугольник создан, успешно.");
					String EnterR;
					do
					{
						System.out.println("\n=================================");
						System.out.println("P - Изменить позицию прямоугольника.");
						System.out.println("A - Изменить длинну и ширину прямоугольника.");
						System.out.println("R - Повернуть прямоугольник.");
						System.out.println("E - Для выхода из меню прямоугольника.");
						System.out.println("=================================\n");
						
						System.out.print("Введите букву: ");
						EnterR = in.readLine();
						int x;
						switch(EnterR)
						{
							case "P":
								System.out.print("Введите позицию X Прямоугольника:");
								x=Integer.parseInt(in.readLine());
								R.setPositionX(x);
								
								System.out.print("Введите позицию Y Прямоугольника:");
								x=Integer.parseInt(in.readLine());
								R.setPositionY(x);
								
								break;
								
							case "A":
								System.out.print("Введите длинну прямоугольника:");
								x=Integer.parseInt(in.readLine());
								R.setLength(x);
								
								System.out.print("Введите ширину прямоугольника:");
								x=Integer.parseInt(in.readLine());
								R.setWidth(x);
								
								break;
								
							case "R":
								System.out.print("Введите новый угол поворота у прямоугольника по часовой стрелке:");
								x=Integer.parseInt(in.readLine());
								R.setAngle(x);
								
								break;
								
							case "E":
								break;
								
							default:System.out.println("Вы неверно ввели букву!");
						}
					}
					while(!EnterR.equals("E"));
					

					System.out.println("\n Rectangle\n\n Position\n x:"+ R.getPosition_x() + " y:" + R.getPosition_y() + "\n\n Rotation\n Angle:" + R.getAngle() + "\n\n Width:" + R.getWidth() + " Length:" + R.getLength());
					break;
					
				case "E":
					return;
					
				default:
					System.out.println("Вы неверно ввели букву");
			}
		}
		while(!Enter.equals("E"));
	}

}
