package org.example.new_date;

import java.time.LocalDate;

/**
 * @author swsm
 * @date 2024-10-17
 */
public class Test {

    /**
     * Java 8 引入了一个新的日期和时间API，旨在解决旧版 java.util.Date 和 java.util.Calendar 的一些不足之处。这些新API位于 java.time 包中，提供了更好的线程安全性、更易于理解和使用的API设计，以及更好的时区处理能力。以下是一些核心类和它们的主要特点：
     *
     * <li>1.LocalDate、LocalTime 和 LocalDateTime：</li>
     *
     * LocalDate 表示没有时间的日期，遵循 ISO-8601 日历系统（yyyy-MM-dd），用于存储如生日和工资日等日期
     * 。
     * LocalTime 表示没有日期的时间，可以表示如一天中的某个具体时间。
     * LocalDateTime 结合了日期和时间，表示一个具体的日期和时间，但不包含时区信息。
     * <li>2.ZonedDateTime 和 OffsetDateTime：</li>
     *
     * ZonedDateTime 表示包含时区信息的日期和时间。它使用 ZoneId 来标识不同的时区。
     * OffsetDateTime 也表示包含时区偏移量的日期和时间，但不包含具体的时区ID。
     * <li>3.Instant：</li>
     *
     * Instant 表示一个具体的时刻，定义为自1970年1月1日00:00:00 UTC以来的秒数偏移量。
     * <li>4.Duration 和 Period：</li>
     *
     * Duration 表示两个时间点之间的时间长度，可以以秒、毫秒等单位表示。
     * Period 表示两个日期之间的时间长度，通常以年、月、日为单位。
     * <li>5.DateTimeFormatter：</li>
     *
     * 用于格式化和解析日期时间对象为字符串，提供了多种预定义的格式以及自定义格式的能力。
     * <li>6.TemporalAdjusters：</li>
     *
     * 提供了一系列静态方法，用于执行如“下一个星期五”、“这个月的第二个星期二”等复杂的日期时间调整。
     * <li>7.ChronoUnit：</li>
     *
     * 枚举类型，用于表示日期和时间的单位，如天、月、年、小时、分钟等，取代了旧API中使用的整数值。
     * <li>8.线程安全性：</li>
     *
     * 新的日期时间API是不可变的，因此是线程安全的，解决了旧API中的线程安全问题。
     * <li>9.ISO-8601 支持：</li>
     *
     * 新API遵循ISO-8601标准，提供了更好的国际化支持。
     * <li>10.与旧API的兼容性：</li>
     *
     * Java 8 通过 toInstant() 方法提供了将旧的 Date 和 Calendar 实例转换为新的日期时间API的途径
     * 。
     */
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today's date is: " + today);
    }
    
}
