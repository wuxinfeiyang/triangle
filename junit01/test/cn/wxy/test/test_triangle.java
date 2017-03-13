package cn.wxy.test;

import static org.junit.Assert.*;

import org.junit.Test;

import cn.wxy.triangle.Triangle;

public class test_triangle {
	Triangle t;
	@Test 
	public void test(){
		t = new Triangle();
		assertEquals(1, t.classify(6, 6, 6));
	    assertEquals(2, t.classify(5, 5, 6));
	    assertEquals(3, t.classify(5, 4, 3));
	    assertEquals(0, t.classify(4, 5, 9));
	}
}


