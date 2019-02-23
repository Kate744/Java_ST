package sfwtesting.autojava;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimesTest {

    @Test
    public  void  testPrimes () {
        Assert.assertTrue(Primes.isPrimeFast(Integer.MAX_VALUE));

    }
    @Test
    public  void  testNonePrimes () {
        Assert.assertFalse(Primes.isPrime(Integer.MAX_VALUE - 2));

    }
    @Test (enabled = false)
    public  void  testPrimesLong () {
        long n = Integer.MAX_VALUE;
        Assert.assertTrue(Primes.isPrime(n));

    }
}
