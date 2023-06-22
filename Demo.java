import java.util.*;

class Student{
	String StudentID;
	String Name;
	int PRFMarks;
	int DBMSMarks;
    }
    

class Demo{
	static Scanner scan = new Scanner(System.in);
//Student Array
	static Student[] Student1 = new Student[0];
	
	public static void main(String args[]){
		while(true){
		System.out.println("------------------------------------------------------------------------------------\n|                      WELCOME TO GDSE MARKS MANAGEMENT SYSTEM                     |\n------------------------------------------------------------------------------------\n");
			
		System.out.println("[1] Add New Student                        [2] Add New Student With Marks\n[3] Add Marks                              [4] Update Student Details\n[5] Update Marks                           [6] Delete Student\n[7] Print Student Details                  [8] Print Student Ranks\n[9] Best in Programming Fundamentals       [10] Best in Database Management System\n");
			
		System.out.print("\nEnter your option to continue > ");
		int op= scan.nextInt();
		
		clearConsole();                                          //to clear console
		
		switch(op){
			case 1: 
				addNewStudent();
				break;
			case 2: 
				addNewStudentWithMarks();
				break;
			case 3: 
				addMarks();
				break;
			case 4: 
				updateStudentDetails();
				break;
			case 5: 
				updateStudentMarks();
				break;
			case 6: 
				deleteStudent();
				break;
			case 7:
				printStudentDetails();
				break;
			case 8:
				printStudentRanks();
				break;
			case 9:
				bestInPRF();
				break;
			case 10:
				bestInDMBS();
				break;   
				
				} 
			}  
		}
public static void addNewStudent(){                  // to add marks (1)
		
		char Option = 'y';
		while(Option=='y'){
			System.out.println("------------------------------------------------------------------------------------\n|                                ADD NEW STUDENT                                   |\n------------------------------------------------------------------------------------\n");
			
			arraysIncrement();
			
			while(true){
				System.out.print("\nEnter Student ID : ");
				Student1[Student1.length-1].StudentID = scan.next();
				
				int count =0;
				for(int i=0; i<Student1.length-1; i++){
					if(Student1[Student1.length-1].StudentID .equals (Student1[i].StudentID)){
						count++;
					}
				}
				
				if(count==0){
					break;
				}
				else{
					System.out.println("The Student ID already exist");
				}
			}
		
		System.out.print("Enter Student Name: ");
		Student1[Student1.length-1].Name = scan.next();
		System.out.println();
			
		System.out.print("Student has been added successfully.");	
			  
		while(true){
				System.out.print("Do you want to add a new student(y/n): ");
				Option = scan.next().charAt(0);
				
				if(Option=='y' || Option=='n'){
					break;
				}
				else{
					System.out.print("Invalid Option.Try Again");
				}
			}
			
			clearConsole();
		}
	}

public static void addNewStudentWithMarks(){         //to add new student with marks (2)
		
		char Option = 'y';
		while (Option == 'y'){
			System.out.println("------------------------------------------------------------------------------------\n|                              ADD NEW STUDENT WITH MARKS                          |\n------------------------------------------------------------------------------------\n");
			
			arraysIncrement();
		    
		    while(true){
			System.out.print("\nEnter Student ID :");
			Student1[Student1.length-1].StudentID = scan.next();
			
			int count = 0;
			for(int i=0; i<Student1.length-1; i++){
				if(Student1[Student1.length-1].StudentID .equals (Student1[i].StudentID)){
					count++;
				}
			}
			
			if(count==0){
				break;
				}
				else{
				  System.out.println("The Student ID Already Exist!");
				}
				
			}
				
		System.out.print("Enter Student name: ");
		Student1[Student1.length-1].Name=scan.next();
		System.out.println();
		
		while(true){
				System.out.print("Programming Fundamentals Marks : ");
				Student1[Student1.length-1].PRFMarks =scan.nextInt();
				
				if(Student1[Student1.length-1].PRFMarks <0 || Student1[Student1.length-1].PRFMarks >100 ){
					System.out.println("Invalid marks, Please enter correct marks.\n");
				}else{
					break;
					}
				}
				
		while(true){
				System.out.print("Database Management System Marks : ");
				Student1[Student1.length-1].DBMSMarks =scan.nextInt();
				
				if(Student1[Student1.length-1].DBMSMarks <0 ||Student1[Student1.length-1].DBMSMarks >100 ){
					System.out.println("Invalid marks, Please enter correct marks.\n");
				}
				else{
					break;
					}
				}
				
	    System.out.print("Student has been added successfully.");
	   
	    while(true){
				System.out.print("Do you want to add new student(y/n): ");
				Option = scan.next().charAt(0);
				
				if(Option=='y' || Option=='n'){
					break;
				}
				else{
					System.out.print("Invalid Option.Try Again");
				}
			}
			
		 clearConsole();
		 
		}	 
}		

public static void  addMarks(){                    //to add marks for added stuents(3)
		 
		 System.out.println("------------------------------------------------------------------------------------\n|                                     ADD MARKS                                    |\n------------------------------------------------------------------------------------\n");
			
		 char Option = 'y';
		 while(Option =='y'){
			 
			 int IDNumber = -1; 
			 char OptionNew = 'y';
			 
			 while(true){
				 System.out.print("\nEnter Student ID : ");
				 String ID = scan.next();
				 
				 for(int i=0; i<Student1.length; i++){
					 if(ID .equals (Student1[i].StudentID)){
						 IDNumber = i;
					 }
				 }
				
				if(IDNumber== -1){
					System.out.print("Invalid Student ID."+ "  ");
					
					while(true){
						System.out.print("Do you want to search again ?(y/n) ");
						OptionNew = scan.next().charAt(0);
						
						if(OptionNew == 'y'||OptionNew =='n'){
							break;
						}
						else{
							System.out.print("Invalid Option");
						}
					}
					
				}
				else{
					System.out.println("Student ID: "+ Student1[IDNumber].Name);
					break;
				}
				if(OptionNew =='n'){
					break;
				}
			}
			if(OptionNew =='n'){
				break;
			}
			else if(Student1[IDNumber].PRFMarks !=0 && Student1[IDNumber].DBMSMarks !=0){
				System.out.println("This student's marks  have been already added. ");
				
				while(true){
					System.out.print("Do you want to add marks for another student? (y/n)");
					Option = scan.next().charAt(0);
					
						if(Option =='y' || Option =='n'){
							break;
						}
						else{
							System.out.print("Invalid Option");
						}
				}
			}
			else{
				while(true){
					System.out.print("\nProgramming Fundementals Marks : ");
					Student1[IDNumber].PRFMarks =scan.nextInt();
					
					if(Student1[IDNumber].PRFMarks <0 || Student1[IDNumber].PRFMarks>100){
						System.out.println("Invalid marks, please enter correct marks. ");
					}
					else{
						break;
					}
				}
				while(true){
					System.out.print("Database Management Marks : ");
					Student1[IDNumber].DBMSMarks = scan.nextInt();
					
					if(Student1[IDNumber].DBMSMarks<0 || Student1 [IDNumber].DBMSMarks>100){
						System.out.println("Invalid marks, please enter correct marks.");
					}
					else{
						break;
					}
				}			
			    System.out.print("Marks have been added. ");
			    
			    while(true){
					System.out.print("Do you want to add marks for another student? (y/n)");
					Option = scan.next().charAt(0);
					
					if(Option == 'y' || Option =='n'){
						break;
					}
					else{
						System.out.print("Invalid Option.");
					}
				}
			}
		}
		
		clearConsole();
}

public static void updateStudentDetails(){           //to update student details(4)
		System.out.println("------------------------------------------------------------------------------------\n|                               UPDATE STUDENT DETAILS                             |\n------------------------------------------------------------------------------------\n");
			
		char Option = 'y';
		while(Option == 'y'){
			
			int IDNumber = -1;
			char OptionNew = 'y';
			
			while(OptionNew == 'y'){
				System.out.print("\nEnter Student ID : ");
				String ID = scan.next();
				
				for(int i =0; i<Student1.length; i++){
					if(ID .equals (Student1[i].StudentID)){
						IDNumber = i;
					}
				}
				
				if(IDNumber == -1){
					System.out.print("Invalid Number.");
					
					while(true){
						System.out.print("Do you want to search again ?(y/n)");
						OptionNew = scan.next().charAt(0);
						
						if(OptionNew == 'y' || OptionNew == 'n'){
							break;
						}
						else{
							System.out.print("Invalid Option.");
						}
					}
				}
				else{
					System.out.println("Student Name : "+ Student1[IDNumber].Name);
					break;
				}
			}
			
			if(OptionNew =='n'){
				break;
			}
			
			System.out.print("\nEnter the new student name : ");
			Student1[IDNumber].Name =scan.next();
			
			System.out.println("Student details has been updated successfully. ");
			
			while(true){
				System.out.print("Do you want to update another student details ? (y/n)");
				Option = scan.next().charAt(0);
				
				if(Option =='y' || Option =='n'){
					break;
				}
				else{
					System.out.print("Invalid Option. ");
				}
			}
		}
		
		clearConsole();
					
	}
	
public static void updateStudentMarks(){             //to update student marks(5)
		System.out.println("------------------------------------------------------------------------------------\n|                                     UPDATE MARKS                                 |\n------------------------------------------------------------------------------------\n");
			
		char Option ='y';
		while(Option == 'y'){
			
			int IDNumber = -1;
			char OptionNew = 'y';
			
			while(OptionNew == 'y'){
				System.out.print("\nEnter Student ID : ");
				String ID = scan.next();
				
				for(int i=0; i<Student1.length; i++){
					if(ID .equals (Student1[i].StudentID)){
						IDNumber = i;
					}
				}
				
				if(IDNumber == -1){
					System.out.print("Invalid Student ID.");
					
					while(true){
						System.out.print("Do you want to search again?(y/n)");
						OptionNew = scan.next().charAt(0);
						
						if(OptionNew == 'y' || OptionNew == 'n'){
							break;
						}
						else{
							System.out.print("Invalid Option.");
						}
					}
					
				}
				else if(Student1[IDNumber].PRFMarks ==0 && Student1[IDNumber].DBMSMarks ==0){
					System.out.print("This student's marks  yet to be added.");
					
					while(true){
						System.out.print("Do you want to search again ? (y/n)");
						OptionNew = scan.next().charAt(0);
						
						if(OptionNew == 'y' || OptionNew == 'n'){
							break;
						}
						else{
							System.out.print("Invalid Option. ");
						}
					}
					
				}
				else{
					System.out.println("Student Name : "+ Student1[IDNumber].Name);
					
					System.out.println("Programming Fundementals Marks : "+ Student1[IDNumber].PRFMarks);
					System.out.println("Database Management System Marks : "+ Student1[IDNumber].DBMSMarks);
					
					break;
				}
			}
			
			if(OptionNew == 'n'){
				break;
			}
			
			while(true){
				System.out.print("\nEnter new Programming Fundamentals Marks : ");
				Student1[IDNumber].PRFMarks = scan.nextInt();
				
				if(Student1[IDNumber].PRFMarks <0 || Student1[IDNumber].PRFMarks >100){
					System.out.println("Invalid marks, please enter correct marks. \n");
				}
				else{
					break;
				}
			}
			
			while(true){
				System.out.print("Enter new Database Management System Marks : ");
				Student1[IDNumber].DBMSMarks = scan.nextInt();
				
				if(Student1[IDNumber].DBMSMarks <0 || Student1[IDNumber].DBMSMarks >100){
					System.out.println("Invalid marks,please enter correct marks. \n");
				}
				else{
					break;
				}
			}
			
			System.out.println("Marks have been updated successfully. ");
			
			while(true){
				System.out.print("Do you want to update marks for another student ? (y/n)");
				Option = scan.next().charAt(0);
				
				if(Option == 'y' || Option == 'n'){
					break;
				}
				else{
					System.out.print("Invalid Option.");
				}
			}
		}
		
		clearConsole();		 
						
     }
     
 public static void deleteStudent(){              //to delete student(6)
		 System.out.println("------------------------------------------------------------------------------------\n|                                       DELETE STUDENT                             |\n------------------------------------------------------------------------------------\n");
			
		 char Option = 'y';
		 while(Option == 'y'){
			 
			 int IDNumber = -1;
			 
			 System.out.print("\nEnter Student ID : ");
			 String ID = scan.next();
			 
			 for(int i=0; i<Student1.length; i++){
				 if(ID .equals (Student1[i].StudentID)){
					 IDNumber = i;
				 }
			 }
			 
			 if(IDNumber ==-1){
				 System.out.print("Invalid Student ID.");
				 
				 while(true){
					 System.out.print("Do you want to search again ? (y/n)");
					 Option = scan.next().charAt(0);
					 
					 if(Option =='y' || Option == 'n'){
						 break;
					 }
					 else{
						 System.out.print("Invalid Option.");
					 }
				 }
			 }
			 else{
				 Student1[IDNumber].StudentID = "null";
				 Student1[IDNumber].Name = "null";
				 Student1[IDNumber].PRFMarks = 0;
				 Student1[IDNumber].DBMSMarks = 0;
				 
				 System.out.println("Student has been deleted successfully.");
				 
				 while(true){
					 System.out.print("Do you want to delete another student ? (y/n)");
					 Option = scan.next().charAt(0);
					 
					 if(Option == 'y'||Option =='n'){
						 break;
					 }
					 else{
						 System.out.print("Invalid Option.");
					 }
				 }
			 }
		 }
					 	
		 clearConsole();			 		 
	 }

public static void printStudentDetails(){           //to print student details(7)
		
		char Option = 'y';
		while(Option == 'y'){
			System.out.println("------------------------------------------------------------------------------------\n|                                 PRINT STUDENT DETAILS                            |\n------------------------------------------------------------------------------------\n");
			
			int IDNumber = -1; 
			
			System.out.print("\nEnter Student ID : ");
			String ID = scan.next();
			
			for(int i=0; i<Student1.length; i++){
				if(ID .equals (Student1[i].StudentID)){
					IDNumber = i;
				}
			}
			
			if(IDNumber == -1){
				System.out.print("Invalid Student ID.");
				
				while(true){
					System.out.print("Do you want to search again ? (y\n)");
					Option = scan.next().charAt(0);
					
					if(Option == 'y' || Option == 'n'){
						break;
					}
					else{
						System.out.print("Invalid Option.");
					}
				}
			}
			else{
				System.out.println("Student Name : "+ Student1[IDNumber].Name);
				
				if(Student1[IDNumber].PRFMarks ==0 && Student1[IDNumber].DBMSMarks ==0){
					System.out.println("\nMarks yet to be added.");
				}
				else{
					System.out.println("+------------------------------+----------------+");
					System.out.println("|Programming Fundamnetal Marks |              "+ Student1[IDNumber].PRFMarks +"|");
					System.out.println("|Database Management System    |              "+ Student1[IDNumber].DBMSMarks +"|");
					
					int[] Total= total();
					System.out.println("|Total Marks                   |             "+Total[IDNumber]+"|");
					
					double[] Average=average();
					System.out.println("|Avg. Marks                    |            "+Average[IDNumber]+"|");
					
					String Rank=rankPosition(IDNumber);
					System.out.println("|Rank                          |"+(rankPosition(IDNumber))+"|");
					
					System.out.println("+------------------------------+----------------+");
					}
				while(true){
					System.out.print("Do you want to search another student details ? (y/n)");
					Option = scan.next().charAt(0);
					
					if(Option == 'y' || Option == 'n'){
						break;
					}
					else{
						System.out.print("Invalid Option.");
					}
				}
			}
			
			clearConsole();	
		}			
	}

public static void printStudentRanks(){                 //to print student ranks(8)
		System.out.println("------------------------------------------------------------------------------------\n|                               PRINT STUDENT'S RANKS                              |\n------------------------------------------------------------------------------------\n");
		System.out.println();
		 
		System.out.println("+--------+-----+------------------+--------------+-------------+");
		System.out.println("|Rank    |ID   |Name              |Total Marks   |Avg. Marks   |");
		System.out.println("+--------+-----+------------------+--------------+-------------+");
		 
		double[] Descending =avgDescending();
		int[] Total =totalDescending();
		Student[] tempStudentIDName = studentIDNameDescending();
		 
		for(int i=0; i<Descending.length;i++){
			if(Descending[i]!=0){
			
			System.out.println("|"+(i+1)+"       |"+tempStudentIDName[i].StudentID+" |"+tempStudentIDName[i].Name +"             |           "+Total[i]+"|         "+Descending[i]+"|");
			}
		}
		
		System.out.println("+--------+-----+------------------+--------------+---------------+");
		
		char Option = 'y';
		
		while(true){
			System.out.print("Do you want to go back to main menu?(y/n):");
			Option =scan.next().charAt (0);
			
			if(Option =='y'){
				break;
			}else if(Option =='n'){
				System.out.println();
			}else{
				System.out.print("Invalid Option.");
				}
			}
			
			if(Option =='y'){
			clearConsole();
			}
		
		}

public static void bestInPRF(){	                // to get descending order of PRF marks(9)
		
		System.out.println("------------------------------------------------------------------------------------\n|                        BEST IN PROGRAMMING FUNDAMENTALS                          |\n------------------------------------------------------------------------------------\n");
		System.out.println();
		
		System.out.println("+-----+------------------+--------------+-------------+");
		System.out.println("|ID   |Name              |PRF Marks     |DBMS Marks   |");
		System.out.println("+-----+------------------+--------------+-------------+");
		
		Student [] Descending = PRFDescending();
		
		for(int i=0; i<Descending.length;i++){
			if(Descending[i].PRFMarks!=0 && Descending[i].DBMSMarks!=0){
				
				System.out.println("|"+ Descending[i].StudentID+" |"+ Descending[i].Name+"             |"+Descending[i].PRFMarks+"            |"+Descending[i].DBMSMarks+"           |");
				}
			}
		
		System.out.println("+-----+------------------+--------------+-------------+");
		
		char Option='y';
		while(true){
			System.out.print("Do you want to go back to main menu?(y/n):");
			Option=scan.next().charAt (0);
					
			if(Option =='y'){
				break;
			}else if(Option =='n'){
				System.out.println();
			}else{
				System.out.print("Invalid option.");
				}
			}
		
		if(Option =='y'){
			clearConsole();
			}
		}

public static void bestInDMBS(){                             // to get descending order of DBMS marks (10)
		
		System.out.println("------------------------------------------------------------------------------------\n|                         BEST IN DATABASE MANAGEMENT SYSTEM                       |\n------------------------------------------------------------------------------------\n");
		System.out.println();
		
		System.out.println("+-----+------------------+--------------+-------------+");
		System.out.println("|ID   |Name              |DBMS Marks    |PRF Marks    |");
		System.out.println("+-----+------------------+--------------+-------------+");
		
		Student[] Descending= DBMSDescending();
		
		for(int i=0; i<Descending.length;i++){
			if(Descending[i].PRFMarks!=0 && Descending[i].DBMSMarks!=0){
				
				System.out.println("|"+Descending[i].StudentID+" |"+Descending[i].Name+"             |"+Descending[i].DBMSMarks+"            |"+Descending[i].PRFMarks+"           |");
				}
			}
		
		System.out.println("+-----+------------------+--------------+-------------+");
		
		char Option='y';
		while(true){
			System.out.print("Do you want to go back to main menu?(y/n):");
			Option=scan.next().charAt (0);
					
			if(Option =='y'){
				break;
			}else if(Option =='n'){
				System.out.println();
			}else{
				System.out.print("Invalid option.");
				}
			}
		
		if(Option =='y'){
			clearConsole();
			}
		}
			 

public static int[] total(){                            //to get total 
	
		int [] Total= new int [Student1.length];
					
			for(int i=0; i<Total.length; i++){
				Total [i] = Student1[i].PRFMarks + Student1[i].DBMSMarks;
			}
			return Total; 
	 }

public static int[] totalDescending(){                //to get descending order of total 
		 
		 int [] Total = total();
		 
		 for(int i=0;i<Total.length-1;i++){
			for(int j=0;j<Total.length-1;j++){
				if(Total[j]<Total[j+1]){
					int temp = Total[j];
					Total[j]=Total[j+1];
					Total[j+1]=temp;
					}
				}
			}
		return Total;
		}

public static double[] average(){                        //to get average
		 
		 int [] Total = total();
		 
		 double [] Average = new double[Student1.length];
					
			for(int i=0; i<Average.length; i++){
				Average[i] = (double)Total[i]/2;
			}
			return Average;
	 }	  

 public static double [] avgDescending(){           // to get descending order of average
	
		double[] Descending= average();
			
			for(int i=0;i<Descending.length-1;i++){
			for(int j=0;j<Descending.length-1;j++){
				if(Descending[j]<Descending[j+1]){
					double temp = Descending[j];
					Descending[j]=Descending[j+1];
					Descending[j+1]=temp;
					}
				}
			}
			
		return Descending;
		}

public static Student[] studentIDNameDescending(){          //to get descending order of student id 
		double[] Descending =avgDescending();
		double[] Average=average();
		Student[] tempStudentIDName =new Student[Student1.length];
		
		for (int i = 0; i < Average.length; i++){
			for(int j = 0; j < Descending .length; j++){
				if(Average[i]== Descending[j]){
					tempStudentIDName[i]= new Student();
					
					tempStudentIDName[i].StudentID =Student1[j].StudentID;
					tempStudentIDName[i].Name =Student1[j].Name;
					}
					
				}
			}
			return tempStudentIDName; 
	 }

public static String rankPosition(int index){                   //to get id's rank
		double[] Descending =avgDescending();
		double[] Average=average();
		
		int rankNumber=0;		                            
		for (int i = 0; i <Descending .length; i++){
			if(Average[index]==Descending [i]){
				rankNumber=i+1;
				}
			}
		
		String Rank="null";
		if(Descending[Descending.length-1]==Average[index]){
			Rank="         "+rankNumber+"(Last)";
		}else{
			switch (rankNumber){
				case 1:
					Rank="        "+rankNumber+"(First)";
					break;
				case 2:
					Rank="       "+rankNumber+"(Second)";
					break;
				case 3:
					Rank="        "+rankNumber+"(Third)";
					break;
				default :
					Rank="      "+rankNumber+"("+rankNumber+"th)";
				}
			
			}
		return Rank;
		
		}

public static Student[] PRFDescending(){	        //to get  student array descending order according to PRF marks
		Student[] PRFDescending= new Student[Student1.length];
		
		for(int i=0; i<PRFDescending.length;i++){
			PRFDescending[i]=new Student();
			
			PRFDescending[i].PRFMarks = Student1[i].PRFMarks;
			}
		
		for(int i=0;i<PRFDescending.length-1;i++){
			for(int j=0;j<PRFDescending.length-1;j++){
				if(PRFDescending[j].PRFMarks<PRFDescending[j+1].PRFMarks){
					int temp = PRFDescending[j].PRFMarks;
					PRFDescending[j].PRFMarks=PRFDescending[j+1].PRFMarks;
					PRFDescending[j+1].PRFMarks=temp;
					}
				}
			}
			
		for (int i = 0; i < PRFDescending.length; i++){
			for(int j = 0; j < PRFDescending.length; j++){
				if(PRFDescending[i].PRFMarks==Student1[j].PRFMarks){
					PRFDescending[i].DBMSMarks=Student1[j].DBMSMarks;
					PRFDescending[i].StudentID=Student1[j].StudentID;
					PRFDescending[i].Name=Student1[j].Name;
					
					}
					
				}
			}
			
		return PRFDescending;
		}	

public static Student[] DBMSDescending(){	            // to get marks descending order according to DBMS marks
		Student[] DBMSDescending = new Student[Student1.length];
		
		for(int i=0; i<DBMSDescending.length;i++){
			DBMSDescending[i]=new Student();
			
			DBMSDescending[i].DBMSMarks=Student1[i].DBMSMarks;
			}
		
		for(int i=0;i<DBMSDescending.length-1;i++){
			for(int j=0;j<DBMSDescending.length-1;j++){
				if(DBMSDescending[j].DBMSMarks<DBMSDescending[j+1].DBMSMarks){
					int temp = DBMSDescending[j].DBMSMarks;
					DBMSDescending[j].DBMSMarks=DBMSDescending[j+1].DBMSMarks;
					DBMSDescending[j+1].DBMSMarks=temp;
					}
				}
			}
			
		for (int i = 0; i < DBMSDescending.length; i++){
			for(int j = 0; j < DBMSDescending.length; j++){
				if(DBMSDescending[i].DBMSMarks== Student1[j].DBMSMarks){
					DBMSDescending[i].PRFMarks= Student1[j].PRFMarks;
					DBMSDescending[i].StudentID = Student1[j].StudentID;
					DBMSDescending[i].Name= Student1[j].Name;
					
					}
					
				}
			}
			
		return DBMSDescending;
		}
			      
	
public final static void clearConsole() {                    //to clear the screen
		try {
			final String os = System.getProperty("os.name"); 
			if (os.contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			}else {
				System.out.print("\033[H\033[2J"); 
				System.out.flush();
			}
		} catch (final Exception e) {
			 e.printStackTrace();
			 // Handle any exceptions.
		}
	 }

 public static void arraysIncrement(){                           //to increment the array 
		Student[] tempStudent = new Student[Student1.length+1];
		
		for(int i=0; i<Student1.length; i++){
			tempStudent[i] = new Student();
			
			tempStudent[i].StudentID = Student1[i].StudentID;
			tempStudent[i].Name = Student1[i].Name;
			tempStudent[i].PRFMarks = Student1[i].PRFMarks;
			tempStudent[i].DBMSMarks = Student1[i].DBMSMarks;	
			}
			
		tempStudent[tempStudent.length -1] =new Student();
		
		Student1 = tempStudent;
		}
	}

	
	

