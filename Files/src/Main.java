import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class Main {
	public static void main(String[] args)
	throws IOException
	{
		Path file = Paths.get("E:\\Old_Destkop\\���������\\Prog\\Files\\file.txt");
		if(Files.notExists(file))
		{
			System.out.println("���� �����!");
			return;
		}
		List<String> Words = Files.readAllLines(file);
		
		System.out.println("����������� � ��������� ����� � ���������� �������:\n");
		
		for(String s: Words)
		{
			System.out.print(s + " ");
		}
		System.out.println("\n\n����������� � �������� �������:\n");
		
		for(int j=Words.size()-1;j>=0;j--)
		{
			System.out.print(Words.get(j) + " ");
		}
	}

}