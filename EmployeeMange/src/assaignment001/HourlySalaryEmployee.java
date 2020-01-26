package assaignment001;

public class HourlySalaryEmployee extends AbstractEmployee {

	private double employeeSalary;
	private double workinghour;
	
	public HourlySalaryEmployee(String employeeName, String employeeNID,double employeeSalary,double workinghour ) {
		super(employeeName, employeeNID);
		setEmployeeSalary(employeeSalary);
		setWorkingHour(workinghour );
	}

	
	
	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	public void setWorkingHour(double workinghour ) {
		this.workinghour = workinghour;
	}
	public double getWorkingHour() {
		return workinghour;
	}

	@Override
	public double calculateSalary() {
		double sal,total = 0;
		
		if( getWorkingHour()>168){
			sal= getWorkingHour()-168;
			
			total=getEmployeeSalary()+sal*100;
			
		}
		else{
			total=getEmployeeSalary();
		}
		return total;
		
	}

	
}

