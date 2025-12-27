/**
 * Java Basics: Introduction to Java
 * 
 * What is Java?
 * - High-level, object-oriented programming language developed by Sun Microsystems (1995), now maintained by Oracle.
 * - Platform-independent (Write Once, Run Anywhere) thanks to JVM (Java Virtual Machine).
 * - Widely used for backend development (Spring Boot), Android apps, enterprise systems.
 * - Key features: Simple, secure, robust, portable, multi-threaded.
 * 
 * Why Java for Backend?
 * - Excellent ecosystem (Spring Boot for REST APIs).
 * - Large community, strong demand for freshers in India.
 * 
 * Basic Program Structure
 * - public class ClassName {
 * -     public static void main(String[] args) {
 * -         // code here
 * -     }
 * - }
 * 
 * Topics Covered in This File:
 * - Variables and Data Types
 * - Operators
 * - Simple Output
 */

public class IntroductionToJava {
    public static void main(String[] args) {
        // Variables and Data Types
        int age = 25;                        // whole number
        double salary = 45000.50;            // decimal number
        char grade = 'A';                    // single character
        boolean isStudent = true;            // true or false
        String name = "Your Name";           // text

        // Output
        System.out.println("Hello, " + name + "!");
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        // Operators
        int a = 10, b = 5;
        System.out.println("a + b = " + (a + b));  // 15
        System.out.println("a - b = " + (a - b));  // 5
        System.out.println("a * b = " + (a * b));  // 50
        System.out.println("a / b = " + (a / b));  // 2
        System.out.println("a % b = " + (a % b));  // 0

        // Comparison operators
        System.out.println("a > b: " + (a > b));   // true
    }
}
