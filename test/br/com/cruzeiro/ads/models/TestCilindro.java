package br.com.cruzeiro.ads.models;



import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCilindro {

    @Test
    public void test() {
        assertEquals(new Cilindro(5, 5).calculoVolume(), 392.7, 0);
    }
}
