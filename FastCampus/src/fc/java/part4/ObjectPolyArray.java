package fc.java.part4;

import fc.java.poly.*;

public class ObjectPolyArray {
    public static void main(String[] args) {
         Object[] obj = new Object[2];
         obj[0] = new A();
         obj[1] = new B();
        for (int i = 0; i < obj.length; i++) {
            display(obj[i]);
        }
    }
    public static void display(Object obj){
        if(obj instanceof A){
            ((A)obj).printGO();
        }
        if (obj instanceof B){
            ((B)obj).printGO();
        }
    }
}
