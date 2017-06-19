package decorator;

public class SecondAuthor implements Author {

    Author author;


    public SecondAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String write() {
        return author.write();
    }
}
