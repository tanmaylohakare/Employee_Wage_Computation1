import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome To Employee Wage Computation ");

        final int IS_FULL_TIME=1;
        final int IS_PART_TIME=2;
        final int WAGE_PER_HOUR=20;
        final int FULL_DAY_HOURS=8;
        final int PART_TIME_HOURS=4;

        int empType=(int) (Math.random()*3);
        int workinhHours=0;

        switch (empType)
        {
            case IS_FULL_TIME :
                System.out.println("Employee is Working Full Time");
                workinhHours=FULL_DAY_HOURS;
                break;
            case IS_PART_TIME:
                System.out.println("Employee is Working Part time");
                workinhHours=PART_TIME_HOURS;

            default:
                System.out.println("Employee is Absent ");
                workinhHours = 0;

        }
        int dailywage = WAGE_PER_HOUR * workinhHours;
        System.out.println("Daily Employee wage "+ dailywage);
        }
    }