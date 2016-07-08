package prob4;//환율계산기

public class CurrencyConverter {
	 private static double rate=0;
	
	 public static double  toDollar(double won) {// 한국 원화를 달러로 변환
		   
		   return  won/rate;
	 
	 }
	 public static double  toKWR(double dollar) {// 달러를 한국 원화로 변환
		 return dollar*rate;
		  
	 
	 }
	
	 public static void setRate(double r){// 환율 설정(KWR/$1)
		 rate=r;  
		
		 
	 }
	
	 public static void main(String[] args) {
	  /* 구현합니다. */
		 setRate( 1208.50 );
		 System.out.println( "백만원은 " + toDollar( 1000000 ) + "달러 입니다." );
		 System.out.println( "백달러는 " + toKWR( 100 ) + "원 입니다." );
		
	 }	
}		
