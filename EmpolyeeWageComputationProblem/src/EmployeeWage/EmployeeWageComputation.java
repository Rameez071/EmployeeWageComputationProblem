package EmployeeWage;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		checkAttendance employee = new checkAttendance();
		System.out.println("Welcome to Employee wage computation problem");
		employee.isPresent();
	}

}
class checkAttendance extends calculateWage{
    int check = (int)(Math.floor(Math.random() * 10) % 3);
    void isPresent(){
        switch(check) {
            case 0:
                System.out.println("Employee is Present for full time !");
                System.out.println("Wage is " + dailyWage(8));
                break;
            case 1:
                System.out.println("Employee is Present for part time !");
                System.out.println("Wage is " + dailyWage(4));
                break;
            default:
                System.out.println("Employee is Absent !");
                break;
        }
    }
}
class calculateWage {
    final int wagePerHr = 20;
    int dailyWage(int workHr){
        return wagePerHr * workHr;
    }
}