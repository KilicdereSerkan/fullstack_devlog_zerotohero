package com.serkan;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;
import java.time.Duration;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.*;




public class DateTimeMain {
    static void main() {
/*
        Overview
        Java's modern date-time API is in the java.time package. It was introduced in Java 8 to replace the old, error-prone java.util.Date and java.util.Calendar. The new API is immutable, clearer, and safer. Core concepts: a date without time (LocalDate), a time without date (LocalTime), a date and time without timezone (LocalDateTime), an instantaneous point on the timeline (Instant), and date-time with timezone (ZonedDateTime).

        Key classes and what they represent
        - LocalDate — a calendar date (year, month, day). No time, no timezone.
                - LocalTime — a time-of-day (hour, minute, second, nanosecond). No date, no timezone.
                - LocalDateTime — date plus time, still no timezone.
        - Instant — a point on the global timeline (UTC-based) expressed as seconds/nanoseconds from 1970-01-01T00:00:00Z.
                - ZonedDateTime — LocalDateTime plus a ZoneId (timezone rules applied).
        - OffsetDateTime / OffsetTime — date-time or time with a fixed offset from UTC (e.g., +03:00), not a full timezone with DST rules.
                - Duration — time-based amount (seconds, nanos) used to measure time between two instants or times.
                - Period — date-based amount (years, months, days) used to measure differences in calendar dates.
                - DateTimeFormatter — formats and parses date-time objects to and from strings.

 */

  //              Creating dates and times
  //      Simple examples using factory methods and constructors provided by java.time.

                // Current date, time, date-time
                LocalDate today = LocalDate.now();
                LocalTime nowTime = LocalTime.now();
                LocalDateTime nowDateTime = LocalDateTime.now();

                // Specific date and time
                LocalDate birthday = LocalDate.of(1990, Month.JULY, 15);
                LocalTime meetingTime = LocalTime.of(14, 30);        // 14:30
                LocalDateTime event = LocalDateTime.of(birthday, meetingTime);

                // Instant (UTC-based point in time)
                Instant instantNow = Instant.now();

                // Zoned date-time for a timezone
                ZoneId istanbul = ZoneId.of("Europe/Istanbul");     // IANA zone id
                ZonedDateTime zdt = ZonedDateTime.of(nowDateTime, istanbul);

                System.out.println("today = " + today);
                System.out.println("nowTime = " + nowTime);
                System.out.println("nowDateTime = " + nowDateTime);
                System.out.println("birthday = " + birthday);
                System.out.println("event = " + event);
                System.out.println("instantNow = " + instantNow);
                System.out.println("zoned = " + zdt);
/*
        Key notes:
        - Use ofPattern is not needed to create instances; it’s for formatting/parsing only.
                - ZoneId uses IANA names like "Europe/Istanbul" or "America/New_York".
 */

/*
                Formatting and parsing (DateTimeFormatter)
                Use DateTimeFormatter for human-friendly strings and parsing from text.
*/
                LocalDateTime now = LocalDateTime.now();

                // Predefined formatters
                DateTimeFormatter iso = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
                System.out.println("ISO: " + now.format(iso));

                // Custom pattern
                DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                String formatted = now.format(pattern);
                System.out.println("Custom: " + formatted);

                // Localized formatter
                DateTimeFormatter localized = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
                        .withLocale(Locale.forLanguageTag("tr-TR"));
                System.out.println("Localized: " + now.format(localized));

                // Parsing back to LocalDateTime
                String text = "25-12-2025 09:15:00";
                LocalDateTime parsed = LocalDateTime.parse(text, pattern);
                System.out.println("Parsed: " + parsed);
 /*
        Tips:
        - Pattern letters: yyyy (year), MM (month), dd (day), HH (hour 0-23), mm (minutes), ss (seconds).
        - Always parse with a matching formatter; mismatched patterns throw DateTimeParseException.
 */

 /*
        Time zones, Instant, and conversions
        Instant represents a point on the timeline in UTC. Convert between Instant and ZonedDateTime for timezone-aware operations.

 */
                Instant nowInstant = Instant.now();                       // UTC instant
                ZoneId tokyo = ZoneId.of("Asia/Tokyo");
                ZoneId istanbula = ZoneId.of("Europe/Istanbul");

                // Instant -> ZonedDateTime
                ZonedDateTime tokyoTime = nowInstant.atZone(tokyo);
                ZonedDateTime istTime = nowInstant.atZone(istanbul);

                // LocalDateTime -> ZonedDateTime (assume system default or specify zone)
                LocalDateTime local = LocalDateTime.of(2025, 10, 22, 21, 0);
                ZonedDateTime localAsIstanbul = local.atZone(istanbul);

                // ZonedDateTime -> Instant (convert back to UTC instant)
                Instant fromIstanbul = localAsIstanbul.toInstant();

                System.out.println("nowInstant = " + nowInstant);
                System.out.println("tokyoTime = " + tokyoTime);
                System.out.println("istTime = " + istTime);
                System.out.println("localAsIstanbul = " + localAsIstanbul);
                System.out.println("fromIstanbul = " + fromIstanbul);


/*
        Important:
        - Use ZoneId for timezone-aware operations and to respect daylight saving rules.
                - The same local date-time in two zones maps to two different instants.
 */


 /*
        Calculations: plus, minus, durations, and periods
                - Use plusXxx and minusXxx methods for simple arithmetic (plusDays, minusHours, plusMonths).
        - Use Duration for time-based differences (hours, minutes, seconds). Use Period for date-based differences (years, months, days).

  */

                LocalDate todaya = LocalDate.now();
                LocalDate nextMonth = today.plusMonths(1);
                LocalDate lastWeek = today.minusWeeks(1);

                LocalDateTime start = LocalDateTime.of(2025, 10, 1, 9, 0);
                LocalDateTime end = LocalDateTime.of(2025, 10, 1, 17, 30);

                // Duration between two LocalDateTime
                Duration workDuration = Duration.between(start, end);
                System.out.println("Work hours: " + workDuration.toHours() + " hours");
                System.out.println("Work minutes: " + workDuration.toMinutes() + " minutes");

                // Period between dates
                LocalDate birth = LocalDate.of(1990, 7, 15);
                Period age = Period.between(birth, today);
                System.out.println("Age: " + age.getYears() + " years, " + age.getMonths() + " months, " + age.getDays() + " days");

                // ChronoUnit for simple units
                long daysBetween = ChronoUnit.DAYS.between(birth, today);
                System.out.println("Days between birth and today: " + daysBetween);
/*
        Rules of thumb:
        - Use Duration for times and instants, Period for calendar differences.
        - ChronoUnit supports many units and works with different temporal types.

 */

 /*
        Interoperability with legacy Date and Calendar
        Convert old java.util.Date or java.util.Calendar to new API and back:

  */
                Date legacyDate = new Date();                // java.util.Date (legacy)
                Instant fromLegacy = legacyDate.toInstant(); // convert to Instant

                ZonedDateTime zdtt = fromLegacy.atZone(ZoneId.systemDefault());
                LocalDateTime ldt = LocalDateTime.ofInstant(fromLegacy, ZoneId.systemDefault());

                // Back to legacy Date
                Date again = Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());

                System.out.println("legacyDate = " + legacyDate);
                System.out.println("fromLegacy = " + fromLegacy);
                System.out.println("zdt = " + zdtt);
                System.out.println("ldt = " + ldt);
                System.out.println("again = " + again);
  //      Use these conversions when working with older libraries or APIs that still accept java.util.Date.


  /*
                Common pitfalls and best practices
        - Prefer java.time classes over java.util.Date and Calendar for clarity and immutability.
                - Always be explicit about timezones when storing or transferring instants across systems. Store Instants or ISO strings with timezone (Z).
                - Use ZoneId (IANA) rather than system offsets when you need correct DST handling.
        - Format and parse with DateTimeFormatter and matching patterns to avoid exceptions.
        - Account for immutability: methods like plusDays return new objects; they don’t change the original.
   */

 //       Combined example: scheduling message across time zones
        // Event scheduled at 10:00 on 2025-11-01 in Istanbul
                ZoneId ist = ZoneId.of("Europe/Istanbul");
                LocalDate eventDate = LocalDate.of(2025, 11, 1);
                LocalTime eventTime = LocalTime.of(10, 0);
                ZonedDateTime eventIst = ZonedDateTime.of(eventDate, eventTime, ist);

                // Convert to user's timezone (Tokyo)
                ZoneId tokyoa = ZoneId.of("Asia/Tokyo");
                ZonedDateTime eventTokyoa = eventIst.withZoneSameInstant(tokyoa);

                // Show UTC instant for storage or transmission
                Instant storedInstant = eventIst.toInstant();

                System.out.println("Event in Istanbul: " + eventIst);
                System.out.println("Event in Tokyo: " + eventTokyoa);
                System.out.println("Store this Instant (UTC): " + storedInstant);

  //      Pattern:
  //      - Build a ZonedDateTime in the event’s local zone, convert to other zones for display, and store Instant for unambiguous persistence.



    }
}
