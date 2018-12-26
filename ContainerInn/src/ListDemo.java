import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	public static void main(String z[])
	{
		ArrayList al=new ArrayList();
		al.add("Ishanya");
		al.add(0, "Bhanu");
		al.add("Gpovind");
		al.add("Rashi");
		al.add(10);
		al.add(1,22);
		al.remove(new Integer(10));
		Iterator it;
		it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
	}
}
