package EmployeeWage;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		checkAttendance employee = new checkAttendance();
		System.out.println("Welcome to Employee wage computation problem");
		employee.isPresent();
	}

}
class checkAttendance extends calculateWage{
    double check = Math.floor(Math.random() * 10) % 2;
    void isPresent(){
        if ( check == 1) {
            System.out.println("Employee is Present !");
            System.out.println("Wage is "+ dailyWage());
        }
        else
            System.out.println("Employee is Absent !");
    }
}
class calculateWage {
    final int wagePerHr = 20;
    final int workHr = 8;
    int dailyWage(){
        return wagePerHr * workHr;
    }
}