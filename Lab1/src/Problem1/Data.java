package Problem1;

public class Data {
	private double max;
	private double sum;
	private int size;
	
	Data(){
		
	}
	public void addVal(double val) {
		if (max < val) {
			max = val;
		}
		sum += val;
		size++;
	}
	
	
	public double getMax() {
		return max;
	}
	
	public double getAverage() {
		if(size == 0) {
			return sum;
		}
		return sum/size;
	}
	
	public String toString() {
		return getMax() + " " + getAverage();
	}

}
