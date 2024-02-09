// @author Jacó Gonzaga Brasil Neto

/*
 * 
 * This program is used to convert all keys in a .arb translation file
 * from SCREAMING_SNAKE_CASE to regular_snake_case
 * 
 * */

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		if (args.length > 0) {
			try {
				String original = FileHandler.readFile(args[0]);
				String result = RegexSubstitution.substituteRegex(original, "[A-Z0-9]+.*(?:_[A-Z0-9]+)", "bom dia");

				PrintWriter consoleOut = new PrintWriter(new OutputStreamWriter(System.out, "UTF-8"));
				consoleOut.println(result);
				consoleOut.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("please inform a file path");
		}
		
		
		
	}

}
