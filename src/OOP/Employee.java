package OOP;

public class Employee extends Person {
	public Employee(String name, String email, String mobile, String title, String employer, String emplyeeGrade, Integer salary) {
		super(name, email, mobile);
		
		setTitle(title);
		setEmployer(employer);
		setEmployeeGrade(employeeGrade);
		setSalary(salary);
		
	}

	private String title;
	private String employer;
	private String employeeGrade;
	private Integer salary;
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmployer() {
		return employer;
	}
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	public String getEmployeeGrade() {
		return employeeGrade;
	}
	public void setEmployeeGrade(String employeeGrade) {
		this.employeeGrade = employeeGrade;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return getName() + "#" + getEmail() + "#" + getMobile() + "#" + getTitle() + "#" + getEmployer() + "#" + getSalary();
	}
}
;