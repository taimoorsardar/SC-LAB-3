/* Copyright (c) 2007-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package rules;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * JUnit tests for RulesOf6005.
 */
public class RulesOf6005Test {
    
    /**
     * Tests the mayUseCodeInAssignment method.
     */
    @Test
    public void testMayUseCodeInAssignment() {
        assertFalse("Expected false: un-cited publicly-available code",
                RulesOf6005.mayUseCodeInAssignment(false, true, false, false, false));
        assertTrue("Expected true: self-written required code",
                RulesOf6005.mayUseCodeInAssignment(true, false, true, true, true));
    }
    /**
     * Tests using code available to others with proper citation.
     */
    @Test
    public void testMayUseCodeWithProperCitation() {
        assertTrue("Expected true: code available to others with proper citation",
                RulesOf6005.mayUseCodeInAssignment(false, true, true, true, false));
    }

    /**
     * Tests using code available to others without proper citation.
     */
    @Test
    public void testMayNotUseCodeWithoutProperCitation() {
        assertFalse("Expected false: code available to others without proper citation",
                RulesOf6005.mayUseCodeInAssignment(false, true, true, false, false));
    }
}
