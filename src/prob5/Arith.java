package prob5;

public abstract class Arith {
	protected int lValue;
	protected int rValue;
	
	public void setValue( int lValue, int rValue ) {
		this.lValue = lValue;
		this.rValue = rValue;
	}
	
	public abstract int calculate();
}