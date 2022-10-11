import java.time.LocalDate;

public interface FastFood 
{
	void Cook();
	
	void ShowIngredients();
	
	void AddIngredient(String e);
	
	 String getStatus();

	default void checkDate(LocalDate Food)
	{
		LocalDate Now = LocalDate.now();
		if(Now.isAfter(Food))
		{
			System.out.println("срок годности истёк");
			return;
		}
		else
		{
			System.out.println("срок годности ещё не истёк");
			return;
		}
	}
}
