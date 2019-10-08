import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Thanos {

    public static void main(String[] args) {

        Hero widow = new Hero("Black Widow", 34);
        Hero captain = new Hero("Captain America", 100);
        Hero vision = new Hero("Vision", 3);
        Hero iron = new Hero("Iron Man", 48);
        Hero scarlet = new Hero("Scarlet Witch", 29);
        Hero thor = new Hero("Thor", 1500);
        Hero spider = new Hero("Spider-Man", 18);
        Hero hulk = new Hero("Hulk", 49);
        Hero doctor = new Hero("Doctor Strange", 42);

        List<Hero> heroes = new ArrayList<>();
        heroes.add(widow);
        heroes.add(captain);
        heroes.add(vision);
        heroes.add(iron);
        heroes.add(scarlet);
        heroes.add(thor);
        heroes.add(spider);
        heroes.add(hulk);
        heroes.add(doctor);

        thor.setAge(1501);

        Collections.shuffle(heroes);

        heroes = heroes.subList(0, heroes.size() / 2);

        for (Hero hero : heroes) {
            System.out.println(hero.getName());
        }
    }
}