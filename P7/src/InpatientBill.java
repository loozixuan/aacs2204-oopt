
public class InpatientBill extends PatientBill{
    private final static double STANDARDROOM_RATE = 100;
    private final static double PRIVATEROOM_RATE = 200;
    
    private double specialistCharges;
    private double labCharges;
    private char roomType;
    private int durationOfStay;

    public InpatientBill(){
    }
    
    public InpatientBill(double specialistCharges, double labCharges, char roomType, int durationOfStay, String visitID, String name) {
        super(visitID, name);
        this.specialistCharges = specialistCharges;
        this.labCharges = labCharges;
        this.roomType = roomType;
        this.durationOfStay = durationOfStay;
    }

    public double getSpecialistCharges() {
        return specialistCharges;
    }

    public void setSpecialistCharges(double specialistCharges) {
        this.specialistCharges = specialistCharges;
    }

    public double getLabCharges() {
        return labCharges;
    }

    public void setLabCharges(double labCharges) {
        this.labCharges = labCharges;
    }

    public char getRoomType() {
        return roomType;
    }

    public void setRoomType(char roomType) {
        this.roomType = roomType;
    }

    public int getDurationOfStay() {
        return durationOfStay;
    }

    public void setDurationOfStay(int durationOfStay) {
        this.durationOfStay = durationOfStay;
    }
    
    public double calculateTotalCharges(){
        double roomRate;      
        if(roomType=='S'){
            roomRate=STANDARDROOM_RATE;
        }else{
            roomRate=PRIVATEROOM_RATE;
        }
        return specialistCharges + labCharges + (durationOfStay + roomRate);
    }

    public String toString() {
        return super.toString()+"\n"+
                "SpecialistCharges: " + specialistCharges + "\n"+
                "LabCharges: " + labCharges +"\n"
                +"RoomType: " + roomType + "\n"+
                "DurationOfStay: " + durationOfStay;
    }
    
    
}
