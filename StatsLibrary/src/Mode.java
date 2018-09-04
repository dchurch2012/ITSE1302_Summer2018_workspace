public class Mode {
	private double number;
	private  int frequency;
	
	public double getNumber() {
		return this.number;
	}
	
	public void setNumber(double number) {
		this.number = number;
	}
	
	public int getFrequency() {
		return this.frequency;
	}
	
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	
	public Mode() {
		this.number = 0;
		this.frequency = 0;
	}
	
	public Mode(double number, int frequency) {
		this.number = number;
		this.frequency = frequency;
	}
}
