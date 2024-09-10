package fc.java.part4;
import fc.java.poly.*;
public class ObjectPolyArg {
    public static void main(String[] args) {
        Object a = new A();
        Object b = new B();
        display(a);
        display(b);
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
