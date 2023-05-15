package questionsfrom_w2022.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class General {
    /*
    When we use maps, if we give key, it will return always the value.

    Entry means Key+Value
    Entry Set= all Keys and Values

    maps use key value pairs structure,
    keys and values are important.
    keys should be unique,however values can be duplicate.
    In maps keys cannot be NULL except HasMap,
    in hashMaps Null can be used.
    only once for key, multiple time as values

    hashmap does not create in natural order cause of it is a super-fast.

    hashmap is not thread safe.
    Hashmap is not synchronized.


     */

    // addition "entry" in Map by using put keyword.
    public static void main(String[] args) {
        HashMap<String, Integer> countryPopulation = new HashMap<>();
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("GB", 69000000);
        countryPopulation.put("Canada", 40000000);
        countryPopulation.put("USA", 335000000);

        System.out.println(countryPopulation);//{Canada=40000000, USA=335000000, GB=69000000, Germany=83000000}

        //get () runs with key,
        System.out.println(countryPopulation.get("USA"));//335000000
        // we can get keys by using keySet()
        System.out.println(countryPopulation.keySet());//[Canada, USA, GB, Germany]
        Set<String> keysOfCountryPopulation = countryPopulation.keySet();
        System.out.println(keysOfCountryPopulation.size());//4

        //how can be accessed to value of Map
        Collection<Integer> valuesOfCountryPopulation = countryPopulation.values();
        System.out.println(valuesOfCountryPopulation);//[40000000, 335000000, 69000000, 83000000]

        //size()
        System.out.println(valuesOfCountryPopulation.size());//4


        //entrySet()
        System.out.println("*********1) entrySet getvalues getkeys************");
        Set<Map.Entry<String, Integer>> entriesOfCountryPopulation = countryPopulation.entrySet();
        System.out.println(entriesOfCountryPopulation);//[Canada=40000000, USA=335000000, GB=69000000, Germany=83000000]


        for (Map.Entry<String, Integer> w : entriesOfCountryPopulation) {
         //   System.out.print(w + " ");//Canada=40000000 USA=335000000 GB=69000000 Germany=83000000
            System.out.println("***********");
            if (w.getValue() > 83000000) {
                System.out.print(w.getValue() + "getValues ");//335000000
                System.out.println("w.getKey() = " + w.getKey());// USA
            }
        }

        System.out.println();
        System.out.println("*********2) entrySet getvalues getkeys************");

        HashMap<String, Integer> hm1 = new HashMap<>();
        hm1.put("Math", 9);
        hm1.put("English", 8);
        hm1.put("Biology", 7);
        hm1.put("History", 6);
        hm1.put("French", 7);

        Set<Map.Entry<String, Integer>> setGrade = hm1.entrySet();
        for (Map.Entry<String, Integer> w : setGrade) {
            if (w.getValue() > 7) {
                System.out.println("greater than 7 getKeys : " + w.getKey());
                System.out.println("greater than 7 getValues : " + w.getValue());
            }
        }

        System.out.println("*********3) entrySet getvalues getkeys hm2************");
        HashMap<String, Integer> grade1 = new HashMap<>();
        grade1.put("Math", 8);
        grade1.put("Java", 9);
        grade1.put("SDLC", 9);
        grade1.put("API", 7);

        Set<Map.Entry<String,Integer>> entriesOfGrade1=grade1.entrySet();
        System.out.println("entriesOfGrade1 = " + entriesOfGrade1);
        Integer newValuesOfSdlc1=0;
        for(Map.Entry<String,Integer> w:entriesOfGrade1){
            if(w.getKey().contains("SDLC")){
                newValuesOfSdlc1 += w.setValue(15);
                System.out.println("newValuesOfSdlc = " + newValuesOfSdlc1);

                System.out.println("newValuesOfSdlc 0 = " + newValuesOfSdlc1);
                System.out.println("w.setValue(1) = " + w.setValue(25));


                newValuesOfSdlc1 =+ w.setValue(25);
                newValuesOfSdlc1 =+ w.setValue(0);
                System.out.println("w.setValue(again) = " + w.setValue(25));
            }

        }
        System.out.println("newValuesOfSdlc 1 = " + newValuesOfSdlc1);
        System.out.println("newValuesOfSdlc 2 = " + newValuesOfSdlc1);

        System.out.println("*********4) not setValue with ifAbsent entrySet getvalues getkeys hm2************");
        HashMap<String, Integer> grade2 = new HashMap<>();
        grade2.put("Math", 8);
        grade2.put("Java", 9);
        grade2.put("SDLC", 9);
        grade2.put("SQL", 7);
        System.out.println("grade2 = " + grade2);

        Set<Map.Entry<String,Integer>> entriesOfGrade2=grade2.entrySet();
        System.out.println("entriesOfGrade2 = " + entriesOfGrade2);

        for(Map.Entry<String,Integer> w:entriesOfGrade2){
            System.out.println("w.getValue() 1= " + w.getValue());
            System.out.println("w.getKey() 2= " + w.getKey());

            if(w.getKey().contains("SQL")){
                entriesOfGrade2.remove("SQL");
                System.out.println("w = " + w.getValue());
                System.out.println("w.getValue() after remove= " + w.getValue());
                System.out.println("w.getKey() after remove = " + w.getKey());
            }
        }
        System.out.println("entriesOfGrade2 after remove = " + entriesOfGrade2);


    }
}
