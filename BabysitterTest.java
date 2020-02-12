package com.monktowntech.babysitter;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Map;

import static java.util.Map.entry;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class BabysitterTest {

  private static Babysitter babysitter;
  private static Map<Integer, Integer> familyAlpha;

  @BeforeAll
  static void init() {
    babysitter = new Babysitter();
    familyAlpha =
        Collections.unmodifiableMap(
            Map.ofEntries(
                entry(17, 1),
                entry(18, 2),
                entry(20, 3),
                entry(21, 4),
                entry(22, 5),
                entry(23, 6),
                entry(24, 7),
                entry(1, 8),
                entry(2, 9),
                entry(3, 10)
            )
        );

  }

  @Test
  void pays_3_from_17_to_19() {
    int payment = babysitter.getPaid(17,19, familyAlpha);
    assertEquals(3, payment);
  }

  @Test
  void pays_6_from_17_to_20() {
    int paymentTwo = babysitter.getPaid(17, 20, familyAlpha);
    assertEquals(6, paymentTwo);
  }

  @Test
  void pays_27_from_24_03() {
    fail();
  }

  @Test
  void pays_19_from_01_to_02() {
    fail();
  }

  @Test
  void pays_61_from_17_to_04() {
    fail();
  }
}

