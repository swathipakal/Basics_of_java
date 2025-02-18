package assignment;

 class students

{
	static void total()
	{
		System.out.println("There are total 1000 engineering students");
		
	}	
}

 class Single_level_lnheritance extends students

{
	static void admissions()
    {
  	  System.out.println("There are 50 medical admissions");
    }
	
	
	public static void main(String[] args) 
	{
		
    Single_level_lnheritance.admissions();
	Single_level_lnheritance.total();
     
	} 
}
