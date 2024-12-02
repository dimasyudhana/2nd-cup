public class Magazine {
    
    private String title;
    private String publisher;
    private int issueNumber;
    private int publicationYear;


    public Magazine(String title, String publisher, int issueNumber, int publicationYear) {
        setTitle(title);
        setPublisher(publisher);
        setIssueNumber(issueNumber);
        setPublicationYear(publicationYear);
    }
    
    public Magazine(Magazine src) {
        setTitle(src.getTitle());
        setPublisher(src.getPublisher());
        setIssueNumber(src.getIssueNumber());
        setPublicationYear(src.getPublicationYear());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        checkString("Title",title);
        this.title = title;
    }
    
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        checkString("Publisher",title);
        this.publisher = publisher;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        checkNumber("Issue number", issueNumber);
        this.issueNumber = issueNumber;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        checkNumber("Publication Year", publicationYear);
        this.publicationYear = publicationYear;
    }

    private void checkString(String field, String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(field + " tidak boleh kosong");
        }
    }

    private void checkNumber(String field, int value) {
        if (value <= 0) {
            throw new IllegalArgumentException(field + " tidak boleh kurang dari 0");
        }
    }

}
