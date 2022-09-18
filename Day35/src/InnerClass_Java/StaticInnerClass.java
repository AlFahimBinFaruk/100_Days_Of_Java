package InnerClass_Java;


class StaticOuterClass {
    static int x = 10;
    int z=3;

    // Note : just like static attributes and methods, a static inner class does not have access to members of the outer class
    // you cannot access z inside of InnerClass but you can access x.
    static class InnerClass {
        int y = x;
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {
        StaticOuterClass.InnerClass myInner = new StaticOuterClass.InnerClass();
        System.out.println(myInner.y);
    }
}
