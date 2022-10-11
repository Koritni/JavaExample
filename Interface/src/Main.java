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
			System.out.println("1-Создать Гамбургер\n2-Создать Сэндвич\ne-Выход");
			Enter = in.readLine();
			
			switch(Enter)
			{
			// Гамбургер
			case "1":
				ff = new Hamburger();
				System.out.println("Введите срок годности:");
				Time = CheckDate();
				System.out.println();
				ff.checkDate(Time);
				System.out.println();
				File = Paths.get("E:\\Old_Destkop\\Созданное\\Prog\\Java Eclipse\\Lab 6\\Files\\IngredientsHamburger.txt");
				if(Files.notExists(File))
				{
					System.out.println("Файл верни!");
					return;
				}
				List<String> IngredientsH = Files.readAllLines(File);
				for(String s: IngredientsH)
				{
					ff.AddIngredient(s);
				}
				ff.ShowIngredients();
				System.out.println();
				System.out.println("До приготовления Гамбургера:");
				System.out.println("Мясо:" + ((Hamburger)ff).getMeatStatus());
				System.out.println("Само блюдо:" + ff.getStatus());
				 
				ff.Cook();
				System.out.println();
				System.out.println("После приготовления Гамбургера:");
				System.out.println("Мясо:" + ((Hamburger)ff).getMeatStatus());
				System.out.println("Само блюдо:" + ff.getStatus());
				System.out.println();
				break;
				
				//Сэндвич
			case "2":
				ff = new Sandwich();
				System.out.println("Введите срок годности:");
				Time = CheckDate();
				System.out.println();
				ff.checkDate(Time);
				
				File = Paths.get("E:\\Old_Destkop\\Созданное\\Prog\\Java Eclipse\\Lab 6\\Files\\IngredientsSandwich.txt");
				if(Files.notExists(File))
				{
					System.out.println("Файл верни!");
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
				
				System.out.println("До приготовления Сэндвича:");	
				System.out.println("Само блюдо:" + ff.getStatus());
				ff.Cook();
				
				System.out.println();
				
				System.out.println("После приготовления Сэндвича:");
				System.out.println("Само блюдо:" + ff.getStatus());
				
				System.out.println();
				break;
				
				//Выход
			case "e":
				System.out.println("Выходим из программы");
				return;
				
			default:
				System.out.println("Веденно неверное значение!");
				break;
			}
		}while(Enter!="e");
		
		return;
		
	}
	
	// Приватные методы
	
	//region PrivateMethods
	private static LocalDate CheckDate() throws IOException
	{
		String Year, Month, Day;
		LocalDate New = LocalDate.now();
		boolean check = false;
		while(check == false)
		{
			System.out.print("Год:");
			Year = checkYear();
			
			
			System.out.print("Месяц (Числом):");
			Month = checkMonth();
			
			
			System.out.print("День:");
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
				System.out.println("Ошибка, дата введена некоректно. Введите пожалуйста ещё раз:");
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
					System.out.print("Число дня не может быть больше чем 31 или меньше чем 1.\n Введите число дня ещё раз:");
				}
				else
				{
					Enter = true;
				}
			}
			catch(NumberFormatException e)
			{
				System.out.println("Число введено неверно. Попробуйте ещё раз:");
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
					System.out.print("Число месяца не может быть больше чем 12.\n Введите число месяца ещё раз:");
				}
				else
				{
					Enter = true;
				}
			}
			catch(NumberFormatException e)
			{
				System.out.println("Число введено неверно. Попробуйте ещё раз:");
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
					System.out.print("Год не должно превышать 9999 и не должен быть меньше чем 0\n Введите число ещё раз:");	
				}
				else
				{
					Enter=true;
				}
				
			}
			catch(NumberFormatException e)
			{
				System.out.println("Число введено неверно. Попробуйте ещё раз:");
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
