import java.util.*;
public class EmplWageBuilderUc13{
public static final int IS_PART_TIME = 1;
public static final int IS_FULL_TIME = 2;
public static final int EMP_RATE_PER_HOUR = 20;
public static final int NUM_OF_WORKING_DAYS = 2;
public static final int MAX_HRS_IN_MONTH = 10;
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of companies");
int n = sc.nextInt();

ArrayList<String>arrli=new ArrayList<>();
ArrayList<Integer>Daily=new ArrayList<>();
ArrayList<Integer>total=new ArrayList<>();
sc.nextLine();
for(int i=0;i<n;i++)
{
System.out.println("Enter the company name");
String company=sc.nextLine();
arrli.add(company);
int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
System.out.println("The employee wage computation for "+company+" company");
while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
totalWorkingDays++;
int empCheck = (int) Math.floor(Math.random() * 10) % 3;
switch (empCheck) {
case IS_PART_TIME:
empHrs = 4;
break;
case IS_FULL_TIME:
empHrs = 8;
break;
default:
empHrs = 0;
}
totalEmpHrs += empHrs;
System.out.println("Day#: " + totalWorkingDays + " Emp Hr: "+empHrs);
}
int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
int dailyWage=totalEmpWage/30;
Daily.add(dailyWage);
total.add(totalEmpWage);
System.out.println("Total Emp Wage: " + totalEmpWage);

}
System.out.println("Array of companies "+arrli.toString());
System.out.println("Array of daily wage "+Daily.toString());
System.out.println("Array of total wage "+total.toString());
}
}
