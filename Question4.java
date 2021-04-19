package lab2;

public class Question4 {

	public static void main(String[] args) {
		
		
		int males=15;
		int females=5;
		
		
		int perMales;
		int perFemales;
		
		
		perMales=males * 100 / (males + females);
		
		perFemales=females * 100 / (males + females);
		
		
		System.out.println("Class has %" + perMales + " and %" + perFemales );

	}

}
