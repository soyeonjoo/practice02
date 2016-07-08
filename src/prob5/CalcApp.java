package prob5;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		int value1;
		int value2;
		int result=0;
		while (true){
			
			Scanner scanner= new Scanner(System.in);
			System.out.println(">>");
			String input = scanner.nextLine();
			if(input.equals("quit")==true){
				break;
			}
		String [] tokens = input.split(" ");
		
		value1 = Integer.parseInt(tokens[0]);
		value2 = Integer.parseInt(tokens[2]);
		
		
		switch (tokens[1]){
		case "+" :
			Add add = new Add();
			add.setValue(value1,value2);
			result=add.calculate(value1,value2);
			break;
		case "*" :
			Mul mul = new Mul();
			mul.setValue(value1,value2);
			result=mul.calculate(value1,value2);
			break;
		case "-" :
			Sub sub = new Sub();
			sub.setValue(value1,value2);
			result=sub.calculate(value1,value2);
			break;
		case "/" :
			Div div = new Div();
			div.setValue(value1,value2);
			result=div.calculate(value1,value2);
			break;
			
		}System.out.println(">> "+ result);
	}	
	}
}

