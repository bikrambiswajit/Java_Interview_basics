package collections;

public class student {
	
	String name;
	int rollno;


	public student(String name, int rollno){
		this.name=name;
		this.rollno=rollno;
	}


	@Override
	public String toString() {
		return "student [name=" + name + ", rollno=" + rollno + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollno;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student other = (student) obj;
		if (rollno != other.rollno)
			return false;
		return true;
	}

}
