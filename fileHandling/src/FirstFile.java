import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstFile {
	public static void main(String z[]) throws IOException
	{
		BufferedReader br;
		br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter your ID: ");
		int id=Integer.parseInt(br.readLine());
	
		//br.readLine()..............to consume "enter" if used read() method.
		
		System.out.println("enter your name: ");
		String name=br.readLine();
		
		System.out.println("enter ur salary: ");
		double sal=Double.parseDouble(br.readLine());
		
		System.out.println(id+" "+name+" "+sal);
	}
}
