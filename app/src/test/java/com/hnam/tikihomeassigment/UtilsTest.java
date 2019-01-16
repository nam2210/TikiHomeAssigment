package com.hnam.tikihomeassigment;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by nampham on 1/16/19.
 */
@RunWith(JUnit4.class)
public class UtilsTest {

    @Test
    public void keywordHasOneWorkCorrect() {
        String result = Utils.formatData("abc");
        Assert.assertEquals("abc", result);
    }

    @Test
    public void keywordHasTwoWork() {
        String result = Utils.formatData("abc abc");
        System.out.println(result);
        System.out.println("++++++++");
    }

    @Test
    public void keywordHas3Work() {
        String result = Utils.formatData("abc abc abc");
        System.out.println(result);
        System.out.println("++++++++");
    }

    @Test
    public void keywordHas4Work() {
        String result = Utils.formatData("abc abc abc abc");
        System.out.println(result);
        System.out.println("++++++++");
    }


    @Test
    public void keywordHas5Work() {
        String result = Utils.formatData("abc abc abc abc");
        System.out.println(result);
        System.out.println("++++++++");
    }
}