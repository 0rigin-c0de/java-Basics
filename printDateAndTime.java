import java.time.LocalDateTime;
class CurrentDateTime{
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        System.out.println("Current DateTime :- " + current);
    }
}