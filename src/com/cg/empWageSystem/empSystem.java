package com.cg.empWageSystem;

public class empSystem {
	public static final int isPartTime = 1;
	public static final int isFullTime = 2;
	public static final int empRatePerHr = 20;
	public static final int numOfDays = 20;
	public static final int maxHrPerMonth = 100;

	public String attendance() {
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == isFullTime)
			return "Employee Present";
		else
			return "Employee Absent";
	}

	public double empStatus() {
		double empCheck = Math.floor(Math.random() * 10) % 3;
		return empCheck;
	}

	public int totalWage() {
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		while (totalEmpHrs <= maxHrPerMonth && totalWorkingDays < numOfDays) {
			totalWorkingDays++;
			int status = (int) empStatus();
			switch (status) {
			case isPartTime:
				empHrs = 4;
				break;

			case isFullTime:
				empHrs = 8;
				break;

			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#:" + totalWorkingDays + " EmpHrs: " + empHrs);
		}
		int totalEmpWage = totalEmpHrs * empRatePerHr;
		return totalEmpWage;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		empSystem empobj = new empSystem();
		int totalWage = empobj.totalWage();
		System.out.println("Emp Total Wage : " + totalWage);
	}
}