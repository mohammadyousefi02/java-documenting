package org.example;

/**
 * this is TestDocument class for test documenting java
 */
public class TestDocument {
    /**
     * this is first field
     */
    private String a;

    /**
     * this is the second field
     */
    private String b;

    /**
     *  this is for testing the code true
     * {@code true}
     */
    public void testCodeTrue() {
        System.out.println("code true");
    }

    /**
     * this is for testing the code false
     * {@code false}
     */
    public void testCodeFalse() {
        System.out.println("code false");
    }

    /**
     * this is for testing both of them
     * {@code System.out.println("code")}
     */
    public void testCode() {
        System.out.println("code");
    }

    /**
     * this is the getter of a
     * @return value of a : String
     */
    public String getA() {
        return a;
    }

    /**
     * setter of a
     * @param a the new value of a
     */
    public void setA(String a) {
        this.a = a;
    }


    /**
     *
     * @return the value of b : String
     */
    public String getB() {
        return b;
    }

    /**
     * setter of b
     * @param b the new value of b
     */
    public void setB(String b) {
        this.b = b;
    }
}
