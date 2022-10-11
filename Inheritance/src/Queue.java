import java.util.Vector;
public class Queue<T>
{
		// ���������� �������� � ����� ������
		Vector<T> queue = new Vector<>();
		
		void AddElement(T Element)
		{
			if(Element == null)
			{
				throw new NullPointerException("Element = null");
			}
			queue.add(Element);
		}
		
		// ������� ������� �� ������ ������ � ������� ���
		T OutElement()
		{
			if(queue.size() == 0)
			{
				throw new NullPointerException("������ ������");
			}
			T a = queue.firstElement();
			queue.remove(0);
			return a;
		}
		
		void SeeElements()
		{
			if(queue.size() == 0)
			{
				throw new NullPointerException("������ ������");
			}
			System.out.println(queue.toString());
		}
		
		void Clear()
		{
			if(queue.size() == 0)
			{
				throw new NullPointerException("������ ������");
			}
			queue.removeAll(queue);
		}
}
