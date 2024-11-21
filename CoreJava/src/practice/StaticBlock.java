package practice;

public class StaticBlock 
{
    static 
    {
        x = 10;
       //System.out.println(x); 
        System.out.println(StaticBlock.x);
    }
    
    static int x = 20;

    public static void main(String[] args)
    {
        System.out.println("Value of x: " + x);
    }
}
