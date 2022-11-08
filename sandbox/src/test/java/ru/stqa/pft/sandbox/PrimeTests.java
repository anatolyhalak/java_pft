package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeTests {

  @Test
  public void testPrime() {
    Assert.assertTrue(Primes.isPrime(Integer.MAX_VALUE));
  }
  @Test
  public void testNonPrime() {
    Assert.assertFalse(Primes.isPrime(Integer.MAX_VALUE - 2));
  }
}
