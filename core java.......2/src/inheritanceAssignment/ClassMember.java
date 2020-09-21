package inheritanceAssignment;

public class ClassMember extends Department {
	String memberName;
	String memberQualifiction;
	
	ClassMember()
	{
		this.memberName="ganesh";
		this.memberQualifiction="civil engineer";
	}
	void showStaffMemberDetails()                       //(String memberName,String memberQualifiction)
	{
		System.out.println("the staff member  name is:"+memberName);
		System.out.println("the member qualification is:"+memberQualifiction);
	}
}
