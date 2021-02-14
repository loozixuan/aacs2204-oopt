
public class testPatientBill {
    public static void main(String[] args) {
        //MUST BE PARENT CLASS (ARRAY DATA TYPE)
        PatientBill[] patientBillArray = {new InpatientBill(1000,50,'S',2,"V1001","Ali"),new InpatientBill(1500,150,'P',7,"V1002","Abu"),new OutpatientBill(50,"V1003","Siti"),new OutpatientBill(50,"V1004","Ahmad")};
        
        //compare to 
        System.out.println(patientBillArray[0].compareTo(patientBillArray[1]));
        //sort data
        selectionSort(patientBillArray);
         
        for (PatientBill p : patientBillArray) {
            System.out.print("\nPatient's Bill Information\n===========================\n");
            System.out.println(p.toString()+ "\n" + "Total Charges: RM " + p.calculateTotalCharges() + "\n");
        }
        
        System.out.println("\nTotal Collection Fees: RM " + computeTotalCollection(patientBillArray));
    }
    
    public static double computeTotalCollection(PatientBill [] p){
      double total=0;
      for (PatientBill pList : p) {
          total+=pList.calculateTotalCharges();
      }
      return total;
    }
    
    public static PatientBill[] selectionSort(PatientBill[] arr) {
      for (int i = 0; i < arr.length; ++i) {
         int indexOfSmallest = i;	// assign the first index of the subarray as the initial indexOfSmallest    

         for (int j = i+1; j < arr.length; ++j) {
            if (arr[j].compareTo(arr[indexOfSmallest]) < 0) // if the current array element is smaller than the
                    indexOfSmallest = j;	// element at indexOfSmallest, update indexOfSmallest
         }

            // swap the element at indexOfSmallest with the current subarray's first element 	
            PatientBill tempArr = arr[indexOfSmallest];
            arr[indexOfSmallest] = arr[i];
            arr[i] = tempArr;
         }
   return arr;
}
}
