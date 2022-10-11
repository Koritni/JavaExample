import java.util.ArrayList;

public class Hamburger implements FastFood 
{
	private ArrayList <String> Ingredients = new ArrayList<String>();
	private String status;
	private String MeatStatus;
	
	Hamburger()
	{
		status = "Not cooked";
		MeatStatus = "raw";
	}
		
	public void ShowIngredients()
	{
		System.out.println("Ингредиенты:");
		for(String s:Ingredients)
		{
			System.out.println(s);
		}
	}
	
	public void AddIngredient(String e) 
	{
		Ingredients.add(e);
	}
	
	public void Cook()
	{
		this.status="Cooked";
		this.MeatStatus="Medium";
	}
	
	public String getStatus()
	{
		return this.status;
	}
	
	public String getMeatStatus()
	{
		return this.MeatStatus;
	}
	
	
}
