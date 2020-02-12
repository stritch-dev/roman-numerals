package com.monktowntech.converter;

import org.junit.jupiter.api.Test;
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
    String result = Converter.convert(1);
    assertEquals("I", result);
  }

  @Test
  void convert_3_to_III(){
    String result = Converter.convert(3);
    assertEquals("III", result);
  }

  @Test
  void convert_4_to_IV(){
    String result = Converter.convert(4);
    assertEquals("IV", result);

  }
  @Test
  void convert_5_to_V(){
    String result = Converter.convert(5);
    assertEquals("V", result);
  }

  @Test
  void convert_9_to_IX(){
    String result = Converter.convert(9);
    assertEquals("IX", result);
  }

  @Test
  void convert_1066_to_MLXVI(){
    String result = Converter.convert(1066);
    assertEquals("MLXVI", result);
  }

  @Test
  void convert_1989_to_MCMLXXXIX() {
    String result = Converter.convert(1989);
    assertEquals("MCMLXXXIX", result);
  }
}
