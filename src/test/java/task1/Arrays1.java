package task1;

import org.junit.Test;

public class Arrays1 {

    @Test
    public void numbers(){
        int a = 12;
        int b = 14;
        int c = a + b;
	    int d = c + a;
        int e = c + a;
        int r = a + b + c + d + e;
	    String str = "Finaly I set up Jenkins after ";


        System.out.println(str + r+ " attemps");
    }
}
