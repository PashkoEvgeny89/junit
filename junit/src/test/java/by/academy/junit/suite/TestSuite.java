package by.academy.junit.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import by.academy.junit.MathTest1;
import by.academy.junit.MathTest2;

@RunWith(Suite.class)

@Suite.SuiteClasses({ MathTest1.class, MathTest2.class })
public class TestSuite {
}
