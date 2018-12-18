
public class EmployeeAssessment {
	private int empId;
	private String emp_Name;
	private double monthlyBasic ;
	private double hra;
	private double pf;
	private double monthlyAllowance = 1250;
	private double conveyenceAllowance = 800;
	private double esic;
	private double profTax;
	private double pfRate = 10;
	private int getempId() {
		return empId;
	}
	public void setempId(int empId) {
		this.empId = empId;
	}
	public void setPFRate(double pfRate) {
		this.pfRate = pfRate;
	}
	
	public double getPFRate() {
		return pf;
	}
	public String getEmp_Name() {
		return emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}
	public double getmonthlyBasic() {
		return monthlyBasic;
	}
	public void setmonthlyBasic(double monthlyBasic) {
		this.monthlyBasic = monthlyBasic;
	}
	public double getAnnualBasic(){
		return 12 * this.monthlyBasic;
	}
	public double getMonthlyGrossSalary(){
		return grossSalary(this.monthlyBasic);
	}
	public double getAnnualGrossSalary(){
		return grossSalary(this.monthlyBasic) * 12;
	}
	public double getMonthlyDeductions(){
		return this.monthlyDeductions();
	}
	public double monthlyDeductions() {
		esic = 0;
		pf =0;
		
		pf=(getPFRate()*((this.monthlyBasic)/100) <6500) ? (this.pfRate*this.monthlyBasic)/100 : 6500;
		if(monthlyBasic <= 5000)
			this.esic = (4.75* this.monthlyBasic)/100;
		
		System.out.println("pf "+pf);
		if(this.monthlyBasic <= 10000)
			this.profTax = 50;
		else
			this.profTax = 100;
		return (this.pf + this.esic + this.profTax);
		
	}
	public double grossSalary(double monthlyBasic) {
		this.hra = monthlyBasic / 2;
		monthlyBasic = monthlyBasic + this.hra + this.monthlyAllowance + this.conveyenceAllowance;
		return monthlyBasic;
	}
	public double getMonthlyTakeHome(){
		return  (this.grossSalary(this.monthlyBasic) - this.monthlyDeductions());
	}
	public double getAnnualTakeHome(){
		return this.getMonthlyTakeHome() * 12;
	}

}
