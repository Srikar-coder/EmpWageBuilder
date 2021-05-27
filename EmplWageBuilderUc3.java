public class EmplWageBuilderUc3{

   public static void main(String args[]){
    int isPartTime=2;
    int isFullTime=1;     
    int wagePerHour=20;
    
    int employeeWage=0;
    double empCheck=Math.floor(Math.random()*10)%3;
     if(empCheck==isFullTime){
      int hourPerDay=8;
      employeeWage=wagePerHour*hourPerDay;
      }else if (empCheck==isPartTime){
       int hourPerDay=4;
       employeeWage=wagePerHour*hourPerDay;
       } 
       System.out.println(employeeWage);
     
     }

}