package topic4_1c;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FilePlay {

	private static int copyFile(String InFile, String OutFile ) throws IOException {
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
		return 0;
		
		
		
		

	}
	public static void main(String[] args) throws IOException {
		
		int err = copyFile("InUsers.txt" , "OutUsers.txt" );
		
		//display copy file results 
		switch(err) {
		case 0:
			System.out.println("File was copied successfully.");
			break;
		case -1:
			System.out.println("File could not be opened"); 
			break;
			
		 
		case -2:
			System.out.println("File I/O error.");
			break;
		}
			
		
		
	}

}