package helloworld.example.com.unitconverter;

/**
 * Created by PremMithilesh on 7/19/2016.
 */
public class Converter {
    public static double ctof(double c) {
        return 32+(c*(9/5));
    }
    public static double ftoc(double f){
        return (f - 32) * (5 / 9);
    }
}
