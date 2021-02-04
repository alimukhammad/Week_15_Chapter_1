package week_15;

public class Wages {

	public static void main(String[] args) {
		double regularWages, basePay= 25, regularHours= 40, overTimeWages, overTimePay =37.5, overTimeHours =10, totalWages;
		
		regularWages = basePay * regularHours;
		overTimeWages = overTimePay * overTimeHours;
		totalWages = regularWages + overTimeWages;
		System.out.println("Wages for this week are $" + totalWages);

	}

}
