package com.example.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;


@Entity
@Table(name="Student")
public class Student {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "student_id")
    private  long id;
    private int number;
    private String name;
//    private String major;
    private String yearOfEntry;

//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(joinColumns = @JoinColumn(name="student_id"),
//            inverseJoinColumns = @JoinColumn(name="class_id"))
//    private Collection<Class> classes;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "major_id")
    private Major major;


    @OneToMany
    @JoinTable
            (
                    name = "StudentCourse",
                    joinColumns = { @JoinColumn(name="student_id", referencedColumnName = "student_id") },
                    inverseJoinColumns = { @JoinColumn(name="course_id", referencedColumnName = "course_id", unique = true) }
            )
    private List<Course> courseList;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "depart_id")
    private Department department;

    @OneToMany(mappedBy="student")
    private Collection<Grade> grades;

    public Student() {
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Collection<Grade> getGrades() {
        return grades;
    }

    public void setGrades(Collection<Grade> grades) {
        this.grades = grades;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getMajor() {
//        return major;
//    }
//
//    public void setMajor(String major) {
//        this.major = major;
//    }

    public String getYearOfEntry() {
        return yearOfEntry;
    }

    public void setYearOfEntry(String yearOfEntry) {
        this.yearOfEntry = yearOfEntry;
    }
}
