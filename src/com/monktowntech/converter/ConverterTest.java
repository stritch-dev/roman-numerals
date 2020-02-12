package com.monktowntech.converter;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Map;

import static java.util.Map.entry;
import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {
  /**
   * Test Cases
   * Number  Numeral
   *  1       I
   *  3       III
   *  9       IX
   *  1066    MLXVI
   *  1989    MCMLXXXIX
   */
  private static Converter converter;

  /*
  @BeforeAll
  static void init() {
  }
  */

  @Test
  void convert_1_to_I(){
    String result = Converter.convert("1");
    assertEquals("I", result);
  }


  @Test
  void convert_3_to_III(){
    fail();
  }

  @Test
  void convert_9_to_IX(){
    fail();
  }

  @Test
  void convert_1066_to_MLXVI(){
    fail();
  }

  @Test
  void convert_1989_to_MCMLXXXIX(){
    fail();
  }
}
