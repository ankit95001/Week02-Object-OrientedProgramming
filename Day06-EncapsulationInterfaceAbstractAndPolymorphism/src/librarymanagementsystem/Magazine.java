package librarymanagementsystem;

class Magazine extends LibraryItem {
    private static final int LOAN_DURATION = 7; // 7 days

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return LOAN_DURATION;
    }
}