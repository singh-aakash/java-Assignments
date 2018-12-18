import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestCaseofEmployeementAssignment {
	private EmployeeAssessment employeeAssessment = new EmployeeAssessment();

	@Before
	public void setup() {
		employeeAssessment.setempId(123);
		employeeAssessment.setEmp_Name("Aakash Singh");
		employeeAssessment.setmonthlyBasic(10000);
	}
				
	@Test
	public void testAnnualBasic() {
		double result = employeeAssessment.getAnnualBasic();
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
		assertEquals(16000.0, result, 0.01);
	}
	
	@Test
	public void testAnnualTakeHome() {
		double result = employeeAssessment.getAnnualTakeHome();
		assertEquals(192000.0, result, 0.01);
	}
}
