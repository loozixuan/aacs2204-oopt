
public class Employee {
    private String name;
    private int yearJoined;
    private double basicSalary;

    public Employee() {
    }

    public Employee(String name, int yearJoined, double basicSalary) {
        this.name = name;
        this.yearJoined = yearJoined;
        this.basicSalary = basicSalary;
    }

    public String getName() {
        return name;
    }

    public int getYearJoined() {
        return yearJoined;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    
    public String toString() {
        return  "Name: " + name + "\n"+
                "YearJoined: " + yearJoined + "\n"+
                "BasicSalary: " + basicSalary ;
    }
    
    public double calculateSalary(){
        return this.basicSalary;
    }
    
    public boolean equals(Object obj){
        //Casting(change Object data type to Employee data type)
        Employee temp = (Employee)obj;
        
        if(temp.getName().equals(this.name)){
            return true;
        }else{
            return false;
        }
    }
}
