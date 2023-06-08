import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        AltasFunciones af = new AltasFunciones();
        af.probandoooo();
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Santi");
        nombres.add("Gustavo");
        nombres.add("Maria");
        nombres.add("Gordi");
        Stream<String> nombresStream = nombres.stream()
                .map((x -> x.toUpperCase()))
                .filter(x -> x.startsWith("G"));
        nombresStream.forEach(x -> System.out.println(x));
    }
}