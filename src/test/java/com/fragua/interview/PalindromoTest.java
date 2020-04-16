package com.fragua.interview;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PalindromoTest {
    private Palindromo palindromo;

    public PalindromoTest(){
        palindromo = new Palindromo();
    }

    @Test
    public void palindromosCortos() {
        assertTrue("Single character string",palindromo.esPalindromo("a"));
        assertTrue("Palindromo corto",palindromo.esPalindromo("aba"));
        assertTrue("Cadena numerica",palindromo.esPalindromo("111111"));
    }

    @Test
    public void noPalindromos() {
        assertFalse("Cadena simple",palindromo.esPalindromo("ab"));
        assertFalse("Cadena simple",palindromo.esPalindromo("abaa"));
        assertFalse("Cadena numerica",palindromo.esPalindromo("2111113"));
    }

}