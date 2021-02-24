
public class CarInsurance extends Insurance{
    private String carRegs;
    private String coverage;
    
    public CarInsurance() {
    }

    public CarInsurance(String carRegs, String coverage, String policyNumber, String policyHolderName, double premium) {
        super(policyNumber, policyHolderName, premium);
        this.carRegs = carRegs;
        this.coverage = coverage;
    }

    public String toString(){
        return super.toString() + "\n" +
            "Car Registration no: " + carRegs + 
            "\n" + "Coverage: " + coverage;
    }
  
    
}
