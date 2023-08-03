public class ExerciseBeTheCompiler {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Hi");
        Consumer<String> c = s -> System.out.println(s);
        //Supplier<String> s = () -> System.out.println("Some string");
    }
}
