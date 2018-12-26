import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReading {
	public static void main(String z[]) throws IOException 
	{
		//FileInputStream inn = null;
	//	FileOutputStream outt = null;
		
		FileReader fr=null;
		FileWriter fw=null;
		
		try {
		//inn=new FileInputStream("C:\\Users\\Training\\Desktop\\input.txt");
		
//		inn=new FileInputStream("Image_output.jpg");
//		outt=new FileOutputStream("night.jpg");
			
			fr=new FileReader("Image_output.jpg");
			fw=new FileWriter("night_charStream.jpg");
		
		int x;
		while( (x=fr.read())!=-1)
		{
			fw.write(x);
		}
		}finally {
			if(fr!=null)
			{
				fr.close();
			}
			if(fw!=null)
			{
				fw.close();
			}
		}
	}

}
