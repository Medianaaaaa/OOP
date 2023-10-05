package Problem3;

public class Temperature {
	private double value;
	private char scale;
	
	Temperature(){
	}
	
	Temperature(double value){
		this.value = value;
	}
	Temperature(char scale){
		this.scale = scale;
	}
	Temperature(double value, char scale){
		this.value = value;
		this.scale = scale;
	}
	private double inCelsius(){
		if (this.scale == 'F') {
			return (5*(value-32))/9;
		}
		else {
			return this.value;
		}
	}
	
	public double getInCelsius() {
		return inCelsius();
	}
	
	private double inFahrenheit(){
		if(this.scale == 'C') {
			return (9*(value/5))+32;
		}
		else {
			return this.value;
		}
	}
	public double getInFahrenheit() {
		return inFahrenheit();
	}
	
	public void setValues(double value) {
		this.value=value;
	}
	
	public void setScale(char scale) {
		this.scale=scale;
	}

	public void setValuesScale(double value, char scale) {
		this.value=value;
		this.scale=scale;
	}
	
	public double getValues() {
		return value;
	}
	
	public char getScale() {
		return scale;
	}
	
	public void plus(Temperature t2) {
		if(this.scale=='F') {
			this.scale += t2.inFahrenheit();
		} else {
			this.scale += t2.inCelsius();
		}
//	this.val = this.val + t2.value;
	
	}
	
	public String toString() {
		return this.value + " " + this.scale;
	}
}
