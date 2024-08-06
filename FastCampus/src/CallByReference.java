public class CallByReference {
    public static void main(String[] args) {
        float a = 15.9f;
        float b = 13.4f;
        floatAdd(a,b);
    }

    public static void floatAdd(float a, float b){
        float hap = a+b;
        System.out.println("hap = " + hap);
    }
}
