import org.apache.commons.math3.distribution.NormalDistribution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class COVIDLibTest {
    COVIDLib covidLib;
    NormalDistribution normalDistribution;

    @BeforeEach
    void setUp() {
        normalDistribution = new NormalDistribution(15, 7);
        covidLib = new COVIDLib();
    }

    @Test
    void covidChanceEnMoyenne() {
        long expected = Math.round(0.12654895447355774);

        long result = Math.round(covidLib.covidChanceEnMoyenne(normalDistribution, 7));

        Assertions.assertEquals(expected, result);
    }

    @Test
    void covidChanceDurree() {
        long expected = Math.round(0.6826894921370861);

        long result = Math.round(covidLib.covidChanceDurree(normalDistribution, 8, 22));

        Assertions.assertEquals(expected, result);
    }
}