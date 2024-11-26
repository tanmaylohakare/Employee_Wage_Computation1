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
            System.out.println("Employee is Present ");
        }
        else
        {
            System.out.println("Employee is Absent");
        }
    }
}