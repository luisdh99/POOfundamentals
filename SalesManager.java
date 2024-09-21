
public class SalesManager extends employee {
	    double teamSales;

	    public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken, double salary, int yearsWorked, double teamSales) {
	        super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
	        this.teamSales = teamSales;
	    }

	    // Calculate commission for the manager based on the team's sales
	    public double calculateCommission() {
	        return 0.03 * teamSales;
	    }
	}


