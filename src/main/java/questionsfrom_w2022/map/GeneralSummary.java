package questionsfrom_w2022.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GeneralSummary {

    public static void main(String[] args) {
        HashMap<String, Integer> countryPopulation = new HashMap<>();
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("GB", 69000000);
        countryPopulation.put("Canada", 40000000);
        countryPopulation.put("USA", 335000000);

        System.out.println(countryPopulation);//{Canada=40000000, USA=335000000, GB=69000000, Germany=83000000}

        System.out.println("*********get()*******************");
        System.out.println(countryPopulation.get("USA"));//335000000

        System.out.println("*********keySet()*******************");
        System.out.println(countryPopulation.keySet());//[Canada, USA, GB, Germany]
        Set<String> keysOfCountryPopulation = countryPopulation.keySet();
        System.out.println(keysOfCountryPopulation.size());//4

        System.out.println("*********value of Map values()*******************");
        Collection<Integer> valuesOfCountryPopulation = countryPopulation.values();
        System.out.println(valuesOfCountryPopulation);//[40000000, 335000000, 69000000, 83000000]

        System.out.println("*********size()*******************");
        System.out.println(valuesOfCountryPopulation.size());//4

        System.out.println("*********1) entrySet() for loop of Map*******************");
        Set<Map.Entry<String, Integer>> entriesOfCountryPopulation = countryPopulation.entrySet();
        System.out.println(entriesOfCountryPopulation);//[Canada=40000000, USA=335000000, GB=69000000, Germany=83000000]

        for (Map.Entry<String, Integer> w : entriesOfCountryPopulation) {
            //   System.out.print(w + " ");//Canada=40000000 USA=335000000 GB=69000000 Germany=83000000
            if (w.getValue() > 83000000) {
                System.out.print(w.getValue() + "getValues ");//335000000
                System.out.println("w.getKey() = " + w.getKey());// USA
            }
        }

        System.out.println("*********2) entrySet getvalues getkeys************");

        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("Math", 9);
        grade.put("English", 8);
        grade.put("Biology", 7);
        grade.put("History", 6);
        grade.put("French", 7);

        Set<Map.Entry<String, Integer>> setGrade = grade.entrySet();
        for (Map.Entry<String, Integer> w : setGrade) {
            if (w.getValue() > 7) {
                System.out.print(" greater than 7 getKeys : " + w.getKey());//English Math
                System.out.print(" greater than 7 getValues : " + w.getValue());//8 9
            }
        }


    }
}
