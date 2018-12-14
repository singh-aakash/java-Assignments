
public class EmployeeAssessment {
	private int emp_Id;
	private String emp_Name;
	private double monthly_Basic ;
	private double hra;
	private double pf;
	private double monthlyAllowance = 1250;
	private double conveyenceAllowance = 800;
	private double esic;
	private double profTax;
	private double pfRate = 10;
	private int getEmp_Id() {
		return emp_Id;
	}
	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
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
	public double getMonthly_Basic() {
		return monthly_Basic;
	}
	public void setMonthly_Basic(double monthly_Basic) {
		this.monthly_Basic = monthly_Basic;
	}
	public double getAnnualBasic(){
		return 12 * this.monthly_Basic;
	}
	public double getMonthlyGrossSalary(){
		return grossSalary(this.monthly_Basic);
	}
	public double getAnnualGrossSalary(){
		return grossSalary(this.monthly_Basic) * 12;
	}
	public double getMonthlyDeductions(){
		return this.monthlyDeductions();
	}
	public double monthlyDeductions() {
		esic = 0;
		pf =0;
		
		pf=(getPFRate()*((this.monthly_Basic)/100) <6500) ? (this.pfRate*this.monthly_Basic)/100 : 6500;
		if(monthly_Basic <= 5000)
			this.esic = (4.75* this.monthly_Basic)/100;
		
		System.out.println("pf "+pf);
		if(this.monthly_Basic <= 10000)
			this.profTax = 50;
		else
			this.profTax = 100;
		return (this.pf + this.esic + this.profTax);
		
	}
	public double grossSalary(double monthly_Basic) {
		this.hra = monthly_Basic / 2;
		monthly_Basic = monthly_Basic + this.hra + this.monthlyAllowance + this.conveyenceAllowance;
		return monthly_Basic;
	}
	public double getMonthlyTakeHome(){
		return  (this.grossSalary(this.monthly_Basic) - this.monthlyDeductions());
	}
	public double getAnnualTakeHome(){
		return this.getMonthlyTakeHome() * 12;
	}
	public static void main(String[] args)
	{
		EmployeeAssessment obj = new EmployeeAssessment();
		obj.setEmp_Id(123);
		obj.setEmp_Name("Aakash Singh");
		obj.setMonthly_Basic(10000);
		System.out.println(" Employee_Id : " + obj.getEmp_Id() + "\n Employee-NAME : "
				+ obj.getEmp_Name() + "\n Employee monthly salary : " + obj.getMonthly_Basic()
				+ "\n Annual Salary : " + obj.getAnnualBasic() 
				+ "\n Monthly Gross Salary : " + obj.getMonthlyGrossSalary() + 
				"\n Annual Gross Salary : " + obj.getAnnualGrossSalary() + 
				"\n Monthly Deductions : " + obj.getMonthlyDeductions() +
				"\n MonthlyTakeHome : " + obj.getMonthlyTakeHome() +
				"\n AnnualyTakeHome : " + obj.getAnnualTakeHome());
	}

	

}
