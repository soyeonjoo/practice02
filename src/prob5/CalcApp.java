package prob5;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		for(;;){
			System.out.print( ">>" );
			String inputs = scanner.nextLine();
			
			if( "quit".equals( inputs ) ) {
				break;
			}
			
			String[] tokens = inputs.split( " " );
			
			Arith arith = null;
			switch( tokens[ 1 ] ) {
				case "+" :
					arith = new Add();
					break;
				case "-" :
					arith = new Sub();
					break;
				case "*" :
					arith = new Mul();
					break;
				case "/" :
					arith = new Div();
					break;
				default :
					System.out.println( "Unknown Operator" );
					break;
			}
			
			if( arith != null ) {
				int lValue = Integer.parseInt( tokens[ 0 ] );
				int rValue = Integer.parseInt( tokens[ 2 ] );
				
				arith.setValue( lValue, rValue );
				int result = arith.calculate();
				System.out.println( result );
			}
		}
		
		scanner.close();
	}

}
