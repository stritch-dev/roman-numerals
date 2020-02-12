package com.monktowntech.babysitter;

import java.util.HashMap;
import java.util.Map;

public class Babysitter {
  public int getPaid(int startHour, int endHour, Map<Integer, Integer> family) {
    int result = 0;
    for(int i = startHour; i < endHour; i++){
      int familyValue  =  family.get(i);
      result += familyValue;
    }
    return result;
  }
}
