import apple.laf.JRSUIConstants;

public class Printer {
    private int sheetsLeft;
    private int tonerVolume;

    public Printer(int sheetsLeft, int tonerVolume) {
        this.sheetsLeft = sheetsLeft;
        this.tonerVolume = tonerVolume;
    }

    public int getSheetsLeft() {
        return this.sheetsLeft;
    }

    public int getTonerVolume() {
        return this.tonerVolume;
    }

    public int print(int pages, int copies) {
        if (this.sheetsLeft >= (pages * copies)) {
            this.sheetsLeft = this.sheetsLeft - (pages * copies);
            this.tonerVolume = this.tonerVolume - (pages * copies);
        } else {
            this.sheetsLeft;
            this.tonerVolume
        }

    }




}

//    Create a Printer class that has a property for number of sheets of paper left.
////        Add a method to print that takes in a number of pages and number of copies.
////        The print method will only run if the printer has enough paper. If it runs it will reduce the value of the paper left by number of copies * number of pages.
////        Add a toner volume property to the class.
////        Modify the printer so that it reduces the toner by 1 for each page printed.