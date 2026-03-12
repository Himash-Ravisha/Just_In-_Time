package com.zybots.mediqueue.controller;

import com.zybots.mediqueue.model.Patient;
import com.zybots.mediqueue.service.PatientService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    // Flutter sends a POST request here to create an account
    @PostMapping("/register")
    public Patient registerPatient(@RequestBody Patient patient) {
        return patientService.registerPatient(patient);
    }

    // Flutter sends a GET request here to load a patient's profile
    @GetMapping("/{id}")
    public Patient getPatient(@PathVariable Long id) {
        // If the patient exists, return them. Otherwise, return null (for now).
        return patientService.getPatientById(id).orElse(null);
    }
}
