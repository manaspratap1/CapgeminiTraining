package Task1;

import java.sql.SQLOutput;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

class Logs{
    private String level;//INFO, ERROR, WARN, DEBUG
    private LocalTime timestamp;

    public Logs(String level, String timestamp){
        this.level = level;
        this.timestamp = LocalTime.parse(timestamp);
    }

    public String getLevel(){
        return level;
    }

    public LocalTime getTimestamp(){
        return timestamp;
    }
}

public class Task5 {
    public static void main(String[] args) {

        List<Logs> logs = new ArrayList<>();

        logs.add(new Logs("ERROR", "09:10:28"));
        logs.add(new Logs("WARN", "10:10:20"));
        logs.add(new Logs("DEBUG", "05:08:56"));
        logs.add(new Logs("WARN", "17:45:34"));
        logs.add(new Logs("ERROR", "22:10:25"));
        logs.add(new Logs("DEBUG", "00:19:23"));

        Map<String, Integer> priority = Map.of(
                "ERROR", 1,
                "WARN", 2,
                "INFO", 3,
                "DEBUG", 4
        );

        Comparator<Logs> logComparator=
                Comparator
                        .comparing((Logs l) -> priority.getOrDefault(l.getLevel(), Integer.MAX_VALUE))
                        .thenComparing(Logs::getTimestamp);

        logs.sort(logComparator);

        logs.forEach((log) -> System.out.println(log.getLevel() + " " + log.getTimestamp()));


    }
}
