package week1.les1.opdracht5;

public class Student{
	private String naam;
	private int studentNummer;

public Student(String nm, int num){
	naam = nm;
	studentNummer = num;
	}

public Student(String nm) {
	naam = nm;
}

public String getNaam() {
	return naam;
}

public int getStudentNummer() {
	return studentNummer;
}

public void setStudentNummer(int newNum) {
	studentNummer = newNum;
}

public String toString() {
	return "naam van student is " + naam + ", studentnummer van " + naam + " is " + studentNummer + ".";
}
}