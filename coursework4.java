import java.util.*;
class coursework4{
	public static void main(String args[]){
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("|               SALARY INFORMATION SYSTEM                 |");
		System.out.println("-----------------------------------------------------------\n");
		System.out.println("  [1] Calculate Income Tax ");
		System.out.println("  [2] Calculate Annual Bonus");
		System.out.println("  [3] Calculate Loan amount");
		
		System.out.println("\n");
		System.out.print("Enter an option to continue : ");
		int option=input.nextInt();
		
		switch(option){
			case 1:
				System.out.println("-----------------------------------------------------------");
				System.out.println("|               [1] Calculate Income Tax                  |");
				System.out.println("-----------------------------------------------------------\n");
				
				input.nextLine();
				System.out.print("Input Employee name   - ");
				String name =input.nextLine();
				System.out.print("Input Employee salary -");
				double salary =input.nextDouble();
				
				int wht;
				
				if(salary<100000){
					wht=0;
				
				}else if(salary<141667){
					wht=(int)((salary-100000)*0.06);
					
				}else if(salary<183333){
					wht=(int)((salary-141667)*0.12+2500);
					
				}else if(salary<225000){
					wht=(int)((salary-183333)*0.18+7500);
					
				}else if(salary<266667){
					wht=(int)((salary-225000)*0.24+15000);
					
				}else if(salary<308333){
					wht=(int)((salary-266667)*0.3+25000);
					
				}else{
					wht=(int)((salary-308333)*0.36+37500);
					
				System.out.println("You have to pay Income Tax per month:"+wht);
			}
				break;
				
			case 2:
				System.out.println("-----------------------------------------------------------");
				System.out.println("|               [2] Calculate Annual Bonus                |");
				System.out.println("-----------------------------------------------------------\n");
				
				input.nextLine();
				System.out.print("Input Employee Name -");
				name=input.nextLine();
				System.out.print("Input Employee Salary -");
				salary=input.nextDouble();
			
			if(salary<100000){
					System.out.println("Annual Bonus - " +5000);
					
			}else if(salary<199999){
					System.out.println("Annual Bonus - " +salary*0.1);
					
			}else if(salary<299999){
					System.out.println("Annual Bonus - " +salary*0.15);
					
			}else if(salary<399999){
					System.out.println("Annual Bonus - " +salary*0.2);
					
			}else{
					System.out.println("Annual Bonus - " +salary*0.35);
					
			}
			
			break;
					
			case 3:
				System.out.println("-----------------------------------------------------------");
				System.out.println("|               [3] Calculate Loan amount                 |");
				System.out.println("-----------------------------------------------------------\n");
				
				input.nextLine();
				System.out.print("Input Employee name - ");
				name=input.nextLine();
				System.out.print("Input Employee salary -");
				salary=input.nextDouble();
				System.out.print("Enter number of year - ");
				int year=input.nextInt();
				
				double monthly_installment;
				int number=year*12; //number of month
				double rate=0.15; // annual rate
				int loanamount;
				double x=(double)rate/12;
				double y=1+x;
				double z=Math.pow(y,number); 
								
				if (salary>50000 & year<5){
					monthly_installment=salary*0.6;
										
					loanamount=(int)(monthly_installment*(1-(1/z))/x);
					long roundvalue=Math.round(loanamount/1000)*1000;
					System.out.println("You can get a Loan Amount ="+roundvalue);
										
										
				}else if(salary<50000){
					System.out.print("You can not get a loan because your salary is less than 50000 ...");
									  
				}else{
					System.out.println("You can not get a loan because you exceeds the maximum limit of years");
				
				}
								
				break;
								
				default:
					System.out.println("Incorrect option");
	
				}
														
		}
			
}

				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	
