import java.io.*;
public class Main 
{
	public static void main(String[] args) 
	throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); // Для ввода
		
		Factory WorkingObj = new Factory(); //Для создания и удаления объектов
		
		SymbString[] SymbArray = new SymbString[0]; //Два массива объектов
		BinString[] BinArray = new BinString[0];
		
		String Enter;
		
		do
		{
			System.out.println("1-Создать объект"); 
			System.out.println("2-Удалить объект");
			System.out.println("3-Посмотреть объект"); 
			System.out.println("4-Действия с объектом BinString");
			System.out.println("0-Выход");
			
			Enter=in.readLine();
			String SubEnter;
			int index;
			
			switch(Enter)
			{
				case "1": // Создать
					System.out.println("Какой объект хотите создать?\n1-SymbString 2-BinString");
					SubEnter=in.readLine();
					int amount;
					
					switch(SubEnter)
					{
						case "1": //SymbString
							System.out.println("Создаём SymbString\nСколько объектов хотите создать?");
							amount=Integer.parseInt(in.readLine());
							
							System.out.println("Вводите символы для каждого объекта");
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
							System.out.println("Создаём BinString\nСколько объектов хотите создать?");
							amount=Integer.parseInt(in.readLine());
							
							System.out.println("Вводите бинарное число для каждого объекта");
							BinArray = new BinString[amount];
							String Bin;
							
							for(int i=0; i<amount; i++)
							{
								System.out.print("BinArr["+ (i+1) +"]");
								Bin=in.readLine();
								boolean check = true;
								
								if(Bin.length()==0) // проверка на ввод не пустого значения
								{
									System.out.println("Вы должны что-нибудь ввести");
									i--;
									check=false;
								}
								else
								{
									for(int j=0; j<Bin.length(); j++) //Проверка на бинарность
									{
										if(Bin.charAt(j)!='1' && Bin.charAt(j)!='0') 
										{
											System.out.println("Вводите двоичный/бинарный код, т.е. 0 и 1\n");
											i--;
											check=false;
											break;
										}
									}
										
									while(Bin.charAt(0)=='0') // Избавление от нуля в начале
									{
										Bin=Bin.substring(1);
										if(Bin.length() == 0)
										{
											System.out.println("Число не должно быть нулевым");
											i--;
											check=false;
										}
									}
										
								}
								
								if(check == true) {BinArray[i]=WorkingObj.createBin(Bin, i);}
							}
							break;
							
						default:System.out.println("Неправильный ввод!");
					}
					break;
								
				case "2": // Удалить
					System.out.println("Какой объект хотите убрать?\n1-SymbString 2-BinString");
					SubEnter=in.readLine();
					
					
					switch(SubEnter)
					{
						case "1":
							if(SymbArray.length==0)
							{
								System.out.println("Здесь нет объектов\n");
								break;
							}
							System.out.println("Всего объектов:" + SymbArray.length + "\nВведите номер объекта");
							index=Integer.parseInt(in.readLine()) - 1;
							SymbArray[index] = (SymbString)WorkingObj.remove(SymbArray[index]);
							break;
							
							
						case "2":
							if(BinArray.length==0)
							{
								System.out.println("Здесь нет объектов");
								break;
							}
							System.out.println("Всего объектов:" + BinArray.length + "\nВведите номер объекта");
							index=Integer.parseInt(in.readLine());
							BinArray[index] = (BinString)WorkingObj.remove(BinArray[index]);
							break;
							
						default:System.out.println("Неправильный ввод!");
					}
					break;
					
				case "3": //Посмотреть объект
					System.out.println("Какой объект вы хотите посмотреть?\n 1-SymbString 2-BinString");
					SubEnter=in.readLine();
					switch(SubEnter)
					{
						case "1":
							if(SymbArray.length == 0)
							{
								System.out.println("Здесь нет объектов");
								break;
							}
							
							System.out.print("Всего объектов:"+ SymbArray.length + "\nВведите номер объекта:");
							index=Integer.parseInt(in.readLine());
							if(SymbArray[index-1]==null)
							{
								System.out.println("Такого объекта нет");
							}
							else
							{
								System.out.println(SymbArray[index-1].Str);
							}
							
							break;
							
						case "2":
							if(BinArray.length == 0)
							{
								System.out.println("Здесь нет объектов");
								break;
							}
						
							System.out.print("Всего объектов:"+ BinArray.length + "\nВведите номер объекта:");
							index=Integer.parseInt(in.readLine());
							if(BinArray[index-1]==null)
							{
								System.out.println("Такого объекта нет");
							}
							else
							{
								System.out.println(BinArray[index-1].Str);
							}
							break;
							
						default:System.out.println("Неправильный ввод!");
					}
					break;
					
				case "4": // посмотреть какое-то представление объекта
					System.out.println("1-Показать восьмиричное представление BinString");
					System.out.println("2-Показать десятичное представление BinString");
					System.out.println("3-Показать шестнадцатеричное представление BinString");
					SubEnter=in.readLine();
					
					switch(SubEnter)
					{
						case "1":
							if(BinArray.length == 0)
							{
								System.out.println("Здесь нет объектов");
								break;
							}
							
							System.out.print("Всего объектов:"+ BinArray.length + "\nВведите номер объекта:");
							index=Integer.parseInt(in.readLine());
							if(BinArray[index-1]==null)
							{
								System.out.println("Такого объекта нет");
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
								System.out.println("Здесь нет объектов");
								break;
							}
							
							System.out.print("Всего объектов:"+ BinArray.length + "\nВведите номер объекта:");
							index=Integer.parseInt(in.readLine());
							if(BinArray[index-1]==null)
							{
								System.out.println("Такого объекта нет");
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
								System.out.println("Здесь нет объектов");
								break;
							}
							
							System.out.print("Всего объектов:"+ BinArray.length + "\nВведите номер объекта:");
							index=Integer.parseInt(in.readLine());
							if(BinArray[index-1]==null)
							{
								System.out.println("Такого объекта нет");
							}
							else
							{
								String HexBin=BinArray[index-1].ShowHex();
								System.out.println(HexBin);
							}
							break;
							
						default:System.out.println("Неправильный ввод!");
					}
					break;
					
					
					
					
				case "0":
					System.out.println("Выходим из программы");
					return;
					
				default: System.out.println("Неправильный ввод!");
			}
		} while(Enter!="0");
		
	}
}
