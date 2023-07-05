/*import java.io.*;

public class JavaFileInputStream {

	public static void main(String[] args) throws IOException {
		
		try
		{
		FileInputStream input = new FileInputStream("D:/DBDA/5/Day 7/sample.txt");
		InputStreamReader input1 = new InputStreamReader(System.in);
		//FileOutputStream output = new FileOutputStream("D:/DBDA/5/Day 7/output1.txt", true);
		//OutputStreamWriter output = new OutputStreamWriter(System.out);
		PrintStream output = new PrintStream(System.out);
		int i = 0;
		
		//while ((i = input.read() ) != -1)
		//{
			//output.print((char)i);
		//}
		
		//input.close();
		
		
		while ((i = input1.read() ) != -1)
	{	
			//System.out.print(i);
			output.write(i);
			
		}
		}
		catch(Exception f)
		{
			System.out.println("File not found");
		}

	}

}
*/