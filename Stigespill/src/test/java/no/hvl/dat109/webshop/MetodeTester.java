package no.hvl.dat109.webshop;



import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import no.hvl.dat109.webshop.Rute;
import no.hvl.dat109.webshop.RuteRepo;
import no.hvl.dat109.webshop.RuteService;
import no.hvl.dat109.webshop.Spiller;
import no.hvl.dat109.webshop.TerningKaster;





@ExtendWith(MockitoExtension.class)
class SpillTest {


    @Mock
    RuteRepo mockedruterepo;


    @InjectMocks
    RuteService mockedruteservice;



    private Rute rute1= new Rute(1);
    private Rute rute2= new Rute(2);
    private Rute rute3= new Rute(3);
    private Rute rute4= new Rute(4);
    private Rute rute5= new Rute(5);


    @BeforeEach
    void reset() {
        mockedruterepo.save(rute1);
        mockedruterepo.save(rute2);
        mockedruterepo.save(rute3);
        mockedruterepo.save(rute4);
        mockedruterepo.save(rute5);
    }


    @Test
    void testFinnByRutenummer() {

        when(mockedruterepo.findByRutenummer(1)).thenReturn(new Rute(1));
        Rute resultat = mockedruteservice.finnRutbyNummer(1);
        assertTrue(resultat.getRutenummer()==1);
    }
TerningKaster terningKaster = new TerningKaster();
    @Test
    void terningTest() {
        boolean erRiktig=true;
        int terningen=0;
        for(int i = 0; i<1000; i++) {
            terningen = terningKaster.kastTerning();
            if(terningen<1||terningen>6) {
                erRiktig=false;
            }
        }
        assertTrue(erRiktig);
    }
    Spiller testspiller = new Spiller("tom");


    @Test
    void spillerNavnTest() {
    	assertTrue(testspiller.getNavn().equals("tom"));
    }
    @Test
    void terningKastSekserTest() {
        for(int i=0;i<1000;i++) {
            testspiller.Spilltrekk();
            }
        assertTrue(testspiller.getTerningen().getAntSeksere() >= 3);
        }
    }

