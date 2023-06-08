import java.util.function.Function;

public class AltasFunciones {
    private Function<String,String> converMayus =  x -> x.toUpperCase();
    private Function<Integer,Integer> suma = x -> x.sum(x,x);

    public void probandoooo(){
        System.out.println(converMayus.apply("soy santi"));
        System.out.println(suma.apply(22));
    }
}
