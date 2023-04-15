package com.bldea.crorepathApp.package1;

import java.util.Scanner;

public class CrorepathiApp {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("Welcome to Crorepathi Game");
		System.out.println("lets welcome our first candidate");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("what is your Name:");
		String name=sc.next();

		System.out.println("what is your Age:");
		int age=sc.nextInt();
		System.out.println("which is your City:");
		String city=sc.next();
		System.out.println("what is your state:");
		String state=sc.next();
		Candidate c1=new Candidate(name ,age ,city,state);
		
		System.out.println("congratulate for making it till here Mr/Ms."+c1.getName());
        System.out.println("The rules of the game:");
        System.out.println("1. There will be 10 question which rewards a specific amount in" +"incremental order");
        System.out.println("2. The game will contain 3 life lines:"+"(audiancepjone,50-50 and skip the question)");
	     System.out.println("please type 1 if you wish to see the reward per question."+"else type any key.");
	     int type_1=sc.nextInt();
	     if(type_1==1) {
	    	 System.out.println( "question-1:1000\n"+
	                             "question-2:5000\n"+
	                             "question-3:10000\n"+
	                             "question-4:20000\n"+
	                             "question-5:50000\n"+
	                             "question-6:5,00,000\n"+
	                             "question-7:10,00,000\n"+
	                             "question-8:20,00,000\n"+
	                             "question-9:50,00,000\n"+
	                             "question-10:1,00,00,000\n");
	    	 System.out.println("Do you wish to continue??(type:YES/NO)");
	     }
	     else {
	    	 System.out.println("Do you wish to continue??(type:YES/NO)");
	     }
	    	 String type_2=sc.next();
	     if(type_2.equalsIgnoreCase("yes")==true) {
	    	 System.out.println("Lets begin the game");
	    	 System.out.println("Here is the first question.");
	    	boolean res1=Questions.fetchQuestion1(c1.getName());
	    	if(res1==true) {
	    		System.out.println("congratulations!! your answer is correct.\n" +"you hve won Rs."+c1.getAmount());
	    		System.out.println();
	    		System.out.println("Here is your next question ");
	    		
	    		boolean res2=Questions.fetchQuestion2(c1.getName());
	    		if(res2==true) {
	    			System.out.println("congratulations!! your answer is correct.\n" +"you hve won Rs."+c1.getAmount());
	    			System.out.println();
	    			System.out.println("here is your next question.");
	    			boolean res3=Questions.fetchQuestion3(c1.getName());
	    			if(res3==true) {
		    			System.out.println("congratulations!! your answer is correct.\n" +"you hve won Rs."+c1.getAmount());
		    			System.out.println();
		    			System.out.println("here is your next question.");
		    			boolean res4=Questions.fetchQuestion4(c1.getName());
			    		if(res4==true) {
			    			System.out.println("congratulations!! your answer is correct.\n" +"you hve won Rs."+c1.getAmount());
			    			System.out.println();
			    			System.out.println("here is your next question.");
			    			boolean res5=Questions.fetchQuestion5(c1.getName());
				    		if(res5==true) {
				    			System.out.println("congratulations!! your answer is correct.\n" +"you hve won Rs."+c1.getAmount());
				    			System.out.println();
				    			System.out.println("here is your next question.");
				    			boolean res6=Questions.fetchQuestion6(c1.getName());
					    		if(res6==true) {
					    			System.out.println("congratulations!! your answer is correct.\n" +"you hve won Rs."+c1.getAmount());
					    			System.out.println();
					    			System.out.println("here is your next question.");
					    			boolean res7=Questions.fetchQuestion7(c1.getName());
						    		if(res7==true) {
						    			System.out.println("congratulations!! your answer is correct.\n" +"you hve won Rs."+c1.getAmount());
						    			System.out.println();
						    			System.out.println("here is your next question.");
						    			boolean res8=Questions.fetchQuestion8(c1.getName());
							    		if(res8==true) {
							    			System.out.println("congratulations!! your answer is correct.\n" +"you hve won Rs."+c1.getAmount());
							    			System.out.println();
							    			System.out.println("here is your next question.");
							    			boolean res9=Questions.fetchQuestion9(c1.getName());
								    		if(res9==true) {
								    			System.out.println("congratulations!! your answer is correct.\n" +"you hve won Rs."+c1.getAmount());
								    			System.out.println();
								    			System.out.println("here is your next question.");
								    			boolean res10=Questions.fetchQuestion10(c1.getName());
									    		if(res10==true) {
									    			System.out.println("congratulations!! your answer is correct.\n" +"you hve won Rs."+c1.getAmount());
									    			System.out.println();
									    			
		    			
	    			                     }
									    		else {
								    				System.out.println("we are sorry!! your answer is incorrect.\n"+"you hve won rs."+c1.getAmount());
								    			}
								    		}
								    		else {
							    				System.out.println("we are sorry!! your answer is incorrect.\n"+"you hve won rs."+c1.getAmount());
							    			}
							    		}
							    		else {
						    				System.out.println("we are sorry!! your answer is incorrect.\n"+"you hve won rs."+c1.getAmount());
						    			}
						    		}
						    		else {
					    				System.out.println("we are sorry!! your answer is incorrect.\n"+"you hve won rs."+c1.getAmount());
					    			}
					    		}
					    		else {
				    				System.out.println("we are sorry!! your answer is incorrect.\n"+"you hve won rs."+c1.getAmount());
				    			}
				    		}
					    		
				    		else {
			    				System.out.println("we are sorry!! your answer is incorrect.\n"+"you hve won rs."+c1.getAmount());
			    			}
			    		}
			    		else {
		    				System.out.println("we are sorry!! your answer is incorrect.\n"+"you hve won rs."+c1.getAmount());
		    			}
		    		}
	    			else {
	    				System.out.println("we are sorry!! your answer is incorrect.\n"+"you hve won rs."+c1.getAmount());
	    			}
	    		}
	    		else {
	    			System.out.println("we are sorry!! your answer is incorrect.\n"+"you hve won rs."+c1.getAmount());
	    		}
		    		
		    
	    	}
	    	
	    	else {
	    		System.out.println("we are sorry!! your answer is incorrect.\n"+"you hve won rs."+c1.getAmount());
	    	}
	     }
	     
	     else {
	    	 System.out.println("Thank you for coming.All the best!!");
	     }
	     }
	}


