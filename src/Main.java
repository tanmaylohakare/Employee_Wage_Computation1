import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome To Employee Wage Computation ");
        final int FULL_TIME=1;
        int PART_TIME=2;
        final int WAGE_PER_HR=20;

        int workingHrs=0;

        int empType=(int) (Math.random() *100) %3;

    if(empType ==FULL_TIME)
    {
        System.out.println("Employee is Present ");
        workingHrs=8;
    } else if (empType == PART_TIME)
    {
        System.out.println("Employee is Absent Part Time");
        workingHrs=4;
    }
    else
    {
        System.out.println("Employee is Absent ");
    }
    int wage=workingHrs * WAGE_PER_HR;
        System.out.println("Employee Daily Wage is "+ wage);
    }
    }
