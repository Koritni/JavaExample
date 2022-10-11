import java.io.*;


public class Main 
{

	public static void main(String[] args)
	throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queueInt = new Queue<>();
		Queue<String> queueStr = new Queue<>();
		Queue<Double> queueDouble = new Queue<>();
		
		//Добавление чисел и показ исключения
		for(int i=0; i<3; i++)
		{
			try 
			{
				System.out.println("Введите число для добавления его в очередь:");
				int a = Integer.parseInt(in.readLine());
				queueInt.AddElement(a);
			}
			catch (NumberFormatException e)
			{
				System.out.println("Вы вводите не Integer или значение пустое");
			}
		}
		
		try
		{
			System.out.println("\nЭлементов в очереди queueInt:");
			queueInt.SeeElements();
			System.out.println("Объект из начала очереди: " + queueInt.OutElement());
			System.out.println("Теперь элементов в очереди:");
			queueInt.SeeElements();
		}
		catch (NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		
		//Добавление строк
		//Строка может быть всем, что можно записать
		
		System.out.println("\n\nДобавляем в список queueStr следующие элементы:\" Smth \" \" 123 \" \" 1.3 \" ");
		
		queueStr.AddElement("Smth");
		queueStr.AddElement("123");
		queueStr.AddElement("1.3");
		
		
		System.out.println("Элементов в очереди queueStr:");
		queueStr.SeeElements();
		System.out.println("Объект из начала очереди: " + queueStr.OutElement());
		System.out.println("Теперь элементы в очереди:");
		queueStr.SeeElements();
		
		System.out.println("Очищаем список queueStr");
		queueStr.Clear();
		
		try
		{
			System.out.println("Теперь элементы в очереди:");
			queueStr.SeeElements();
		}
		catch (NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		
		// Добавление Double в список queueDoulbe и показ исключении для него
		System.out.println("\n\nДобавляем Double :");
		
		for(int i=0; i<3; i++)
		{
			try 
			{
				System.out.println("\nВведите Double для добавления его в очередь:");
				Double a = Double.parseDouble(in.readLine());
				queueDouble.AddElement(a);
			}
			catch (NumberFormatException e)
			{
				System.out.println("Вы вводите не Double или значение пустое");
			}
		}
		
		try
		{
			System.out.println("\nЭлементов в очереди queueDouble:");
			queueDouble.SeeElements();
			System.out.println("Объект из начала очереди: " + queueDouble.OutElement());
			System.out.println("Теперь элементов в очереди:");
			queueDouble.SeeElements();
		}
		catch (NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("\nЗавершаем работу программы");
		return;	
	}
}
