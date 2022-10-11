import java.util.ArrayList;

public class Sandwich implements FastFood
{
	private ArrayList <String> Ingredients = new ArrayList<String>();
	private String status;
		
	Sandwich()
	{
		status = "Not cooked";
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
		this.status = "Cooked";
	}
	
	public String getStatus()
	{
		return this.status;
	}

}
