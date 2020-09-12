package Internship.dlithe.DlitheInternCore;

public class InRole {
	
	public static void main(String[] args) {
		System.out.println("Begin");
		Holder s1=new Holder();
		s1.name="Aryan"; s1.mobile=12345678l;
		s1.skill="dance";
		s1.cgpa=9.15;
		Holder s2=new Holder();
		s2.name="Balaji"; s2.mobile=12345678l;
		s2.skill="sing";
		s2.cgpa=10.0;
		System.out.println(s1.name+" "+s1.mobile+" "+s1.skill+" "+s1.cgpa);
	}
}
class Holder{
	String name,skill;
	Long mobile;
	Double cgpa;
}