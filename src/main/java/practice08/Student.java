package practice08;

public class Student extends Person{
	private Klass klass;
	
	public Student(int id,String name, int age) {
		super(id,name, age);
	}
	
	public Student(int id,String name, int age, Klass klass) {
		super(id,name, age);
		this.klass = klass;
	}	
		
	public Klass getKlass() {
		return klass;
	}
	
	public String introduce() {
		String introduce =super.introduce()+ " I am a Student. I am at Class "+this.klass.getNumber()+".";
		if(this.klass.getLeader().getName() == this.getName()) {
			return introduce = super.introduce() + " I am a Student. I am Leader of Class " + klass.getNumber() + ".";
		}
		return introduce;		
	}
}
