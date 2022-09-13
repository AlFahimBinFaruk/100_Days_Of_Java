package JavaPackages.UserDefinedPackages.TestPackage;

//import JavaPackages.UserDefinedPackages.PackageOne.Cat;
//import JavaPackages.UserDefinedPackages.PackageOne.Dog;
import JavaPackages.UserDefinedPackages.PackageOne.*;
import JavaPackages.UserDefinedPackages.PackageTwo.*;


public class Test {
    public static void main(String[] args){
        // package one
        Cat myCat=new Cat();
        Dog myDog=new Dog();

        //package two
        Cow myCow=new Cow();

        // Donkey is available in both PackageTwo and TestPackage but
        // This will print TestPackage donkey because it is a local package.
        Donkey myDonkey=new Donkey();

        // to access package two donkey
        JavaPackages.UserDefinedPackages.PackageTwo.Donkey myPackageTwoDonkey=new JavaPackages.UserDefinedPackages.PackageTwo.Donkey();
    }
}
