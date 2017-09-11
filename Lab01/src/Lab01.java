import java.io.*;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Lab01 {
	
	public static void main(String args[]) throws IOException{
		
		Scanner input = null;
		
		int t = 0;
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		//open file
		try{
			input = new Scanner(Paths.get("."+File.separator+"bin"+File.separator+"Events.txt"));
		} catch(IOException e){
			System.err.println("Io " + e);
		}
		
		//read file
		try{
			while(input.hasNext()){
				System.out.printf("Type = %-12d Month: %-12d Day: %-12d Year: %-12d "
						+ "Hour: %-12d Minute: %-12d Description: %-20s Extra: %-12s \n", 
						t = input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), 
						input.nextInt(), input.nextInt(), input.next(), (t==1 || t==3) ? input.next() : "");
			}
		} catch(NoSuchElementException e){
			System.err.println("Such " + e);
		} catch(IllegalStateException e){
			System.err.println("Ill " + e);
		}
		
		//close file
		if(input != null)
			input.close();
		
	}

}
