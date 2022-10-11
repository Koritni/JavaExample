import java.util.ArrayList;

public class Vect<T>
{
	ArrayList<T> array = new ArrayList<>();
	
	void AddElement(T Element)
	{
		array.add(Element);
	}
	
	T OutElement()
	{
		T Element = array.get(0);
		array.remove(0);
		return Element;
	}
	
	//�������� ���� ��������� �������
	void SeeElements()
	{
		if(array.size() == 0)
		{
			throw new NullPointerException("������ ������");
		}
		System.out.println(array.toString());
	}
	
	//������ �������
	void Clear()
	{
		if(array.size() == 0)
		{
			throw new NullPointerException("������ ������");
		}
		while(array.iterator().hasNext())
		{
			array.remove(0);
		}
	}
}
