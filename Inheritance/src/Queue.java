import java.util.Vector;
public class Queue<T>
{
		// Добавление элемента в конец списка
		Vector<T> queue = new Vector<>();
		
		void AddElement(T Element)
		{
			if(Element == null)
			{
				throw new NullPointerException("Element = null");
			}
			queue.add(Element);
		}
		
		// Вывести элемент из начала списка и удалить его
		T OutElement()
		{
			if(queue.size() == 0)
			{
				throw new NullPointerException("Массив пустой");
			}
			T a = queue.firstElement();
			queue.remove(0);
			return a;
		}
		
		void SeeElements()
		{
			if(queue.size() == 0)
			{
				throw new NullPointerException("Массив пустой");
			}
			System.out.println(queue.toString());
		}
		
		void Clear()
		{
			if(queue.size() == 0)
			{
				throw new NullPointerException("Массив пустой");
			}
			queue.removeAll(queue);
		}
}
