
package testpk;
abstract class atm
{
    abstract void withdraw();
    
}

public class dataAbstraction extends atm 
{
    
void withdraw()
{
    System.out.println("withdraw successfull");

}

public static void main(String args[])
{  
    dataAbstraction ob1 =new dataAbstraction();
    ob1.withdraw();
}
}
