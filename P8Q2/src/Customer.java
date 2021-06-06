
public class Customer {
  private String id;
  private String name;
  private Address address;

  public Customer() {
  }

  public Customer(String id, String name, Address address) {
    this.id = id;
    this.name = name;
    this.address = address;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
