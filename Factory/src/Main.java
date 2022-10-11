import java.io.*;
public class Main 
{
	public static void main(String[] args) 
	throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); // ��� �����
		
		Factory WorkingObj = new Factory(); //��� �������� � �������� ��������
		
		SymbString[] SymbArray = new SymbString[0]; //��� ������� ��������
		BinString[] BinArray = new BinString[0];
		
		String Enter;
		
		do
		{
			System.out.println("1-������� ������"); 
			System.out.println("2-������� ������");
			System.out.println("3-���������� ������"); 
			System.out.println("4-�������� � �������� BinString");
			System.out.println("0-�����");
			
			Enter=in.readLine();
			String SubEnter;
			int index;
			
			switch(Enter)
			{
				case "1": // �������
					System.out.println("����� ������ ������ �������?\n1-SymbString 2-BinString");
					SubEnter=in.readLine();
					int amount;
					
					switch(SubEnter)
					{
						case "1": //SymbString
							System.out.println("������ SymbString\n������� �������� ������ �������?");
							amount=Integer.parseInt(in.readLine());
							
							System.out.println("������� ������� ��� ������� �������");
							SymbArray = new SymbString[amount]; 
							String Symb;
							for(int i=0; i<amount; i++)
							{
								System.out.print("SymbArr["+ (i+1) +"]"); 
								Symb=in.readLine();
								SymbArray[i]=WorkingObj.createSymb(Symb, i);
							}
							break;
							
						case "2":// BinString
							System.out.println("������ BinString\n������� �������� ������ �������?");
							amount=Integer.parseInt(in.readLine());
							
							System.out.println("������� �������� ����� ��� ������� �������");
							BinArray = new BinString[amount];
							String Bin;
							
							for(int i=0; i<amount; i++)
							{
								System.out.print("BinArr["+ (i+1) +"]");
								Bin=in.readLine();
								boolean check = true;
								
								if(Bin.length()==0) // �������� �� ���� �� ������� ��������
								{
									System.out.println("�� ������ ���-������ ������");
									i--;
									check=false;
								}
								else
								{
									for(int j=0; j<Bin.length(); j++) //�������� �� ����������
									{
										if(Bin.charAt(j)!='1' && Bin.charAt(j)!='0') 
										{
											System.out.println("������� ��������/�������� ���, �.�. 0 � 1\n");
											i--;
											check=false;
											break;
										}
									}
										
									while(Bin.charAt(0)=='0') // ���������� �� ���� � ������
									{
										Bin=Bin.substring(1);
										if(Bin.length() == 0)
										{
											System.out.println("����� �� ������ ���� �������");
											i--;
											check=false;
										}
									}
										
								}
								
								if(check == true) {BinArray[i]=WorkingObj.createBin(Bin, i);}
							}
							break;
							
						default:System.out.println("������������ ����!");
					}
					break;
								
				case "2": // �������
					System.out.println("����� ������ ������ ������?\n1-SymbString 2-BinString");
					SubEnter=in.readLine();
					
					
					switch(SubEnter)
					{
						case "1":
							if(SymbArray.length==0)
							{
								System.out.println("����� ��� ��������\n");
								break;
							}
							System.out.println("����� ��������:" + SymbArray.length + "\n������� ����� �������");
							index=Integer.parseInt(in.readLine()) - 1;
							SymbArray[index] = (SymbString)WorkingObj.remove(SymbArray[index]);
							break;
							
							
						case "2":
							if(BinArray.length==0)
							{
								System.out.println("����� ��� ��������");
								break;
							}
							System.out.println("����� ��������:" + BinArray.length + "\n������� ����� �������");
							index=Integer.parseInt(in.readLine());
							BinArray[index] = (BinString)WorkingObj.remove(BinArray[index]);
							break;
							
						default:System.out.println("������������ ����!");
					}
					break;
					
				case "3": //���������� ������
					System.out.println("����� ������ �� ������ ����������?\n 1-SymbString 2-BinString");
					SubEnter=in.readLine();
					switch(SubEnter)
					{
						case "1":
							if(SymbArray.length == 0)
							{
								System.out.println("����� ��� ��������");
								break;
							}
							
							System.out.print("����� ��������:"+ SymbArray.length + "\n������� ����� �������:");
							index=Integer.parseInt(in.readLine());
							if(SymbArray[index-1]==null)
							{
								System.out.println("������ ������� ���");
							}
							else
							{
								System.out.println(SymbArray[index-1].Str);
							}
							
							break;
							
						case "2":
							if(BinArray.length == 0)
							{
								System.out.println("����� ��� ��������");
								break;
							}
						
							System.out.print("����� ��������:"+ BinArray.length + "\n������� ����� �������:");
							index=Integer.parseInt(in.readLine());
							if(BinArray[index-1]==null)
							{
								System.out.println("������ ������� ���");
							}
							else
							{
								System.out.println(BinArray[index-1].Str);
							}
							break;
							
						default:System.out.println("������������ ����!");
					}
					break;
					
				case "4": // ���������� �����-�� ������������� �������
					System.out.println("1-�������� ������������ ������������� BinString");
					System.out.println("2-�������� ���������� ������������� BinString");
					System.out.println("3-�������� ����������������� ������������� BinString");
					SubEnter=in.readLine();
					
					switch(SubEnter)
					{
						case "1":
							if(BinArray.length == 0)
							{
								System.out.println("����� ��� ��������");
								break;
							}
							
							System.out.print("����� ��������:"+ BinArray.length + "\n������� ����� �������:");
							index=Integer.parseInt(in.readLine());
							if(BinArray[index-1]==null)
							{
								System.out.println("������ ������� ���");
							}
							else
							{
								String OctBin=BinArray[index-1].ShowOct();
								System.out.println(OctBin);
							}
							break;
							
							
						case "2":
							if(BinArray.length == 0)
							{
								System.out.println("����� ��� ��������");
								break;
							}
							
							System.out.print("����� ��������:"+ BinArray.length + "\n������� ����� �������:");
							index=Integer.parseInt(in.readLine());
							if(BinArray[index-1]==null)
							{
								System.out.println("������ ������� ���");
							}
							else
							{
								String DecBin=BinArray[index-1].ShowDec();
								System.out.println(DecBin);
							}
							break;
							
						case "3":
							if(BinArray.length == 0)
							{
								System.out.println("����� ��� ��������");
								break;
							}
							
							System.out.print("����� ��������:"+ BinArray.length + "\n������� ����� �������:");
							index=Integer.parseInt(in.readLine());
							if(BinArray[index-1]==null)
							{
								System.out.println("������ ������� ���");
							}
							else
							{
								String HexBin=BinArray[index-1].ShowHex();
								System.out.println(HexBin);
							}
							break;
							
						default:System.out.println("������������ ����!");
					}
					break;
					
					
					
					
				case "0":
					System.out.println("������� �� ���������");
					return;
					
				default: System.out.println("������������ ����!");
			}
		} while(Enter!="0");
		
	}
}
