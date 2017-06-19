package decorator;

public class ToDo {
    public static void main(String[] args) {

        Author author = new AuthorTeam( new MasterAuthor( new FirstAuthor()));

        System.out.println(author.write());
    }
}
