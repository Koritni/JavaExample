import java.io.*;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.nio.file.*;
import java.util.List;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
				
		String Enter;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		LocalDate Time;
		FastFood ff;
		Path File;
		
		do
		{
			System.out.println("1-������� ���������\n2-������� �������\ne-�����");
			Enter = in.readLine();
			
			switch(Enter)
			{
			// ���������
			case "1":
				ff = new Hamburger();
				System.out.println("������� ���� ��������:");
				Time = CheckDate();
				System.out.println();
				ff.checkDate(Time);
				System.out.println();
				File = Paths.get("E:\\Old_Destkop\\���������\\Prog\\Java Eclipse\\Lab 6\\Files\\IngredientsHamburger.txt");
				if(Files.notExists(File))
				{
					System.out.println("���� �����!");
					return;
				}
				List<String> IngredientsH = Files.readAllLines(File);
				for(String s: IngredientsH)
				{
					ff.AddIngredient(s);
				}
				ff.ShowIngredients();
				System.out.println();
				System.out.println("�� ������������� ����������:");
				System.out.println("����:" + ((Hamburger)ff).getMeatStatus());
				System.out.println("���� �����:" + ff.getStatus());
				 
				ff.Cook();
				System.out.println();
				System.out.println("����� ������������� ����������:");
				System.out.println("����:" + ((Hamburger)ff).getMeatStatus());
				System.out.println("���� �����:" + ff.getStatus());
				System.out.println();
				break;
				
				//�������
			case "2":
				ff = new Sandwich();
				System.out.println("������� ���� ��������:");
				Time = CheckDate();
				System.out.println();
				ff.checkDate(Time);
				
				File = Paths.get("E:\\Old_Destkop\\���������\\Prog\\Java Eclipse\\Lab 6\\Files\\IngredientsSandwich.txt");
				if(Files.notExists(File))
				{
					System.out.println("���� �����!");
					return;
				}
				
				System.out.println();
				
				List<String> IngredientsS = Files.readAllLines(File);
				for(String s: IngredientsS)
				{
					ff.AddIngredient(s);
				}
				ff.ShowIngredients();
				
				System.out.println();
				
				System.out.println("�� ������������� ��������:");	
				System.out.println("���� �����:" + ff.getStatus());
				ff.Cook();
				
				System.out.println();
				
				System.out.println("����� ������������� ��������:");
				System.out.println("���� �����:" + ff.getStatus());
				
				System.out.println();
				break;
				
				//�����
			case "e":
				System.out.println("������� �� ���������");
				return;
				
			default:
				System.out.println("������� �������� ��������!");
				break;
			}
		}while(Enter!="e");
		
		return;
		
	}
	
	// ��������� ������
	
	//region PrivateMethods
	private static LocalDate CheckDate() throws IOException
	{
		String Year, Month, Day;
		LocalDate New = LocalDate.now();
		boolean check = false;
		while(check == false)
		{
			System.out.print("���:");
			Year = checkYear();
			
			
			System.out.print("����� (������):");
			Month = checkMonth();
			
			
			System.out.print("����:");
			Day = checkDay();
			
			
			String Enter = Year + "-" + Month + "-" + Day;
			System.out.println(Enter);
			
			
			try 
			{
				New = LocalDate.parse(Enter);
				check = true;
								
			}
			catch(DateTimeException e)
			{
				System.out.println("������, ���� ������� ����������. ������� ���������� ��� ���:");
			}
		}
		return New;
	}
	
	
	private static String checkDay() throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		boolean Enter = false;
		int x = 0;
		while(Enter==false)
		{
			try
			{
				x = Integer.parseInt(in.readLine());
				if(x>31 || x<1)
				{
					System.out.print("����� ��� �� ����� ���� ������ ��� 31 ��� ������ ��� 1.\n ������� ����� ��� ��� ���:");
				}
				else
				{
					Enter = true;
				}
			}
			catch(NumberFormatException e)
			{
				System.out.println("����� ������� �������. ���������� ��� ���:");
			}
		}
		String Result = Integer.toString(x);
		while(Result.length()<2)
		{
			Result = "0" + Result;
		}
		return Result;
	}
	
	private static String checkMonth() throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		boolean Enter = false;
		int x = 0;
		while(Enter==false)
		{
			try
			{
				x = Integer.parseInt(in.readLine());
				if(x>12 || x<1)
				{
					System.out.print("����� ������ �� ����� ���� ������ ��� 12.\n ������� ����� ������ ��� ���:");
				}
				else
				{
					Enter = true;
				}
			}
			catch(NumberFormatException e)
			{
				System.out.println("����� ������� �������. ���������� ��� ���:");
			}
		}
		String Result = Integer.toString(x);
		while(Result.length()<2)
		{
			Result = "0" + Result;
		}
		return Result;
	}
	
	private static String checkYear() throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		boolean Enter = false;
		int x = 0;
		while(Enter==false)
		{
			try
			{
				x = Integer.parseInt(in.readLine());
				
				if(x<0 || x>9999)
				{
					System.out.print("��� �� ������ ��������� 9999 � �� ������ ���� ������ ��� 0\n ������� ����� ��� ���:");	
				}
				else
				{
					Enter=true;
				}
				
			}
			catch(NumberFormatException e)
			{
				System.out.println("����� ������� �������. ���������� ��� ���:");
			}
		}
		
		String Result = Integer.toString(x);
		while(Result.length()<4)
		{
			Result = "0" + Result;
		}
		return Result;
	}
	
	//endregion PrivateMethods
}
