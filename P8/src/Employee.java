        
public class Employee {
  private int id;
  private String name;

  public Employee() {
  }

  public Employee(int id, String name) {
  	this.id = id;
   	this.name = name;
  }

  public int getId() {
	return id;
  }

  public String getName(){
   	return name;
  }

  public void setId(int id) {
  	this.id = id;
  }

  public void setName(String name) {
   	this.name = name;
  }

  public String toString(){
   	return "Employee id: " + id + "\n" +
               "Employee name: " + name ;
  }

}
