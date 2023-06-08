import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AltasFunciones af = new AltasFunciones();
        af.probandoooo();
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Santi");
        nombres.add("Gustavo");
        nombres.add("Maria");
        nombres.add("Gordi");
        nombres.stream().forEach(System.out::println);
        //otra forma valida de hacer lo anterior es:
        nombres.stream().forEach( x -> System.out.println(x));
    }
}