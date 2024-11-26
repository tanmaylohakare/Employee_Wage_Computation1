public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome To Employee Wage Computation");

        // Constants
        final int IS_FULL_TIME = 1;
        final int IS_PART_TIME = 2;
        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY_HOURS = 8;
        final int PART_TIME_HOURS = 4;
        final int WORKING_DAYS_IN_MONTH = 20;

        // Variables
        int totalWage = 0;

        // Loop through each working day
        for (int day = 1; day <= WORKING_DAYS_IN_MONTH; day++) {
            int empType = (int) (Math.random() * 3); // Randomly generate 0, 1, or 2
            int workingHours = 0;

            // Determine employee type using switch-case
            switch (empType) {
                case IS_FULL_TIME:
                    System.out.println("Employee is Working Full Time");
                    workingHours = FULL_DAY_HOURS;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee is Working Part Time");
                    workingHours = PART_TIME_HOURS;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    workingHours = 0;
            }

            // Calculate daily wage and update total wage
            int dailyWage = WAGE_PER_HOUR * workingHours;
            totalWage += dailyWage;
            System.out.println("Day " + day + ": Daily Wage = " + dailyWage);
        }

        // Print total wage for the month
        System.out.println("Total Wage for the Month = " + totalWage);
    }
}
