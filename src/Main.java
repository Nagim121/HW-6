import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 1; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
            System.out.println("Задача 1");
            int age = 18;
            if (age >= 18) {
                System.out.println("Если возраст человека равен 18, то он совершеннолетний");
            } else {
                System.out.println("Он не достиг совершеннолетия, нужно немного подождать");
            }
            System.out.println("Задчача 2");
            int temp = 4;
            if (temp > 5) {
                System.out.println("Сегодня тепло, можно идти без шапки");
            } else {
                System.out.println("На улице холодно, нужно надеть шапку");
            }
            System.out.println("Задача 3");

            int speed = 57;
            if (speed > 60) {
                System.out.println("Если скорость  " + speed + " км/час, то придется заплатить штраф");
            } else {
                System.out.println("Если скорость  " + speed + " км/час, то можно ездить спокойно");
            }
            System.out.println("Задача 4");
            int agePerson = 24;
            if (agePerson >= 2 && agePerson <= 6) {
                System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в детский сад");
            }
            if (agePerson >= 7 && agePerson <= 17) {
                System.out.println("Если возраст человека равен " + agePerson + " то ему нужно ходить в школу");
            }
            if (agePerson >= 18 && agePerson <= 24) {
                System.out.println("Если возраст человека равен " + agePerson + " то его место в университете");
            }
            if (agePerson > 24) {
                System.out.println("Если возраст человека равен " + agePerson + " то ему пора ходить на работу");
            }

            System.out.println("Задача 5");
            int babyAge = 6;
            if (babyAge < 5) {
                System.out.println(" Если возраст ребенка равен " + babyAge + ", то он не может кататься на аттракционе");
            }
            if (babyAge > 5 && babyAge < 14) {
                System.out.println(" Если возраст ребенка равен " + babyAge + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
            }
            if (babyAge >= 14) {
                System.out.println(" Если возраст ребенка равен " + babyAge + ", то он может кататься без сопровождения взрослого");
            }
            System.out.println("Задача 6");
            int place = 111;
            if (place >= 1 && place <= 60) {
                System.out.println("Место под номером " + place + " - сидячее");
            }
            if (place > 60 && place <= 102) {
                System.out.println("Место под номером " + place + " - стоячее");
            } else {
                System.out.println(" Мест в вагоне нет");
            }
        }
        System.out.println("Задача 7");
        int one = 18;
        int two = 88;
        int three = 3;
        if (one > three && one > two) {
            System.out.println("Максимальное число равно " + one + "");
        }
        if (two > one && two > three) {
            System.out.println(" Максимальное число равно " + two + "");
        }
        if (three > one && three > two) {
            System.out.println("Максимальное число равно " + three + "");
        }


    }
}
