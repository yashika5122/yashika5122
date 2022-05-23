package collectionExample;

import java.util.*;

public class Student implements Comparable<Student>{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(Student s) {
        if(id==s.id){
            return getName().compareTo(s.getName());
        }else if(id>s.id){
            return 1;
        }else {
            return -1;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
//        Set<Student> students = new HashSet<>();
        Student s1=new Student(101,"yashika");
        Student s2=new Student(109,"manoj");
        Student s3=new Student(105,"Asha");
        Student s4=new Student(104,"pinki");
        Student s5=new Student(101,"harsh");

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
//        Collections.sort(students); // for Comparable
        Collections.sort(students,new IdComparator()); // for comparator
        System.out.println(students);
    }
}
