package Athira;

import java.util.Scanner;


public class Employee {
	
	
	public String firstname,lastname,department,password,email;
	
	Employee(String fname, String lname) {
		this.firstname = fname;
		this.lastname = lname;
		this.department = generateDepartment();
		
		//this.password = generatePassword();
		email = fname+lname+"@"+department+".abc.com" ;
		
		
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String generateDepartment() {
		// TODO Auto-generated method stub
		System.out.println("Please enter the department from the following");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		Scanner obj = new Scanner(System.in);
		
		int dept = obj.nextInt();
		
		if(dept == 1){
		
				department = "technical";
				
		}
		else if (dept == 2){
			department =  "Admin";
			
		}
		else if (dept == 3){
			department =  "humanresource";
			
		}
		else if (dept == 4){
			department =  "legal";
		}
				
		
		return department;
		
	}
	
public String generatePassword(int len) {
	
	
	
	String pwdSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#";
	char[] password = new char[len];
	for(int i = 0;i< len;i++) {
		
		int rand = (int) (Math.random()*pwdSet.length());
		password[i] = pwdSet.charAt(rand);
		
		
	}
	
	return new String(password);
	
}
	
public static void main(String[] args) {
	
	Employee obj1 = new Employee("Harshit","Choudary");
	Employee obj2 = new Employee();
	System.out.println("Dear "+obj1.firstname+" your credentials are as follows");
	System.out.println("Email--> "+obj1.email.toLowerCase());
	System.out.println("Password--> "+obj2.generatePassword(8));
}
	
}
	

	






	
		
	
	

		


