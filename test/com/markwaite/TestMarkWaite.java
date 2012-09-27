package com.markwaite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

import com.markwaite.MarkWaite;


public class TestMarkWaite {
    private MarkWaite me;

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("com.markwaite.TestMarkWaite");
    }

    @Before
    public void initialize() {
        me = new MarkWaite();
    }

    @Test
    public void getNameMarkWaite() {
        assertEquals("Wrong name", "Mark Waite", me.getName());
    }

    @Test
    public void getNameStartsWithMark() {
        assertTrue("Wrong name: '" + me.getName() + "'", me.getName().startsWith("Mark"));
    }

    @Test
    public void getFormName() {
        assertEquals("Wrong name", "Mark's form", me.getFormName());
    }

    @Test
    public void getBlogURL() {
        assertEquals("Wrong blog URL", "http://markwaite.blogspot.com/", me.getBlogURL());
    }
}
