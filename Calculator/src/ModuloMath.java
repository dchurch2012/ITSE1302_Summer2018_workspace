
public class ModuloMath {
	
	protected double number = 0;
	protected double divisor = 0;
	
	public ModuloMath() {
		this.number = 0;
		this.divisor = 0;
	}
	
	public ModuloMath(double number, double divisor) {
		this.number = number;
		this.divisor = divisor;
	}
	
	public void setNumber(double number) {
		this.number = number;
	}
	
	public double getNumber() {
		return this.number;
	}
	
	public void setDivisor(double divisor) {
		this.divisor = divisor;
	}
	
	public double getDivisor() {
		return this.divisor;
	}
	

}
