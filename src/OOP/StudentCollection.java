package OOP;

public class StudentCollection implements Comparable<StudentCollection> {
	private int id;
	private String name;
	
	
	public StudentCollection(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "StudentCollection [id=" + id + ", name=" + name + "]";
	}

	public int compareTo(StudentCollection that) {
		return Integer.compare(this.id, that.id);
	}
	
	
}
