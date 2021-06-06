public class InsuranceDriver {
    public static void main(String[] args) {
    Insurance [] insuranceArray = new Insurance[]{new CarInsurance("JQV1688","Comprehensive","ca00012345","Andy Lim",1240),
        new PersonalAccidentInsurance("Eric Ooi","800212-08-6093","pa00009876","Lily Tan",180)};
    
    for (int i=0;i<insuranceArray.length;i++){
        if(insuranceArray[i] instanceof CarInsurance){
            System.out.println("Car Insurance\n=============");
        }else{
            System.out.println("\nPersonal Accident Insurance\n============================");
        }
        System.out.println(insuranceArray[i].toString());
    }
}
}

