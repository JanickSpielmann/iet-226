import org.example.Konto;
import org.example.Kunde;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KontoTest {
    Kunde kunde1;
    Konto konto1;


    @BeforeEach
    public void setUp(){
    kunde1 = new Kunde("name", "vorname", 1);
    konto1 = new Konto(1000,0.01,kunde1);
    }


    @Test
    public void TestEinzahlen(){

        assertEquals(1000,konto1.getSaldo());
        konto1.einzahlen(100);
        assertEquals(1100,konto1.getSaldo());
        konto1.einzahlen(2);
        assertEquals(1102,konto1.getSaldo());
    }
    @Test
    public void TestVerzinsen() {

        konto1.verzinsen(365);
        assertEquals(1010, konto1.getSaldo());
        konto1.verzinsen(3650);
        assertEquals(1111, konto1.getSaldo());

    }
}
