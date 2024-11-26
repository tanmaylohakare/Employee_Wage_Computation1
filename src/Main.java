public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome To Employee Wage Computation");

        final int IS_FULL_TIME = 1;
        final int IS_PART_TIME = 2;
        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY_HOURS = 8;
        final int MAX_WORKING_DAYS = 20;
        final int MAX_WORKING_HOURS = 100;

        // Variables
        int totalWage = 0;
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;

        // Loop through each working day


        while (totalWorkingDays < MAX_WORKING_DAYS && totalWorkingHours < MAX_WORKING_HOURS) {
            totalWorkingDays++;
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
                    workingHours = IS_PART_TIME;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    workingHours = 0;
            }


            if(totalWorkingHours + workingHours >   MAX_WORKING_HOURS)
            {
                workingHours =MAX_WORKING_HOURS - totalWorkingHours;
            }

            int dailyWage = WAGE_PER_HOUR * workingHours;
            totalWage += dailyWage;
            System.out.println("Day " + totalWorkingDays + ": Daily Wage = " + dailyWage);

        // Print daily details
            System.out.println("Day" + totalWorkingHours + ": Daily Wage =" + dailyWage+ "Total Working Hours = "+ totalWorkingHours);
        }

        // Print total wage and Summary
        System.out.println("Total Wage for the Month = " + totalWage);
        System.out.println("Total Working Days = " + totalWorkingDays
                + ", Total Working Hours = " + totalWorkingHours);
    }
    }

