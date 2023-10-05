package Problem3;

public class TestTemperature {
	public static void main(String[] args) {
		Temperature temp1 = new Temperature(100, 'C');
		Temperature temp2 = new Temperature(100, 'F');
	    Temperature temp3 = new Temperature(200, 'C');
		
		System.out.println(temp1.getInCelsius());
		System.out.println(temp2.getInFahrenheit());
		System.out.println(temp3.getInFahrenheit());
	}
}
