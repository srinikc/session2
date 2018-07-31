class test133 { 
int Account_number; String Account_Name;
 test133 (int x) 
{    
Account_number = x; 
} 
}  


class base{  
base() 
{  System.out.println("In the base class.."); 
} 
void test() 
{  System.out.println("in the test function...");
 }
}

class derived extends base
{ 
derived() 
{     System.out.println("In the derived class..");
  super.test(); 
}
}

class base1
{  
base1() 
{  System.out.println("In the base class..");
  test(); 
} 


void test() 
{  System.out.println("in the test function...");
  base1 b1 = new base1();
 }

    
   
static
{  
System.out.println ("This is static block");
}
}
  
    



public class Module2Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test133 t1 = new test133(150);
		  t1.Account_number = 250;
		  t1.Account_Name = "Banking";
		  System.out.println("Id " + t1.Account_number);
		  System.out.println("Name " + t1.Account_Name); 
		  derived d1 = new derived();
		 // base1 b1 = new base1(); 
		  //derived d2 = (derived) new base();
	}

}
