package diagnosis.it3.mydsl.tests.targetplatform;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class GeneratorGalaxy {
	
    
	public static boolean checkGeneratorGalaxy(String generated, String target, String id) throws IOException {
		
		/*ReadFragment from target*/
		FileReader ftarget = new FileReader(target);
		BufferedReader btarget = new BufferedReader(ftarget);
	    String current_target_line;
		while((current_target_line = btarget.readLine())!=null) {
	          if(current_target_line.contains("tool_id") && current_target_line.contains(id)){//Seach corresponding step (identified by id)
	        	  current_target_line= btarget.readLine();//Read next line "tool_sequence"
	        	 break;
	          }
	    }
		btarget.close();
		
		/*ReadFragment from generated*/		
		
		Scanner scanner = new Scanner(generated);
		String current_generated_line;
		while((current_generated_line = scanner.nextLine())!=null) {
	          if(current_generated_line.contains("tool_id") && current_generated_line.contains(id)){//Seach corresponding step (identified by id)
	        	  current_generated_line= scanner.nextLine();//Read next line "tool_sequence"
	        	 break;
	          }
	    }
				
		/*Compare sequences*/
		
		if(current_target_line.compareTo(current_generated_line)==0) return true;
		else return false;
	}

	
}
