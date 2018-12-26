import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileAccess {
	public static void main(String z[]) throws IOException
	{
		FileReader fr=null;
		FileOutputStream fileout=new FileOutputStream("data_object.ser");
		
		try {
		fr=new FileReader("data.txt");
		BufferedReader br=new BufferedReader(fr);
		String str;
		ObjectOutputStream outt=new ObjectOutputStream(fileout);
		 
		while((str=br.readLine())!=null)
		{
			//String s[]=str.split("\n");
		
		//	for(String i:s)
			//{
			EmployeeDetail ed=new EmployeeDetail();
			String ss[]=str.split(" ");
			ed.setId(Integer.parseInt(ss[0]));
			ed.setName(ss[1]);
			ed.setSalary(Double.parseDouble(ss[2]));
			//System.out.println(2*x);
//			}
			try {
				
				outt.writeObject(ed);
				
				//System.out.println("Object written");
				
			}finally {
			//	outt.close();	
			}
			
			
		}
		}finally {
			if(fr!=null)
			{
				fr.close();
			}
			if(fileout!=null)
			{
				fileout.close();
			}
		}
		
		
	}
}
	/*	int c,l=0;
		String s=null;
		char cy[]=new char[10];	
		while((c=fr.read())!=-1)
		{
			if(c==32)
			{
				 s=new String(cy);
				System.out.println(cy+" ");
				l=0;
							}
			else if(c==10)
			{
				System.out.println("\n");
			}
			else {
				cy[l]=(char)c;
				l++;

				
			}*/
		
