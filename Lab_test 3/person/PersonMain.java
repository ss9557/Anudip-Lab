package person;

public class PersonMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str= {"Hindi","Math"};
		Student st= new Student("Shweta Rathore",22,8567389,105,str);
		System.out.println(st);
		
		String[] str1= {"Science","SocialScience"};
		Student st1= new Student("Raman",25,567432,110,str1);
		System.out.println(st1);
		

	}

}
