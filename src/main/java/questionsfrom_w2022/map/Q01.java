package questionsfrom_w2022.map;

import java.util.Collection;
import java.util.HashMap;

public class Q01 {


//type a code to get average of the countries population.
    public static void main(String[] args) {

        HashMap<String,Integer> countryPopulation = new HashMap<>();
        countryPopulation.put("Germany",83000000);
        countryPopulation.put("GB",69000000);
        countryPopulation.put("Canada", 40000000);
        countryPopulation.put("USA", 335000000);

        Collection<Integer> valueOfCountryPopulation=countryPopulation.values();
        int sum=0;
        for(Integer w:valueOfCountryPopulation){
            sum+=w;

        }
        int numberOfValues=countryPopulation.size();
        int averageOfValues = sum / numberOfValues;
        System.out.println(averageOfValues);
    }
}
