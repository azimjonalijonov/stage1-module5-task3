package com.epam.mjc;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        List<Integer> str = list
                .stream()
                .filter(b -> b % 2 == 0)
                .collect(Collectors.toList());
        return str;
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        List<String> str = list
                .stream()
                .map(c -> c.toUpperCase())
                .collect(Collectors.toList());
        return str;
    }

    public Optional<Integer> findMax(List<Integer> list) {
       int  optionalInteger = list
               .stream()
               .mapToInt(v -> v)
               .max().orElseThrow(NoSuchElementException::new);
       return Optional.of(optionalInteger);
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        int op = list
                .stream()
                .mapToInt(v -> {
                    return v.stream()
                            .mapToInt(c -> c)
                            .min().orElseThrow(NoSuchElementException::new);

                })
                .min().orElseThrow(NoSuchElementException::new);
        return Optional.of(op);
    }

    public Integer sum(List<Integer> list) {
        int res = list
                .stream()
                .mapToInt(Integer::intValue)
                .sum();
        return res;
    }
}
