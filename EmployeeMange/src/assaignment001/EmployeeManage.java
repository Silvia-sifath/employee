package assaignment001;

public class EmployeeManage {
public static void main(String[] args) {
		
		System.out.println("Design Pattern: Strategy\n\n");
		FixedSalaryEmployee abstractEmployee=new FixedSalaryEmployee("Md. ", "5697485", 12000);
		System.out.println(abstractEmployee.calculateSalary());
		
		HourlySalaryEmployee hourlysal=new HourlySalaryEmployee("sd. ", "5697485", 12000,200);
		System.out.println(hourlysal.calculateSalary());
		
		ComissionSalaryEmployee comission=new ComissionSalaryEmployee("fd. ", "5697485", 12000);
		System.out.println(comission.calculateSalary());
	}

}
