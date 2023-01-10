class Test{
    
    private int num1;
    private int num2;
    
    
    Test(){
        this("Galelio");
        System.out.println("empty construtor");
    }
    
    Test(String a, int n){
        this();
        a = "Disney";
        n = 26;
        
    }
    
    Test(int a, int b){
        this("Bufflet", 56);
        int sum = a + b;
        System.out.println(sum);
        
    }
    
    Test(String n){
        System.out.println(n);
    }
    
    
    public int getfunc(){
        return num1;
    }
    public int getfunct(){
        return num2;
    }
    public void setfunc(int a, int b){
        this.num1 = a;
        num2 = b;
        
    }
    
    
    
}
public class ConstructorAndThis
{
	public static void main(String[] args) {
	Test c = new Test(65 , 45);
	c.setfunc(10, 22);

	System.out.println(c.getfunc());
	System.out.println(c.getfunct());
	
	}
}
