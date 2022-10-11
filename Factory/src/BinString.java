
public class BinString extends SymbString 
{
	//id
	
	BinString(String x, int id)
	{
		super(x, id);
	}
	
	String ShowOct()
	{
		int Oct=Integer.parseInt(Str,2);
		String StrOct=Integer.toString(Oct,8);
		return StrOct;
	}
	
	String ShowDec()
	{
		int Dec=Integer.parseInt(Str,2);
		String StrDec=Integer.toString(Dec);
		return StrDec;
	}
	
	String ShowHex()
	{
		int Hex=Integer.parseInt(Str,2);
		String StrHex=Integer.toString(Hex,16);
		return StrHex;
	}
	
}
