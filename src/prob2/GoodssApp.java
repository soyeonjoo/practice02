package prob2;

import java.util.Scanner;


public class GoodssApp {
	public static void main (String[] args){
		final int COUNT =3;
		Scanner scanner = new Scanner(System.in);
		Goodss[] arrayGoods = new Goodss[3];

		for(int i=0; i<3;i++){
			System.out.print(">> ");
			String info = scanner.nextLine(); // 줄단위로 입력 받는것. 띄어쓰기해야함 
			String[] infos = info.split(" "); //띄어쓰기를 기준으로 하나씩 배열에넣는것
			arrayGoods[i]=new Goodss();
			arrayGoods[i].setName(infos[0]);
			arrayGoods[i].setPrice(infos[1]);
			arrayGoods[i].setSu(infos[2]);
		}
		for(int i=0; i<3;i++){
			arrayGoods[i].showGoods();
		}
	}
}	