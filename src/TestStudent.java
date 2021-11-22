//Berniga Christian 4D
public class TestStudent {

	public static void main(String[] args) {
		Student s1=new Student("Mario","Rossi","2006-02-21","2019-03-27T10:15:30");
		Student s2=new Student("Giorgio","Bianchi","2003-01-01","2021-02-01T10:00:00");
		//test getters
		System.out.print("STUDENT S1\nname: "+s1.getName()+"\nsurname: "+s1.getSurname()+"\nstudent number: "+s1.getId()+"\nbirthday: "+s1.getBirthDay()+"\nregistration day: "+s1.getRegistrationDay()+"\n\n");
		System.out.print("STUDENT S2\nname: "+s2.getName()+"\nsurname: "+s2.getSurname()+"\nstudent number: "+s2.getId()+"\nbirthday: "+s2.getBirthDay()+"\nregistration day: "+s2.getRegistrationDay()+"\n\n");
		//test toString
		System.out.print("STUDENT S1\n"+s1.toString()+"\n\n");
		System.out.print("STUDENT S2\n"+s2.toString()+"\n\n");
	}
}
