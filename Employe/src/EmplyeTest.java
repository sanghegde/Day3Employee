//program to find the salary details of the employee
import java.util.Scanner;
public class EmplyeTest {
	public static void main(String args[])
	{
		Employe employee1=new Employe();
		
		Scanner scanner=new Scanner(System.in);
		
		double monthlyBasic;
		String name;
		
		System.out.println("Enter the 1st employee name");
		name=scanner.nextLine();
		employee1.setName(name);
		
		System.out.println("Enter the monthybasic");
		monthlyBasic=scanner.nextDouble();
		employee1.setMonthlyBasic(monthlyBasic);
		
		System.out.println("the salary details of employee");
		System.out.println("Employee ID:"+employee1.getId());
		System.out.println("Employee name:"+employee1.getName());
		System.out.println("MonthlyBAsic:"+employee1.getMonthlyBasic());
		System.out.println("AnnualBasic:"+employee1.getAnnualBasic( ));
		System.out.println("Monthly Gross:"+employee1.getMonthyGrossSalary());
		System.out.println("annual Gross:"+employee1.getAnnualSalary());
		System.out.println("monthlydeduction:"+employee1.getMonthlyDeduction());
		System.out.println("monthlytake home:"+employee1.getMonthlyTakeHome( ));
		System.out.println("annualtake home:"+employee1.getAnnualTakeHome());
		
		

}

}

		
		
		
		
		
		
		
		
		
		
		
	
