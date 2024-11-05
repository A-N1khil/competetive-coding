package persons;

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
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        person2.setName("hi!");
        java.lang.Class<?> wildcardClass5 = person2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        person2.setName("hi!");
        person2.setName("");
        java.lang.Class<?> wildcardClass7 = person2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        persons.PersonSort personSort0 = new persons.PersonSort();
        persons.Person person3 = new persons.Person("", (int) (short) 0);
        persons.Person person6 = new persons.Person("", (int) (short) 0);
        persons.Person person9 = new persons.Person("", (int) (short) 0);
        persons.Person person12 = new persons.Person("", (int) (short) 0);
        persons.Person person15 = new persons.Person("", (int) (short) 0);
        persons.Person person18 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray19 = new persons.Person[] { person3, person6, person9, person12, person15, person18 };
        personSort0.sort(personArray19);
        persons.PersonSort personSort21 = new persons.PersonSort();
        persons.Person person24 = new persons.Person("", (int) (short) 0);
        persons.Person person27 = new persons.Person("", (int) (short) 0);
        persons.Person person30 = new persons.Person("", (int) (short) 0);
        persons.Person person33 = new persons.Person("", (int) (short) 0);
        persons.Person person36 = new persons.Person("", (int) (short) 0);
        persons.Person person39 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray40 = new persons.Person[] { person24, person27, person30, person33, person36, person39 };
        personSort21.sort(personArray40);
        personSort0.sort(personArray40);
        persons.PersonSort personSort43 = new persons.PersonSort();
        persons.Person person46 = new persons.Person("", (int) (short) 0);
        persons.Person person49 = new persons.Person("", (int) (short) 0);
        persons.Person person52 = new persons.Person("", (int) (short) 0);
        persons.Person person55 = new persons.Person("", (int) (short) 0);
        persons.Person person58 = new persons.Person("", (int) (short) 0);
        persons.Person person61 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray62 = new persons.Person[] { person46, person49, person52, person55, person58, person61 };
        personSort43.sort(personArray62);
        persons.Person person66 = new persons.Person("", (int) (short) 0);
        java.lang.String str67 = person66.getName();
        persons.Person person70 = new persons.Person("", (int) (short) 0);
        persons.Person person73 = new persons.Person("", (int) (short) 0);
        java.lang.String str74 = person73.getName();
        persons.Person person77 = new persons.Person("", (int) (short) 0);
        person77.setName("hi!");
        persons.Person[] personArray80 = new persons.Person[] { person66, person70, person73, person77 };
        personSort43.sort(personArray80);
        personSort0.sort(personArray80);
        persons.Person[] personArray83 = null;
        // The following exception was thrown during execution in test generation
        try {
            personSort0.sort(personArray83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"persons\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(personArray19);
        org.junit.Assert.assertNotNull(personArray40);
        org.junit.Assert.assertNotNull(personArray62);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(personArray80);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        person2.setName("hi!");
        persons.PersonSort personSort5 = new persons.PersonSort();
        persons.Person person8 = new persons.Person("", (int) (short) 0);
        persons.Person person11 = new persons.Person("", (int) (short) 0);
        persons.Person person14 = new persons.Person("", (int) (short) 0);
        persons.Person person17 = new persons.Person("", (int) (short) 0);
        persons.Person person20 = new persons.Person("", (int) (short) 0);
        persons.Person person23 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray24 = new persons.Person[] { person8, person11, person14, person17, person20, person23 };
        personSort5.sort(personArray24);
        persons.PersonSort personSort26 = new persons.PersonSort();
        persons.Person person29 = new persons.Person("", (int) (short) 0);
        persons.Person person32 = new persons.Person("", (int) (short) 0);
        persons.Person person35 = new persons.Person("", (int) (short) 0);
        persons.Person person38 = new persons.Person("", (int) (short) 0);
        persons.Person person41 = new persons.Person("", (int) (short) 0);
        persons.Person person44 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray45 = new persons.Person[] { person29, person32, person35, person38, person41, person44 };
        personSort26.sort(personArray45);
        personSort5.sort(personArray45);
        boolean boolean48 = person2.equals((java.lang.Object) personSort5);
        person2.setName("");
        person2.setName("");
        int int53 = person2.getAge();
        java.lang.Class<?> wildcardClass54 = person2.getClass();
        org.junit.Assert.assertNotNull(personArray24);
        org.junit.Assert.assertNotNull(personArray45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        person2.setAge((int) (byte) 0);
        person2.setName("hi!");
        java.lang.Class<?> wildcardClass7 = person2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        person2.setName("hi!");
        persons.PersonSort personSort5 = new persons.PersonSort();
        persons.Person person8 = new persons.Person("", (int) (short) 0);
        persons.Person person11 = new persons.Person("", (int) (short) 0);
        persons.Person person14 = new persons.Person("", (int) (short) 0);
        persons.Person person17 = new persons.Person("", (int) (short) 0);
        persons.Person person20 = new persons.Person("", (int) (short) 0);
        persons.Person person23 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray24 = new persons.Person[] { person8, person11, person14, person17, person20, person23 };
        personSort5.sort(personArray24);
        persons.PersonSort personSort26 = new persons.PersonSort();
        persons.Person person29 = new persons.Person("", (int) (short) 0);
        persons.Person person32 = new persons.Person("", (int) (short) 0);
        persons.Person person35 = new persons.Person("", (int) (short) 0);
        persons.Person person38 = new persons.Person("", (int) (short) 0);
        persons.Person person41 = new persons.Person("", (int) (short) 0);
        persons.Person person44 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray45 = new persons.Person[] { person29, person32, person35, person38, person41, person44 };
        personSort26.sort(personArray45);
        personSort5.sort(personArray45);
        boolean boolean48 = person2.equals((java.lang.Object) personSort5);
        java.lang.String str49 = person2.getName();
        java.lang.Class<?> wildcardClass50 = person2.getClass();
        org.junit.Assert.assertNotNull(personArray24);
        org.junit.Assert.assertNotNull(personArray45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        person2.setName("hi!");
        boolean boolean6 = person2.equals((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        persons.Person person2 = new persons.Person("hi!", (int) '4');
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        person2.setName("hi!");
        persons.PersonSort personSort5 = new persons.PersonSort();
        persons.Person person8 = new persons.Person("", (int) (short) 0);
        persons.Person person11 = new persons.Person("", (int) (short) 0);
        persons.Person person14 = new persons.Person("", (int) (short) 0);
        persons.Person person17 = new persons.Person("", (int) (short) 0);
        persons.Person person20 = new persons.Person("", (int) (short) 0);
        persons.Person person23 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray24 = new persons.Person[] { person8, person11, person14, person17, person20, person23 };
        personSort5.sort(personArray24);
        persons.PersonSort personSort26 = new persons.PersonSort();
        persons.Person person29 = new persons.Person("", (int) (short) 0);
        persons.Person person32 = new persons.Person("", (int) (short) 0);
        persons.Person person35 = new persons.Person("", (int) (short) 0);
        persons.Person person38 = new persons.Person("", (int) (short) 0);
        persons.Person person41 = new persons.Person("", (int) (short) 0);
        persons.Person person44 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray45 = new persons.Person[] { person29, person32, person35, person38, person41, person44 };
        personSort26.sort(personArray45);
        personSort5.sort(personArray45);
        boolean boolean48 = person2.equals((java.lang.Object) personSort5);
        person2.setAge((int) (short) 0);
        java.lang.String str51 = person2.getName();
        org.junit.Assert.assertNotNull(personArray24);
        org.junit.Assert.assertNotNull(personArray45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        persons.Person person2 = new persons.Person("", 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        person2.setName("hi!");
        persons.PersonSort personSort5 = new persons.PersonSort();
        persons.Person person8 = new persons.Person("", (int) (short) 0);
        persons.Person person11 = new persons.Person("", (int) (short) 0);
        persons.Person person14 = new persons.Person("", (int) (short) 0);
        persons.Person person17 = new persons.Person("", (int) (short) 0);
        persons.Person person20 = new persons.Person("", (int) (short) 0);
        persons.Person person23 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray24 = new persons.Person[] { person8, person11, person14, person17, person20, person23 };
        personSort5.sort(personArray24);
        persons.PersonSort personSort26 = new persons.PersonSort();
        persons.Person person29 = new persons.Person("", (int) (short) 0);
        persons.Person person32 = new persons.Person("", (int) (short) 0);
        persons.Person person35 = new persons.Person("", (int) (short) 0);
        persons.Person person38 = new persons.Person("", (int) (short) 0);
        persons.Person person41 = new persons.Person("", (int) (short) 0);
        persons.Person person44 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray45 = new persons.Person[] { person29, person32, person35, person38, person41, person44 };
        personSort26.sort(personArray45);
        personSort5.sort(personArray45);
        boolean boolean48 = person2.equals((java.lang.Object) personSort5);
        java.lang.String str49 = person2.getName();
        person2.setName("");
        org.junit.Assert.assertNotNull(personArray24);
        org.junit.Assert.assertNotNull(personArray45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        person2.setName("hi!");
        persons.PersonSort personSort5 = new persons.PersonSort();
        persons.Person person8 = new persons.Person("", (int) (short) 0);
        persons.Person person11 = new persons.Person("", (int) (short) 0);
        persons.Person person14 = new persons.Person("", (int) (short) 0);
        persons.Person person17 = new persons.Person("", (int) (short) 0);
        persons.Person person20 = new persons.Person("", (int) (short) 0);
        persons.Person person23 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray24 = new persons.Person[] { person8, person11, person14, person17, person20, person23 };
        personSort5.sort(personArray24);
        persons.PersonSort personSort26 = new persons.PersonSort();
        persons.Person person29 = new persons.Person("", (int) (short) 0);
        persons.Person person32 = new persons.Person("", (int) (short) 0);
        persons.Person person35 = new persons.Person("", (int) (short) 0);
        persons.Person person38 = new persons.Person("", (int) (short) 0);
        persons.Person person41 = new persons.Person("", (int) (short) 0);
        persons.Person person44 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray45 = new persons.Person[] { person29, person32, person35, person38, person41, person44 };
        personSort26.sort(personArray45);
        personSort5.sort(personArray45);
        boolean boolean48 = person2.equals((java.lang.Object) personSort5);
        person2.setName("");
        person2.setName("");
        int int53 = person2.getAge();
        java.lang.String str54 = person2.getName();
        java.lang.Class<?> wildcardClass55 = person2.getClass();
        org.junit.Assert.assertNotNull(personArray24);
        org.junit.Assert.assertNotNull(personArray45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        person2.setName("hi!");
        persons.PersonSort personSort5 = new persons.PersonSort();
        persons.Person person8 = new persons.Person("", (int) (short) 0);
        persons.Person person11 = new persons.Person("", (int) (short) 0);
        persons.Person person14 = new persons.Person("", (int) (short) 0);
        persons.Person person17 = new persons.Person("", (int) (short) 0);
        persons.Person person20 = new persons.Person("", (int) (short) 0);
        persons.Person person23 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray24 = new persons.Person[] { person8, person11, person14, person17, person20, person23 };
        personSort5.sort(personArray24);
        persons.PersonSort personSort26 = new persons.PersonSort();
        persons.Person person29 = new persons.Person("", (int) (short) 0);
        persons.Person person32 = new persons.Person("", (int) (short) 0);
        persons.Person person35 = new persons.Person("", (int) (short) 0);
        persons.Person person38 = new persons.Person("", (int) (short) 0);
        persons.Person person41 = new persons.Person("", (int) (short) 0);
        persons.Person person44 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray45 = new persons.Person[] { person29, person32, person35, person38, person41, person44 };
        personSort26.sort(personArray45);
        personSort5.sort(personArray45);
        boolean boolean48 = person2.equals((java.lang.Object) personSort5);
        person2.setAge((int) (short) 0);
        person2.setName("");
        org.junit.Assert.assertNotNull(personArray24);
        org.junit.Assert.assertNotNull(personArray45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        person2.setName("hi!");
        persons.PersonSort personSort5 = new persons.PersonSort();
        persons.Person person8 = new persons.Person("", (int) (short) 0);
        persons.Person person11 = new persons.Person("", (int) (short) 0);
        persons.Person person14 = new persons.Person("", (int) (short) 0);
        persons.Person person17 = new persons.Person("", (int) (short) 0);
        persons.Person person20 = new persons.Person("", (int) (short) 0);
        persons.Person person23 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray24 = new persons.Person[] { person8, person11, person14, person17, person20, person23 };
        personSort5.sort(personArray24);
        persons.PersonSort personSort26 = new persons.PersonSort();
        persons.Person person29 = new persons.Person("", (int) (short) 0);
        persons.Person person32 = new persons.Person("", (int) (short) 0);
        persons.Person person35 = new persons.Person("", (int) (short) 0);
        persons.Person person38 = new persons.Person("", (int) (short) 0);
        persons.Person person41 = new persons.Person("", (int) (short) 0);
        persons.Person person44 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray45 = new persons.Person[] { person29, person32, person35, person38, person41, person44 };
        personSort26.sort(personArray45);
        personSort5.sort(personArray45);
        boolean boolean48 = person2.equals((java.lang.Object) personSort5);
        person2.setName("");
        person2.setName("");
        java.lang.String str53 = person2.getName();
        org.junit.Assert.assertNotNull(personArray24);
        org.junit.Assert.assertNotNull(personArray45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        person2.setName("hi!");
        person2.setAge(100);
        java.lang.String str7 = person2.getName();
        java.lang.Class<?> wildcardClass8 = person2.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        person2.setAge((int) (byte) 0);
        person2.setAge((int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = person2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        java.lang.String str3 = person2.getName();
        java.lang.String str4 = person2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        person2.setName("hi!");
        person2.setAge(100);
        java.lang.Class<?> wildcardClass7 = person2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        person2.setName("hi!");
        persons.PersonSort personSort5 = new persons.PersonSort();
        persons.Person person8 = new persons.Person("", (int) (short) 0);
        persons.Person person11 = new persons.Person("", (int) (short) 0);
        persons.Person person14 = new persons.Person("", (int) (short) 0);
        persons.Person person17 = new persons.Person("", (int) (short) 0);
        persons.Person person20 = new persons.Person("", (int) (short) 0);
        persons.Person person23 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray24 = new persons.Person[] { person8, person11, person14, person17, person20, person23 };
        personSort5.sort(personArray24);
        persons.PersonSort personSort26 = new persons.PersonSort();
        persons.Person person29 = new persons.Person("", (int) (short) 0);
        persons.Person person32 = new persons.Person("", (int) (short) 0);
        persons.Person person35 = new persons.Person("", (int) (short) 0);
        persons.Person person38 = new persons.Person("", (int) (short) 0);
        persons.Person person41 = new persons.Person("", (int) (short) 0);
        persons.Person person44 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray45 = new persons.Person[] { person29, person32, person35, person38, person41, person44 };
        personSort26.sort(personArray45);
        personSort5.sort(personArray45);
        boolean boolean48 = person2.equals((java.lang.Object) personSort5);
        person2.setAge((int) (short) 0);
        boolean boolean52 = person2.equals((java.lang.Object) (byte) -1);
        org.junit.Assert.assertNotNull(personArray24);
        org.junit.Assert.assertNotNull(personArray45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        boolean boolean4 = person2.equals((java.lang.Object) (short) -1);
        java.lang.String str5 = person2.getName();
        int int6 = person2.getAge();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        person2.setName("hi!");
        person2.setAge(100);
        java.lang.String str7 = person2.getName();
        persons.Person person10 = new persons.Person("", (int) (short) 0);
        person10.setAge((int) (byte) 0);
        person10.setAge((int) (byte) 1);
        boolean boolean15 = person2.equals((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass16 = person2.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        person2.setAge((int) (byte) 0);
        person2.setAge((int) '4');
        java.lang.String str7 = person2.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        person2.setName("hi!");
        persons.PersonSort personSort5 = new persons.PersonSort();
        persons.Person person8 = new persons.Person("", (int) (short) 0);
        persons.Person person11 = new persons.Person("", (int) (short) 0);
        persons.Person person14 = new persons.Person("", (int) (short) 0);
        persons.Person person17 = new persons.Person("", (int) (short) 0);
        persons.Person person20 = new persons.Person("", (int) (short) 0);
        persons.Person person23 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray24 = new persons.Person[] { person8, person11, person14, person17, person20, person23 };
        personSort5.sort(personArray24);
        persons.PersonSort personSort26 = new persons.PersonSort();
        persons.Person person29 = new persons.Person("", (int) (short) 0);
        persons.Person person32 = new persons.Person("", (int) (short) 0);
        persons.Person person35 = new persons.Person("", (int) (short) 0);
        persons.Person person38 = new persons.Person("", (int) (short) 0);
        persons.Person person41 = new persons.Person("", (int) (short) 0);
        persons.Person person44 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray45 = new persons.Person[] { person29, person32, person35, person38, person41, person44 };
        personSort26.sort(personArray45);
        personSort5.sort(personArray45);
        boolean boolean48 = person2.equals((java.lang.Object) personSort5);
        person2.setName("");
        person2.setName("");
        int int53 = person2.getAge();
        person2.setAge((int) '4');
        java.lang.Class<?> wildcardClass56 = person2.getClass();
        org.junit.Assert.assertNotNull(personArray24);
        org.junit.Assert.assertNotNull(personArray45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        persons.Person person2 = new persons.Person("", (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = person2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        person2.setName("hi!");
        persons.PersonSort personSort5 = new persons.PersonSort();
        persons.Person person8 = new persons.Person("", (int) (short) 0);
        persons.Person person11 = new persons.Person("", (int) (short) 0);
        persons.Person person14 = new persons.Person("", (int) (short) 0);
        persons.Person person17 = new persons.Person("", (int) (short) 0);
        persons.Person person20 = new persons.Person("", (int) (short) 0);
        persons.Person person23 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray24 = new persons.Person[] { person8, person11, person14, person17, person20, person23 };
        personSort5.sort(personArray24);
        persons.PersonSort personSort26 = new persons.PersonSort();
        persons.Person person29 = new persons.Person("", (int) (short) 0);
        persons.Person person32 = new persons.Person("", (int) (short) 0);
        persons.Person person35 = new persons.Person("", (int) (short) 0);
        persons.Person person38 = new persons.Person("", (int) (short) 0);
        persons.Person person41 = new persons.Person("", (int) (short) 0);
        persons.Person person44 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray45 = new persons.Person[] { person29, person32, person35, person38, person41, person44 };
        personSort26.sort(personArray45);
        personSort5.sort(personArray45);
        boolean boolean48 = person2.equals((java.lang.Object) personSort5);
        person2.setAge((int) (short) 0);
        boolean boolean52 = person2.equals((java.lang.Object) 100.0d);
        org.junit.Assert.assertNotNull(personArray24);
        org.junit.Assert.assertNotNull(personArray45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        persons.Person person2 = new persons.Person("hi!", (int) 'a');
        persons.Person person5 = new persons.Person("", (int) (short) 0);
        person5.setAge((int) (byte) 0);
        person5.setAge((int) '4');
        boolean boolean10 = person2.equals((java.lang.Object) '4');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        persons.PersonSort personSort0 = new persons.PersonSort();
        persons.PersonSort personSort1 = new persons.PersonSort();
        persons.PersonSort personSort2 = new persons.PersonSort();
        persons.Person person5 = new persons.Person("", (int) (short) 0);
        persons.Person person8 = new persons.Person("", (int) (short) 0);
        persons.Person person11 = new persons.Person("", (int) (short) 0);
        persons.Person person14 = new persons.Person("", (int) (short) 0);
        persons.Person person17 = new persons.Person("", (int) (short) 0);
        persons.Person person20 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray21 = new persons.Person[] { person5, person8, person11, person14, person17, person20 };
        personSort2.sort(personArray21);
        persons.Person person25 = new persons.Person("", (int) (short) 0);
        java.lang.String str26 = person25.getName();
        persons.Person person29 = new persons.Person("", (int) (short) 0);
        persons.Person person32 = new persons.Person("", (int) (short) 0);
        java.lang.String str33 = person32.getName();
        persons.Person person36 = new persons.Person("", (int) (short) 0);
        person36.setName("hi!");
        persons.Person[] personArray39 = new persons.Person[] { person25, person29, person32, person36 };
        personSort2.sort(personArray39);
        personSort1.sort(personArray39);
        personSort0.sort(personArray39);
        java.lang.Class<?> wildcardClass43 = personSort0.getClass();
        org.junit.Assert.assertNotNull(personArray21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(personArray39);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        persons.PersonSort personSort0 = new persons.PersonSort();
        persons.Person person3 = new persons.Person("", (int) (short) 0);
        persons.Person person6 = new persons.Person("", (int) (short) 0);
        persons.Person person9 = new persons.Person("", (int) (short) 0);
        persons.Person person12 = new persons.Person("", (int) (short) 0);
        persons.Person person15 = new persons.Person("", (int) (short) 0);
        persons.Person person18 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray19 = new persons.Person[] { person3, person6, person9, person12, person15, person18 };
        personSort0.sort(personArray19);
        persons.Person[] personArray21 = new persons.Person[] {};
        personSort0.sort(personArray21);
        persons.PersonSort personSort23 = new persons.PersonSort();
        persons.Person person26 = new persons.Person("", (int) (short) 0);
        persons.Person person29 = new persons.Person("", (int) (short) 0);
        persons.Person person32 = new persons.Person("", (int) (short) 0);
        persons.Person person35 = new persons.Person("", (int) (short) 0);
        persons.Person person38 = new persons.Person("", (int) (short) 0);
        persons.Person person41 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray42 = new persons.Person[] { person26, person29, person32, person35, person38, person41 };
        personSort23.sort(personArray42);
        persons.Person[] personArray44 = new persons.Person[] {};
        personSort23.sort(personArray44);
        personSort0.sort(personArray44);
        org.junit.Assert.assertNotNull(personArray19);
        org.junit.Assert.assertNotNull(personArray21);
        org.junit.Assert.assertArrayEquals(personArray21, new persons.Person[] {});
        org.junit.Assert.assertNotNull(personArray42);
        org.junit.Assert.assertNotNull(personArray44);
        org.junit.Assert.assertArrayEquals(personArray44, new persons.Person[] {});
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        person2.setName("hi!");
        persons.PersonSort personSort5 = new persons.PersonSort();
        persons.Person person8 = new persons.Person("", (int) (short) 0);
        persons.Person person11 = new persons.Person("", (int) (short) 0);
        persons.Person person14 = new persons.Person("", (int) (short) 0);
        persons.Person person17 = new persons.Person("", (int) (short) 0);
        persons.Person person20 = new persons.Person("", (int) (short) 0);
        persons.Person person23 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray24 = new persons.Person[] { person8, person11, person14, person17, person20, person23 };
        personSort5.sort(personArray24);
        persons.PersonSort personSort26 = new persons.PersonSort();
        persons.Person person29 = new persons.Person("", (int) (short) 0);
        persons.Person person32 = new persons.Person("", (int) (short) 0);
        persons.Person person35 = new persons.Person("", (int) (short) 0);
        persons.Person person38 = new persons.Person("", (int) (short) 0);
        persons.Person person41 = new persons.Person("", (int) (short) 0);
        persons.Person person44 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray45 = new persons.Person[] { person29, person32, person35, person38, person41, person44 };
        personSort26.sort(personArray45);
        personSort5.sort(personArray45);
        boolean boolean48 = person2.equals((java.lang.Object) personSort5);
        person2.setName("");
        int int51 = person2.getAge();
        boolean boolean53 = person2.equals((java.lang.Object) 100.0d);
        org.junit.Assert.assertNotNull(personArray24);
        org.junit.Assert.assertNotNull(personArray45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        persons.Person person2 = new persons.Person("", (int) (short) 10);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        person2.setName("hi!");
        person2.setAge(100);
        int int7 = person2.getAge();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        persons.Person person2 = new persons.Person("", (int) (byte) 100);
        person2.setName("hi!");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        person2.setName("hi!");
        persons.PersonSort personSort5 = new persons.PersonSort();
        persons.Person person8 = new persons.Person("", (int) (short) 0);
        persons.Person person11 = new persons.Person("", (int) (short) 0);
        persons.Person person14 = new persons.Person("", (int) (short) 0);
        persons.Person person17 = new persons.Person("", (int) (short) 0);
        persons.Person person20 = new persons.Person("", (int) (short) 0);
        persons.Person person23 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray24 = new persons.Person[] { person8, person11, person14, person17, person20, person23 };
        personSort5.sort(personArray24);
        persons.PersonSort personSort26 = new persons.PersonSort();
        persons.Person person29 = new persons.Person("", (int) (short) 0);
        persons.Person person32 = new persons.Person("", (int) (short) 0);
        persons.Person person35 = new persons.Person("", (int) (short) 0);
        persons.Person person38 = new persons.Person("", (int) (short) 0);
        persons.Person person41 = new persons.Person("", (int) (short) 0);
        persons.Person person44 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray45 = new persons.Person[] { person29, person32, person35, person38, person41, person44 };
        personSort26.sort(personArray45);
        personSort5.sort(personArray45);
        boolean boolean48 = person2.equals((java.lang.Object) personSort5);
        person2.setName("");
        persons.Person person53 = new persons.Person("", (int) (short) 0);
        person53.setName("hi!");
        person53.setName("");
        boolean boolean58 = person2.equals((java.lang.Object) "");
        person2.setName("");
        persons.Person person63 = new persons.Person("", (int) (short) 0);
        person63.setAge((int) (byte) 0);
        person63.setName("hi!");
        java.lang.String str68 = person63.getName();
        java.lang.String str69 = person63.getName();
        boolean boolean70 = person2.equals((java.lang.Object) str69);
        org.junit.Assert.assertNotNull(personArray24);
        org.junit.Assert.assertNotNull(personArray45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        person2.setName("hi!");
        person2.setAge(100);
        java.lang.String str7 = person2.getName();
        persons.Person person10 = new persons.Person("", (int) (short) 0);
        person10.setAge((int) (byte) 0);
        person10.setAge((int) (byte) 1);
        boolean boolean15 = person2.equals((java.lang.Object) (byte) 1);
        java.lang.String str16 = person2.getName();
        java.lang.String str17 = person2.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        persons.Person person2 = new persons.Person("hi!", 0);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        person2.setName("hi!");
        persons.PersonSort personSort5 = new persons.PersonSort();
        persons.Person person8 = new persons.Person("", (int) (short) 0);
        persons.Person person11 = new persons.Person("", (int) (short) 0);
        persons.Person person14 = new persons.Person("", (int) (short) 0);
        persons.Person person17 = new persons.Person("", (int) (short) 0);
        persons.Person person20 = new persons.Person("", (int) (short) 0);
        persons.Person person23 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray24 = new persons.Person[] { person8, person11, person14, person17, person20, person23 };
        personSort5.sort(personArray24);
        persons.PersonSort personSort26 = new persons.PersonSort();
        persons.Person person29 = new persons.Person("", (int) (short) 0);
        persons.Person person32 = new persons.Person("", (int) (short) 0);
        persons.Person person35 = new persons.Person("", (int) (short) 0);
        persons.Person person38 = new persons.Person("", (int) (short) 0);
        persons.Person person41 = new persons.Person("", (int) (short) 0);
        persons.Person person44 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray45 = new persons.Person[] { person29, person32, person35, person38, person41, person44 };
        personSort26.sort(personArray45);
        personSort5.sort(personArray45);
        boolean boolean48 = person2.equals((java.lang.Object) personSort5);
        person2.setName("");
        person2.setName("");
        boolean boolean54 = person2.equals((java.lang.Object) (short) 10);
        org.junit.Assert.assertNotNull(personArray24);
        org.junit.Assert.assertNotNull(personArray45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        person2.setName("hi!");
        boolean boolean6 = person2.equals((java.lang.Object) 0.0d);
        java.lang.String str7 = person2.getName();
        java.lang.Class<?> wildcardClass8 = person2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        person2.setAge((int) (byte) 0);
        java.lang.String str5 = person2.getName();
        person2.setAge((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        person2.setName("hi!");
        persons.PersonSort personSort5 = new persons.PersonSort();
        persons.Person person8 = new persons.Person("", (int) (short) 0);
        persons.Person person11 = new persons.Person("", (int) (short) 0);
        persons.Person person14 = new persons.Person("", (int) (short) 0);
        persons.Person person17 = new persons.Person("", (int) (short) 0);
        persons.Person person20 = new persons.Person("", (int) (short) 0);
        persons.Person person23 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray24 = new persons.Person[] { person8, person11, person14, person17, person20, person23 };
        personSort5.sort(personArray24);
        persons.PersonSort personSort26 = new persons.PersonSort();
        persons.Person person29 = new persons.Person("", (int) (short) 0);
        persons.Person person32 = new persons.Person("", (int) (short) 0);
        persons.Person person35 = new persons.Person("", (int) (short) 0);
        persons.Person person38 = new persons.Person("", (int) (short) 0);
        persons.Person person41 = new persons.Person("", (int) (short) 0);
        persons.Person person44 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray45 = new persons.Person[] { person29, person32, person35, person38, person41, person44 };
        personSort26.sort(personArray45);
        personSort5.sort(personArray45);
        boolean boolean48 = person2.equals((java.lang.Object) personSort5);
        person2.setName("");
        person2.setAge((int) (short) 10);
        int int53 = person2.getAge();
        org.junit.Assert.assertNotNull(personArray24);
        org.junit.Assert.assertNotNull(personArray45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        java.lang.String str3 = person2.getName();
        person2.setAge((int) ' ');
        person2.setName("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        person2.setName("hi!");
        persons.PersonSort personSort5 = new persons.PersonSort();
        persons.Person person8 = new persons.Person("", (int) (short) 0);
        persons.Person person11 = new persons.Person("", (int) (short) 0);
        persons.Person person14 = new persons.Person("", (int) (short) 0);
        persons.Person person17 = new persons.Person("", (int) (short) 0);
        persons.Person person20 = new persons.Person("", (int) (short) 0);
        persons.Person person23 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray24 = new persons.Person[] { person8, person11, person14, person17, person20, person23 };
        personSort5.sort(personArray24);
        persons.PersonSort personSort26 = new persons.PersonSort();
        persons.Person person29 = new persons.Person("", (int) (short) 0);
        persons.Person person32 = new persons.Person("", (int) (short) 0);
        persons.Person person35 = new persons.Person("", (int) (short) 0);
        persons.Person person38 = new persons.Person("", (int) (short) 0);
        persons.Person person41 = new persons.Person("", (int) (short) 0);
        persons.Person person44 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray45 = new persons.Person[] { person29, person32, person35, person38, person41, person44 };
        personSort26.sort(personArray45);
        personSort5.sort(personArray45);
        boolean boolean48 = person2.equals((java.lang.Object) personSort5);
        person2.setName("");
        person2.setName("");
        int int53 = person2.getAge();
        person2.setAge((int) '4');
        person2.setName("hi!");
        org.junit.Assert.assertNotNull(personArray24);
        org.junit.Assert.assertNotNull(personArray45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        persons.Person person2 = new persons.Person("", (int) '#');
        java.lang.Class<?> wildcardClass3 = person2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        person2.setName("hi!");
        person2.setAge(100);
        java.lang.String str7 = person2.getName();
        person2.setAge((int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        person2.setName("hi!");
        persons.PersonSort personSort5 = new persons.PersonSort();
        persons.Person person8 = new persons.Person("", (int) (short) 0);
        persons.Person person11 = new persons.Person("", (int) (short) 0);
        persons.Person person14 = new persons.Person("", (int) (short) 0);
        persons.Person person17 = new persons.Person("", (int) (short) 0);
        persons.Person person20 = new persons.Person("", (int) (short) 0);
        persons.Person person23 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray24 = new persons.Person[] { person8, person11, person14, person17, person20, person23 };
        personSort5.sort(personArray24);
        persons.PersonSort personSort26 = new persons.PersonSort();
        persons.Person person29 = new persons.Person("", (int) (short) 0);
        persons.Person person32 = new persons.Person("", (int) (short) 0);
        persons.Person person35 = new persons.Person("", (int) (short) 0);
        persons.Person person38 = new persons.Person("", (int) (short) 0);
        persons.Person person41 = new persons.Person("", (int) (short) 0);
        persons.Person person44 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray45 = new persons.Person[] { person29, person32, person35, person38, person41, person44 };
        personSort26.sort(personArray45);
        personSort5.sort(personArray45);
        boolean boolean48 = person2.equals((java.lang.Object) personSort5);
        person2.setName("");
        persons.Person person53 = new persons.Person("", (int) (short) 0);
        person53.setName("hi!");
        person53.setName("");
        boolean boolean58 = person2.equals((java.lang.Object) "");
        boolean boolean60 = person2.equals((java.lang.Object) 1.0d);
        java.lang.String str61 = person2.getName();
        person2.setAge((int) (byte) 100);
        org.junit.Assert.assertNotNull(personArray24);
        org.junit.Assert.assertNotNull(personArray45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        person2.setAge((int) (byte) 0);
        person2.setName("hi!");
        java.lang.String str7 = person2.getName();
        java.lang.String str8 = person2.getName();
        java.lang.String str9 = person2.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        persons.PersonSort personSort0 = new persons.PersonSort();
        persons.PersonSort personSort1 = new persons.PersonSort();
        persons.Person person4 = new persons.Person("", (int) (short) 0);
        persons.Person person7 = new persons.Person("", (int) (short) 0);
        persons.Person person10 = new persons.Person("", (int) (short) 0);
        persons.Person person13 = new persons.Person("", (int) (short) 0);
        persons.Person person16 = new persons.Person("", (int) (short) 0);
        persons.Person person19 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray20 = new persons.Person[] { person4, person7, person10, person13, person16, person19 };
        personSort1.sort(personArray20);
        persons.Person person24 = new persons.Person("", (int) (short) 0);
        java.lang.String str25 = person24.getName();
        persons.Person person28 = new persons.Person("", (int) (short) 0);
        persons.Person person31 = new persons.Person("", (int) (short) 0);
        java.lang.String str32 = person31.getName();
        persons.Person person35 = new persons.Person("", (int) (short) 0);
        person35.setName("hi!");
        persons.Person[] personArray38 = new persons.Person[] { person24, person28, person31, person35 };
        personSort1.sort(personArray38);
        personSort0.sort(personArray38);
        persons.PersonSort personSort41 = new persons.PersonSort();
        persons.Person person44 = new persons.Person("", (int) (short) 0);
        persons.Person person47 = new persons.Person("", (int) (short) 0);
        persons.Person person50 = new persons.Person("", (int) (short) 0);
        persons.Person person53 = new persons.Person("", (int) (short) 0);
        persons.Person person56 = new persons.Person("", (int) (short) 0);
        persons.Person person59 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray60 = new persons.Person[] { person44, person47, person50, person53, person56, person59 };
        personSort41.sort(personArray60);
        personSort0.sort(personArray60);
        org.junit.Assert.assertNotNull(personArray20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(personArray38);
        org.junit.Assert.assertNotNull(personArray60);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        person2.setName("hi!");
        persons.PersonSort personSort5 = new persons.PersonSort();
        persons.Person person8 = new persons.Person("", (int) (short) 0);
        persons.Person person11 = new persons.Person("", (int) (short) 0);
        persons.Person person14 = new persons.Person("", (int) (short) 0);
        persons.Person person17 = new persons.Person("", (int) (short) 0);
        persons.Person person20 = new persons.Person("", (int) (short) 0);
        persons.Person person23 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray24 = new persons.Person[] { person8, person11, person14, person17, person20, person23 };
        personSort5.sort(personArray24);
        persons.PersonSort personSort26 = new persons.PersonSort();
        persons.Person person29 = new persons.Person("", (int) (short) 0);
        persons.Person person32 = new persons.Person("", (int) (short) 0);
        persons.Person person35 = new persons.Person("", (int) (short) 0);
        persons.Person person38 = new persons.Person("", (int) (short) 0);
        persons.Person person41 = new persons.Person("", (int) (short) 0);
        persons.Person person44 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray45 = new persons.Person[] { person29, person32, person35, person38, person41, person44 };
        personSort26.sort(personArray45);
        personSort5.sort(personArray45);
        boolean boolean48 = person2.equals((java.lang.Object) personSort5);
        person2.setName("");
        person2.setAge((int) (short) 10);
        java.lang.Class<?> wildcardClass53 = person2.getClass();
        org.junit.Assert.assertNotNull(personArray24);
        org.junit.Assert.assertNotNull(personArray45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        persons.Person person2 = new persons.Person("hi!", (int) (byte) -1);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        person2.setName("hi!");
        person2.setAge((int) (byte) 0);
        persons.Person person9 = new persons.Person("", (int) (short) 0);
        person9.setName("hi!");
        persons.PersonSort personSort12 = new persons.PersonSort();
        persons.Person person15 = new persons.Person("", (int) (short) 0);
        persons.Person person18 = new persons.Person("", (int) (short) 0);
        persons.Person person21 = new persons.Person("", (int) (short) 0);
        persons.Person person24 = new persons.Person("", (int) (short) 0);
        persons.Person person27 = new persons.Person("", (int) (short) 0);
        persons.Person person30 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray31 = new persons.Person[] { person15, person18, person21, person24, person27, person30 };
        personSort12.sort(personArray31);
        persons.PersonSort personSort33 = new persons.PersonSort();
        persons.Person person36 = new persons.Person("", (int) (short) 0);
        persons.Person person39 = new persons.Person("", (int) (short) 0);
        persons.Person person42 = new persons.Person("", (int) (short) 0);
        persons.Person person45 = new persons.Person("", (int) (short) 0);
        persons.Person person48 = new persons.Person("", (int) (short) 0);
        persons.Person person51 = new persons.Person("", (int) (short) 0);
        persons.Person[] personArray52 = new persons.Person[] { person36, person39, person42, person45, person48, person51 };
        personSort33.sort(personArray52);
        personSort12.sort(personArray52);
        boolean boolean55 = person9.equals((java.lang.Object) personSort12);
        person9.setName("");
        persons.Person person60 = new persons.Person("", (int) (short) 0);
        person60.setName("hi!");
        person60.setName("");
        boolean boolean65 = person9.equals((java.lang.Object) "");
        boolean boolean66 = person2.equals((java.lang.Object) person9);
        org.junit.Assert.assertNotNull(personArray31);
        org.junit.Assert.assertNotNull(personArray52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        persons.Person person2 = new persons.Person("", 100);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        persons.Person person2 = new persons.Person("hi!", (int) 'a');
        person2.setAge((-1));
        persons.Person person7 = new persons.Person("", (int) (short) 0);
        person7.setName("hi!");
        person7.setAge(100);
        java.lang.String str12 = person7.getName();
        boolean boolean13 = person2.equals((java.lang.Object) person7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        persons.Person person2 = new persons.Person("", (int) (short) 0);
        person2.setAge((int) (byte) 0);
        person2.setAge((int) '4');
        int int7 = person2.getAge();
        java.lang.String str8 = person2.getName();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }
}

