package person;
import java.util.Arrays;
public class Student extends Person {

	static final String inst_name = "Ucer";
	int roll_no;
	String[] subj;
	
	Student(String name,int age,int mob,int roll_no,String[] subj){
		super(name,age,mob);
		this.roll_no=roll_no;
		this.subj=subj;
	}

	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", subj=" + Arrays.toString(subj) + ", name=" + name + ", age=" + age
				+ ", mob=" + mob + "]"+" "+inst_name;
	}
}
