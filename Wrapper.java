public class Wrapper {
    public static void main() {
        Integer i = Integer.valueOf(10);
        int a = i;
        System.out.println(a==i);
        System.out.println(i.equals(a));
        Integer j = Integer.valueOf("1010",2);//Always in String
        Integer k = Integer.valueOf("010",10);
        Integer l = Integer.valueOf("f",16);
        Integer m = Integer.decode("0xa6");//Only HexaDecimal value Decode
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
    }
}
