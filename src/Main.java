import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome To Employee Wage Computation ");

        int IS_PRESENT=1;
        int attendence=(int) (Math.random()*2);

        if(attendence== IS_PRESENT)
        {
            int WAGE_PER_HOUR=20;
            int FULL_DAY_HOURS=8;
            int daily_wage= WAGE_PER_HOUR * FULL_DAY_HOURS;

            System.out.println("Daily Employee Wage "+ daily_wage);

        System.out.println("Employee is Present ");
        }
        else
        {
            System.out.println("Employee is Absent");
            System.out.println("Daily Employee Wage :0");
        }
    }
}