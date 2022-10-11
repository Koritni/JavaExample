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
		
		//���������� ����� � ����� ����������
		for(int i=0; i<3; i++)
		{
			try 
			{
				System.out.println("������� ����� ��� ���������� ��� � �������:");
				int a = Integer.parseInt(in.readLine());
				queueInt.AddElement(a);
			}
			catch (NumberFormatException e)
			{
				System.out.println("�� ������� �� Integer ��� �������� ������");
			}
		}
		
		try
		{
			System.out.println("\n��������� � ������� queueInt:");
			queueInt.SeeElements();
			System.out.println("������ �� ������ �������: " + queueInt.OutElement());
			System.out.println("������ ��������� � �������:");
			queueInt.SeeElements();
		}
		catch (NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		
		//���������� �����
		//������ ����� ���� ����, ��� ����� ��������
		
		System.out.println("\n\n��������� � ������ queueStr ��������� ��������:\" Smth \" \" 123 \" \" 1.3 \" ");
		
		queueStr.AddElement("Smth");
		queueStr.AddElement("123");
		queueStr.AddElement("1.3");
		
		
		System.out.println("��������� � ������� queueStr:");
		queueStr.SeeElements();
		System.out.println("������ �� ������ �������: " + queueStr.OutElement());
		System.out.println("������ �������� � �������:");
		queueStr.SeeElements();
		
		System.out.println("������� ������ queueStr");
		queueStr.Clear();
		
		try
		{
			System.out.println("������ �������� � �������:");
			queueStr.SeeElements();
		}
		catch (NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		
		// ���������� Double � ������ queueDoulbe � ����� ���������� ��� ����
		System.out.println("\n\n��������� Double :");
		
		for(int i=0; i<3; i++)
		{
			try 
			{
				System.out.println("\n������� Double ��� ���������� ��� � �������:");
				Double a = Double.parseDouble(in.readLine());
				queueDouble.AddElement(a);
			}
			catch (NumberFormatException e)
			{
				System.out.println("�� ������� �� Double ��� �������� ������");
			}
		}
		
		try
		{
			System.out.println("\n��������� � ������� queueDouble:");
			queueDouble.SeeElements();
			System.out.println("������ �� ������ �������: " + queueDouble.OutElement());
			System.out.println("������ ��������� � �������:");
			queueDouble.SeeElements();
		}
		catch (NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("\n��������� ������ ���������");
		return;	
	}
}
