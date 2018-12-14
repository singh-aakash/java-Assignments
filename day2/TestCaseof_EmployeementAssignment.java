import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestCaseof_EmployeementAssignment {
	private EmployeeAssessment employeeAssessment = new EmployeeAssessment();

	@Before
	public void setup() {
		employeeAssessment.setEmp_Id(123);
		employeeAssessment.setEmp_Name("Aakash Singh");
		employeeAssessment.setMonthly_Basic(10000);
	}
				
	@Test
	public void testAnnualBasic() {
		double result = employeeAssessment.getAnnualBasic();
		System.out.println("annual basic "+result);
		assertEquals(120000.0, result, 0.01);
	}

	@Test
	public void testMonthlyGrossSalary() {
		double result = employeeAssessment.getMonthlyGrossSalary();
		assertEquals(17050.0, result, 0.01);
	}
	
	@Test
	public void testAnnualGrossSalary() {
		double result = employeeAssessment.getAnnualGrossSalary();
		assertEquals(204600.0, result, 0.01);
	}
	
	@Test
	public void testMonthlyDeductions() {
		double result = employeeAssessment.getMonthlyDeductions();
		assertEquals(1050.0, result, 0.01);
	}
	
	@Test
	public void testMonthlyTakeHome() {
		double result = employeeAssessment.getMonthlyTakeHome();
		System.out.println("MonthlyTakeHome   " + result);
		assertEquals(16000.0, result, 0.01);
	}
	
	@Test
	public void testAnnualTakeHome() {
		double result = employeeAssessment.getAnnualTakeHome();
		System.out.println("  AnnualTakeHome  " + result);
		assertEquals(192000.0, result, 0.01);
	}
}
