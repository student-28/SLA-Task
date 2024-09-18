import java.util.*;

public class EmployeeDetails{
	static int id=1;
	int employee_id;
	String name;
	int salary;
	EmployeeDetails(String name,int salary){
		this.name=name;
		this.salary=salary;
		this.employee_id=id++;
	}
	void details() {
		System.out.println("Employee name : "+name);
		System.out.println("Employee Id : "+employee_id);
		}
	void bonus(String month) {
		if(month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul") || month.equals("Sep") ||  month.equals("Nov"))
			System.out.println("Salary : "+salary+" \nBonus : "+(int)(salary*(0.1)));
		else
			System.out.println("Salary : "+salary+"\n Bonus : "+(int)(salary*(0.05)));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeDetails emp1=new EmployeeDetails("ABC",40000);
		System.out.println("Enter a month for salary bonus : ");
		String mon=sc.nextLine();
		emp1.details();
		emp1.bonus(mon);
	}
}