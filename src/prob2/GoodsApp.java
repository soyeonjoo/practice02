package prob2;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in );
		Goods[] goods = new Goods[ COUNT_GOODS ];
		
		for( int i = 0; i < COUNT_GOODS; i++ ) {
			String inputs = scanner.nextLine();
			String[] infos = inputs.split( " " );
			
			goods[ i ] = new Goods();
			goods[ i ].setName( infos[ 0 ] );
			goods[ i ].setPrice( Integer.parseInt( infos[ 1 ] ) );
			goods[ i ].setCountStock( Integer.parseInt( infos[ 2 ] ) );
		}
		
		for( int i = 0; i < COUNT_GOODS; i++ ) {
			System.out.println( goods[ i ].getName() + "(" + goods[i].getPrice() + ")이 " + goods[ i ].getCountStock() + "개 입고 되었습니다." );
		}
		
		scanner.close();
	}
}
