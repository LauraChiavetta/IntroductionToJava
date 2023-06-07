package NumberOperations;

public class Testing {
    public static void main(String[] args) {
        int a = 15;
        a +=5;
        a-=4;
        int b = a;
        b++;
        if(b % 2 != 0){
            System.out.println(b);
        }
        if( b*(b+1) %3 == 0 ) {
            System.out.println("This number is a multiple of 3");
        }
    }
}
