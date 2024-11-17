package org.example.zadanie2;

import org.junit.jupiter.api.Test;

import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.*;

class LongOperationTest {

@Test
void testWithTimeout() {
    LongOperation longOperation = new LongOperation();
    int result = assertTimeout(ofSeconds(2), () -> longOperation.performLongOperation());
    assertEquals(42, result, "The result of the long operation should be 42.");
}

@Test
void testWithTimeoutPreemptively() {
    LongOperation longOperation = new LongOperation();
    assertTimeoutPreemptively(ofSeconds(2), () -> longOperation.performLongOperation());
}
}
