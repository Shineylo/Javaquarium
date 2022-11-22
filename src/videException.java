public class videException extends RuntimeException {
    public videException(String nom){
        super("Aucune instance de " + nom);
    }
}
