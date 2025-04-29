package problem_solving3;

public class Language {
//48. How to create constructor overloading in java Program
    String name;
    Language() {
        System.out.println("Constructor method called.");
    }
    Language(String t) {
        name = t;
    }
    public static void main(String[] args) {
        Language cpp = new Language();
        Language java = new Language("Java");
        cpp.setName("C++");
        java.getName();
        cpp.getName();
    }
    void setName(String t) {
        name = t;
    }
    void getName() {
        System.out.println("Language name: " + name);
    }
}
