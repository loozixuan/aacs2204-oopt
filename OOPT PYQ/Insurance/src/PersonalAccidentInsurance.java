
public class PersonalAccidentInsurance extends Insurance{
    private String nomineeName;
    private String nomineeICno;

    public PersonalAccidentInsurance() {
    }

    public PersonalAccidentInsurance(String nomineeName, String nomineeICno, String policyNumber, String policyHolderName, double premium) {
        super(policyNumber, policyHolderName, premium);
        this.nomineeName = nomineeName;
        this.nomineeICno = nomineeICno;
    }
    
    public String toString(){
        return super.toString() + "\n"
                + "Nominee Name: " + nomineeName+
                "\n" + "Nominee IC no: " + nomineeICno;
    }
}
