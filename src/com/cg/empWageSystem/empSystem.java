package com.cg.empWageSystem;

import java.util.Random;

public class empSystem {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	public static int computeEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		int empHrs = 0, totalEmpHrs = 0, totalEmpWage = 0, totalWorkingDays = 0;

		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;

			Random r = new Random();
			int empCheck = r.nextInt(3);

			switch (empCheck) {
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;

			}
			totalEmpHrs += empHrs;
			System.out.println("Day : " + totalWorkingDays + "empHrs : " + empHrs);
		}
		totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println("Total Emp Wage for Company: " + company + " is: " + totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {
		computeEmpWage("Reliance", 15, 25, 100);
		computeEmpWage("BigBazar", 20, 27, 90);

	}
}