package nix;

import nix.data.DurationBetweenDates;
import nix.data.SortedMapOfDates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("____________Task 1______________");
        List<LocalDateTime> localDateTimes = new ArrayList<>();
        localDateTimes.add(LocalDateTime.of(2022, 11,19,12,30));
        localDateTimes.add(LocalDateTime.of(2001, 2,28,12,30));
        localDateTimes.add(LocalDateTime.of(2001, 2,28,15,30));
        localDateTimes.add(LocalDateTime.of(2001, 2,28,16,30));
        localDateTimes.add(LocalDateTime.of(1917, 7,28,21,30));
        SortedMapOfDates.task(localDateTimes);
        System.out.println();
        System.out.println("____________Task 2______________");
        DurationBetweenDates.task(localDateTimes);

    }
}
