
public class Factory 
{
	public SymbString createSymb(String x, int id)
	{
		return new SymbString(x, id);
	}
	
	public BinString createBin(String x, int id)
	{
		return new BinString(x, id);
	}
	
	public Object remove(Object obj)
	{
		return null;
	}
		
}
