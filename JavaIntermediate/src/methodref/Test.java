package methodref;

public class Test {
public static void main(String[] args) {
	School sch=new School();
	Noteable nt=sch::noteLecture;
	nt.note("Lecturer");
	
	Noteable nt1=sch::noteObservation;
	nt1.note("note");
	
	Noteable nt2=sch::noteOnlineClass;
	nt1.note("online");
	
	School mySchool=new School();
	mySchool.noteLecture("Lecturer");
	mySchool.noteObservation("note");
	mySchool.noteOnlineClass("online");
}
}
