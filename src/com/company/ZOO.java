package com.company;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ZOO implements Comparable<ZOO> {
    private LocalDateTime start;
    private LocalDateTime end;
    private String summary;
    private String description;


    public ZOO(LocalDateTime start, LocalDateTime end, String summary, String description) {
        this.start = start;
        this.end = end;
        this.summary = summary;
        this.description = description;
    }

    public static ZOO build(String start, String end, String summary, String description) {
        LocalDateTime startTime = LocalDateTime.parse(start);
        LocalDateTime endTime = LocalDateTime.parse(end);
        return new ZOO(startTime, endTime, summary, description);
    }

    public long getDuration() {
        return start.until(end, ChronoUnit.MINUTES);
    }



    @Override
    public int compareTo(ZOO o) {
        long dur = getDuration();
        long dur2 = o.getDuration();
        return Long.signum(dur2 - dur);
    }

    public void addToHours(int[] arrOfHours) {
        for (int i = start.getHour(); i < end.getHour(); i++) {
            arrOfHours[i] += 1;
        }
    }
}
