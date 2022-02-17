package com.distinctString;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

        public class DistinctStringTestClass {

        //       test cases :
        List<String> stringList = new ArrayList<>(Arrays.asList("java", "scala", "java", "sbt", "uiux"));
        List<String> stringList2 = new ArrayList<>(Arrays.asList("red", "yellow", "green", "blue", "pink", "voilet","purple","ab","a"));

        @Test
        public void mustReturnDistinctString(){
            List<String> expected1 = Arrays.asList("sbt","java","scala");
            List<String> expected2 = Arrays.asList("blue","yellow","green","blue");

            List<String> distinctList1= DistinctStringApplicationClass.getDistinctStrings(stringList);
            List<String> distinctList2= DistinctStringApplicationClass.getDistinctStrings(stringList2);

            Assert.assertEquals(expected1,distinctList1);
            Assert.assertEquals(expected2,distinctList2);
        }
    }