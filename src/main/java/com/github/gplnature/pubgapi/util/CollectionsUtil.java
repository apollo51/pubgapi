package com.github.gplnature.pubgapi.util;

import java.util.List;
import java.util.stream.Collectors;

public class CollectionsUtil {

    /**
     * Filter in the list the elements with the provided class
     *
     * @param <T> filtered class
     * @param objects List you want to filtered
     * @param filterClass filtering criteria
     * @return the list of elements in the list of type filterClass
     */
    public static <T> List<T> filterType(List<?> objects, Class<T> filterClass) {
        return objects.stream()
                .filter(filterClass::isInstance)
                .map(filterClass::cast)
                .collect(Collectors.toList());
    }
}
