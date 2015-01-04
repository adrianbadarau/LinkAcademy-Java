package exercise1;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

/**
 * Created by adrian on 04.01.2015.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<User> usersToAdd = new ArrayList<User>();
        usersToAdd.add(new User(4,"Goran"));
        usersToAdd.add(new User(2,"Ilija"));
        usersToAdd.add(new User(6,"Nikola"));

        ArrayList<User> users = new ArrayList<User>();
        users.add(new User(1, "Petar"));
        users.add(new User(2, "Jovan"));
        users.add(new User(3, "Zoran"));
        
        for(User newUser : usersToAdd){
            for (User user : users){
                if (newUser.Id == user.Id) users.remove(user);
            }
        }
        users.addAll(usersToAdd);

        for (User user : users){
            System.out.println(user.Id+user.name);
        }
        System.out.println(LocalDate.now() +"||"+ LocalTime.now());

            LocalDate now = LocalDate.now();
            LocalDate birthday = LocalDate.of(1986, Month.OCTOBER, 13);

            Period p = Period.between(birthday, now);
            long p2 = ChronoUnit.DAYS.between(birthday, now);
            long p3 = ChronoUnit.MONTHS.between(birthday, now);

            System.out.println("You are " + p.getYears() + " years, " + p.getMonths() + " months, and " + p.getDays() + " days old. (" + p2 + " days total or " + p3 + " months)");

        for (Month month : Month.values()) {
            System.out.println(month + " " + month.length(now.isLeapYear()));

        }

    }
}
