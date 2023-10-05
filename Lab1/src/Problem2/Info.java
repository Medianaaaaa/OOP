package Problem2;

public class Info {
	private final String name = "Diana";
	int year;
	Month month;
	
	{
		year++;
	}
	
	Info (int year, Month month){
		this.year = year;
		this.month = month;
	}
	
	public String toString() {
		return "My name is "+ name+ ". I'm "+ year + ". My birthday is in "+ month  + ".";
	}

}
