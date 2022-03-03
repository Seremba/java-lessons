package inheritance;

public class Employee extends Person{
  private String id;
  private String title;

	public Employee() {
		super("Seremba");
		System.out.println("this is an employee constructor");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
