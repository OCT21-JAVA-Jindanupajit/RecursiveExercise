##Recursive methods
A recursive method is one which calls itself. The ability for a method to call itself allows you to more easily solve some problems that would be very difficult of imposisble to solve otherwise.

    import java.io.File;
    
    public class MainEntry {
        public static void main(String[] args) {
            walkin(new File("/home/user")); //Replace this with a suitable directory
        }
    
        /**
        * Recursive function to descend into the directory tree and find all the files
        * that end with ".mp3"
        * @param dir A file object defining the top directory
        **/
        public static void walkin(File dir) {
            String pattern = ".mp3";
            File listFile[] = dir.listFiles();
            if (listFile != null){
                for (int i = 0; i < listFile.length; i++) {
                    if (listFile[i].isDirectory()) {
                        walkin(listFile[i]);
                    } else {
                        if (listFile[i].getName().endsWith(pattern)) {
                            System.out.println(listFile[i].getPath());
                        }
                    }
                }
            }
        }
    
    }

###Assignment #1

By definition, the first two numbers in the Fibonacci sequence are either 1 and 1, or 0 and 1, depending on the chosen starting point of the sequence, and each subsequent number is the sum of the previous two.

Write a recursive method to create a Fibonacci sequence of 20 numbers.

 

###Assignment #2

Create a Java method to display the sequence of numbers in the Collatz conjecture.

The Collatz conjecture can be summarized as follows:

Take any positive integer (Links to an external site.) n. If n is even, divide it by 2 to get n / 2. If n is odd, multiply it by 3 and add 1 to obtain 3n + 1. Repeat the process until you reach a result of 1. The conjecture is that no matter what number you start with, you will always eventually reach 1.
