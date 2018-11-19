package multipleEmployeeData;

import java.util.Scanner;

public class MultipleEmployeeData extends EmployeeDetail{
	static EmployeeDetail[] emp=null;
	
	
	public static void empDataoutput() {
		System.out.println("Employee Database: ");
		System.out.println("EmployeeName"+"\t"+"EmployeeNumber"+"\t"+"EmployeeSalary"+"\t"+"EmployeeMobileNumber");
		for(int i=0;i<3;i++ ) {
			System.out.print(emp[i].EmpName+"\t"+emp[i].EmpNumber+"\t"+emp[i].Salary+"\t"+emp[i].MobNumber);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		emp=new EmployeeDetail[3];
		for(int i=0;i<3;i++) {
			emp[i]=new EmployeeDetail();
			System.out.println("Enter the employee "+(i+1)+" name");
			emp[i].EmpName=scn.nextLine();
			System.out.println("Enter the employee "+(i+1)+" number");
			emp[i].EmpNumber=Integer.parseInt(scn.nextLine());
			System.out.println("Enter the employee "+(i+1)+" Mobile number");
			emp[i].MobNumber=Long.parseLong(scn.nextLine());
			System.out.println("Enter the employee "+(i+1)+" Salary");
			emp[i].Salary=Float.parseFloat(scn.nextLine());
		}
		scn.close();
		
		empDataoutput();	
	}

}

class EmployeeDetail{
	String EmpName;
	int EmpNumber;
	Float Salary;
	Long MobNumber;
}
