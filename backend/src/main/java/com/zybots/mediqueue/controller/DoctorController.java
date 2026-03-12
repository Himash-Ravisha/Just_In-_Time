package com.zybots.mediqueue.controller;

import com.zybots.mediqueue.model.Doctor;
import com.zybots.mediqueue.service.DoctorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/doctors") // This is the base URL for this controller
public class DoctorController {

    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    // When Flutter makes a GET request to "http://your-server/api/doctors", this runs!
    @GetMapping
    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctors();
    }
}
