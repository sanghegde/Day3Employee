//class employee which includes the methods for calculating the salary details of the employee
public class Employe {
	
	private final int id=101;
	private String name;
	private double monthlyBasic;
	double MonthyGrossSalary;
	double MonthlyDeduction;
	double MonthlyTakeHome;
	static double pf;
	double AnnualTakeHome;
	
	public int getId()
	{
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public double getMonthlyBasic()
	{
		return monthlyBasic;
	}
	public void setMonthlyBasic(double monthlyBasic) 
	{
		this.monthlyBasic = monthlyBasic;
	}
	double getAnnualBasic( )
	{
		double annualBascics=monthlyBasic * 12;
		 return  annualBascics ;
	}
        //method for calculating monthlygrosssalary
	public double getMonthyGrossSalary()
    {   
		double hra=monthlyBasic*0.5;
		double medical=1250;
		double convience=800;
	    double MonthyGrossSalary=monthlyBasic+hra+medical+convience;
		return MonthyGrossSalary;
	}
        //method for calculating the annualsalary
	double getAnnualSalary()
	{
		 double annualSalary=12 * MonthyGrossSalary;
		 return annualSalary ;
	}
	 
	//calculating the monthlydeduction
	double getMonthlyDeduction()
	{  
		double esic;
		double profTax,pf;
		if(monthlyBasic>6500)
		{
			pf=monthlyBasic*0.1;
		}
		else
		{
			pf=6500;
		}
		if(monthlyBasic<=5000)
		{
			esic=monthlyBasic*0.475;
		}
		else
		{
			esic=0;
		}
		if(monthlyBasic<=10000)
		{
			profTax=50;
		}
		else
		{
			profTax=100;
		}
		MonthlyDeduction=pf+esic+profTax;
		
		return MonthlyDeduction;
	}
	//calculate monthlytakehome
	double getMonthlyTakeHome( )
	{
		MonthlyTakeHome=MonthyGrossSalary-MonthlyDeduction;
		return MonthlyTakeHome ;
	}
	
	double getAnnualTakeHome()
	{
		AnnualTakeHome=MonthlyTakeHome*12;
		return AnnualTakeHome ;
	}
	
	public static double getPf() {
		return pf;
	}

	public static void setPf(double pf) {
		Employe.pf = pf;
	}

	
}
