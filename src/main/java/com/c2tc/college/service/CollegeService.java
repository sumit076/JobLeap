package com.c2tc.college.service;

import com.c2tc.college.model.College;
import com.c2tc.college.repositry.CollegeRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class CollegeService {
    @Autowired
    private CollegeRepositry repositry;
    public College saveCollege(College college){
        return repositry.save(college);
    }
    public Optional<College> getCollegeById(long id){
        return repositry.findById(id);
    }

    public String deleteCollege(long id){
        repositry.deleteById(id);
        return "college deleted";
    }
    public College updateCollege(College college){
        College existingcollege = repositry.findById(college.getId()).orElse(null);
        existingcollege.setCollegeAdmin(college.getCollegeAdmin());
        existingcollege.setCollegeName(college.getCollegeName());
        return repositry.save(existingcollege);
    }
}
