package korzin.io.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BalancedBracketsTest {

    private BalancedBrackets algorithm = new BalancedBrackets();

    @Test
    public void hasBalancedBracketsTest() {

        assertTrue(algorithm.hasBalancedBrackets("([sc])s/ugf43&c[sd 1+565]()sdcsc"));
        assertTrue(algorithm.hasBalancedBrackets("((([scsccs([6576887564])354dscsdscs]sdc))sdc())"));
        assertFalse(algorithm.hasBalancedBrackets("(4356[]]()"));
        assertFalse(algorithm.hasBalancedBrackets("]["));
    }
}
