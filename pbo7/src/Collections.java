import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Collections {
    static Collection<String> names = new ArrayList<>();

    public static void addCollection() {
        System.out.println("Add Collection");
        names.add("Taufik");
        names.addAll(Arrays.asList("Dean", "Lukaz"));
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
    }

    public static void removeCollection() {
        System.out.println("Remove Collection");
        names.add("Rafly");
        names.add("Lukas");
        names.addAll(Arrays.asList("Dean", "Lukaz"));
        names.remove("Rifqi");
        names.removeAll(Arrays.asList("Dean", "Lukaz"));
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
    }

    public static void checkCollection() {
        System.out.println("Check Collection");
        names.add("Eko");
        names.add("Kurniawan");
        names.addAll(Arrays.asList("Ihsan", "Akbar"));
        System.out.println(names.contains("Eko"));
        System.out.println(names.containsAll(Arrays.asList("Ihsan", "Akbar")));
        names.remove("Eko");
        names.removeAll(Arrays.asList("Ihsan", "Akbar"));
        System.out.println(names.contains("Eko"));
        System.out.println(names.containsAll(Arrays.asList("Ihsan", "Akbar")));
        System.out.println();
    }
}
