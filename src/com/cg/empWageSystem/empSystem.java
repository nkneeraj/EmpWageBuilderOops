package com.cg.empWageSystem;

import java.util.Random;

public class empSystem {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;

	public empSystem(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	public void computeEmpWage() {

		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
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
	}

	@Override
	public String toString() {
		return "Total Emp Wage for Company: " + company + " is: " + totalEmpWage;
	}

	public static void main(String[] args) {
		empSystem reliance = new empSystem("Reliance", 15, 25, 100);
		empSystem bigBazar = new empSystem("BigBazar", 20, 27, 90);
		reliance.computeEmpWage();
		System.out.println(reliance);
		bigBazar.computeEmpWage();
		System.out.println(bigBazar);
	}
}