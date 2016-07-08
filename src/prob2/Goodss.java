package prob2;

public class Goodss {

	private String name;
	private String su;
	private String price;


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSu() {
		return su;
	}
	public void setSu(String su) {
		this.su = su;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	 public void showGoods (){
		 System.out.println(name+"(가격 : "+price+"원 )이  "+su+"개 입고 되었습니다.");
	 }
	 
}
