package topic4_1b;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FilePlay {
	@SuppressWarnings("resource")
	private static int copyFile(String InFile, String OutFile ) throws IOException {
		//input and output file read/writer declarations
		BufferedReader in =null; 
		BufferedWriter out = null; 
		
		//create reader and writer
	
		in= new BufferedReader(new FileReader(InFile)); 
		out = new BufferedWriter(new FileWriter(OutFile));
	
		
		//loop to read all characters from fileRedaer and write to fileWriter 
		int c;
		while((c=in.read()) != -1) {
			out.write(c);
	
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

