import java.util.function.Function;

public class AltasFunciones {
    private Function<String,String> converMayus =  x -> x.toUpperCase();
    private Function<Integer,Integer> suma = x -> x.sum(x,x);

    public void probandoooo(){
       String frase = Holis(converMayus , "soy santi");
        System.out.println(frase);
        System.out.println(suma.apply(22));
    }
    public String Holis (Function<String,String> unaFuncion , String nombre){
       return unaFuncion.apply("Hooliiiis, " + nombre);
    }
}
