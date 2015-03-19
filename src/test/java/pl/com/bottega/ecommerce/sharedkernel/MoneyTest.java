/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.bottega.ecommerce.sharedkernel;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Godzio
 */
public class MoneyTest {

    private final Money first = new Money(20.00, "USD");
    private final Money second = new Money(20.00, "USD");
    private final Money third = new Money(10.00, "USD");
    private final Money fourth = new Money(20.00, "PLN");
    private final Money fifth = new Money(10.00, "PLN");

    @Test
    public void money_equals_twoElementsWithBothValuesDifferent_expectedFalse() {
        assertFalse(first.equals(fifth));
    }

    @Test
    public void money_equals_twoElementsWithDifferentValue_expectedFalse() {
        assertFalse(first.equals(third));
    }

    @Test
    public void money_equals_twoElementsWithDifferentCurrency_expectedFalse() {
        assertFalse(first.equals(fourth));
    }

    @Test
    public void money_equals_twoIdenticalElements_expectedTrue() {
        assertTrue(first.equals(second));
    }

}