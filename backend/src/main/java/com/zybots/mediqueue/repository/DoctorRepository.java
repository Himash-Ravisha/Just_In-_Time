package com.zybots.mediqueue.repository;

import com.zybots.mediqueue.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
