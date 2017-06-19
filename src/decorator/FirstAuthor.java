package decorator;


public class FirstAuthor implements Author {
    @Override
    public String write() {
        return "Write new book. ";
    }
}
