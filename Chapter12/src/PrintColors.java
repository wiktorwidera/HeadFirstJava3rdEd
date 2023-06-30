import java.util.List;

public class PrintColors {
    public static void main(String[] args) {
        List<String> allColors = List.of("Red", "Blue", "Yellow");
        allColors.forEach(color -> System.out.println(color));
    }
}
