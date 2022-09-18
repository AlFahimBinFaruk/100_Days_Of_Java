package InnerClass_Java;

class MyOuterClass {
    int x = 10;

    private class InnerClass {
        int y = 5;
    }
}

public class PrivateInnerClass {
    public static void main(String[] args) {
        MyOuterClass myOuter = new MyOuterClass();
       // MyOuterClass.InnerClass myInner = myOuter.new InnerClass();//If you try to access a private inner class from an outside class, this will give error
       // System.out.println(myInner.y + myOuter.x);
    }
}
