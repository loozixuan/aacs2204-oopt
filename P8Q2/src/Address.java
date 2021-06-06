
public class Address {
  private String street;
  private int postcode;
  private String state;

  public Address() {
  }

  public Address(String street, int postcode, String state) {
    this.street = street;
    this.postcode = postcode;
    this.state = state;
  }

  public int getPostcode() {
    return postcode;
  }

  public void setPostcode(int postcode) {
    this.postcode = postcode;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  @Override
  public String toString() {
    return "\n\t" + street + "\n\t" + postcode + "\n\t" + state;
  }

}
