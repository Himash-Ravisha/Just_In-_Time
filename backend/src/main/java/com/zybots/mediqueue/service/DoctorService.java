package com.zybots.mediqueue.service;

import com.zybots.mediqueue.model.Doctor;
import com.zybots.mediqueue.repository.DoctorRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    // Spring Boot automatically provides the repository here
    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    // A method to get a list of all doctors in the system
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }
}
