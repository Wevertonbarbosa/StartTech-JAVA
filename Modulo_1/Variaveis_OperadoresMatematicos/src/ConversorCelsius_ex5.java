public class ConversorCelsius_ex5 {
    public static void main(String[] args) {

        double celsius = Double.parseDouble(args[0]);
        //Conversão para farenheit
        double farenheit = (celsius * 1.8) + 32;
        System.out.println("O valor convetido é: "+ farenheit);
    }
}
