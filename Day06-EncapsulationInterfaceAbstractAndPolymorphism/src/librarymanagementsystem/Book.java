package librarymanagementsystem;

class Book extends LibraryItem implements Reservable {
    private static final int LOAN_DURATION = 14; // 14 days
    private boolean isReserved;
    private String borrower;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return LOAN_DURATION;
    }

    @Override
    public void reserveItem(String borrower) {
        if (!isReserved) {
            this.borrower = borrower;
            isReserved = true;
            System.out.println("Book reserved by: " + borrower);
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}
