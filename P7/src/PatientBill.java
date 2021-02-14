
public abstract class PatientBill implements Comparable{
    protected String visitID;
    protected String name;

    protected PatientBill() {
    }
       
    protected PatientBill(String visitID, String name) {
        this.visitID = visitID;
        this.name = name;
    }

    public String getVisitID() {
        return visitID;
    }

    public void setVisitID(String visitID) {
        this.visitID = visitID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

 
    public String toString() {
        return "VisitID: " + visitID + "\n"+
                "Name: " + name;
    }
    
   public abstract double calculateTotalCharges();
   
   public int compareTo(Object o){
       if(o==null){
           throw new NullPointerException("empty");
       }else if(!(o instanceof PatientBill)){
           throw new IllegalArgumentException("Invalid input");
       }
        PatientBill temp = (PatientBill)o;
        
        return (temp.getName().compareTo(this.name));
           
   }
    
}
