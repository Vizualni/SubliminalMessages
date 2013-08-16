

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class main {

	/**
	 * 
	 */
	public static void main(String[] args) {
		
		ArrayList<String>messages = getMessages("messages.data");
		TransparentWindow tranny = new TransparentWindow(); // :P
		int rand_id;
		while(true){
			rand_id = (int)(Math.random()*(messages.size()));
			tranny.displayText(messages.get(rand_id));
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				break;
			}
		}

	}
	
	
	public static ArrayList<String> getMessages(String filename){
		ArrayList<String> messages = new ArrayList<String>();
		try{
			File file = new File(filename);
			
			BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF8"));
			String line;
			while((line=in.readLine())!=null && line.length()>0){
				messages.add(line);
			}
			in.close();
		}catch(Exception e){
			System.out.println("Error while trying to read file: "+filename);
		}
		return messages;
	}

}
