package org.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class Stream {
    public static <T> T findElement(Collection<T> collection, T element) {
        Optional<T> result = collection.stream()
                .filter(e -> e.equals(element))
                .findFirst();
        return result.orElse((T) "-1");



    }
    public static void main(String[] args) {
        Collection<String> StringCollection = Arrays.asList("banana", "apple", "cranberry", "orange", "pineapple");
        String element = "pineapple";
        System.out.println(findElement(StringCollection, element));

        String element2 = "peach";
        System.out.println(findElement(StringCollection, element2));
    }
}
