package com.codecool;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhraseReverseTest {

    //  reverse()
    @Test
    void testReverseHandlesInvalidInput() {
        assertNull(null, PhraseReverse.reverse(null));
    }

    @Test
    void testReverseHandlesLeastValidInput() {
        assertEquals("321", PhraseReverse.reverse("123"));
        assertEquals("o00i", PhraseReverse.reverse("i00o"));
        assertEquals("&&@~", PhraseReverse.reverse("~@&&"));
        assertEquals("&&@~o00i", PhraseReverse.reverse("i00o~@&&"));
        assertEquals("&&@~o00i", PhraseReverse.reverse("i00o~@&&"));
        assertEquals("lol l 2 @ ", PhraseReverse.reverse("@ 2 l lol"));
    }

    //  reverseWords()
    @Test
    void testReverseWordsHandlesInvalidInput() {
        assertNull(null, PhraseReverse.reverseWords(null));
    }

    @Test
    void testReverseWordsHandlesLeastValidInput() {
        assertEquals("321", PhraseReverse.reverseWords("123"));
        assertEquals("o00i 321 AAs", PhraseReverse.reverseWords("sAA 123 i00o"));
        assertEquals("&&@~ &&@~ &&!!", PhraseReverse.reverseWords("!!&& ~@&& i00o"));
        assertEquals("&&@~o00i", PhraseReverse.reverseWords("i00o~@&&"));
        assertEquals("lol l 2 @ ", PhraseReverse.reverseWords("@ 2 l lol"));
        assertEquals("   word    another  word", PhraseReverse.reverseWords("drow rehtona drow"));

    }

    // reverseWordOrder()
    @Test
    void testReverseWordOrderHandlesInvalidInput() {assertNull(null, PhraseReverse.reverseWords(null));}

    @Test
    void testReverseWordOrderHandlesLeastValidInput() {
        assertEquals("words", PhraseReverse.reverseWordOrder("words"));
        assertEquals("words words", PhraseReverse.reverseWordOrder("words words"));
        assertEquals("          haha so    many    spaces  ", PhraseReverse.reverseWordOrder("spaces many so haha word"));
        assertEquals("552 35 numbers LOL", PhraseReverse.reverseWordOrder("LOL numbers 35 255"));
    }

    //reverseN()
    @Test
    void testReverseNHandlesInvalidInput() {assertNull(null, PhraseReverse.reverseN(null, 22));}

    @Test
    void testReverseNInputBiggerThanWordLengthThrowsException() {
        assertThrows(IndexOutOfBoundsException.class,() -> PhraseReverse.reverseN("one", 5));
    }

    @Test
    void testReverseNNegativeInputThrowsException() {
        assertThrows(IndexOutOfBoundsException.class,() -> PhraseReverse.reverseN("one", -55555));
    }

    @Test
    void testReverseNHandlesLeastValidInput() {
        assertEquals("", PhraseReverse.reverseN("sajt", 0));
        assertEquals("lfiki", PhraseReverse.reverseN("kifli", 4));
        assertEquals("pzsészek", PhraseReverse.reverseN("  szpészek  ", 3));
        assertEquals("s^ˇ@&!peckó  _ karik", PhraseReverse.reverseN("!&@ˇ^speckó  _ karik", 6));
    }

}