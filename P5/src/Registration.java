public class Registration {
    private static int count=1001;
    
    private int regNo;
    private Car car;
    private Owner owner;

    public Registration(Owner owner,Car car) {
        this.car = car;
        this.owner = owner;
        regNo = count;
        count++;
    }

    public static int getCount() {
        return count;
    }
    
    @Override
    public String toString(){
     return String.format("%-5d %s %s",regNo,owner.toString(),car.toString());
    }
}
