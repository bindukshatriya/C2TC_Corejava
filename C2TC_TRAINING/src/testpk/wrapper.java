package testpk;

public class wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    float f=50.0f;
    double d=60.0d;
    char c='a';
    boolean b2=true;
    Float floatobj=f;
    double doubleobj=d;
    char charobj=c;
    boolean boolobj=b2;
    System.out.println("float object:"+floatobj);
    System.out.println("double object:"+doubleobj);
    System.out.println("character object:"+charobj);
    System.out.println("boolean object:"+boolobj);
    
    float floatvalue=floatobj;
    double doublevalue=doubleobj;
    char charvalue=charobj;
    boolean boolvalue=boolobj;
    System.out.println("printing primitive value");
    System.out.println("float value:"+floatvalue);
    System.out.println("double value:"+doublevalue);
    System.out.println("boolean value:"+boolvalue);
	}

}
