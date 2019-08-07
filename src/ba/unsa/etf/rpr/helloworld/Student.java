package ba.unsa.etf.rpr.helloworld;

public class Student {
    String name,surname;
    int age;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        String result = "";
        result +=name;
        result += " "+surname;
        result += " ("+age+")\n";

        return result;
    }
}
