package Java.LambdaExpressions.DataProcessingLambdaAndCollections;

import Java.LambdaExpressions.CreateNewApi.Person;

import java.util.*;

public class ExamplesMapInterface {


    public static void main(String[] args) {

        // the String in the map below, represents the City where each person lives
        Map<String, List<Person>> citizens = new HashMap<>();

        citizens.forEach((city, list) -> System.out.println(city + ":" + list.size() + " people: "));


        // this method check if the key is present in the given map, and if present it will return the existent value
        // if it is not present, it will return the default value that i pass as the second parameter
        citizens.getOrDefault("example city", Collections.emptyList());

        // it a new version of the put method, if the key is not present in the it put's it in the map
        // basically what are we doing below, is that we add new key, value pair if the city is missing from the map
        // and then we directly add a new person to the city. If the key  was not missing from map, it will not change anything
        citizens.putIfAbsent("example city", new ArrayList<>());

        citizens.get("example city").add(new Person());

        ArrayList<Person> existingValue = new ArrayList<>();
        ArrayList<Person> newValue = new ArrayList<>();
        //the below replace the value of the given key, with the newValue passed as parameter
        citizens.replace("example city", newValue);

        //the below will replace the value of the key with the newValue passed as parameter . . .
        // ONLY   if the current value of the key, matches the given existingValue passed as parameter
        citizens.replace("example city", existingValue, newValue);

        //will remove the key-value pair if they match with what is existing in the map
        citizens.remove("example city", existingValue);


        /* basically the below .computeIfAbsent() method:
                    - check if "one" is in the map.
                                - if "one" is already in the map i will not execute the lambda expression
                                - if "one" is not in the map, i will execute the lambda expression

           the .compute*() methods returns the value that were just been computed
         */
        Map<String, Map<String, Person>> map = new HashMap<>();
        map.computeIfAbsent("one", key -> new HashMap<String, Person>()).put("two", new Person("John"));



        /*   the  .merge(K key, V newValue, BiFunction<? super V, ? super V, ? extends V> remapping)    method.
        Used to merge maps:
                - if the passed key is not in the map:
                                - Adds the key-value pair to the map
                - if the passed key is in the map:
                                - merge the existing value with the passed value using the lambda expression
                                - the remapping takes a pair of values and return a new value
         */
        Map<String, List<Person>> map1 = new HashMap<>();
        Map<String, List<Person>> map2 = new HashMap<>();

        map2.forEach((key1, value1) ->
                                        //existingPeople and newPeople, are basically 2 lists, and we used de .addAll() method to add the newPeople to the existingPeople
                map1.merge(key1, value1, (existingPeople, newPeople) -> {
                    existingPeople.addAll(newPeople);
                    return existingPeople;
                }
            )
        );

    }
}
