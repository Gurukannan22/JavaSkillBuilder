package javaLearning.Week1.Basics;
// Variables and Types
// Although Java is object oriented, not all types are objects. It is built on top of basic variable types called primitives.

// Here is a list of all primitives in Java:

// byte (number, 1 byte)
// short (number, 2 bytes)
// int (number, 4 bytes)
// long (number, 8 bytes)
// float (float number, 4 bytes)
// double (float number, 8 bytes)
// char (a character, 2 bytes)
// boolean (true or false, 1 byte)
// Java is a strong typed language, which means variables need to be defined before we use them.
public class VariablesTypes{
          public static void main (String[] args){
                    int a = 34;
                    int first;
                    first = 68;
                    double d = 8.6;
                    d = 5.0;
                    float f = (float) 6.9;
                    float fl = 45.98f;
                    char c = 'g'; // char only able to store the 2 bytes of data.
                    System.out.println(a +" "+ first +" "+ d +" "+ f +" "+ fl +" "+ c);

                    //Create a String with a contructor
                    String string1 = new String("Who let the dogs out ?\n"); // string object stored in a heap memory
                    String string2 = "Who who who....";
                    String string3 = string1 + string2;
                    System.out.println(string3);

                    int number = 123;
                    String str1 = "Hi I'm gonna call out " + number + " then you're good to go";
                    System.out.println(str1);

                    boolean bool = false;
                    bool = true;
                    boolean tobe = false;
                    bool = tobe || !tobe;
                    if (bool){
                              System.out.println(tobe);
                    }

          }
          
}
