package fundamentos;

public class Wrappers
{
    public static void main(String[] args) {
        //byte 

        Byte b = 5;
        Short s = 1000;
        Integer i = 1000;
        Long l = 100000L;

        Integer e = Integer.parseInt("12332");

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(e);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '#';
        System.out.println("C" + c);
    }
}