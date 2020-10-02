package EmployeeWage;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		checkAttendance employee = new checkAttendance();
		System.out.println("Welcome to Employee wage computation problem");
		employee.isPresent();
	}

}
class checkAttendance extends calculateWage{
    int check;
    static int days = 0;
    void isPresent(){
        int wage = 0;
        int totalWage = 0;
        while ( days != 20 ){
            days++;
            check = (int)(Math.floor(Math.random() * 10) % 3);
            switch(check) {
                case 0:
                    wage = dailyWage(8);
                    break;
                case 1:
                    wage = dailyWage(4);
                    break;
                default:
                    wage = 0;
                    break;
            }
            totalWage = totalWage + wage;
        }
        System.out.println("Total earning of employee for a month is "+totalWage);
    }
}
class calculateWage {
    final int wagePerHr = 20;
    int dailyWage(int workHr){
        return wagePerHr * workHr;
    }
}