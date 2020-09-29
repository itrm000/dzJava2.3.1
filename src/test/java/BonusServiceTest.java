import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void calculate() {
        BonusService service = new BonusService(); /* создали объект на базе class BonusService */

        long amount = 100060;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
   }

    @org.junit.jupiter.api.Test
    void shouldCalculateNotRagisteredAndUnderLimit(){

        BonusService service = new BonusService(); /* создали объект на базе class BonusService */

        long amount = 100060;
        boolean registered = false;
        long expected = 10;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void shouldCalculateNotRagisteredAndLessLimit(){

        BonusService service = new BonusService();

        long amount = 1900;
        boolean registered = false;
        long expected = 0;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void shouldCalculateRagisteredAndBiggerLimit(){

        BonusService service = new BonusService();

        long amount = 2000000;
        boolean registered = true;
        long expected = 500;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void shouldCalculateNotRagisteredAndBiggerLimit(){

        BonusService service = new BonusService();

        long amount = 6000000;
        boolean registered = false;
        long expected = 500;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }

}