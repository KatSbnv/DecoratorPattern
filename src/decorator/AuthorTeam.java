package decorator;


public class AuthorTeam extends SecondAuthor {
    public AuthorTeam(Author author) {
        super(author);
    }
    public String sendNewCopy(){
        return "Send a lot of new copies of the book! ";

    }

    @Override
    public String write() {
        return super.write() + sendNewCopy();
    }
}
