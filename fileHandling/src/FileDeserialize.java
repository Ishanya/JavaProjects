import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileDeserialize {
	static FileInputStream fin=null;
	public static void main(String z[]) throws IOException, ClassNotFoundException
	{
		EmployeeDetail de=null;
		try {
			
		
		 fin=new FileInputStream("data_object.ser");
		ObjectInputStream oin=new ObjectInputStream(fin);
		int i=0;
		while(i<3) {
			de=(EmployeeDetail)oin.readObject();
			
			//oin.close();
			
			System.out.print(de.getId()+" ");
			System.out.print(de.getName()+" ");
			System.out.println(de.getSalary());
		i++;
		}
		oin.close();
		} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			if(fin!=null)
			fin.close();
		}
		
		
	}
	
}
