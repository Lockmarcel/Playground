package de.lubowiecki.time;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Set;

/**
 *
 * @author T.Lubowiecki
 */
public class TimeTest {
    
    public static void main(String[] args) {
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.y");
        DateTimeFormatter dayFormatter = DateTimeFormatter.ofPattern("eeeee");
        
        LocalDate d1 = LocalDate.now();
        System.out.println(d1);
        
        LocalDate d2 = LocalDate.of(2000, 12, 30);
        System.out.println(d2);
        
        LocalDate d3 = LocalDate.parse("2000-12-22");
        System.out.println(d3);
        
        LocalDate d4 = LocalDate.parse("10.1.2001", formatter);
        System.out.println(d4);
        
        LocalTime t1 = LocalTime.NOON;
        System.out.println(t1);
        
        LocalTime t2 = LocalTime.of(10, 43, 33);
        System.out.println(t2);
        
        LocalDateTime dt1 = LocalDateTime.of(2018, Month.MARCH, 10, 2, 33);
        System.out.println(dt1);
        
        ZoneId zid = ZoneId.of("Europe/Berlin");
        ZonedDateTime zdt1 = ZonedDateTime.now(zid);
        System.out.println(zdt1);
        
        System.out.println("------------------");
        
        Period p1 = Period.between(d2, d1);
        System.out.println(p1);
        
        p1 = Period.ofDays(14);
        System.out.println(d1.plus(p1));
        System.out.println(d1.plus(14, ChronoUnit.DAYS));
        System.out.println(d1.plusDays(14));
        
        System.out.println(d2.isBefore(d1));
        System.out.println(d2.isAfter(d1));
        
        System.out.println("---------------");
        
        Duration dur = Duration.between(t2, t1);
        System.out.println(dur);
        
        //System.out.println(Year.now().isLeap());
        
        Set<String> ids = ZoneId.getAvailableZoneIds();
        ids.stream()
                .filter(s -> s.endsWith("Moscow"))
                .forEach(s -> System.out.println(s));
        
        System.out.println("----------------");
        
        ZoneId id = ZoneId.of("Europe/Berlin");
        System.out.println(id.getRules());
        
        
        LocalDateTime dNow = LocalDateTime.of(2017, 12, 10, 12, 22);
        ZonedDateTime dt = ZonedDateTime.of(dNow, id);
        System.out.println(dt);
        
        System.out.println("-----------------");
        
        LocalDate ld1 = LocalDate.now();
        System.out.println(ld1.format(dayFormatter));
        System.out.println(dayFormatter.format(ld1));
        
        NumberFormat nf = NumberFormat.getInstance(Locale.KOREA);
        System.out.println(nf.format(10000000.123));
        
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println(nf2.format(10000000.123));
    }
    
}
