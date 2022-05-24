
package testpk;
abstract class atm
{
    abstract void withdraw();
    
}

public class DataAbstraction extends atm 
{
    
void withdraw()
{
    System.out.println("withdraw successfull");

}

public static void main(String args[])
{  
    DataAbstraction ob1 =new DataAbstraction();
    ob1.withdraw();
}
}
