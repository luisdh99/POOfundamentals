
public class employee {

	String firstName;
    String lastName;
    int registration;
    int age;
    int daysWorked;
    int vacationDaysTaken;
    double salary;
    int yearsWorked;

    public employee(String firstName2, String lastName2, int registration2, int age2, int daysWorked2,
			int vacationDaysTaken2, double salary2, int yearsWorked2) {
		// TODO Auto-generated constructor stub
	}

	public void Employee(String firstName, String lastName, 
    		int registration, int age, int daysWorked, 
    		int vacationDaysTaken, double salary, int yearsWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.age = age;
        this.daysWorked = daysWorked;
        this.vacationDaysTaken = vacationDaysTaken;
        this.salary = salary;
        this.yearsWorked = yearsWorked;
    }

    // Calculate the time to retirement
    public int timeToRetirement() {
        return Math.min(60 - age, 40 - yearsWorked);
    }

    // Calculate vacation time left
    public int vacationTimeLeft() {
        return (daysWorked / 360) * (30 - vacationDaysTaken);
    }

    // Calculate bonus
    public double calculateBonus() {
        return 2.2 * salary;
    }
}

