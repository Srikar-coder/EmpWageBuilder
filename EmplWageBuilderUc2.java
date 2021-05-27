public class EmplWageBuilderUc2{

   public static void main(String args[]){
    int isFullTime=1;     
    int wagePerHour=20;
    int hourPerDay=8;
    int employeeWage=0;
    double empCheck=Math.floor(Math.random()*10)%2;
     if(empCheck==isFullTime){
      employeeWage=wagePerHour*hourPerDay;
     System.out.println(employeeWage);
      }
       else 
       System.out.println(employeeWage);
     
     }

}