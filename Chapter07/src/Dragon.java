public class Dragon extends Monster{
    @Override
    boolean frighten(int degree) {
        System.out.println("breathe fire");
        return true;
    }
}
