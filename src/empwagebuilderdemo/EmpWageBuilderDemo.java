package empwagebuilderdemo;
public class EmpWageBuilderDemo {

	public static void main(String[] args) {
		
		System.out.println("welcome to employye wage builder program:");
		
		//constants
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;

		//Variable
		int empHrs = 0;
		int empWage = 0;
		
		//computation
		double empCheck = Math.floor(Math.random() * 10 ) % 2;
		if (empCheck == IS_FULL_TIME)
			empHrs = 8;
			
		else
			empHrs = 0;
		
		//calculate daily wages
			
		empWage = empHrs *  EMP_RATE_PER_HOUR;
		System.out.println("Emp WAGE " +empWage );

		}

}
