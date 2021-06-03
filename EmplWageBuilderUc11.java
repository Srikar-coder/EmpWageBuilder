import java.util.*;

interface Inter
{
public final int IS_PART_TIME = 1;
public final int IS_FULL_TIME = 2;
public final int EMP_RATE_PER_HOUR = 20;
public final int NUM_OF_WORKING_DAYS = 2;
public final int MAX_HRS_IN_MONTH = 10;

public void computeEmployeeWageOfCompany(String str);
}
class Emp implements Inter
{
public void computeEmployeeWageOfCompany(String company)
{

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
System.out.println("Total Emp Wage: " + totalEmpWage);
}
}
public class EmpWageBuilderUc11 {
public static void main(String[] args) {
Emp obj = new Emp();
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of companies");
int n = sc.nextInt();
String arr[]=new String[n];
sc.nextLine();
for(int i=0;i<n;i++)
{
System.out.println("Enter the company name");
arr[i]=sc.nextLine();
obj.computeEmployeeWageOfCompany(arr[i]);
}
System.out.println("Array of companies "+Arrays.toString(arr));
}
}
