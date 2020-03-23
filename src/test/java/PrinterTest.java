import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(50, 200);
    }

    @Test
    public void getSheetsLeft() {
        assertEquals(50, printer.getSheetsLeft());
    }

    @Test
    public void getTonerVolume() {
        assertEquals(200, printer.getTonerVolume());
    }

    @Test
    public void printWithEnough() {
        assertEquals(46, printer.print(2,2));
    }

    @Test
    public void printWithNotEnough() {
        Printer scarcePrinter = new Printer(10, 500);
        assertEquals(scarcePrinter.sheetsLeft(), 10);
        assertEquals(scarcePrinter.tonerVolume(), 500);

    }
}


