package nix.data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByKey;
import static java.util.stream.Collectors.toMap;

public class SortedMapOfDates {

    public static void task(List<LocalDateTime> localDateTimes){
        Map<LocalDate, Set<LocalTime>> map = localDateTimes.stream()
                .collect(Collectors.groupingBy(LocalDateTime::toLocalDate,
                        Collectors.mapping(LocalDateTime::toLocalTime, Collectors.toSet())));
        map = map.entrySet().stream()
                .sorted(comparingByKey())
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2)->e2, LinkedHashMap::new));
        System.out.println(map);
    }
}
