package Default;

import java.util.*;
import java.io.*;

import java.text.ParseException;

public class Test {


	public static void main(String[] args) throws ParseException, FileNotFoundException {

		File file = new File("C:\\Users\\Predator\\Desktop\\testprogram.txt");
		
		Scanner scanner = new Scanner(file); 
		
		ArrayList <String> data = new ArrayList<String>();
		
		String condition = null;
		String operator =  null;
		String a = null;
		String b = null;
		String c = null;	
		String d = null;
		String e = null;
		String f = null;
		String g = null;
		String h = null;
		while(scanner.hasNext()) {
			String word = scanner.next();
			data.add(word);
			System.out.println(data);	
		}
		
		
		
		for(int index = 0 ; index < data.size() ; index++) {
			
		switch (data.get(index)){
		case "if" : continue;
		case "a" : a = "$s0";; continue;
		case "b" : b = "$s1";; continue;
		case "c" : c = "$s2"; continue;
		case "d" : d = "$s3"; continue;
		case "e" : e = "$s4"; continue;
		case "f" : f = "$s5"; continue;
		case "g" : g = "$s6"; continue;
		case "h" : h = "$s7"; continue;
		case "==" : condition = "beq"; continue;
		case "!=" : condition = "bne"; continue;
		case "+" : operator = "add"; continue;
		case "+=" : operator = "add"; continue;
		case "-" : operator = "sub"; continue;
		case "-=" : operator = "sub"; continue;
		default : break;
			}
		
		}
		System.out.println(condition + " " + a + " "  + b);
		System.out.println(operator + " $t0 " + a +" " + b );
	}

	

}
