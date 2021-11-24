package com.greatlearning.main;

import com.greatlearning.models.AdminDepartment;
import com.greatlearning.models.HrDepartment;
import com.greatlearning.models.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		
		AdminDepartment adminDepartment = new AdminDepartment();
		HrDepartment hrDepartment = new HrDepartment();
		TechDepartment techDepartment = new TechDepartment();
		
		System.out.println(" Welcome to " + adminDepartment.departmentName().strip());
		System.out.println(adminDepartment.getTodaysWork().replace(" S", " s"));
		System.out.println(adminDepartment.getWorkDeadline().stripLeading());
		System.out.println(adminDepartment.isTodayAHoliday().replace("h", "H"));
		
		System.out.println();
		
		System.out.println(" Welcome to " + hrDepartment.departmentName().replace("Hr", "HR").strip());
		System.out.println(hrDepartment.doActivity());
		System.out.println(hrDepartment.getTodaysWork().strip());
		System.out.println(hrDepartment.getWorkDeadline().stripLeading());
		System.out.println(hrDepartment.isTodayAHoliday().replace("h", "H"));
		
		System.out.println();
		System.out.println();
		
		System.out.println(" Welcome to " + techDepartment.departmentName().strip());
		System.out.println(techDepartment.getTodaysWork().strip().replace(" m", " M"));
		System.out.println(techDepartment.getWorkDeadline().stripLeading());
		System.out.println(techDepartment.getTechStackInformation().replace("c", " C")+" ");
		System.out.println(techDepartment.isTodayAHoliday().replace("h", "H"));
		
	}

}
