
    public class Employee{
        private String name;
        private double salary;
        
        //contrustor overloading
        public Employee(){
           name="";
           salary=0.0;
        }
        
        public Employee(String employeeName) {
            name = employeeName;
            salary = 0.0;
        }
        
        public Employee(String employeeName, double currentSalary) {
            name = employeeName;
            salary = currentSalary;
        }
        
        //getter and setter
        public String getName() {
            return name;
        }

        public void setName(String n) {
            name = n;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double s) {
            salary = s;
        }
        
        //method to raise salary
        public void raiseSalary(double percent){
        salary = salary + (salary * percent / 100.0);
        }
}


