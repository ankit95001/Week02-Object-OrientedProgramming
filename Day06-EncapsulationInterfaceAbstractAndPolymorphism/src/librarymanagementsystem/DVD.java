package librarymanagementsystem;

class DVD extends LibraryItem implements Reservable {
    private static final int LOAN_DURATION = 5; // 5 days
    private boolean isReserved;
    private String borrower;

    public DVD(String itemId, String title, String author) {
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
            System.out.println("DVD reserved by: " + borrower);
        } else {
            System.out.println("DVD is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}
