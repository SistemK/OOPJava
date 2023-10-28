package gb_oop_java.sem2.hw2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Master[] masters = {
                new Robot("Электроник", 200, 500),
                new Human("Николай", 120, 30),
                new Human("Василий", 80, 10),
                new Human("Петр", 160, 90),
                new Cat("Барсик", 180, 80),
                new Cat("Рыжик", 100, 20),
                new Cat("Рыжик", 200, 320)
        };

        Obstacle[] obstacles = {
                new Wall(40),
                new RunTrack(200),
                new Wall(12),
                new RunTrack(120),
        };

        List<Master> mastersLoosers = new ArrayList<>();
        List<Master> mastersFinish = new ArrayList<>(Arrays.asList(masters));

        System.out.println("----------------------------------------------------------");
        System.out.println("Старт соревнований по бегу в длинну и перепрыгиванию стен!");
        System.out.println("В соревнованиях участвуют " + Arrays.toString(masters).replaceAll("^\\[|\\]", ""));
        for (Master master : masters) {
            System.out.println("\nВыполнять упражнения выходит " + master.toString());
            for (Obstacle obstacle : obstacles) {
                if (obstacle instanceof RunTrack) {
                    if (master.run((RunTrack) obstacle)) {
                        System.out.println("Пробежал дорожку длинной " + ((RunTrack) obstacle).distance + " метров" );
                    } else {
                        System.out.println(master.toString() + " не смог пробежать дорожку длинной " + ((RunTrack) obstacle).distance + " метров и выбывает из соревнований");
                        mastersFinish.remove(mastersFinish.indexOf(master));
                        mastersLoosers.add(master);
                        break;
                    }
                } else {
                    if (master.jump((Wall) obstacle)) {
                        System.out.println("Перепрыгнул стену высотой " + ((Wall) obstacle).height + " метров");
                    } else {
                        System.out.println(master.toString() + "не смог перепрыгнуть стену высотой " + + ((Wall) obstacle).height + " метров и выбывает из соревнований");
                        mastersFinish.remove(mastersFinish.indexOf(master));
                        mastersLoosers.add(master);
                        break;
                    }
                }
            }
        }
        System.out.println("-------------------------");
        System.out.println("Результаты соревнований: ");
        System.out.println("C заданием справились " + mastersFinish.toString().replaceAll("^\\[|\\]", ""));
        System.out.println("C заданием не справились " + mastersLoosers.toString().replaceAll("^\\[|\\]", ""));

    }
}
