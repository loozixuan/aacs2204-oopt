
public class OutpatientBill extends PatientBill{
    private static double REGISTRACTION_FEES=30.00;
    private double consultationFees;

    public OutpatientBill(double consultationFees, String visitID, String name) {
        super(visitID, name);
        this.consultationFees = consultationFees;
    }

    public static double getREGISTRACTION_FEES() {
        return REGISTRACTION_FEES;
    }

    public double getConsultationFees() {
        return consultationFees;
    }

    public void setConsultationFees(double consultationFees) {
        this.consultationFees = consultationFees;
    }
    
    public double calculateTotalCharges(){
        return REGISTRACTION_FEES + consultationFees;
    }

    public String toString() {
        return super.toString()+ "\n" +
                "ConsultationFees: " + consultationFees +
                "\n" +"Registraction Fees: " + REGISTRACTION_FEES;
    }   
}
