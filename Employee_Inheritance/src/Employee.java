public class Employee {
	protected long employeeId;
	protected String employeeName;
	protected String employeeAddress;
	protected long employeePhone;
	protected double basicSalary;
	protected final double SPECIAL_ALLOWANCE = 250.80;
	protected final double HRA = 1000.50;
	
	///////////////////////////////////  CONSTRUCTORS  ///////////////////////////////////////////////
	
	public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone,
			double basicSalary) {
		
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
		this.basicSalary = basicSalary;
	}
	
	public Employee() {
		
	}

//////////////////////////////////////////SETTERS & GETTERS ///////////////////////////////////////////
	
	
	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public long getEmployeePhone() {
		return employeePhone;
	}

	public void setEmployeePhone(long employeePhone) {
		this.employeePhone = employeePhone;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getSPECIAL_ALLOWANCE() {
		return SPECIAL_ALLOWANCE;
	}

	public double getHRA() {
		return HRA;
	}
	
	
////////////////////////////////////////// OTHER METHODS  ///////////////////////////////////////////
	public double calculateSalary() {
		double salary;
		salary = basicSalary + (basicSalary * SPECIAL_ALLOWANCE/100) + (basicSalary * HRA/100);
		return salary;
		
	}
	
	
	
	
	
	
	
	
}
