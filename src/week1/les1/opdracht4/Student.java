package week1.les1.opdracht4;

public class Student{
	private String naam;

public Student(String nm){
	naam = nm;
	}

public String getNaam() {
	return naam;
}
public String toString() {
	return "naam van student is " + naam;
}
}