package topic4_1c;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FilePlay {
	
	private static void copyFile(String InFile, String OutFile ) throws FileNotFoundException, IOException {
		//input and output file read/writer declarations
		BufferedReader in =null; 
		BufferedWriter out = null; 
		
		//create reader and writer
	
		in= new BufferedReader(new FileReader(InFile)); 
		out = new BufferedWriter(new FileWriter(OutFile));
	
		
		//loop to read all characters from fileRedaer and write to fileWriter 
		//int c;
		//while((c=in.read()) != -1) {
			//out.write(c);
	
		//}
		
		String line; 
		while ((line = in.readLine()) != null) {
			String[] tokens = line.split("\\|");
			out.write(String.format("name is %s %s of age %s\n", tokens[0] ,tokens[1] , tokens[2]));
		}
		
		
		try {
			if(in != null) {
				in.close();
				
			}
			if(out != null) {
				out.close();
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		

	}
	public static void main(String[] args) throws FileNotFoundException ,IOException {
		
		
		try {
		copyFile("InUsers.txt" , "OutUsers.txt" );
		System.out.println("File was copied successfull");
		}
		catch (FileNotFoundException e) {
			
			//catch file not found error
			e.printStackTrace();
			System.out.println("File could not be opened"); 
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println("File I/O error.");
			
		}
		
	
		
		
	}

}