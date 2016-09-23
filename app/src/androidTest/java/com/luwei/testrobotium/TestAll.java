package com.luwei.testrobotium;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Created by luwei on 16-9-23.
 */

public class TestAll {
    public static Test testAll() {
        TestSuite testSuite = new TestSuite();
        testSuite.addTestSuite(ApplicationTest.class);
        return testSuite;
    }
}
