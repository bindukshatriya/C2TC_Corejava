package threadpg;

interface rbi
{
    float rateofintrest();	
}
interface worldbank
{
	float roi();
}

public class sbi implements rbi,worldbank {
	public float rateofintrest()
	{
		return 9.12f;
	}
	public float roi()
	{
		return 10.25f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       sbi ob1=new sbi();
       System.out.println("rbi"+ob1.rateofintrest());
       System.out.println("worldbank"+ob1.roi());
       }	
}
