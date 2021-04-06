/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.utils;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import org.junit.Test;

/**
 *
 * @author Daniel
 */
public class ValidationTest {
    
    public ValidationTest() {
    }
    
    /**
     * Test of validateEntries method, of class Validation.
     */
    @Test
    public void testValidateEntries() {
        System.out.println("validateEntries");
        String newEntrie = "";
        boolean expResult = false;
        boolean result = Validation.validateEntries(newEntrie);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   /**
     * Test of letters method, of class Validation.
     */
    @Test
    public void testValidateLetters() {
        System.out.println("validateLetters");
        String letters = "45563";
        boolean expResult = false;
        boolean result = Validation.letters(letters);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of letters method, of class Validation.
     */
    @Test
    public void testValidateLetters2() {
        System.out.println("validateLetters");
        String letters = "perro";
        boolean expResult = true;
        boolean result = Validation.letters(letters);
        assertEquals(expResult, result); 
    }
    
    /**
     * Test of letters method, of class Validation.
     */
    @Test
    public void testValidateLetters3() {
        System.out.println("validateLetters");
        String letters = "ANIMALES";
        boolean expResult = true;
        boolean result = Validation.letters(letters);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of letters method, of class Validation.
     */
    @Test
    public void testValidateLetters4() {
        System.out.println("validateLetters");
        String letters = "GUITIERREZ14022001";
        boolean expResult = false;
        boolean result = Validation.letters(letters);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of letters method, of class Validation.
     */
    @Test
    public void testValidateLetters5() {
        System.out.println("validateLetters");
        String letters = "ToXiC-593";
        boolean expResult = false;
        boolean result = Validation.letters(letters);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of letters method, of class Validation.
     */
    @Test
    public void testValidateLetters6() {
        System.out.println("validateLetters");
        String letters = "velocidad por tiempo";
        boolean expResult = false;
        boolean result = Validation.letters(letters);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of letters method, of class Validation.
     */
    @Test
    public void testValidateLetters7() {
        System.out.println("validateLetters");
        String letters = "minusculas con 159357";
        boolean expResult = false;
        boolean result = Validation.letters(letters);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of letters method, of class Validation.
     */
    @Test
    public void testValidateLetters8() {
        System.out.println("validateLetters");
        String letters = "velocidad * tiempo";
        boolean expResult = false;
        boolean result = Validation.letters(letters);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of letters method, of class Validation.
     */
    @Test
    public void testValidateLetters9() {
        System.out.println("validateLetters");
        String letters = "CON MAS de tres ESPACIOS";
        boolean expResult = true;
        boolean result = Validation.letters(letters);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of letters method, of class Validation.
     */
    @Test
    public void testValidateLetters10() {
        System.out.println("validateLetters");
        String letters = "CADA PASO";
        boolean expResult = true;
        boolean result = Validation.letters(letters);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of letters method, of class Validation.
     */
    @Test
    public void testValidateLetters11() {
        System.out.println("validateLetters");
        String letters = "todosevale";
        boolean expResult = true;
        boolean result = Validation.letters(letters);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of letters method, of class Validation.
     */
    @Test
    public void testValidateLetters12() {
        System.out.println("validateLetters");
        String letters = "UNPASOALAVEZ";
        boolean expResult = true;
        boolean result = Validation.letters(letters);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of letters method, of class Validation.
     */
    @Test
    public void testValidateLetters13() {
        System.out.println("validateLetters");
        String letters = "ANIMALES-SALVAJES";
        boolean expResult = false;
        boolean result = Validation.letters(letters);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of letters method, of class Validation.
     */
    @Test
    public void testValidateLetters14() {
        System.out.println("validateLetters");
        String letters = "que pas0";
        boolean expResult = false;
        boolean result = Validation.letters(letters);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of letters method, of class Validation.
     */
    @Test
    public void testValidateLetters15() {
        System.out.println("validateLetters");
        String letters = "3sc1b4m0s";
        boolean expResult = false;
        boolean result = Validation.letters(letters);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of letters method, of class Validation.
     */
    @Test
    public void testValidateLetters16() {
        System.out.println("validateLetters");
        String letters = "reconoce espacios?";
        boolean expResult = false;
        boolean result = Validation.letters(letters);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of letters method, of class Validation.
     */
    @Test
    public void testValidateLetters17() {
        System.out.println("validateLetters");
        String letters = "deberia reconocer espacios";
        boolean expResult = true;
        boolean result = Validation.letters(letters);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of letters method, of class Validation.
     */
    @Test
    public void testValidateLetters18() {
        System.out.println("validateLetters");
        String letters = " TODO ";
        boolean expResult = true;
        boolean result = Validation.letters(letters);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of letters method, of class Validation.
     */
    @Test
    public void testValidateLetters19() {
        System.out.println("validateLetters");
        String letters = "tílde";
        boolean expResult = true;
        boolean result = Validation.letters(letters);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of letters method, of class Validation.
     */
    @Test
    public void testValidateLetters20() {
        System.out.println("validateLetters");
        String letters = "ANOTHER DAY";
        boolean expResult = true;
        boolean result = Validation.letters(letters);
        assertEquals(expResult, result);
    }
    
    //******************************************************

    /**
     * Test of numbers method, of class Validation.
     */
    @Test
    public void testValidateNumbers() {
        System.out.println("validateNumbers");
        String numbers = "5938754";
        boolean expResult = true;
        boolean result = Validation.numbers(numbers);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of numbers method, of class Validation.
     */
    @Test
    public void testValidateNumbers2() {
        System.out.println("validateNumbers");
        String numbers = "593-412-789";
        boolean expResult = false;
        boolean result = Validation.numbers(numbers);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of numbers method, of class Validation.
     */
    @Test
    public void testValidateNumbers3() {
        System.out.println("validateNumbers");
        String numbers = "442 852";
        boolean expResult = true;
        boolean result = Validation.numbers(numbers);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of numbers method, of class Validation.
     */
    @Test
    public void testValidateNumbers4() {
        System.out.println("validateNumbers");
        String numbers = "Doce";
        boolean expResult = false;
        boolean result = Validation.numbers(numbers);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of numbers method, of class Validation.
     */
    @Test
    public void testValidateNumbers5() {
        System.out.println("validateNumbers");
        String numbers = "*** 10 ***";
        boolean expResult = false;
        boolean result = Validation.numbers(numbers);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of numbers method, of class Validation.
     */
    @Test
    public void testValidateNumbers6() {
        System.out.println("validateNumbers");
        String numbers = "1800 444 555";
        boolean expResult = true;
        boolean result = Validation.numbers(numbers);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of numbers method, of class Validation.
     */
    @Test
    public void testValidateNumbers7() {
        System.out.println("validateNumbers");
        String numbers = "-9000000";
        boolean expResult = true;
        boolean result = Validation.numbers(numbers);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of numbers method, of class Validation.
     */
    @Test
    public void testValidateNumbers8() {
        System.out.println("validateNumbers");
        String numbers = "-250,34";
        boolean expResult = true;
        boolean result = Validation.numbers(numbers);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of numbers method, of class Validation.
     */
    @Test
    public void testValidateNumbers9() {
        System.out.println("validateNumbers");
        String numbers = "12,52";
        boolean expResult = true;
        boolean result = Validation.numbers(numbers);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of numbers method, of class Validation.
     */
    @Test
    public void testValidateNumbers10() {
        System.out.println("validateNumbers");
        String numbers = "8000000";
        boolean expResult = true;
        boolean result = Validation.numbers(numbers);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of numbers method, of class Validation.
     */
    @Test
    public void testValidateNumbers11() {
        System.out.println("validateNumbers");
        String numbers = "200000";
        boolean expResult = true;
        boolean result = Validation.numbers(numbers);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of numbers method, of class Validation.
     */
    @Test
    public void testValidateNumbers12() {
        System.out.println("validateNumbers");
        String numbers = "12-53";
        boolean expResult = false;
        boolean result = Validation.numbers(numbers);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of numbers method, of class Validation.
     */
    @Test
    public void testValidateNumbers13() {
        System.out.println("validateNumbers");
        String numbers = "1800 200";
        boolean expResult = true;
        boolean result = Validation.numbers(numbers);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of numbers method, of class Validation.
     */
    @Test
    public void testValidateNumbers14() {
        System.out.println("validateNumbers");
        String numbers = "docientos";
        boolean expResult = false;
        boolean result = Validation.numbers(numbers);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of numbers method, of class Validation.
     */
    @Test
    public void testValidateNumbers15() {
        System.out.println("validateNumbers");
        String numbers = "8+5";
        boolean expResult = false;
        boolean result = Validation.numbers(numbers);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of numbers method, of class Validation.
     */
    @Test
    public void testValidateNumbers16() {
        System.out.println("validateNumbers");
        String numbers = "512-A";
        boolean expResult = false;
        boolean result = Validation.numbers(numbers);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of numbers method, of class Validation.
     */
    @Test
    public void testValidateNumbers17() {
        System.out.println("validateNumbers");
        String numbers = "-1";
        boolean expResult = true;
        boolean result = Validation.numbers(numbers);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of numbers method, of class Validation.
     */
    @Test
    public void testValidateNumbers18() {
        System.out.println("validateNumbers");
        String numbers = "-1.1";
        boolean expResult = true;
        boolean result = Validation.numbers(numbers);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of numbers method, of class Validation.
     */
    @Test
    public void testValidateNumbers19() {
        System.out.println("validateNumbers");
        String numbers = "100";
        boolean expResult = true;
        boolean result = Validation.numbers(numbers);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of numbers method, of class Validation.
     */
    @Test
    public void testValidateNumbers20() {
        System.out.println("validateNumbers");
        String numbers = "16";
        boolean expResult = true;
        boolean result = Validation.numbers(numbers);
        assertEquals(expResult, result);
    }
    
    //******************************************************

    
    /**
     * Test of isLong method, of class Validation.
     */
    @Test
    public void testIsLong() {
        System.out.println("isLong");
        String string = "1230000";
        boolean expResult = true;
        boolean result = Validation.isLong(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isLong method, of class Validation.
     */
    @Test
    public void testIsLong2() {
        System.out.println("isLong");
        String string = "-2000000";
        boolean expResult = true;
        boolean result = Validation.isLong(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isLong method, of class Validation.
     */
    @Test
    public void testIsLong3() {
        System.out.println("isLong");
        String string = "98215486287";
        boolean expResult = true;
        boolean result = Validation.isLong(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isLong method, of class Validation.
     */
    @Test
    public void testIsLong4() {
        System.out.println("isLong");
        String string = "999999999";
        boolean expResult = true;
        boolean result = Validation.isLong(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isLong method, of class Validation.
     */
    @Test
    public void testIsLong5() {
        System.out.println("isLong");
        String string = "84532645127.25";
        boolean expResult = false;
        boolean result = Validation.isLong(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isLong method, of class Validation.
     */
    @Test
    public void testIsLong6() {
        System.out.println("isLong");
        String string = "15321568";
        boolean expResult = true;
        boolean result = Validation.isLong(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isLong method, of class Validation.
     */
    @Test
    public void testIsLong7() {
        System.out.println("isLong");
        String string = "15987216548";
        boolean expResult = true;
        boolean result = Validation.isLong(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isLong method, of class Validation.
     */
    @Test
    public void testIsLong8() {
        System.out.println("isLong");
        String string = "-999999999";
        boolean expResult = true;
        boolean result = Validation.isLong(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isLong method, of class Validation.
     */
    @Test
    public void testIsLong9() {
        System.out.println("isLong");
        String string = "-14587856256";
        boolean expResult = true;
        boolean result = Validation.isLong(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isLong method, of class Validation.
     */
    @Test
    public void testIsLong10() {
        System.out.println("isLong");
        String string = "100000000";
        boolean expResult = true;
        boolean result = Validation.isLong(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isLong method, of class Validation.
     */
    @Test
    public void testIsLong11() {
        System.out.println("isLong");
        String string = "100001";
        boolean expResult = true;
        boolean result = Validation.isLong(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isLong method, of class Validation.
     */
    @Test
    public void testIsLong12() {
        System.out.println("isLong");
        String string = "-2000.23";
        boolean expResult = true;
        boolean result = Validation.isLong(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isLong method, of class Validation.
     */
    @Test
    public void testIsLong13() {
        System.out.println("isLong");
        String string = "777777";
        boolean expResult = true;
        boolean result = Validation.isLong(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isLong method, of class Validation.
     */
    @Test
    public void testIsLong14() {
        System.out.println("isLong");
        String string = "520";
        boolean expResult = true;
        boolean result = Validation.isLong(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isLong method, of class Validation.
     */
    @Test
    public void testIsLong15() {
        System.out.println("isLong");
        String string = "long";
        boolean expResult = false;
        boolean result = Validation.isLong(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isLong method, of class Validation.
     */
    @Test
    public void testIsLong16() {
        System.out.println("isLong");
        String string = "123456789";
        boolean expResult = true;
        boolean result = Validation.isLong(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isLong method, of class Validation.
     */
    @Test
    public void testIsLong17() {
        System.out.println("isLong");
        String string = "002";
        boolean expResult = true;
        boolean result = Validation.isLong(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isLong method, of class Validation.
     */
    @Test
    public void testIsLong18() {
        System.out.println("isLong");
        String string = "-00004";
        boolean expResult = true;
        boolean result = Validation.isLong(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isLong method, of class Validation.
     */
    @Test
    public void testIsLong19() {
        System.out.println("isLong");
        String string = "-4421";
        boolean expResult = true;
        boolean result = Validation.isLong(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isLong method, of class Validation.
     */
    @Test
    public void testIsLong20() {
        System.out.println("isLong");
        String string = "100000000";
        boolean expResult = true;
        boolean result = Validation.isLong(string);
        assertEquals(expResult, result);
    }

    //******************************************************

    
    /**
     * Test of isNumeric method, of class Validation.
     */
    @Test
    public void testIsNumeric() {
        System.out.println("isNumeric");
        String string = "0";
        boolean expResult = true;
        boolean result = Validation.isNumeric(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isNumeric method, of class Validation.
     */
    @Test
    public void testIsNumeric2() {
        System.out.println("isNumeric");
        String string = "2";
        boolean expResult = true;
        boolean result = Validation.isNumeric(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isNumeric method, of class Validation.
     */
    @Test
    public void testIsNumeric3() {
        System.out.println("isNumeric");
        String string = "a";
        boolean expResult = false;
        boolean result = Validation.isNumeric(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isNumeric method, of class Validation.
     */
    @Test
    public void testIsNumeric4() {
        System.out.println("isNumeric");
        String string = "-3";
        boolean expResult = true;
        boolean result = Validation.isNumeric(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isNumeric method, of class Validation.
     */
    @Test
    public void testIsNumeric5() {
        System.out.println("isNumeric");
        String string = "-800";
        boolean expResult = true;
        boolean result = Validation.isNumeric(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isNumeric method, of class Validation.
     */
    @Test
    public void testIsNumeric6() {
        System.out.println("isNumeric");
        String string = "*";
        boolean expResult = false;
        boolean result = Validation.isNumeric(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isNumeric method, of class Validation.
     */
    @Test
    public void testIsNumeric7() {
        System.out.println("isNumeric");
        String string = " ";
        boolean expResult = false;
        boolean result = Validation.isNumeric(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isNumeric method, of class Validation.
     */
    @Test
    public void testIsNumeric8() {
        System.out.println("isNumeric");
        String string = " 5";
        boolean expResult = true;
        boolean result = Validation.isNumeric(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isNumeric method, of class Validation.
     */
    @Test
    public void testIsNumeric9() {
        System.out.println("isNumeric");
        String string = "@";
        boolean expResult = false;
        boolean result = Validation.isNumeric(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isNumeric method, of class Validation.
     */
    @Test
    public void testIsNumeric10() {
        System.out.println("isNumeric");
        String string = ".";
        boolean expResult = false;
        boolean result = Validation.isNumeric(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isNumeric method, of class Validation.
     */
    @Test
    public void testIsNumeric11() {
        System.out.println("isNumeric");
        String string = "0120";
        boolean expResult = true;
        boolean result = Validation.isNumeric(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isNumeric method, of class Validation.
     */
    @Test
    public void testIsNumeric12() {
        System.out.println("isNumeric");
        String string = "80";
        boolean expResult = true;
        boolean result = Validation.isNumeric(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isNumeric method, of class Validation.
     */
    @Test
    public void testIsNumeric13() {
        System.out.println("isNumeric");
        String string = "AIR";
        boolean expResult = false;
        boolean result = Validation.isNumeric(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isNumeric method, of class Validation.
     */
    @Test
    public void testIsNumeric14() {
        System.out.println("isNumeric");
        String string = "-48";
        boolean expResult = true;
        boolean result = Validation.isNumeric(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isNumeric method, of class Validation.
     */
    @Test
    public void testIsNumeric15() {
        System.out.println("isNumeric");
        String string = "200";
        boolean expResult = true;
        boolean result = Validation.isNumeric(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isNumeric method, of class Validation.
     */
    @Test
    public void testIsNumeric16() {
        System.out.println("isNumeric");
        String string = "¿";
        boolean expResult = false;
        boolean result = Validation.isNumeric(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isNumeric method, of class Validation.
     */
    @Test
    public void testIsNumeric17() {
        System.out.println("isNumeric");
        String string = " number ";
        boolean expResult = false;
        boolean result = Validation.isNumeric(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isNumeric method, of class Validation.
     */
    @Test
    public void testIsNumeric18() {
        System.out.println("isNumeric");
        String string = "00002.2";
        boolean expResult = false;
        boolean result = Validation.isNumeric(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isNumeric method, of class Validation.
     */
    @Test
    public void testIsNumeric19() {
        System.out.println("isNumeric");
        String string = "=";
        boolean expResult = false;
        boolean result = Validation.isNumeric(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isNumeric method, of class Validation.
     */
    @Test
    public void testIsNumeric20() {
        System.out.println("isNumeric");
        String string = "+";
        boolean expResult = false;
        boolean result = Validation.isNumeric(string);
        assertEquals(expResult, result);
    }
    
    //******************************************************

    
    /**
     * Test of isFloat method, of class Validation.
     */
    @Test
    public void testIsFloat() {
        System.out.println("isFloat");
        String string = "a2.b";
        boolean expResult = false;
        boolean result = Validation.isFloat(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isFloat method, of class Validation.
     */
    @Test
    public void testIsFloat2() {
        System.out.println("isFloat");
        String string = "12.5";
        boolean expResult = true;
        boolean result = Validation.isFloat(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isFloat method, of class Validation.
     */
    @Test
    public void testIsFloat3() {
        System.out.println("isFloat");
        String string = "20036.35";
        boolean expResult = true;
        boolean result = Validation.isFloat(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isFloat method, of class Validation.
     */
    @Test
    public void testIsFloat4() {
        System.out.println("isFloat");
        String string = "-1.3";
        boolean expResult = true;
        boolean result = Validation.isFloat(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isFloat method, of class Validation.
     */
    @Test
    public void testIsFloat5() {
        System.out.println("isFloat");
        String string = "-845.23";
        boolean expResult = true;
        boolean result = Validation.isFloat(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isFloat method, of class Validation.
     */
    @Test
    public void testIsFloat6() {
        System.out.println("isFloat");
        String string = "-0.005";
        boolean expResult = true;
        boolean result = Validation.isFloat(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isFloat method, of class Validation.
     */
    @Test
    public void testIsFloat7() {
        System.out.println("isFloat");
        String string = "0.00002";
        boolean expResult = true;
        boolean result = Validation.isFloat(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isFloat method, of class Validation.
     */
    @Test
    public void testIsFloat8() {
        System.out.println("isFloat");
        String string = "45a.2";
        boolean expResult = false;
        boolean result = Validation.isFloat(string);
        assertEquals(expResult, result);
    }
    /**
     * Test of isFloat method, of class Validation.
     */
    @Test
    public void testIsFloat9() {
        System.out.println("isFloat");
        String string = "0.00";
        boolean expResult = true;
        boolean result = Validation.isFloat(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isFloat method, of class Validation.
     */
    @Test
    public void testIsFloat10() {
        System.out.println("isFloat");
        String string = "-0.00";
        boolean expResult = true;
        boolean result = Validation.isFloat(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isFloat method, of class Validation.
     */
    @Test
    public void testIsFloat11() {
        System.out.println("isFloat");
        String string = "48.5x";
        boolean expResult = false;
        boolean result = Validation.isFloat(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isFloat method, of class Validation.
     */
    @Test
    public void testIsFloat12() {
        System.out.println("isFloat");
        String string = "16.16";
        boolean expResult = true;
        boolean result = Validation.isFloat(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isFloat method, of class Validation.
     */
    @Test
    public void testIsFloat13() {
        System.out.println("isFloat");
        String string = "2021.1";
        boolean expResult = true;
        boolean result = Validation.isFloat(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isFloat method, of class Validation.
     */
    @Test
    public void testIsFloat14() {
        System.out.println("isFloat");
        String string = "-41.73";
        boolean expResult = true;
        boolean result = Validation.isFloat(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isFloat method, of class Validation.
     */
    @Test
    public void testIsFloat15() {
        System.out.println("isFloat");
        String string = "-0.3";
        boolean expResult = true;
        boolean result = Validation.isFloat(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isFloat method, of class Validation.
     */
    @Test
    public void testIsFloat16() {
        System.out.println("isFloat");
        String string = "900.9";
        boolean expResult = true;
        boolean result = Validation.isFloat(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isFloat method, of class Validation.
     */
    @Test
    public void testIsFloat17() {
        System.out.println("isFloat");
        String string = "-10101.1";
        boolean expResult = true;
        boolean result = Validation.isFloat(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isFloat method, of class Validation.
     */
    @Test
    public void testIsFloat18() {
        System.out.println("isFloat");
        String string = "4862'25''";
        boolean expResult = false;
        boolean result = Validation.isFloat(string);
        assertEquals(expResult, result);
    }
    /**
     * Test of isFloat method, of class Validation.
     */
    @Test
    public void testIsFloat19() {
        System.out.println("isFloat");
        String string = "20.3F";
        boolean expResult = true;
        boolean result = Validation.isFloat(string);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isFloat method, of class Validation.
     */
    @Test
    public void testIsFloat1020() {
        System.out.println("isFloat");
        String string = "x=12.5";
        boolean expResult = true;
        boolean result = Validation.isFloat(string);
        assertEquals(expResult, result);
    }

    
}
