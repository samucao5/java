package fundamentos;

public class notacaoPonto {
    public static void main(String[] args) {
        String s = "bom dia S";
        s = s.replace("S", "Samuel");
        s = s.concat(", como posso ajuda-lo?");
        s = s.toUpperCase();
        System.out.println(s);

        String x = "Allan".toUpperCase();
        System.out.println(x);

        String y = "BOM DIA X"
                    .replace("X", "ALLAN")
                    .toUpperCase()
                    .concat("!!!");

        System.out.println(y);


    }
}
