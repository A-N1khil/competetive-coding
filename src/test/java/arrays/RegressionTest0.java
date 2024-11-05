package arrays;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        java.lang.Class<?> wildcardClass1 = binarySearch0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        int[] intArray5 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int7 = binarySearch0.binarySearch(intArray5, (int) (byte) 10);
        int[] intArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = binarySearch0.binarySearch(intArray8, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        int[] intArray6 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int8 = binarySearch1.binarySearch(intArray6, (int) (byte) 10);
        int int10 = binarySearch0.binarySearch(intArray6, 1);
        java.lang.Class<?> wildcardClass11 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        int[] intArray5 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int7 = binarySearch0.binarySearch(intArray5, (int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = binarySearch0.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch2 = new arrays.BinarySearch();
        int[] intArray7 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int9 = binarySearch2.binarySearch(intArray7, (int) (byte) 10);
        int int11 = binarySearch1.binarySearch(intArray7, 1);
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch13 = new arrays.BinarySearch();
        int[] intArray18 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int20 = binarySearch13.binarySearch(intArray18, (int) (byte) 10);
        int int22 = binarySearch12.binarySearch(intArray18, 1);
        int int24 = binarySearch1.binarySearch(intArray18, 10);
        int int26 = binarySearch0.binarySearch(intArray18, 0);
        java.lang.Class<?> wildcardClass27 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch2 = new arrays.BinarySearch();
        int[] intArray7 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int9 = binarySearch2.binarySearch(intArray7, (int) (byte) 10);
        int int11 = binarySearch1.binarySearch(intArray7, 1);
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch13 = new arrays.BinarySearch();
        int[] intArray18 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int20 = binarySearch13.binarySearch(intArray18, (int) (byte) 10);
        int int22 = binarySearch12.binarySearch(intArray18, 1);
        int int24 = binarySearch1.binarySearch(intArray18, 10);
        int int26 = binarySearch0.binarySearch(intArray18, 0);
        java.lang.Class<?> wildcardClass27 = binarySearch0.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        int[] intArray6 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int8 = binarySearch1.binarySearch(intArray6, (int) (byte) 10);
        int int10 = binarySearch0.binarySearch(intArray6, 1);
        java.lang.Class<?> wildcardClass11 = binarySearch0.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        int[] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = binarySearch0.binarySearch(intArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        int[] intArray6 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int8 = binarySearch1.binarySearch(intArray6, (int) (byte) 10);
        int int10 = binarySearch0.binarySearch(intArray6, 1);
        arrays.BinarySearch binarySearch11 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        int[] intArray17 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int19 = binarySearch12.binarySearch(intArray17, (int) (byte) 10);
        int int21 = binarySearch11.binarySearch(intArray17, 1);
        int int23 = binarySearch0.binarySearch(intArray17, 10);
        java.lang.Class<?> wildcardClass24 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch2 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch3 = new arrays.BinarySearch();
        int[] intArray8 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int10 = binarySearch3.binarySearch(intArray8, (int) (byte) 10);
        int int12 = binarySearch2.binarySearch(intArray8, 1);
        arrays.BinarySearch binarySearch13 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch14 = new arrays.BinarySearch();
        int[] intArray19 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int21 = binarySearch14.binarySearch(intArray19, (int) (byte) 10);
        int int23 = binarySearch13.binarySearch(intArray19, 1);
        int int25 = binarySearch2.binarySearch(intArray19, 10);
        int int27 = binarySearch1.binarySearch(intArray19, 0);
        int int29 = binarySearch0.binarySearch(intArray19, 1);
        java.lang.Class<?> wildcardClass30 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        int[] intArray6 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int8 = binarySearch1.binarySearch(intArray6, (int) (byte) 10);
        int int10 = binarySearch0.binarySearch(intArray6, 1);
        arrays.BinarySearch binarySearch11 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        int[] intArray17 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int19 = binarySearch12.binarySearch(intArray17, (int) (byte) 10);
        int int21 = binarySearch11.binarySearch(intArray17, 1);
        int int23 = binarySearch0.binarySearch(intArray17, 10);
        arrays.BinarySearch binarySearch24 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch25 = new arrays.BinarySearch();
        int[] intArray30 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int32 = binarySearch25.binarySearch(intArray30, (int) (byte) 10);
        int int34 = binarySearch24.binarySearch(intArray30, 1);
        int int36 = binarySearch0.binarySearch(intArray30, 10);
        arrays.BinarySearch binarySearch37 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch38 = new arrays.BinarySearch();
        int[] intArray43 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int45 = binarySearch38.binarySearch(intArray43, (int) (byte) 10);
        int int47 = binarySearch37.binarySearch(intArray43, 1);
        int int49 = binarySearch0.binarySearch(intArray43, (int) (byte) 10);
        int[] intArray52 = new int[] { ' ', 100 };
        int int54 = binarySearch0.binarySearch(intArray52, 1);
        arrays.BinarySearch binarySearch55 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch56 = new arrays.BinarySearch();
        int[] intArray61 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int63 = binarySearch56.binarySearch(intArray61, (int) (byte) 10);
        int int65 = binarySearch55.binarySearch(intArray61, 1);
        arrays.BinarySearch binarySearch66 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch67 = new arrays.BinarySearch();
        int[] intArray72 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int74 = binarySearch67.binarySearch(intArray72, (int) (byte) 10);
        int int76 = binarySearch66.binarySearch(intArray72, 1);
        int int78 = binarySearch55.binarySearch(intArray72, 10);
        arrays.BinarySearch binarySearch79 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch80 = new arrays.BinarySearch();
        int[] intArray85 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int87 = binarySearch80.binarySearch(intArray85, (int) (byte) 10);
        int int89 = binarySearch79.binarySearch(intArray85, 1);
        int int91 = binarySearch55.binarySearch(intArray85, 10);
        int int93 = binarySearch0.binarySearch(intArray85, 0);
        java.lang.Class<?> wildcardClass94 = binarySearch0.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { 32, 100 });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertArrayEquals(intArray72, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertArrayEquals(intArray85, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch2 = new arrays.BinarySearch();
        int[] intArray7 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int9 = binarySearch2.binarySearch(intArray7, (int) (byte) 10);
        int int11 = binarySearch1.binarySearch(intArray7, 1);
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch13 = new arrays.BinarySearch();
        int[] intArray18 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int20 = binarySearch13.binarySearch(intArray18, (int) (byte) 10);
        int int22 = binarySearch12.binarySearch(intArray18, 1);
        int int24 = binarySearch1.binarySearch(intArray18, 10);
        int int26 = binarySearch0.binarySearch(intArray18, 0);
        arrays.BinarySearch binarySearch27 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch28 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch29 = new arrays.BinarySearch();
        int[] intArray34 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int36 = binarySearch29.binarySearch(intArray34, (int) (byte) 10);
        int int38 = binarySearch28.binarySearch(intArray34, 1);
        arrays.BinarySearch binarySearch39 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch40 = new arrays.BinarySearch();
        int[] intArray45 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int47 = binarySearch40.binarySearch(intArray45, (int) (byte) 10);
        int int49 = binarySearch39.binarySearch(intArray45, 1);
        int int51 = binarySearch28.binarySearch(intArray45, 10);
        int int53 = binarySearch27.binarySearch(intArray45, 0);
        arrays.BinarySearch binarySearch54 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch55 = new arrays.BinarySearch();
        int[] intArray60 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int62 = binarySearch55.binarySearch(intArray60, (int) (byte) 10);
        int int64 = binarySearch54.binarySearch(intArray60, 1);
        arrays.BinarySearch binarySearch65 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch66 = new arrays.BinarySearch();
        int[] intArray71 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int73 = binarySearch66.binarySearch(intArray71, (int) (byte) 10);
        int int75 = binarySearch65.binarySearch(intArray71, 1);
        int int77 = binarySearch54.binarySearch(intArray71, 10);
        arrays.BinarySearch binarySearch78 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch79 = new arrays.BinarySearch();
        int[] intArray84 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int86 = binarySearch79.binarySearch(intArray84, (int) (byte) 10);
        int int88 = binarySearch78.binarySearch(intArray84, 1);
        int int90 = binarySearch54.binarySearch(intArray84, 10);
        int int92 = binarySearch27.binarySearch(intArray84, (int) (short) -1);
        int int94 = binarySearch0.binarySearch(intArray84, (int) (byte) 1);
        java.lang.Class<?> wildcardClass95 = intArray84.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertArrayEquals(intArray84, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        int[] intArray6 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int8 = binarySearch1.binarySearch(intArray6, (int) (byte) 10);
        int int10 = binarySearch0.binarySearch(intArray6, 1);
        arrays.BinarySearch binarySearch11 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        int[] intArray17 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int19 = binarySearch12.binarySearch(intArray17, (int) (byte) 10);
        int int21 = binarySearch11.binarySearch(intArray17, 1);
        int int23 = binarySearch0.binarySearch(intArray17, 10);
        arrays.BinarySearch binarySearch24 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch25 = new arrays.BinarySearch();
        int[] intArray30 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int32 = binarySearch25.binarySearch(intArray30, (int) (byte) 10);
        int int34 = binarySearch24.binarySearch(intArray30, 1);
        int int36 = binarySearch0.binarySearch(intArray30, 10);
        arrays.BinarySearch binarySearch37 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch38 = new arrays.BinarySearch();
        int[] intArray43 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int45 = binarySearch38.binarySearch(intArray43, (int) (byte) 10);
        int int47 = binarySearch37.binarySearch(intArray43, 1);
        int int49 = binarySearch0.binarySearch(intArray43, (int) (byte) 10);
        int[] intArray52 = new int[] { ' ', 100 };
        int int54 = binarySearch0.binarySearch(intArray52, 1);
        arrays.BinarySearch binarySearch55 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch56 = new arrays.BinarySearch();
        int[] intArray61 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int63 = binarySearch56.binarySearch(intArray61, (int) (byte) 10);
        int int65 = binarySearch55.binarySearch(intArray61, 1);
        arrays.BinarySearch binarySearch66 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch67 = new arrays.BinarySearch();
        int[] intArray72 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int74 = binarySearch67.binarySearch(intArray72, (int) (byte) 10);
        int int76 = binarySearch66.binarySearch(intArray72, 1);
        int int78 = binarySearch55.binarySearch(intArray72, 10);
        arrays.BinarySearch binarySearch79 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch80 = new arrays.BinarySearch();
        int[] intArray85 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int87 = binarySearch80.binarySearch(intArray85, (int) (byte) 10);
        int int89 = binarySearch79.binarySearch(intArray85, 1);
        int int91 = binarySearch55.binarySearch(intArray85, 10);
        int int93 = binarySearch0.binarySearch(intArray85, 0);
        java.lang.Class<?> wildcardClass94 = intArray85.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { 32, 100 });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertArrayEquals(intArray72, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertArrayEquals(intArray85, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch2 = new arrays.BinarySearch();
        int[] intArray7 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int9 = binarySearch2.binarySearch(intArray7, (int) (byte) 10);
        int int11 = binarySearch1.binarySearch(intArray7, 1);
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch13 = new arrays.BinarySearch();
        int[] intArray18 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int20 = binarySearch13.binarySearch(intArray18, (int) (byte) 10);
        int int22 = binarySearch12.binarySearch(intArray18, 1);
        int int24 = binarySearch1.binarySearch(intArray18, 10);
        int int26 = binarySearch0.binarySearch(intArray18, 0);
        arrays.BinarySearch binarySearch27 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch28 = new arrays.BinarySearch();
        int[] intArray33 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int35 = binarySearch28.binarySearch(intArray33, (int) (byte) 10);
        int int37 = binarySearch27.binarySearch(intArray33, 1);
        arrays.BinarySearch binarySearch38 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch39 = new arrays.BinarySearch();
        int[] intArray44 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int46 = binarySearch39.binarySearch(intArray44, (int) (byte) 10);
        int int48 = binarySearch38.binarySearch(intArray44, 1);
        int int50 = binarySearch27.binarySearch(intArray44, 10);
        arrays.BinarySearch binarySearch51 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch52 = new arrays.BinarySearch();
        int[] intArray57 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int59 = binarySearch52.binarySearch(intArray57, (int) (byte) 10);
        int int61 = binarySearch51.binarySearch(intArray57, 1);
        int int63 = binarySearch27.binarySearch(intArray57, 10);
        int int65 = binarySearch0.binarySearch(intArray57, (int) (short) -1);
        int[] intArray66 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int68 = binarySearch0.binarySearch(intArray66, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch2 = new arrays.BinarySearch();
        int[] intArray7 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int9 = binarySearch2.binarySearch(intArray7, (int) (byte) 10);
        int int11 = binarySearch1.binarySearch(intArray7, 1);
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch13 = new arrays.BinarySearch();
        int[] intArray18 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int20 = binarySearch13.binarySearch(intArray18, (int) (byte) 10);
        int int22 = binarySearch12.binarySearch(intArray18, 1);
        int int24 = binarySearch1.binarySearch(intArray18, 10);
        int int26 = binarySearch0.binarySearch(intArray18, 0);
        arrays.BinarySearch binarySearch27 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch28 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch29 = new arrays.BinarySearch();
        int[] intArray34 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int36 = binarySearch29.binarySearch(intArray34, (int) (byte) 10);
        int int38 = binarySearch28.binarySearch(intArray34, 1);
        arrays.BinarySearch binarySearch39 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch40 = new arrays.BinarySearch();
        int[] intArray45 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int47 = binarySearch40.binarySearch(intArray45, (int) (byte) 10);
        int int49 = binarySearch39.binarySearch(intArray45, 1);
        int int51 = binarySearch28.binarySearch(intArray45, 10);
        int int53 = binarySearch27.binarySearch(intArray45, 0);
        arrays.BinarySearch binarySearch54 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch55 = new arrays.BinarySearch();
        int[] intArray60 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int62 = binarySearch55.binarySearch(intArray60, (int) (byte) 10);
        int int64 = binarySearch54.binarySearch(intArray60, 1);
        arrays.BinarySearch binarySearch65 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch66 = new arrays.BinarySearch();
        int[] intArray71 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int73 = binarySearch66.binarySearch(intArray71, (int) (byte) 10);
        int int75 = binarySearch65.binarySearch(intArray71, 1);
        int int77 = binarySearch54.binarySearch(intArray71, 10);
        arrays.BinarySearch binarySearch78 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch79 = new arrays.BinarySearch();
        int[] intArray84 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int86 = binarySearch79.binarySearch(intArray84, (int) (byte) 10);
        int int88 = binarySearch78.binarySearch(intArray84, 1);
        int int90 = binarySearch54.binarySearch(intArray84, 10);
        int int92 = binarySearch27.binarySearch(intArray84, (int) (short) -1);
        int int94 = binarySearch0.binarySearch(intArray84, (int) (byte) 1);
        java.lang.Class<?> wildcardClass95 = binarySearch0.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertArrayEquals(intArray84, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch2 = new arrays.BinarySearch();
        int[] intArray7 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int9 = binarySearch2.binarySearch(intArray7, (int) (byte) 10);
        int int11 = binarySearch1.binarySearch(intArray7, 1);
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch13 = new arrays.BinarySearch();
        int[] intArray18 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int20 = binarySearch13.binarySearch(intArray18, (int) (byte) 10);
        int int22 = binarySearch12.binarySearch(intArray18, 1);
        int int24 = binarySearch1.binarySearch(intArray18, 10);
        int int26 = binarySearch0.binarySearch(intArray18, 0);
        arrays.BinarySearch binarySearch27 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch28 = new arrays.BinarySearch();
        int[] intArray33 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int35 = binarySearch28.binarySearch(intArray33, (int) (byte) 10);
        int int37 = binarySearch27.binarySearch(intArray33, 1);
        arrays.BinarySearch binarySearch38 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch39 = new arrays.BinarySearch();
        int[] intArray44 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int46 = binarySearch39.binarySearch(intArray44, (int) (byte) 10);
        int int48 = binarySearch38.binarySearch(intArray44, 1);
        int int50 = binarySearch27.binarySearch(intArray44, 10);
        arrays.BinarySearch binarySearch51 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch52 = new arrays.BinarySearch();
        int[] intArray57 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int59 = binarySearch52.binarySearch(intArray57, (int) (byte) 10);
        int int61 = binarySearch51.binarySearch(intArray57, 1);
        int int63 = binarySearch27.binarySearch(intArray57, 10);
        int int65 = binarySearch0.binarySearch(intArray57, (int) (short) -1);
        java.lang.Class<?> wildcardClass66 = intArray57.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        int[] intArray6 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int8 = binarySearch1.binarySearch(intArray6, (int) (byte) 10);
        int int10 = binarySearch0.binarySearch(intArray6, 1);
        arrays.BinarySearch binarySearch11 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        int[] intArray17 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int19 = binarySearch12.binarySearch(intArray17, (int) (byte) 10);
        int int21 = binarySearch11.binarySearch(intArray17, 1);
        int int23 = binarySearch0.binarySearch(intArray17, 10);
        arrays.BinarySearch binarySearch24 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch25 = new arrays.BinarySearch();
        int[] intArray30 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int32 = binarySearch25.binarySearch(intArray30, (int) (byte) 10);
        int int34 = binarySearch24.binarySearch(intArray30, 1);
        int int36 = binarySearch0.binarySearch(intArray30, 10);
        java.lang.Class<?> wildcardClass37 = intArray30.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        int[] intArray6 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int8 = binarySearch1.binarySearch(intArray6, (int) (byte) 10);
        int int10 = binarySearch0.binarySearch(intArray6, 1);
        arrays.BinarySearch binarySearch11 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        int[] intArray17 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int19 = binarySearch12.binarySearch(intArray17, (int) (byte) 10);
        int int21 = binarySearch11.binarySearch(intArray17, 1);
        int int23 = binarySearch0.binarySearch(intArray17, 10);
        arrays.BinarySearch binarySearch24 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch25 = new arrays.BinarySearch();
        int[] intArray30 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int32 = binarySearch25.binarySearch(intArray30, (int) (byte) 10);
        int int34 = binarySearch24.binarySearch(intArray30, 1);
        arrays.BinarySearch binarySearch35 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch36 = new arrays.BinarySearch();
        int[] intArray41 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int43 = binarySearch36.binarySearch(intArray41, (int) (byte) 10);
        int int45 = binarySearch35.binarySearch(intArray41, 1);
        int int47 = binarySearch24.binarySearch(intArray41, 10);
        arrays.BinarySearch binarySearch48 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch49 = new arrays.BinarySearch();
        int[] intArray54 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int56 = binarySearch49.binarySearch(intArray54, (int) (byte) 10);
        int int58 = binarySearch48.binarySearch(intArray54, 1);
        int int60 = binarySearch24.binarySearch(intArray54, 10);
        arrays.BinarySearch binarySearch61 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch62 = new arrays.BinarySearch();
        int[] intArray67 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int69 = binarySearch62.binarySearch(intArray67, (int) (byte) 10);
        int int71 = binarySearch61.binarySearch(intArray67, 1);
        int int73 = binarySearch24.binarySearch(intArray67, (int) (byte) 10);
        int[] intArray76 = new int[] { ' ', 100 };
        int int78 = binarySearch24.binarySearch(intArray76, 1);
        int int80 = binarySearch0.binarySearch(intArray76, 0);
        int[] intArray81 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int83 = binarySearch0.binarySearch(intArray81, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertArrayEquals(intArray76, new int[] { 32, 100 });
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        int[] intArray6 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int8 = binarySearch1.binarySearch(intArray6, (int) (byte) 10);
        int int10 = binarySearch0.binarySearch(intArray6, 1);
        arrays.BinarySearch binarySearch11 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        int[] intArray17 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int19 = binarySearch12.binarySearch(intArray17, (int) (byte) 10);
        int int21 = binarySearch11.binarySearch(intArray17, 1);
        int int23 = binarySearch0.binarySearch(intArray17, 10);
        arrays.BinarySearch binarySearch24 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch25 = new arrays.BinarySearch();
        int[] intArray30 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int32 = binarySearch25.binarySearch(intArray30, (int) (byte) 10);
        int int34 = binarySearch24.binarySearch(intArray30, 1);
        int int36 = binarySearch0.binarySearch(intArray30, 10);
        arrays.BinarySearch binarySearch37 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch38 = new arrays.BinarySearch();
        int[] intArray43 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int45 = binarySearch38.binarySearch(intArray43, (int) (byte) 10);
        int int47 = binarySearch37.binarySearch(intArray43, 1);
        int int49 = binarySearch0.binarySearch(intArray43, (int) (byte) 10);
        java.lang.Class<?> wildcardClass50 = binarySearch0.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch2 = new arrays.BinarySearch();
        int[] intArray7 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int9 = binarySearch2.binarySearch(intArray7, (int) (byte) 10);
        int int11 = binarySearch1.binarySearch(intArray7, 1);
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch13 = new arrays.BinarySearch();
        int[] intArray18 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int20 = binarySearch13.binarySearch(intArray18, (int) (byte) 10);
        int int22 = binarySearch12.binarySearch(intArray18, 1);
        int int24 = binarySearch1.binarySearch(intArray18, 10);
        int int26 = binarySearch0.binarySearch(intArray18, 0);
        arrays.BinarySearch binarySearch27 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch28 = new arrays.BinarySearch();
        int[] intArray33 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int35 = binarySearch28.binarySearch(intArray33, (int) (byte) 10);
        int int37 = binarySearch27.binarySearch(intArray33, 1);
        arrays.BinarySearch binarySearch38 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch39 = new arrays.BinarySearch();
        int[] intArray44 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int46 = binarySearch39.binarySearch(intArray44, (int) (byte) 10);
        int int48 = binarySearch38.binarySearch(intArray44, 1);
        int int50 = binarySearch27.binarySearch(intArray44, 10);
        arrays.BinarySearch binarySearch51 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch52 = new arrays.BinarySearch();
        int[] intArray57 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int59 = binarySearch52.binarySearch(intArray57, (int) (byte) 10);
        int int61 = binarySearch51.binarySearch(intArray57, 1);
        int int63 = binarySearch27.binarySearch(intArray57, 10);
        int int65 = binarySearch0.binarySearch(intArray57, (int) (short) -1);
        java.lang.Class<?> wildcardClass66 = binarySearch0.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        int[] intArray6 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int8 = binarySearch1.binarySearch(intArray6, (int) (byte) 10);
        int int10 = binarySearch0.binarySearch(intArray6, 1);
        arrays.BinarySearch binarySearch11 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        int[] intArray17 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int19 = binarySearch12.binarySearch(intArray17, (int) (byte) 10);
        int int21 = binarySearch11.binarySearch(intArray17, 1);
        int int23 = binarySearch0.binarySearch(intArray17, 10);
        arrays.BinarySearch binarySearch24 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch25 = new arrays.BinarySearch();
        int[] intArray30 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int32 = binarySearch25.binarySearch(intArray30, (int) (byte) 10);
        int int34 = binarySearch24.binarySearch(intArray30, 1);
        arrays.BinarySearch binarySearch35 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch36 = new arrays.BinarySearch();
        int[] intArray41 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int43 = binarySearch36.binarySearch(intArray41, (int) (byte) 10);
        int int45 = binarySearch35.binarySearch(intArray41, 1);
        int int47 = binarySearch24.binarySearch(intArray41, 10);
        arrays.BinarySearch binarySearch48 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch49 = new arrays.BinarySearch();
        int[] intArray54 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int56 = binarySearch49.binarySearch(intArray54, (int) (byte) 10);
        int int58 = binarySearch48.binarySearch(intArray54, 1);
        int int60 = binarySearch24.binarySearch(intArray54, 10);
        arrays.BinarySearch binarySearch61 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch62 = new arrays.BinarySearch();
        int[] intArray67 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int69 = binarySearch62.binarySearch(intArray67, (int) (byte) 10);
        int int71 = binarySearch61.binarySearch(intArray67, 1);
        int int73 = binarySearch24.binarySearch(intArray67, (int) (byte) 10);
        int[] intArray76 = new int[] { ' ', 100 };
        int int78 = binarySearch24.binarySearch(intArray76, 1);
        int int80 = binarySearch0.binarySearch(intArray76, 0);
        java.lang.Class<?> wildcardClass81 = binarySearch0.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertArrayEquals(intArray76, new int[] { 32, 100 });
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        int[] intArray6 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int8 = binarySearch1.binarySearch(intArray6, (int) (byte) 10);
        int int10 = binarySearch0.binarySearch(intArray6, 1);
        arrays.BinarySearch binarySearch11 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        int[] intArray17 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int19 = binarySearch12.binarySearch(intArray17, (int) (byte) 10);
        int int21 = binarySearch11.binarySearch(intArray17, 1);
        int int23 = binarySearch0.binarySearch(intArray17, 10);
        arrays.BinarySearch binarySearch24 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch25 = new arrays.BinarySearch();
        int[] intArray30 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int32 = binarySearch25.binarySearch(intArray30, (int) (byte) 10);
        int int34 = binarySearch24.binarySearch(intArray30, 1);
        int int36 = binarySearch0.binarySearch(intArray30, 10);
        arrays.BinarySearch binarySearch37 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch38 = new arrays.BinarySearch();
        int[] intArray43 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int45 = binarySearch38.binarySearch(intArray43, (int) (byte) 10);
        int int47 = binarySearch37.binarySearch(intArray43, 1);
        arrays.BinarySearch binarySearch48 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch49 = new arrays.BinarySearch();
        int[] intArray54 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int56 = binarySearch49.binarySearch(intArray54, (int) (byte) 10);
        int int58 = binarySearch48.binarySearch(intArray54, 1);
        int int60 = binarySearch37.binarySearch(intArray54, 10);
        arrays.BinarySearch binarySearch61 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch62 = new arrays.BinarySearch();
        int[] intArray67 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int69 = binarySearch62.binarySearch(intArray67, (int) (byte) 10);
        int int71 = binarySearch61.binarySearch(intArray67, 1);
        int int73 = binarySearch37.binarySearch(intArray67, 10);
        arrays.BinarySearch binarySearch74 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch75 = new arrays.BinarySearch();
        int[] intArray80 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int82 = binarySearch75.binarySearch(intArray80, (int) (byte) 10);
        int int84 = binarySearch74.binarySearch(intArray80, 1);
        int int86 = binarySearch37.binarySearch(intArray80, (int) (byte) 10);
        int[] intArray89 = new int[] { ' ', 100 };
        int int91 = binarySearch37.binarySearch(intArray89, 1);
        int int93 = binarySearch0.binarySearch(intArray89, (int) (byte) 100);
        java.lang.Class<?> wildcardClass94 = binarySearch0.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertArrayEquals(intArray80, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertArrayEquals(intArray89, new int[] { 32, 100 });
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 1 + "'", int93 == 1);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        int[] intArray6 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int8 = binarySearch1.binarySearch(intArray6, (int) (byte) 10);
        int int10 = binarySearch0.binarySearch(intArray6, 1);
        arrays.BinarySearch binarySearch11 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        int[] intArray17 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int19 = binarySearch12.binarySearch(intArray17, (int) (byte) 10);
        int int21 = binarySearch11.binarySearch(intArray17, 1);
        int int23 = binarySearch0.binarySearch(intArray17, 10);
        arrays.BinarySearch binarySearch24 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch25 = new arrays.BinarySearch();
        int[] intArray30 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int32 = binarySearch25.binarySearch(intArray30, (int) (byte) 10);
        int int34 = binarySearch24.binarySearch(intArray30, 1);
        int int36 = binarySearch0.binarySearch(intArray30, 10);
        arrays.BinarySearch binarySearch37 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch38 = new arrays.BinarySearch();
        int[] intArray43 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int45 = binarySearch38.binarySearch(intArray43, (int) (byte) 10);
        int int47 = binarySearch37.binarySearch(intArray43, 1);
        arrays.BinarySearch binarySearch48 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch49 = new arrays.BinarySearch();
        int[] intArray54 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int56 = binarySearch49.binarySearch(intArray54, (int) (byte) 10);
        int int58 = binarySearch48.binarySearch(intArray54, 1);
        int int60 = binarySearch37.binarySearch(intArray54, 10);
        arrays.BinarySearch binarySearch61 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch62 = new arrays.BinarySearch();
        int[] intArray67 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int69 = binarySearch62.binarySearch(intArray67, (int) (byte) 10);
        int int71 = binarySearch61.binarySearch(intArray67, 1);
        int int73 = binarySearch37.binarySearch(intArray67, 10);
        arrays.BinarySearch binarySearch74 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch75 = new arrays.BinarySearch();
        int[] intArray80 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int82 = binarySearch75.binarySearch(intArray80, (int) (byte) 10);
        int int84 = binarySearch74.binarySearch(intArray80, 1);
        int int86 = binarySearch37.binarySearch(intArray80, (int) (byte) 10);
        int[] intArray89 = new int[] { ' ', 100 };
        int int91 = binarySearch37.binarySearch(intArray89, 1);
        int int93 = binarySearch0.binarySearch(intArray89, (int) (byte) 100);
        java.lang.Class<?> wildcardClass94 = intArray89.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertArrayEquals(intArray80, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertArrayEquals(intArray89, new int[] { 32, 100 });
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 1 + "'", int93 == 1);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch2 = new arrays.BinarySearch();
        int[] intArray7 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int9 = binarySearch2.binarySearch(intArray7, (int) (byte) 10);
        int int11 = binarySearch1.binarySearch(intArray7, 1);
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch13 = new arrays.BinarySearch();
        int[] intArray18 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int20 = binarySearch13.binarySearch(intArray18, (int) (byte) 10);
        int int22 = binarySearch12.binarySearch(intArray18, 1);
        int int24 = binarySearch1.binarySearch(intArray18, 10);
        int int26 = binarySearch0.binarySearch(intArray18, 0);
        arrays.BinarySearch binarySearch27 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch28 = new arrays.BinarySearch();
        int[] intArray33 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int35 = binarySearch28.binarySearch(intArray33, (int) (byte) 10);
        int int37 = binarySearch27.binarySearch(intArray33, 1);
        arrays.BinarySearch binarySearch38 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch39 = new arrays.BinarySearch();
        int[] intArray44 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int46 = binarySearch39.binarySearch(intArray44, (int) (byte) 10);
        int int48 = binarySearch38.binarySearch(intArray44, 1);
        int int50 = binarySearch27.binarySearch(intArray44, 10);
        arrays.BinarySearch binarySearch51 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch52 = new arrays.BinarySearch();
        int[] intArray57 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int59 = binarySearch52.binarySearch(intArray57, (int) (byte) 10);
        int int61 = binarySearch51.binarySearch(intArray57, 1);
        int int63 = binarySearch27.binarySearch(intArray57, 10);
        int int65 = binarySearch0.binarySearch(intArray57, (int) (short) -1);
        arrays.BinarySearch binarySearch66 = new arrays.BinarySearch();
        int[] intArray71 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int73 = binarySearch66.binarySearch(intArray71, (int) (byte) 10);
        int int75 = binarySearch0.binarySearch(intArray71, (int) 'a');
        java.lang.Class<?> wildcardClass76 = intArray71.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 3 + "'", int75 == 3);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        int[] intArray6 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int8 = binarySearch1.binarySearch(intArray6, (int) (byte) 10);
        int int10 = binarySearch0.binarySearch(intArray6, 1);
        arrays.BinarySearch binarySearch11 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        int[] intArray17 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int19 = binarySearch12.binarySearch(intArray17, (int) (byte) 10);
        int int21 = binarySearch11.binarySearch(intArray17, 1);
        int int23 = binarySearch0.binarySearch(intArray17, 10);
        arrays.BinarySearch binarySearch24 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch25 = new arrays.BinarySearch();
        int[] intArray30 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int32 = binarySearch25.binarySearch(intArray30, (int) (byte) 10);
        int int34 = binarySearch24.binarySearch(intArray30, 1);
        int int36 = binarySearch0.binarySearch(intArray30, 10);
        java.lang.Class<?> wildcardClass37 = binarySearch0.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        int[] intArray6 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int8 = binarySearch1.binarySearch(intArray6, (int) (byte) 10);
        int int10 = binarySearch0.binarySearch(intArray6, 1);
        arrays.BinarySearch binarySearch11 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch13 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch14 = new arrays.BinarySearch();
        int[] intArray19 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int21 = binarySearch14.binarySearch(intArray19, (int) (byte) 10);
        int int23 = binarySearch13.binarySearch(intArray19, 1);
        arrays.BinarySearch binarySearch24 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch25 = new arrays.BinarySearch();
        int[] intArray30 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int32 = binarySearch25.binarySearch(intArray30, (int) (byte) 10);
        int int34 = binarySearch24.binarySearch(intArray30, 1);
        int int36 = binarySearch13.binarySearch(intArray30, 10);
        int int38 = binarySearch12.binarySearch(intArray30, 0);
        int int40 = binarySearch11.binarySearch(intArray30, 1);
        int int42 = binarySearch0.binarySearch(intArray30, 10);
        java.lang.Class<?> wildcardClass43 = intArray30.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        int[] intArray6 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int8 = binarySearch1.binarySearch(intArray6, (int) (byte) 10);
        int int10 = binarySearch0.binarySearch(intArray6, 1);
        arrays.BinarySearch binarySearch11 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        int[] intArray17 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int19 = binarySearch12.binarySearch(intArray17, (int) (byte) 10);
        int int21 = binarySearch11.binarySearch(intArray17, 1);
        int int23 = binarySearch0.binarySearch(intArray17, 10);
        arrays.BinarySearch binarySearch24 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch25 = new arrays.BinarySearch();
        int[] intArray30 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int32 = binarySearch25.binarySearch(intArray30, (int) (byte) 10);
        int int34 = binarySearch24.binarySearch(intArray30, 1);
        int int36 = binarySearch0.binarySearch(intArray30, 10);
        int[] intArray37 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int39 = binarySearch0.binarySearch(intArray37, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        int[] intArray6 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int8 = binarySearch1.binarySearch(intArray6, (int) (byte) 10);
        int int10 = binarySearch0.binarySearch(intArray6, 1);
        arrays.BinarySearch binarySearch11 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch13 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch14 = new arrays.BinarySearch();
        int[] intArray19 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int21 = binarySearch14.binarySearch(intArray19, (int) (byte) 10);
        int int23 = binarySearch13.binarySearch(intArray19, 1);
        arrays.BinarySearch binarySearch24 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch25 = new arrays.BinarySearch();
        int[] intArray30 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int32 = binarySearch25.binarySearch(intArray30, (int) (byte) 10);
        int int34 = binarySearch24.binarySearch(intArray30, 1);
        int int36 = binarySearch13.binarySearch(intArray30, 10);
        int int38 = binarySearch12.binarySearch(intArray30, 0);
        int int40 = binarySearch11.binarySearch(intArray30, 1);
        int int42 = binarySearch0.binarySearch(intArray30, 10);
        java.lang.Class<?> wildcardClass43 = binarySearch0.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        int[] intArray6 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int8 = binarySearch1.binarySearch(intArray6, (int) (byte) 10);
        int int10 = binarySearch0.binarySearch(intArray6, 1);
        arrays.BinarySearch binarySearch11 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        int[] intArray17 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int19 = binarySearch12.binarySearch(intArray17, (int) (byte) 10);
        int int21 = binarySearch11.binarySearch(intArray17, 1);
        int int23 = binarySearch0.binarySearch(intArray17, 10);
        arrays.BinarySearch binarySearch24 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch25 = new arrays.BinarySearch();
        int[] intArray30 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int32 = binarySearch25.binarySearch(intArray30, (int) (byte) 10);
        int int34 = binarySearch24.binarySearch(intArray30, 1);
        int int36 = binarySearch0.binarySearch(intArray30, 10);
        arrays.BinarySearch binarySearch37 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch38 = new arrays.BinarySearch();
        int[] intArray43 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int45 = binarySearch38.binarySearch(intArray43, (int) (byte) 10);
        int int47 = binarySearch37.binarySearch(intArray43, 1);
        arrays.BinarySearch binarySearch48 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch49 = new arrays.BinarySearch();
        int[] intArray54 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int56 = binarySearch49.binarySearch(intArray54, (int) (byte) 10);
        int int58 = binarySearch48.binarySearch(intArray54, 1);
        int int60 = binarySearch37.binarySearch(intArray54, 10);
        arrays.BinarySearch binarySearch61 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch62 = new arrays.BinarySearch();
        int[] intArray67 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int69 = binarySearch62.binarySearch(intArray67, (int) (byte) 10);
        int int71 = binarySearch61.binarySearch(intArray67, 1);
        int int73 = binarySearch37.binarySearch(intArray67, 10);
        arrays.BinarySearch binarySearch74 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch75 = new arrays.BinarySearch();
        int[] intArray80 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int82 = binarySearch75.binarySearch(intArray80, (int) (byte) 10);
        int int84 = binarySearch74.binarySearch(intArray80, 1);
        int int86 = binarySearch37.binarySearch(intArray80, (int) (byte) 10);
        int[] intArray89 = new int[] { ' ', 100 };
        int int91 = binarySearch37.binarySearch(intArray89, 1);
        int int93 = binarySearch0.binarySearch(intArray89, (int) (byte) 100);
        int[] intArray94 = new int[] {};
        int int96 = binarySearch0.binarySearch(intArray94, 0);
        java.lang.Class<?> wildcardClass97 = binarySearch0.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertArrayEquals(intArray80, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertArrayEquals(intArray89, new int[] { 32, 100 });
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 1 + "'", int93 == 1);
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertArrayEquals(intArray94, new int[] {});
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        int[] intArray5 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int7 = binarySearch0.binarySearch(intArray5, (int) (byte) 10);
        int[] intArray8 = new int[] {};
        int int10 = binarySearch0.binarySearch(intArray8, (int) (byte) 1);
        arrays.BinarySearch binarySearch11 = new arrays.BinarySearch();
        int[] intArray16 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int18 = binarySearch11.binarySearch(intArray16, (int) (byte) 10);
        int int20 = binarySearch0.binarySearch(intArray16, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = binarySearch0.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch2 = new arrays.BinarySearch();
        int[] intArray7 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int9 = binarySearch2.binarySearch(intArray7, (int) (byte) 10);
        int int11 = binarySearch1.binarySearch(intArray7, 1);
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch13 = new arrays.BinarySearch();
        int[] intArray18 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int20 = binarySearch13.binarySearch(intArray18, (int) (byte) 10);
        int int22 = binarySearch12.binarySearch(intArray18, 1);
        int int24 = binarySearch1.binarySearch(intArray18, 10);
        arrays.BinarySearch binarySearch25 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch26 = new arrays.BinarySearch();
        int[] intArray31 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int33 = binarySearch26.binarySearch(intArray31, (int) (byte) 10);
        int int35 = binarySearch25.binarySearch(intArray31, 1);
        int int37 = binarySearch1.binarySearch(intArray31, 10);
        arrays.BinarySearch binarySearch38 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch39 = new arrays.BinarySearch();
        int[] intArray44 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int46 = binarySearch39.binarySearch(intArray44, (int) (byte) 10);
        int int48 = binarySearch38.binarySearch(intArray44, 1);
        int int50 = binarySearch1.binarySearch(intArray44, (int) (byte) 10);
        int[] intArray53 = new int[] { ' ', 100 };
        int int55 = binarySearch1.binarySearch(intArray53, 1);
        arrays.BinarySearch binarySearch56 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch57 = new arrays.BinarySearch();
        int[] intArray62 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int64 = binarySearch57.binarySearch(intArray62, (int) (byte) 10);
        int int66 = binarySearch56.binarySearch(intArray62, 1);
        arrays.BinarySearch binarySearch67 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch68 = new arrays.BinarySearch();
        int[] intArray73 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int75 = binarySearch68.binarySearch(intArray73, (int) (byte) 10);
        int int77 = binarySearch67.binarySearch(intArray73, 1);
        int int79 = binarySearch56.binarySearch(intArray73, 10);
        arrays.BinarySearch binarySearch80 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch81 = new arrays.BinarySearch();
        int[] intArray86 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int88 = binarySearch81.binarySearch(intArray86, (int) (byte) 10);
        int int90 = binarySearch80.binarySearch(intArray86, 1);
        int int92 = binarySearch56.binarySearch(intArray86, 10);
        int int94 = binarySearch1.binarySearch(intArray86, 0);
        int int96 = binarySearch0.binarySearch(intArray86, 100);
        java.lang.Class<?> wildcardClass97 = intArray86.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { 32, 100 });
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertArrayEquals(intArray86, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        int[] intArray5 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int7 = binarySearch0.binarySearch(intArray5, (int) (byte) 10);
        int[] intArray8 = new int[] {};
        int int10 = binarySearch0.binarySearch(intArray8, (int) (byte) 1);
        arrays.BinarySearch binarySearch11 = new arrays.BinarySearch();
        int[] intArray16 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int18 = binarySearch11.binarySearch(intArray16, (int) (byte) 10);
        int int20 = binarySearch0.binarySearch(intArray16, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        int[] intArray6 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int8 = binarySearch1.binarySearch(intArray6, (int) (byte) 10);
        int int10 = binarySearch0.binarySearch(intArray6, 1);
        arrays.BinarySearch binarySearch11 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        int[] intArray17 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int19 = binarySearch12.binarySearch(intArray17, (int) (byte) 10);
        int int21 = binarySearch11.binarySearch(intArray17, 1);
        int int23 = binarySearch0.binarySearch(intArray17, 10);
        arrays.BinarySearch binarySearch24 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch25 = new arrays.BinarySearch();
        int[] intArray30 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int32 = binarySearch25.binarySearch(intArray30, (int) (byte) 10);
        int int34 = binarySearch24.binarySearch(intArray30, 1);
        arrays.BinarySearch binarySearch35 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch36 = new arrays.BinarySearch();
        int[] intArray41 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int43 = binarySearch36.binarySearch(intArray41, (int) (byte) 10);
        int int45 = binarySearch35.binarySearch(intArray41, 1);
        int int47 = binarySearch24.binarySearch(intArray41, 10);
        arrays.BinarySearch binarySearch48 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch49 = new arrays.BinarySearch();
        int[] intArray54 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int56 = binarySearch49.binarySearch(intArray54, (int) (byte) 10);
        int int58 = binarySearch48.binarySearch(intArray54, 1);
        int int60 = binarySearch24.binarySearch(intArray54, 10);
        arrays.BinarySearch binarySearch61 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch62 = new arrays.BinarySearch();
        int[] intArray67 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int69 = binarySearch62.binarySearch(intArray67, (int) (byte) 10);
        int int71 = binarySearch61.binarySearch(intArray67, 1);
        int int73 = binarySearch24.binarySearch(intArray67, (int) (byte) 10);
        int[] intArray76 = new int[] { ' ', 100 };
        int int78 = binarySearch24.binarySearch(intArray76, 1);
        int int80 = binarySearch0.binarySearch(intArray76, 0);
        java.lang.Class<?> wildcardClass81 = intArray76.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertArrayEquals(intArray76, new int[] { 32, 100 });
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch2 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch3 = new arrays.BinarySearch();
        int[] intArray8 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int10 = binarySearch3.binarySearch(intArray8, (int) (byte) 10);
        int int12 = binarySearch2.binarySearch(intArray8, 1);
        arrays.BinarySearch binarySearch13 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch14 = new arrays.BinarySearch();
        int[] intArray19 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int21 = binarySearch14.binarySearch(intArray19, (int) (byte) 10);
        int int23 = binarySearch13.binarySearch(intArray19, 1);
        int int25 = binarySearch2.binarySearch(intArray19, 10);
        int int27 = binarySearch1.binarySearch(intArray19, 0);
        arrays.BinarySearch binarySearch28 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch29 = new arrays.BinarySearch();
        int[] intArray34 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int36 = binarySearch29.binarySearch(intArray34, (int) (byte) 10);
        int int38 = binarySearch28.binarySearch(intArray34, 1);
        arrays.BinarySearch binarySearch39 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch40 = new arrays.BinarySearch();
        int[] intArray45 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int47 = binarySearch40.binarySearch(intArray45, (int) (byte) 10);
        int int49 = binarySearch39.binarySearch(intArray45, 1);
        int int51 = binarySearch28.binarySearch(intArray45, 10);
        arrays.BinarySearch binarySearch52 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch53 = new arrays.BinarySearch();
        int[] intArray58 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int60 = binarySearch53.binarySearch(intArray58, (int) (byte) 10);
        int int62 = binarySearch52.binarySearch(intArray58, 1);
        int int64 = binarySearch28.binarySearch(intArray58, 10);
        int int66 = binarySearch1.binarySearch(intArray58, (int) (short) -1);
        arrays.BinarySearch binarySearch67 = new arrays.BinarySearch();
        int[] intArray72 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int74 = binarySearch67.binarySearch(intArray72, (int) (byte) 10);
        int int76 = binarySearch1.binarySearch(intArray72, (int) 'a');
        int int78 = binarySearch0.binarySearch(intArray72, (int) (short) -1);
        java.lang.Class<?> wildcardClass79 = binarySearch0.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertArrayEquals(intArray72, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 3 + "'", int76 == 3);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch2 = new arrays.BinarySearch();
        int[] intArray7 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int9 = binarySearch2.binarySearch(intArray7, (int) (byte) 10);
        int int11 = binarySearch1.binarySearch(intArray7, 1);
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch13 = new arrays.BinarySearch();
        int[] intArray18 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int20 = binarySearch13.binarySearch(intArray18, (int) (byte) 10);
        int int22 = binarySearch12.binarySearch(intArray18, 1);
        int int24 = binarySearch1.binarySearch(intArray18, 10);
        int int26 = binarySearch0.binarySearch(intArray18, 0);
        arrays.BinarySearch binarySearch27 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch28 = new arrays.BinarySearch();
        int[] intArray33 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int35 = binarySearch28.binarySearch(intArray33, (int) (byte) 10);
        int int37 = binarySearch27.binarySearch(intArray33, 1);
        arrays.BinarySearch binarySearch38 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch39 = new arrays.BinarySearch();
        int[] intArray44 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int46 = binarySearch39.binarySearch(intArray44, (int) (byte) 10);
        int int48 = binarySearch38.binarySearch(intArray44, 1);
        int int50 = binarySearch27.binarySearch(intArray44, 10);
        arrays.BinarySearch binarySearch51 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch52 = new arrays.BinarySearch();
        int[] intArray57 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int59 = binarySearch52.binarySearch(intArray57, (int) (byte) 10);
        int int61 = binarySearch51.binarySearch(intArray57, 1);
        int int63 = binarySearch27.binarySearch(intArray57, 10);
        int int65 = binarySearch0.binarySearch(intArray57, (int) (short) -1);
        arrays.BinarySearch binarySearch66 = new arrays.BinarySearch();
        int[] intArray71 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int73 = binarySearch66.binarySearch(intArray71, (int) (byte) 10);
        int int75 = binarySearch0.binarySearch(intArray71, (int) 'a');
        java.lang.Class<?> wildcardClass76 = binarySearch0.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 3 + "'", int75 == 3);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        int[] intArray5 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int7 = binarySearch0.binarySearch(intArray5, (int) (byte) 10);
        int[] intArray8 = new int[] {};
        int int10 = binarySearch0.binarySearch(intArray8, (int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        int[] intArray5 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int7 = binarySearch0.binarySearch(intArray5, (int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch2 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch3 = new arrays.BinarySearch();
        int[] intArray8 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int10 = binarySearch3.binarySearch(intArray8, (int) (byte) 10);
        int int12 = binarySearch2.binarySearch(intArray8, 1);
        arrays.BinarySearch binarySearch13 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch14 = new arrays.BinarySearch();
        int[] intArray19 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int21 = binarySearch14.binarySearch(intArray19, (int) (byte) 10);
        int int23 = binarySearch13.binarySearch(intArray19, 1);
        int int25 = binarySearch2.binarySearch(intArray19, 10);
        int int27 = binarySearch1.binarySearch(intArray19, 0);
        arrays.BinarySearch binarySearch28 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch29 = new arrays.BinarySearch();
        int[] intArray34 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int36 = binarySearch29.binarySearch(intArray34, (int) (byte) 10);
        int int38 = binarySearch28.binarySearch(intArray34, 1);
        arrays.BinarySearch binarySearch39 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch40 = new arrays.BinarySearch();
        int[] intArray45 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int47 = binarySearch40.binarySearch(intArray45, (int) (byte) 10);
        int int49 = binarySearch39.binarySearch(intArray45, 1);
        int int51 = binarySearch28.binarySearch(intArray45, 10);
        arrays.BinarySearch binarySearch52 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch53 = new arrays.BinarySearch();
        int[] intArray58 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int60 = binarySearch53.binarySearch(intArray58, (int) (byte) 10);
        int int62 = binarySearch52.binarySearch(intArray58, 1);
        int int64 = binarySearch28.binarySearch(intArray58, 10);
        int int66 = binarySearch1.binarySearch(intArray58, (int) (short) -1);
        arrays.BinarySearch binarySearch67 = new arrays.BinarySearch();
        int[] intArray72 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int74 = binarySearch67.binarySearch(intArray72, (int) (byte) 10);
        int int76 = binarySearch1.binarySearch(intArray72, (int) 'a');
        int int78 = binarySearch0.binarySearch(intArray72, (int) (short) -1);
        java.lang.Class<?> wildcardClass79 = intArray72.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertArrayEquals(intArray72, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 3 + "'", int76 == 3);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        int[] intArray5 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int7 = binarySearch0.binarySearch(intArray5, (int) (byte) 10);
        arrays.BinarySearch binarySearch8 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch9 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch10 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch11 = new arrays.BinarySearch();
        int[] intArray16 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int18 = binarySearch11.binarySearch(intArray16, (int) (byte) 10);
        int int20 = binarySearch10.binarySearch(intArray16, 1);
        arrays.BinarySearch binarySearch21 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch22 = new arrays.BinarySearch();
        int[] intArray27 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int29 = binarySearch22.binarySearch(intArray27, (int) (byte) 10);
        int int31 = binarySearch21.binarySearch(intArray27, 1);
        int int33 = binarySearch10.binarySearch(intArray27, 10);
        int int35 = binarySearch9.binarySearch(intArray27, 0);
        arrays.BinarySearch binarySearch36 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch37 = new arrays.BinarySearch();
        int[] intArray42 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int44 = binarySearch37.binarySearch(intArray42, (int) (byte) 10);
        int int46 = binarySearch36.binarySearch(intArray42, 1);
        arrays.BinarySearch binarySearch47 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch48 = new arrays.BinarySearch();
        int[] intArray53 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int55 = binarySearch48.binarySearch(intArray53, (int) (byte) 10);
        int int57 = binarySearch47.binarySearch(intArray53, 1);
        int int59 = binarySearch36.binarySearch(intArray53, 10);
        arrays.BinarySearch binarySearch60 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch61 = new arrays.BinarySearch();
        int[] intArray66 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int68 = binarySearch61.binarySearch(intArray66, (int) (byte) 10);
        int int70 = binarySearch60.binarySearch(intArray66, 1);
        int int72 = binarySearch36.binarySearch(intArray66, 10);
        int int74 = binarySearch9.binarySearch(intArray66, (int) (short) -1);
        arrays.BinarySearch binarySearch75 = new arrays.BinarySearch();
        int[] intArray80 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int82 = binarySearch75.binarySearch(intArray80, (int) (byte) 10);
        int int84 = binarySearch9.binarySearch(intArray80, (int) 'a');
        int int86 = binarySearch8.binarySearch(intArray80, (int) (short) -1);
        int int88 = binarySearch0.binarySearch(intArray80, (int) (short) 0);
        java.lang.Class<?> wildcardClass89 = binarySearch0.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertArrayEquals(intArray80, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 3 + "'", int84 == 3);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch2 = new arrays.BinarySearch();
        int[] intArray7 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int9 = binarySearch2.binarySearch(intArray7, (int) (byte) 10);
        int int11 = binarySearch1.binarySearch(intArray7, 1);
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch13 = new arrays.BinarySearch();
        int[] intArray18 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int20 = binarySearch13.binarySearch(intArray18, (int) (byte) 10);
        int int22 = binarySearch12.binarySearch(intArray18, 1);
        int int24 = binarySearch1.binarySearch(intArray18, 10);
        int int26 = binarySearch0.binarySearch(intArray18, 0);
        int[] intArray27 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int29 = binarySearch0.binarySearch(intArray27, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch2 = new arrays.BinarySearch();
        int[] intArray7 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int9 = binarySearch2.binarySearch(intArray7, (int) (byte) 10);
        int int11 = binarySearch1.binarySearch(intArray7, 1);
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch13 = new arrays.BinarySearch();
        int[] intArray18 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int20 = binarySearch13.binarySearch(intArray18, (int) (byte) 10);
        int int22 = binarySearch12.binarySearch(intArray18, 1);
        int int24 = binarySearch1.binarySearch(intArray18, 10);
        int int26 = binarySearch0.binarySearch(intArray18, 0);
        arrays.BinarySearch binarySearch27 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch28 = new arrays.BinarySearch();
        int[] intArray33 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int35 = binarySearch28.binarySearch(intArray33, (int) (byte) 10);
        int int37 = binarySearch27.binarySearch(intArray33, 1);
        arrays.BinarySearch binarySearch38 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch39 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch40 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch41 = new arrays.BinarySearch();
        int[] intArray46 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int48 = binarySearch41.binarySearch(intArray46, (int) (byte) 10);
        int int50 = binarySearch40.binarySearch(intArray46, 1);
        arrays.BinarySearch binarySearch51 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch52 = new arrays.BinarySearch();
        int[] intArray57 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int59 = binarySearch52.binarySearch(intArray57, (int) (byte) 10);
        int int61 = binarySearch51.binarySearch(intArray57, 1);
        int int63 = binarySearch40.binarySearch(intArray57, 10);
        int int65 = binarySearch39.binarySearch(intArray57, 0);
        int int67 = binarySearch38.binarySearch(intArray57, 1);
        int int69 = binarySearch27.binarySearch(intArray57, 10);
        int int71 = binarySearch0.binarySearch(intArray57, (int) '#');
        java.lang.Class<?> wildcardClass72 = intArray57.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        int[] intArray6 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int8 = binarySearch1.binarySearch(intArray6, (int) (byte) 10);
        int int10 = binarySearch0.binarySearch(intArray6, 1);
        arrays.BinarySearch binarySearch11 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        int[] intArray17 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int19 = binarySearch12.binarySearch(intArray17, (int) (byte) 10);
        int int21 = binarySearch11.binarySearch(intArray17, 1);
        int int23 = binarySearch0.binarySearch(intArray17, 10);
        arrays.BinarySearch binarySearch24 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch25 = new arrays.BinarySearch();
        int[] intArray30 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int32 = binarySearch25.binarySearch(intArray30, (int) (byte) 10);
        int int34 = binarySearch24.binarySearch(intArray30, 1);
        arrays.BinarySearch binarySearch35 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch36 = new arrays.BinarySearch();
        int[] intArray41 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int43 = binarySearch36.binarySearch(intArray41, (int) (byte) 10);
        int int45 = binarySearch35.binarySearch(intArray41, 1);
        int int47 = binarySearch24.binarySearch(intArray41, 10);
        arrays.BinarySearch binarySearch48 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch49 = new arrays.BinarySearch();
        int[] intArray54 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int56 = binarySearch49.binarySearch(intArray54, (int) (byte) 10);
        int int58 = binarySearch48.binarySearch(intArray54, 1);
        int int60 = binarySearch24.binarySearch(intArray54, 10);
        arrays.BinarySearch binarySearch61 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch62 = new arrays.BinarySearch();
        int[] intArray67 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int69 = binarySearch62.binarySearch(intArray67, (int) (byte) 10);
        int int71 = binarySearch61.binarySearch(intArray67, 1);
        int int73 = binarySearch24.binarySearch(intArray67, (int) (byte) 10);
        int[] intArray76 = new int[] { ' ', 100 };
        int int78 = binarySearch24.binarySearch(intArray76, 1);
        int int80 = binarySearch0.binarySearch(intArray76, 0);
        arrays.BinarySearch binarySearch81 = new arrays.BinarySearch();
        int[] intArray86 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int88 = binarySearch81.binarySearch(intArray86, (int) (byte) 10);
        int int90 = binarySearch0.binarySearch(intArray86, 100);
        java.lang.Class<?> wildcardClass91 = binarySearch0.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertArrayEquals(intArray76, new int[] { 32, 100 });
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertArrayEquals(intArray86, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch2 = new arrays.BinarySearch();
        int[] intArray7 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int9 = binarySearch2.binarySearch(intArray7, (int) (byte) 10);
        int int11 = binarySearch1.binarySearch(intArray7, 1);
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch13 = new arrays.BinarySearch();
        int[] intArray18 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int20 = binarySearch13.binarySearch(intArray18, (int) (byte) 10);
        int int22 = binarySearch12.binarySearch(intArray18, 1);
        int int24 = binarySearch1.binarySearch(intArray18, 10);
        int int26 = binarySearch0.binarySearch(intArray18, (int) (short) -1);
        java.lang.Class<?> wildcardClass27 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        int[] intArray6 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int8 = binarySearch1.binarySearch(intArray6, (int) (byte) 10);
        int int10 = binarySearch0.binarySearch(intArray6, 1);
        arrays.BinarySearch binarySearch11 = new arrays.BinarySearch();
        int[] intArray16 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int18 = binarySearch11.binarySearch(intArray16, (int) (byte) 10);
        int[] intArray19 = new int[] {};
        int int21 = binarySearch11.binarySearch(intArray19, (int) (byte) 1);
        arrays.BinarySearch binarySearch22 = new arrays.BinarySearch();
        int[] intArray27 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int29 = binarySearch22.binarySearch(intArray27, (int) (byte) 10);
        int int31 = binarySearch11.binarySearch(intArray27, (int) (short) 0);
        int int33 = binarySearch0.binarySearch(intArray27, (int) (short) 0);
        java.lang.Class<?> wildcardClass34 = binarySearch0.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        int[] intArray5 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int7 = binarySearch0.binarySearch(intArray5, (int) (byte) 10);
        arrays.BinarySearch binarySearch8 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch9 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch10 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch11 = new arrays.BinarySearch();
        int[] intArray16 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int18 = binarySearch11.binarySearch(intArray16, (int) (byte) 10);
        int int20 = binarySearch10.binarySearch(intArray16, 1);
        arrays.BinarySearch binarySearch21 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch22 = new arrays.BinarySearch();
        int[] intArray27 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int29 = binarySearch22.binarySearch(intArray27, (int) (byte) 10);
        int int31 = binarySearch21.binarySearch(intArray27, 1);
        int int33 = binarySearch10.binarySearch(intArray27, 10);
        int int35 = binarySearch9.binarySearch(intArray27, 0);
        arrays.BinarySearch binarySearch36 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch37 = new arrays.BinarySearch();
        int[] intArray42 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int44 = binarySearch37.binarySearch(intArray42, (int) (byte) 10);
        int int46 = binarySearch36.binarySearch(intArray42, 1);
        arrays.BinarySearch binarySearch47 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch48 = new arrays.BinarySearch();
        int[] intArray53 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int55 = binarySearch48.binarySearch(intArray53, (int) (byte) 10);
        int int57 = binarySearch47.binarySearch(intArray53, 1);
        int int59 = binarySearch36.binarySearch(intArray53, 10);
        arrays.BinarySearch binarySearch60 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch61 = new arrays.BinarySearch();
        int[] intArray66 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int68 = binarySearch61.binarySearch(intArray66, (int) (byte) 10);
        int int70 = binarySearch60.binarySearch(intArray66, 1);
        int int72 = binarySearch36.binarySearch(intArray66, 10);
        int int74 = binarySearch9.binarySearch(intArray66, (int) (short) -1);
        arrays.BinarySearch binarySearch75 = new arrays.BinarySearch();
        int[] intArray80 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int82 = binarySearch75.binarySearch(intArray80, (int) (byte) 10);
        int int84 = binarySearch9.binarySearch(intArray80, (int) 'a');
        int int86 = binarySearch8.binarySearch(intArray80, (int) (short) -1);
        int int88 = binarySearch0.binarySearch(intArray80, (int) (short) 0);
        java.lang.Class<?> wildcardClass89 = intArray80.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertArrayEquals(intArray80, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 3 + "'", int84 == 3);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch2 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch3 = new arrays.BinarySearch();
        int[] intArray8 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int10 = binarySearch3.binarySearch(intArray8, (int) (byte) 10);
        int int12 = binarySearch2.binarySearch(intArray8, 1);
        arrays.BinarySearch binarySearch13 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch14 = new arrays.BinarySearch();
        int[] intArray19 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int21 = binarySearch14.binarySearch(intArray19, (int) (byte) 10);
        int int23 = binarySearch13.binarySearch(intArray19, 1);
        int int25 = binarySearch2.binarySearch(intArray19, 10);
        int int27 = binarySearch1.binarySearch(intArray19, 0);
        int int29 = binarySearch0.binarySearch(intArray19, 1);
        java.lang.Class<?> wildcardClass30 = binarySearch0.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        int[] intArray6 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int8 = binarySearch1.binarySearch(intArray6, (int) (byte) 10);
        int int10 = binarySearch0.binarySearch(intArray6, 1);
        arrays.BinarySearch binarySearch11 = new arrays.BinarySearch();
        int[] intArray16 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int18 = binarySearch11.binarySearch(intArray16, (int) (byte) 10);
        int[] intArray19 = new int[] {};
        int int21 = binarySearch11.binarySearch(intArray19, (int) (byte) 1);
        arrays.BinarySearch binarySearch22 = new arrays.BinarySearch();
        int[] intArray27 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int29 = binarySearch22.binarySearch(intArray27, (int) (byte) 10);
        int int31 = binarySearch11.binarySearch(intArray27, (int) (short) 0);
        int int33 = binarySearch0.binarySearch(intArray27, (int) (short) 0);
        arrays.BinarySearch binarySearch34 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch35 = new arrays.BinarySearch();
        int[] intArray40 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int42 = binarySearch35.binarySearch(intArray40, (int) (byte) 10);
        int int44 = binarySearch34.binarySearch(intArray40, 1);
        arrays.BinarySearch binarySearch45 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch46 = new arrays.BinarySearch();
        int[] intArray51 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int53 = binarySearch46.binarySearch(intArray51, (int) (byte) 10);
        int int55 = binarySearch45.binarySearch(intArray51, 1);
        int int57 = binarySearch34.binarySearch(intArray51, 10);
        arrays.BinarySearch binarySearch58 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch59 = new arrays.BinarySearch();
        int[] intArray64 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int66 = binarySearch59.binarySearch(intArray64, (int) (byte) 10);
        int int68 = binarySearch58.binarySearch(intArray64, 1);
        int int70 = binarySearch34.binarySearch(intArray64, 10);
        int int72 = binarySearch0.binarySearch(intArray64, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch2 = new arrays.BinarySearch();
        int[] intArray7 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int9 = binarySearch2.binarySearch(intArray7, (int) (byte) 10);
        int int11 = binarySearch1.binarySearch(intArray7, 1);
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch13 = new arrays.BinarySearch();
        int[] intArray18 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int20 = binarySearch13.binarySearch(intArray18, (int) (byte) 10);
        int int22 = binarySearch12.binarySearch(intArray18, 1);
        int int24 = binarySearch1.binarySearch(intArray18, 10);
        int int26 = binarySearch0.binarySearch(intArray18, 0);
        arrays.BinarySearch binarySearch27 = new arrays.BinarySearch();
        int[] intArray32 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int34 = binarySearch27.binarySearch(intArray32, (int) (byte) 10);
        int[] intArray35 = new int[] {};
        int int37 = binarySearch27.binarySearch(intArray35, (int) (byte) 1);
        arrays.BinarySearch binarySearch38 = new arrays.BinarySearch();
        int[] intArray43 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int45 = binarySearch38.binarySearch(intArray43, (int) (byte) 10);
        int int47 = binarySearch27.binarySearch(intArray43, (int) (short) 0);
        int int49 = binarySearch0.binarySearch(intArray43, (int) (byte) 100);
        java.lang.Class<?> wildcardClass50 = binarySearch0.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] {});
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        int[] intArray6 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int8 = binarySearch1.binarySearch(intArray6, (int) (byte) 10);
        int int10 = binarySearch0.binarySearch(intArray6, 1);
        arrays.BinarySearch binarySearch11 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        int[] intArray17 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int19 = binarySearch12.binarySearch(intArray17, (int) (byte) 10);
        int int21 = binarySearch11.binarySearch(intArray17, 1);
        int int23 = binarySearch0.binarySearch(intArray17, 10);
        arrays.BinarySearch binarySearch24 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch25 = new arrays.BinarySearch();
        int[] intArray30 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int32 = binarySearch25.binarySearch(intArray30, (int) (byte) 10);
        int int34 = binarySearch24.binarySearch(intArray30, 1);
        int int36 = binarySearch0.binarySearch(intArray30, 10);
        arrays.BinarySearch binarySearch37 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch38 = new arrays.BinarySearch();
        int[] intArray43 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int45 = binarySearch38.binarySearch(intArray43, (int) (byte) 10);
        int int47 = binarySearch37.binarySearch(intArray43, 1);
        arrays.BinarySearch binarySearch48 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch49 = new arrays.BinarySearch();
        int[] intArray54 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int56 = binarySearch49.binarySearch(intArray54, (int) (byte) 10);
        int int58 = binarySearch48.binarySearch(intArray54, 1);
        int int60 = binarySearch37.binarySearch(intArray54, 10);
        arrays.BinarySearch binarySearch61 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch62 = new arrays.BinarySearch();
        int[] intArray67 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int69 = binarySearch62.binarySearch(intArray67, (int) (byte) 10);
        int int71 = binarySearch61.binarySearch(intArray67, 1);
        int int73 = binarySearch37.binarySearch(intArray67, 10);
        arrays.BinarySearch binarySearch74 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch75 = new arrays.BinarySearch();
        int[] intArray80 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int82 = binarySearch75.binarySearch(intArray80, (int) (byte) 10);
        int int84 = binarySearch74.binarySearch(intArray80, 1);
        int int86 = binarySearch37.binarySearch(intArray80, (int) (byte) 10);
        int[] intArray89 = new int[] { ' ', 100 };
        int int91 = binarySearch37.binarySearch(intArray89, 1);
        int int93 = binarySearch0.binarySearch(intArray89, (int) (byte) 100);
        int[] intArray94 = new int[] {};
        int int96 = binarySearch0.binarySearch(intArray94, 0);
        java.lang.Class<?> wildcardClass97 = intArray94.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertArrayEquals(intArray80, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertArrayEquals(intArray89, new int[] { 32, 100 });
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 1 + "'", int93 == 1);
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertArrayEquals(intArray94, new int[] {});
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        int[] intArray5 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int7 = binarySearch0.binarySearch(intArray5, (int) (byte) 10);
        arrays.BinarySearch binarySearch8 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch9 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch10 = new arrays.BinarySearch();
        int[] intArray15 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int17 = binarySearch10.binarySearch(intArray15, (int) (byte) 10);
        int int19 = binarySearch9.binarySearch(intArray15, 1);
        arrays.BinarySearch binarySearch20 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch21 = new arrays.BinarySearch();
        int[] intArray26 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int28 = binarySearch21.binarySearch(intArray26, (int) (byte) 10);
        int int30 = binarySearch20.binarySearch(intArray26, 1);
        int int32 = binarySearch9.binarySearch(intArray26, 10);
        int int34 = binarySearch8.binarySearch(intArray26, 0);
        arrays.BinarySearch binarySearch35 = new arrays.BinarySearch();
        int[] intArray40 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int42 = binarySearch35.binarySearch(intArray40, (int) (byte) 10);
        int[] intArray43 = new int[] {};
        int int45 = binarySearch35.binarySearch(intArray43, (int) (byte) 1);
        arrays.BinarySearch binarySearch46 = new arrays.BinarySearch();
        int[] intArray51 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int53 = binarySearch46.binarySearch(intArray51, (int) (byte) 10);
        int int55 = binarySearch35.binarySearch(intArray51, (int) (short) 0);
        int int57 = binarySearch8.binarySearch(intArray51, (int) (byte) 100);
        int int59 = binarySearch0.binarySearch(intArray51, (int) '#');
        java.lang.Class<?> wildcardClass60 = intArray51.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] {});
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        int[] intArray6 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int8 = binarySearch1.binarySearch(intArray6, (int) (byte) 10);
        int int10 = binarySearch0.binarySearch(intArray6, 1);
        arrays.BinarySearch binarySearch11 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        int[] intArray17 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int19 = binarySearch12.binarySearch(intArray17, (int) (byte) 10);
        int int21 = binarySearch11.binarySearch(intArray17, 1);
        int int23 = binarySearch0.binarySearch(intArray17, 10);
        arrays.BinarySearch binarySearch24 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch25 = new arrays.BinarySearch();
        int[] intArray30 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int32 = binarySearch25.binarySearch(intArray30, (int) (byte) 10);
        int int34 = binarySearch24.binarySearch(intArray30, 1);
        arrays.BinarySearch binarySearch35 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch36 = new arrays.BinarySearch();
        int[] intArray41 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int43 = binarySearch36.binarySearch(intArray41, (int) (byte) 10);
        int int45 = binarySearch35.binarySearch(intArray41, 1);
        int int47 = binarySearch24.binarySearch(intArray41, 10);
        int int49 = binarySearch0.binarySearch(intArray41, (-1));
        java.lang.Class<?> wildcardClass50 = binarySearch0.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch2 = new arrays.BinarySearch();
        int[] intArray7 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int9 = binarySearch2.binarySearch(intArray7, (int) (byte) 10);
        int int11 = binarySearch1.binarySearch(intArray7, 1);
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch13 = new arrays.BinarySearch();
        int[] intArray18 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int20 = binarySearch13.binarySearch(intArray18, (int) (byte) 10);
        int int22 = binarySearch12.binarySearch(intArray18, 1);
        int int24 = binarySearch1.binarySearch(intArray18, 10);
        int int26 = binarySearch0.binarySearch(intArray18, 0);
        arrays.BinarySearch binarySearch27 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch28 = new arrays.BinarySearch();
        int[] intArray33 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int35 = binarySearch28.binarySearch(intArray33, (int) (byte) 10);
        int int37 = binarySearch27.binarySearch(intArray33, 1);
        arrays.BinarySearch binarySearch38 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch39 = new arrays.BinarySearch();
        int[] intArray44 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int46 = binarySearch39.binarySearch(intArray44, (int) (byte) 10);
        int int48 = binarySearch38.binarySearch(intArray44, 1);
        int int50 = binarySearch27.binarySearch(intArray44, 10);
        arrays.BinarySearch binarySearch51 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch52 = new arrays.BinarySearch();
        int[] intArray57 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int59 = binarySearch52.binarySearch(intArray57, (int) (byte) 10);
        int int61 = binarySearch51.binarySearch(intArray57, 1);
        int int63 = binarySearch27.binarySearch(intArray57, 10);
        arrays.BinarySearch binarySearch64 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch65 = new arrays.BinarySearch();
        int[] intArray70 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int72 = binarySearch65.binarySearch(intArray70, (int) (byte) 10);
        int int74 = binarySearch64.binarySearch(intArray70, 1);
        int int76 = binarySearch27.binarySearch(intArray70, (int) (byte) 10);
        int[] intArray79 = new int[] { ' ', 100 };
        int int81 = binarySearch27.binarySearch(intArray79, 1);
        arrays.BinarySearch binarySearch82 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch83 = new arrays.BinarySearch();
        int[] intArray88 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int90 = binarySearch83.binarySearch(intArray88, (int) (byte) 10);
        int int92 = binarySearch82.binarySearch(intArray88, 1);
        int int94 = binarySearch27.binarySearch(intArray88, (int) 'a');
        int int96 = binarySearch0.binarySearch(intArray88, (int) (byte) 0);
        java.lang.Class<?> wildcardClass97 = binarySearch0.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertArrayEquals(intArray79, new int[] { 32, 100 });
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertArrayEquals(intArray88, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 3 + "'", int94 == 3);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch2 = new arrays.BinarySearch();
        int[] intArray7 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int9 = binarySearch2.binarySearch(intArray7, (int) (byte) 10);
        int int11 = binarySearch1.binarySearch(intArray7, 1);
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch13 = new arrays.BinarySearch();
        int[] intArray18 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int20 = binarySearch13.binarySearch(intArray18, (int) (byte) 10);
        int int22 = binarySearch12.binarySearch(intArray18, 1);
        int int24 = binarySearch1.binarySearch(intArray18, 10);
        int int26 = binarySearch0.binarySearch(intArray18, 0);
        arrays.BinarySearch binarySearch27 = new arrays.BinarySearch();
        int[] intArray32 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int34 = binarySearch27.binarySearch(intArray32, (int) (byte) 10);
        int[] intArray35 = new int[] {};
        int int37 = binarySearch27.binarySearch(intArray35, (int) (byte) 1);
        arrays.BinarySearch binarySearch38 = new arrays.BinarySearch();
        int[] intArray43 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int45 = binarySearch38.binarySearch(intArray43, (int) (byte) 10);
        int int47 = binarySearch27.binarySearch(intArray43, (int) (short) 0);
        int int49 = binarySearch0.binarySearch(intArray43, (int) (byte) 100);
        arrays.BinarySearch binarySearch50 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch51 = new arrays.BinarySearch();
        int[] intArray56 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int58 = binarySearch51.binarySearch(intArray56, (int) (byte) 10);
        int int60 = binarySearch50.binarySearch(intArray56, 1);
        arrays.BinarySearch binarySearch61 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch62 = new arrays.BinarySearch();
        int[] intArray67 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int69 = binarySearch62.binarySearch(intArray67, (int) (byte) 10);
        int int71 = binarySearch61.binarySearch(intArray67, 1);
        int int73 = binarySearch50.binarySearch(intArray67, 10);
        arrays.BinarySearch binarySearch74 = new arrays.BinarySearch();
        int[] intArray79 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int81 = binarySearch74.binarySearch(intArray79, (int) (byte) 10);
        int[] intArray82 = new int[] {};
        int int84 = binarySearch74.binarySearch(intArray82, (int) (byte) 1);
        int[] intArray88 = new int[] { (byte) -1, 0, 3 };
        int int90 = binarySearch74.binarySearch(intArray88, (int) (byte) 100);
        int int92 = binarySearch50.binarySearch(intArray88, (int) ' ');
        int int94 = binarySearch0.binarySearch(intArray88, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] {});
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertArrayEquals(intArray79, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertArrayEquals(intArray82, new int[] {});
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertArrayEquals(intArray88, new int[] { (-1), 0, 3 });
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        int[] intArray6 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int8 = binarySearch1.binarySearch(intArray6, (int) (byte) 10);
        int int10 = binarySearch0.binarySearch(intArray6, 1);
        arrays.BinarySearch binarySearch11 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        int[] intArray17 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int19 = binarySearch12.binarySearch(intArray17, (int) (byte) 10);
        int int21 = binarySearch11.binarySearch(intArray17, 1);
        int int23 = binarySearch0.binarySearch(intArray17, 10);
        arrays.BinarySearch binarySearch24 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch25 = new arrays.BinarySearch();
        int[] intArray30 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int32 = binarySearch25.binarySearch(intArray30, (int) (byte) 10);
        int int34 = binarySearch24.binarySearch(intArray30, 1);
        int int36 = binarySearch0.binarySearch(intArray30, 10);
        arrays.BinarySearch binarySearch37 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch38 = new arrays.BinarySearch();
        int[] intArray43 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int45 = binarySearch38.binarySearch(intArray43, (int) (byte) 10);
        int int47 = binarySearch37.binarySearch(intArray43, 1);
        int int49 = binarySearch0.binarySearch(intArray43, (int) (byte) 10);
        java.lang.Class<?> wildcardClass50 = intArray43.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch2 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch3 = new arrays.BinarySearch();
        int[] intArray8 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int10 = binarySearch3.binarySearch(intArray8, (int) (byte) 10);
        int int12 = binarySearch2.binarySearch(intArray8, 1);
        arrays.BinarySearch binarySearch13 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch14 = new arrays.BinarySearch();
        int[] intArray19 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int21 = binarySearch14.binarySearch(intArray19, (int) (byte) 10);
        int int23 = binarySearch13.binarySearch(intArray19, 1);
        int int25 = binarySearch2.binarySearch(intArray19, 10);
        int int27 = binarySearch1.binarySearch(intArray19, 0);
        arrays.BinarySearch binarySearch28 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch29 = new arrays.BinarySearch();
        int[] intArray34 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int36 = binarySearch29.binarySearch(intArray34, (int) (byte) 10);
        int int38 = binarySearch28.binarySearch(intArray34, 1);
        arrays.BinarySearch binarySearch39 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch40 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch41 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch42 = new arrays.BinarySearch();
        int[] intArray47 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int49 = binarySearch42.binarySearch(intArray47, (int) (byte) 10);
        int int51 = binarySearch41.binarySearch(intArray47, 1);
        arrays.BinarySearch binarySearch52 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch53 = new arrays.BinarySearch();
        int[] intArray58 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int60 = binarySearch53.binarySearch(intArray58, (int) (byte) 10);
        int int62 = binarySearch52.binarySearch(intArray58, 1);
        int int64 = binarySearch41.binarySearch(intArray58, 10);
        int int66 = binarySearch40.binarySearch(intArray58, 0);
        int int68 = binarySearch39.binarySearch(intArray58, 1);
        int int70 = binarySearch28.binarySearch(intArray58, 10);
        int int72 = binarySearch1.binarySearch(intArray58, (int) '#');
        int int74 = binarySearch0.binarySearch(intArray58, (int) (byte) 1);
        java.lang.Class<?> wildcardClass75 = binarySearch0.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        int[] intArray6 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int8 = binarySearch1.binarySearch(intArray6, (int) (byte) 10);
        int int10 = binarySearch0.binarySearch(intArray6, 1);
        arrays.BinarySearch binarySearch11 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        int[] intArray17 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int19 = binarySearch12.binarySearch(intArray17, (int) (byte) 10);
        int int21 = binarySearch11.binarySearch(intArray17, 1);
        int int23 = binarySearch0.binarySearch(intArray17, 10);
        arrays.BinarySearch binarySearch24 = new arrays.BinarySearch();
        int[] intArray29 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int31 = binarySearch24.binarySearch(intArray29, (int) (byte) 10);
        int[] intArray32 = new int[] {};
        int int34 = binarySearch24.binarySearch(intArray32, (int) (byte) 1);
        int[] intArray38 = new int[] { (byte) -1, 0, 3 };
        int int40 = binarySearch24.binarySearch(intArray38, (int) (byte) 100);
        int int42 = binarySearch0.binarySearch(intArray38, (int) ' ');
        java.lang.Class<?> wildcardClass43 = binarySearch0.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] {});
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { (-1), 0, 3 });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        int[] intArray5 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int7 = binarySearch0.binarySearch(intArray5, (int) (byte) 10);
        int[] intArray8 = new int[] {};
        int int10 = binarySearch0.binarySearch(intArray8, (int) (byte) 1);
        int[] intArray14 = new int[] { (byte) -1, 0, 3 };
        int int16 = binarySearch0.binarySearch(intArray14, (int) (byte) 100);
        arrays.BinarySearch binarySearch17 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch18 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch19 = new arrays.BinarySearch();
        int[] intArray24 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int26 = binarySearch19.binarySearch(intArray24, (int) (byte) 10);
        int int28 = binarySearch18.binarySearch(intArray24, 1);
        arrays.BinarySearch binarySearch29 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch30 = new arrays.BinarySearch();
        int[] intArray35 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int37 = binarySearch30.binarySearch(intArray35, (int) (byte) 10);
        int int39 = binarySearch29.binarySearch(intArray35, 1);
        int int41 = binarySearch18.binarySearch(intArray35, 10);
        int int43 = binarySearch17.binarySearch(intArray35, 0);
        int int45 = binarySearch0.binarySearch(intArray35, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 0, 3 });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        int[] intArray5 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int7 = binarySearch0.binarySearch(intArray5, (int) (byte) 10);
        arrays.BinarySearch binarySearch8 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch9 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch10 = new arrays.BinarySearch();
        int[] intArray15 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int17 = binarySearch10.binarySearch(intArray15, (int) (byte) 10);
        int int19 = binarySearch9.binarySearch(intArray15, 1);
        arrays.BinarySearch binarySearch20 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch21 = new arrays.BinarySearch();
        int[] intArray26 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int28 = binarySearch21.binarySearch(intArray26, (int) (byte) 10);
        int int30 = binarySearch20.binarySearch(intArray26, 1);
        int int32 = binarySearch9.binarySearch(intArray26, 10);
        int int34 = binarySearch8.binarySearch(intArray26, 0);
        arrays.BinarySearch binarySearch35 = new arrays.BinarySearch();
        int[] intArray40 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int42 = binarySearch35.binarySearch(intArray40, (int) (byte) 10);
        int[] intArray43 = new int[] {};
        int int45 = binarySearch35.binarySearch(intArray43, (int) (byte) 1);
        arrays.BinarySearch binarySearch46 = new arrays.BinarySearch();
        int[] intArray51 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int53 = binarySearch46.binarySearch(intArray51, (int) (byte) 10);
        int int55 = binarySearch35.binarySearch(intArray51, (int) (short) 0);
        int int57 = binarySearch8.binarySearch(intArray51, (int) (byte) 100);
        int int59 = binarySearch0.binarySearch(intArray51, (int) '#');
        arrays.BinarySearch binarySearch60 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch61 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch62 = new arrays.BinarySearch();
        int[] intArray67 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int69 = binarySearch62.binarySearch(intArray67, (int) (byte) 10);
        int int71 = binarySearch61.binarySearch(intArray67, 1);
        arrays.BinarySearch binarySearch72 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch73 = new arrays.BinarySearch();
        int[] intArray78 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int80 = binarySearch73.binarySearch(intArray78, (int) (byte) 10);
        int int82 = binarySearch72.binarySearch(intArray78, 1);
        int int84 = binarySearch61.binarySearch(intArray78, 10);
        int int86 = binarySearch60.binarySearch(intArray78, (int) (short) -1);
        int int88 = binarySearch0.binarySearch(intArray78, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] {});
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertArrayEquals(intArray78, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        int[] intArray5 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int7 = binarySearch0.binarySearch(intArray5, (int) (byte) 10);
        int[] intArray8 = new int[] {};
        int int10 = binarySearch0.binarySearch(intArray8, (int) (byte) 1);
        arrays.BinarySearch binarySearch11 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        int[] intArray17 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int19 = binarySearch12.binarySearch(intArray17, (int) (byte) 10);
        int int21 = binarySearch11.binarySearch(intArray17, 1);
        arrays.BinarySearch binarySearch22 = new arrays.BinarySearch();
        int[] intArray27 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int29 = binarySearch22.binarySearch(intArray27, (int) (byte) 10);
        int[] intArray30 = new int[] {};
        int int32 = binarySearch22.binarySearch(intArray30, (int) (byte) 1);
        arrays.BinarySearch binarySearch33 = new arrays.BinarySearch();
        int[] intArray38 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int40 = binarySearch33.binarySearch(intArray38, (int) (byte) 10);
        int int42 = binarySearch22.binarySearch(intArray38, (int) (short) 0);
        int int44 = binarySearch11.binarySearch(intArray38, (-1));
        int int46 = binarySearch0.binarySearch(intArray38, 100);
        arrays.BinarySearch binarySearch47 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch48 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch49 = new arrays.BinarySearch();
        int[] intArray54 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int56 = binarySearch49.binarySearch(intArray54, (int) (byte) 10);
        int int58 = binarySearch48.binarySearch(intArray54, 1);
        arrays.BinarySearch binarySearch59 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch60 = new arrays.BinarySearch();
        int[] intArray65 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int67 = binarySearch60.binarySearch(intArray65, (int) (byte) 10);
        int int69 = binarySearch59.binarySearch(intArray65, 1);
        int int71 = binarySearch48.binarySearch(intArray65, 10);
        int int73 = binarySearch47.binarySearch(intArray65, (int) (short) -1);
        int int75 = binarySearch0.binarySearch(intArray65, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] {});
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        int[] intArray6 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int8 = binarySearch1.binarySearch(intArray6, (int) (byte) 10);
        int int10 = binarySearch0.binarySearch(intArray6, 1);
        arrays.BinarySearch binarySearch11 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        int[] intArray17 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int19 = binarySearch12.binarySearch(intArray17, (int) (byte) 10);
        int int21 = binarySearch11.binarySearch(intArray17, 1);
        int int23 = binarySearch0.binarySearch(intArray17, 10);
        arrays.BinarySearch binarySearch24 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch25 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch26 = new arrays.BinarySearch();
        int[] intArray31 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int33 = binarySearch26.binarySearch(intArray31, (int) (byte) 10);
        int int35 = binarySearch25.binarySearch(intArray31, 1);
        arrays.BinarySearch binarySearch36 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch37 = new arrays.BinarySearch();
        int[] intArray42 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int44 = binarySearch37.binarySearch(intArray42, (int) (byte) 10);
        int int46 = binarySearch36.binarySearch(intArray42, 1);
        int int48 = binarySearch25.binarySearch(intArray42, 10);
        int int50 = binarySearch24.binarySearch(intArray42, 0);
        arrays.BinarySearch binarySearch51 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch52 = new arrays.BinarySearch();
        int[] intArray57 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int59 = binarySearch52.binarySearch(intArray57, (int) (byte) 10);
        int int61 = binarySearch51.binarySearch(intArray57, 1);
        arrays.BinarySearch binarySearch62 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch63 = new arrays.BinarySearch();
        int[] intArray68 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int70 = binarySearch63.binarySearch(intArray68, (int) (byte) 10);
        int int72 = binarySearch62.binarySearch(intArray68, 1);
        int int74 = binarySearch51.binarySearch(intArray68, 10);
        arrays.BinarySearch binarySearch75 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch76 = new arrays.BinarySearch();
        int[] intArray81 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int83 = binarySearch76.binarySearch(intArray81, (int) (byte) 10);
        int int85 = binarySearch75.binarySearch(intArray81, 1);
        int int87 = binarySearch51.binarySearch(intArray81, 10);
        int int89 = binarySearch24.binarySearch(intArray81, (int) (short) -1);
        int int91 = binarySearch0.binarySearch(intArray81, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertArrayEquals(intArray68, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertArrayEquals(intArray81, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        int[] intArray5 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int7 = binarySearch0.binarySearch(intArray5, (int) (byte) 10);
        arrays.BinarySearch binarySearch8 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch9 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch10 = new arrays.BinarySearch();
        int[] intArray15 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int17 = binarySearch10.binarySearch(intArray15, (int) (byte) 10);
        int int19 = binarySearch9.binarySearch(intArray15, 1);
        arrays.BinarySearch binarySearch20 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch21 = new arrays.BinarySearch();
        int[] intArray26 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int28 = binarySearch21.binarySearch(intArray26, (int) (byte) 10);
        int int30 = binarySearch20.binarySearch(intArray26, 1);
        int int32 = binarySearch9.binarySearch(intArray26, 10);
        int int34 = binarySearch8.binarySearch(intArray26, 0);
        arrays.BinarySearch binarySearch35 = new arrays.BinarySearch();
        int[] intArray40 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int42 = binarySearch35.binarySearch(intArray40, (int) (byte) 10);
        int[] intArray43 = new int[] {};
        int int45 = binarySearch35.binarySearch(intArray43, (int) (byte) 1);
        arrays.BinarySearch binarySearch46 = new arrays.BinarySearch();
        int[] intArray51 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int53 = binarySearch46.binarySearch(intArray51, (int) (byte) 10);
        int int55 = binarySearch35.binarySearch(intArray51, (int) (short) 0);
        int int57 = binarySearch8.binarySearch(intArray51, (int) (byte) 100);
        int int59 = binarySearch0.binarySearch(intArray51, (int) '#');
        java.lang.Class<?> wildcardClass60 = binarySearch0.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] {});
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        int[] intArray6 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int8 = binarySearch1.binarySearch(intArray6, (int) (byte) 10);
        int int10 = binarySearch0.binarySearch(intArray6, 1);
        arrays.BinarySearch binarySearch11 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        int[] intArray17 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int19 = binarySearch12.binarySearch(intArray17, (int) (byte) 10);
        int int21 = binarySearch11.binarySearch(intArray17, 1);
        int int23 = binarySearch0.binarySearch(intArray17, 10);
        arrays.BinarySearch binarySearch24 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch25 = new arrays.BinarySearch();
        int[] intArray30 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int32 = binarySearch25.binarySearch(intArray30, (int) (byte) 10);
        int int34 = binarySearch24.binarySearch(intArray30, 1);
        int int36 = binarySearch0.binarySearch(intArray30, 10);
        arrays.BinarySearch binarySearch37 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch38 = new arrays.BinarySearch();
        int[] intArray43 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int45 = binarySearch38.binarySearch(intArray43, (int) (byte) 10);
        int int47 = binarySearch37.binarySearch(intArray43, 1);
        int int49 = binarySearch0.binarySearch(intArray43, (int) (byte) 10);
        int[] intArray52 = new int[] { ' ', 100 };
        int int54 = binarySearch0.binarySearch(intArray52, 1);
        arrays.BinarySearch binarySearch55 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch56 = new arrays.BinarySearch();
        int[] intArray61 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int63 = binarySearch56.binarySearch(intArray61, (int) (byte) 10);
        int int65 = binarySearch55.binarySearch(intArray61, 1);
        int int67 = binarySearch0.binarySearch(intArray61, (int) 'a');
        java.lang.Class<?> wildcardClass68 = intArray61.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { 32, 100 });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 3 + "'", int67 == 3);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        arrays.BinarySearch binarySearch0 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch1 = new arrays.BinarySearch();
        int[] intArray6 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int8 = binarySearch1.binarySearch(intArray6, (int) (byte) 10);
        int int10 = binarySearch0.binarySearch(intArray6, 1);
        arrays.BinarySearch binarySearch11 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch12 = new arrays.BinarySearch();
        int[] intArray17 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int19 = binarySearch12.binarySearch(intArray17, (int) (byte) 10);
        int int21 = binarySearch11.binarySearch(intArray17, 1);
        int int23 = binarySearch0.binarySearch(intArray17, 10);
        arrays.BinarySearch binarySearch24 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch25 = new arrays.BinarySearch();
        int[] intArray30 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int32 = binarySearch25.binarySearch(intArray30, (int) (byte) 10);
        int int34 = binarySearch24.binarySearch(intArray30, 1);
        int int36 = binarySearch0.binarySearch(intArray30, 10);
        arrays.BinarySearch binarySearch37 = new arrays.BinarySearch();
        arrays.BinarySearch binarySearch38 = new arrays.BinarySearch();
        int[] intArray43 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        int int45 = binarySearch38.binarySearch(intArray43, (int) (byte) 10);
        int int47 = binarySearch37.binarySearch(intArray43, 1);
        int int49 = binarySearch0.binarySearch(intArray43, (int) (byte) 10);
        int[] intArray52 = new int[] { ' ', 100 };
        int int54 = binarySearch0.binarySearch(intArray52, 1);
        java.lang.Class<?> wildcardClass55 = intArray52.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 1, 10, (-1), 97 });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { 32, 100 });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass55);
    }
}

