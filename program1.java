public class program1 {
    public static void main(String[] args) {
        
        int a = 1000;
        int b = 2000;
        
        
        System.out.println("Before swap: a = " + a + ", b = " + b);

       
        int temp = a;
        a = b;
        b = temp;


        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}