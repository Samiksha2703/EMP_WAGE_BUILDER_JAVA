public class EmployeeWageBuilder {

	// Constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	//Method to calculate employee wage
	public static void calculateEmpWage(String company, int empRatePerHour, int numOfWorkingDays,
			int maxHoursPerMonth) {

		// Variables
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;

		// Computation
		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
				break;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day# : " + totalWorkingDays + " Emp Hrs : " + empHrs);
		}

		int totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println("Total Emp Wage for company " + company + " is : " + totalEmpWage);
	}

	public static void main(String args[]) {
		calculateEmpWage("D-mart", 20, 20, 100);
		calculateEmpWage("Tech-Mahendra", 15, 18, 85);
	}
}
