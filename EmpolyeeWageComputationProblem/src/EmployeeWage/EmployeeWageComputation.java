package EmployeeWage;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		checkAttendance employee = new checkAttendance();
		System.out.println("Welcome to Employee wage computation problem");
		employee.isPresent();
	}

}
class checkAttendance extends calculateWage{
    double check = Math.floor(Math.random() * 10) % 3;
    void isPresent(){
        if ( check == 0 ) {
            System.out.println("Employee is Present for full time !");
            System.out.println("Wage is "+ dailyWage(8));
        }
        else if ( check == 1 ) {
            System.out.println("Employee is Present for part time !");
            System.out.println("Wage is "+ dailyWage(4));
        }
        else
            System.out.println("Employee is Absent !");
    }
}
class calculateWage {
    final int wagePerHr = 20;
    final int workHr = 8;
    int dailyWage(int workHr){
        return wagePerHr * workHr;
    }
}