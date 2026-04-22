package com.patika.java101.obs;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int oralNote;
    double oralWeight;

    public Course(String name, String code, String prefix, double oralWeight) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.oralNote = 0;
        this.oralWeight = oralWeight;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("Operation successful");
        } else {
            System.out.println(t.name + " cannot teach this course.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println("Instructor of " + this.name + " course: " + courseTeacher.name);
        } else {
            System.out.println("No instructor has been assigned to " + this.name + " course.");
        }
    }
}
