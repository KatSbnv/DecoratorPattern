package decorator;

public class MasterAuthor extends SecondAuthor {

    public MasterAuthor(Author developer) {
        super(developer);
    }

    public String writeBookReview(){
        return "Write book review as soon as possible...please. ";
    }

    @Override
    public String write() {
        return super.write() + writeBookReview();
    }
}
