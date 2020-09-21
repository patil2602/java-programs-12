/*4)	WRITE A PROGRAM for Department class having departmentName and HOD name as instance variables,a 
 * constructor to initialize the variables and showDepartmentDetails() to display the details.
 * Create StaffMember class having MemberName and MemberQualification as instance variables.
 * Create the constructor and showstaffMemberDetails() method to display the details.
Create the objects for the classes Department and staffMember.Test them.


 * */


package inheritanceAssignment;

public class Department {
	String departmentName;
	String hodName;
	
	Department()
	{
		this.departmentName="electronics";
		this.hodName="k.p.akole";
	}
	
	void showDepartmentDetails()     //(String departmentName, String hodName)
	{
		System.out.println("the department name is:"+departmentName);
		System.out.println("the hod name is:"+hodName);
	}
	
}