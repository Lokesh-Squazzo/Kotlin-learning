package _3_functions;
public class TestClassForKotlinFunction {
    static void main() {
        Util.multiOfTwo(2,3);
//        Util2.printChar();// this will give error because i will require 2 arg.
        Util2.printChar('^',10); //this will work.
        System.out.println();
        Util2.testWorkingOfJvmOverloads();
        System.out.println();
        Util2.testWorkingOfJvmOverloads('%');
    }
}
