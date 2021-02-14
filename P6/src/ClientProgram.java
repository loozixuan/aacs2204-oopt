
public class ClientProgram { 
    public static void main(String[] args) {
        Employee[] empArray=new Employee[]{new Employee("Ali",1999,1000.00),new CommissionEmployee("Abu",2001,1200.00,100.00,0.5),new Clerk("Ali",2001,1200.00,250.00,3)};
        printElements(empArray);
         
        //TESTING EQUALS METHOD
        System.out.println("Is array[0] equals to array[1]? " + empArray[0].equals(empArray[1]));       //EMPLOYEE VS COMMISSIONEMPLOYEE
        System.out.println("Is array[0] equals to array[2]? " + empArray[0].equals(empArray[2]));       //EMPLOYEE VS CLERK
        System.out.println("Is array[1] equals to array[2]? " + empArray[1].equals(empArray[2]));       //COMMISSIONEMPLOYEE VS CLERK
    }
    
    public static void printElements(Employee[] e){
        for(int i=0;i<e.length;i++){
            if(e[i] instanceof Clerk){
                System.out.println("Clerk\n=====");      
           }else if(e[i] instanceof CommissionEmployee){
               System.out.println("Comission Employee\n==================");
           }else{
               System.out.println("Employee\n========");
           }
            System.out.println(e[i].toString());
            System.out.println("Monthly Salary: "+e[i].calculateSalary()+"\n");         
        }
    }
}
