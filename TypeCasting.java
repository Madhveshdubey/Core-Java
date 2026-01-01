public class TypeCasting {
    public static void main(String[] args) {
        byte b = 13;
        int i = 12345;
        //  b = (byte) i;// Narrowing is chote se bade main cast karna 
        float f = (float) i;// Widening
        System.out.println(b);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Integer.parseInt("25"));
        System.out.println(Integer.parseInt("10",2));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toHexString(b));
        System.out.println(Integer.toOctalString(b));
        System.out.println(Integer.toString(10,2));
        
    }
}
