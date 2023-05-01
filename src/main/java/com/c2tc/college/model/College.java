package com.c2tc.college.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="college")
public class College {


    @Id
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCollegeAdmin() {
        return collegeAdmin;
    }

    public void setCollegeAdmin(String collegeAdmin) {
        this.collegeAdmin = collegeAdmin;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private String collegeAdmin;
    private String collegeName;
    private String location;
}
