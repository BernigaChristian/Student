//Berniga Christian 4D
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Student {
	private String name;
	private String surname;
	private final int studentId;
	private LocalDate birthDay;
	private LocalDateTime registrationDay;
	private static int registered=0;
	//constructors
	public Student(String name,String surname,String birth,String registration) {
		setName(name);
		setSurname(surname);
		setBirthDay(birth);
		setRegistrationDay(registration);
		studentId=++registered;
	}
	//getters
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public int getId() {
		return studentId;
	}
	public LocalDate getBirthDay() {
		return birthDay;
	}
	public String getRegistrationDay() {
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:s a");
		return registrationDay.format(formatter);
	}
	//setters
	public void setName(String name) {
		this.name=name;
	}
	public void setSurname(String surname) {
		this.surname=surname;
	}
	public void setBirthDay(String birth) {
		birthDay=LocalDate.parse(birth);
	}
	public void setRegistrationDay(String registration) {
		registrationDay=LocalDateTime.parse(registration);
	}
	//methods
	public String toString() {
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:s a");
		return name+" "+surname+" "+studentId+" "+birthDay+" "+registrationDay.format(formatter);
	}
}
