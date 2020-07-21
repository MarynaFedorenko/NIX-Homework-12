package nix.data;

import java.awt.image.ImageProducer;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DurationBetweenDates {

    public static void task(List<LocalDateTime> localDateTimes){
        List<Long> durations = localDateTimes.stream().map(e->{
            Duration duration; long max=0;
            for(int i=0; i<localDateTimes.size(); i++){
                duration = Duration.between(e, localDateTimes.get(i));
                if(max<duration.toHours()) max = duration.toHours();
            }
            return max;
        }).collect(Collectors.toList());
         long maxDuration = durations.stream().max(Long::compare).get();
        System.out.println("Max duration between two dates: "+ maxDuration+" hours");
    }
}
