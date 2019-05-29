package lesson3.labs.prob1;

public class PersonWithJob extends Person {
	
	private double salary;
	private Person person;

	public double getSalary() {
		return salary;
	}
	
	public Person getPerson() {
		return person;
	}

	PersonWithJob(String n, double s, Person p) {
		super(n);
		salary = s;
		this.person = p;
	}
	
	@Override
	public boolean equals(Object aPerson) {
		
		if(aPerson == null) return false; 
		if(!(aPerson instanceof PersonWithJob)) 
			{
				System.out.println("I am here!");
				return false;
			}
		PersonWithJob p = (PersonWithJob)aPerson;
		boolean isEqual = this.getName().equals(p.getName()) &&
				this.getSalary()==p.getSalary();
		return isEqual;
	}
	public static void main(String[] args) {
		Person p2 = new Person("Joe");
		Person p1 = new PersonWithJob("Joe", 30000, p2);
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}


}
