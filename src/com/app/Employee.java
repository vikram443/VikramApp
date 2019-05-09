package com.app;

public class Employee {
	
	private String empNaame;

	public String getEmpNaame() {
		return empNaame;
	}

	public void setEmpNaame(String empNaame) {
		this.empNaame = empNaame;
	}

	@Override
	public String toString() {
		return "Employee [empNaame=" + empNaame + "]";
	}
	
	

}
