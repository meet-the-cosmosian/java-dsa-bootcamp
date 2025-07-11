package meet_java_fundamentals.L02_variables_datatypes;

class VariablesDemo {
    public static void main(String[] args) {

        // Primitive Variables
        int age = 30;
        float price = 99.99f;
        char grade = 'A';
        boolean isJavaFun = true;

        // Reference / Non-Primitive Variable
        String name = "Meet";
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;

        // Constant
        final float PI = 3.14F;

        // Output
        System.out.println("Name: " + name);
        System.out.println("First Mark: " + marks[0]);
        System.out.println("Is Java Fun? " + isJavaFun);
        System.out.println("Constant PI: " + PI);
    }
}
