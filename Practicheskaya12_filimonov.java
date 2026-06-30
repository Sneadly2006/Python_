import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Practicheskaya12_filimonov {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        
        LocalDate now = LocalDate.now();
        LocalDate birth = LocalDate.of(1990, 5, 20);
        
        Period age = Period.between(birth, now);
        
        LocalDate nextBirthday = birth.withYear(now.getYear());
        if (nextBirthday.isBefore(now) || nextBirthday.isEqual(now)) {
            nextBirthday = nextBirthday.plusYears(1);
        }
        long daysLeft = java.time.temporal.ChronoUnit.DAYS.between(now, nextBirthday);
        
        System.out.println("Сегодня: " + now.format(formatter));
        System.out.println("Дата рождения: " + birth.format(formatter));
        System.out.println("Возраст: " + age.getYears() + " лет");
        System.out.println("До дня рождения: " + daysLeft + " дней");
    }
}