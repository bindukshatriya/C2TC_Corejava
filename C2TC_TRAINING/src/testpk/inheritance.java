package testpk;
class inheritance
{
    int amt_withdraw=20000;
    
}

public class atm extends inheritance
{
    
int amt_left=5000;
public static void main(String args[])
{  
atm ob1=new atm();
System.out.println(“amount”+ob1.amt_withdraw);
{
System.out.println(“amount”+ob1.amt_left);
}
}
