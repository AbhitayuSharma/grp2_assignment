package com;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class CheckLargestNumberTest {
	 @Test
     public void evaluatesExpression() {
        CheckLargestNumber ck = new CheckLargestNumber();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<1000;i++) {
        	list.add(i);
        }
        int ans = ck.checkLargest(list);
        assertEquals(999, ans);
        for(int i=5000;i<6000;i++) {
        	list.add(i);
        }
        int ans2 = ck.checkLargest(list);
        assertEquals(5999, ans2);
     }
}
