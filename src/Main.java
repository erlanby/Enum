import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Туура эмес жазса ошол катаны кармоо,
        // А эгер туура жазса чыгарып беруу консольго
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Аптанын бир кунун жазыныз ");
           Day day = Day.valueOf(scanner.next());
           switch (day){
               case MONDAY -> System.out.println(Day.MONDAY.description);
               case TUESDAY -> System.out.println(Day.TUESDAY.description);
               case WEDNESDAY -> System.out.println(Day.WEDNESDAY.description);
               case THURSDAY -> System.out.println(Day.THURSDAY.description);
               case FRIDAY -> System.out.println(Day.FRIDAY.description);
               case SATURDAY -> System.out.println(Day.SATURDAY.description);
               case SUNDAY -> System.out.println(Day.SUNDAY.description);
           }
       } catch (IllegalArgumentException e){
           System.out.println("Туура эмес жазып жатасыз, англис тилинде жана чон тамга менен жазыныз ");
       }
    }
}