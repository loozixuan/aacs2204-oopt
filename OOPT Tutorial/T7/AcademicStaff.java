public abstract class AcademicStaff {

    protected int yearOfService;

    public AcademicStaff(int year) {
        yearOfService = year;

    }

    public void setYearOfService(int year) {
        yearOfService = year;
    }

    public int getYearOfService() {
        return yearOfService;
    }

    public double calcEntertainmentAllowance() {
        double entertainmentAllowance;
        if (getYearOfService() >= 8) {
            entertainmentAllowance = 200;
        } else {
            entertainmentAllowance = 0;
        }
        return entertainmentAllowance;
    }

    public double calcHousingAllowance() {
        double housingAllowance;
        if (getYearOfService() >= 10) {
            housingAllowance = 300;
        } else {
            housingAllowance = 0;
        }
        return housingAllowance;
    }

    public abstract void displayDetail();
}
