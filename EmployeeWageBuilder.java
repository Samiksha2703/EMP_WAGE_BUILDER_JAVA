public class EmployeeWageBuilder {

	// Constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private final String company;
 	private final int empRatePerHour;
        private final int numOfWorkingDays;
        private final int maxHoursPerMonth;

	// Constructor
	public EmployeeWageBuilder(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth){
	this.company = company;
	this.empRatePerHour = empRatePerHour;
	this.numOfWorkingDays = numOfWorkingDays;
	this.maxHoursPerMonth = maxHoursPerMonth;
	}

	//Method to calculate employee wage
	public void calculateEmpWage() {
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
		EmployeeWageBuilder dMart = new EmployeeWageBuilder("D-mart", 20, 20, 100);
		EmployeeWageBuilder reliance = new EmployeeWageBuilder("Tech-Mahendra", 15, 18, 85);
		dMart.calculateEmpWage();
		reliance.calculateEmpWage();
	}
}
