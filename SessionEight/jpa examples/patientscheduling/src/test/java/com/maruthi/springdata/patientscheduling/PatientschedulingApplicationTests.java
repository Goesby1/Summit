package com.maruthi.springdata.patientscheduling;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import com.maruthi.springdata.patientscheduling.entities.Room;

import com.maruthi.springdata.patientscheduling.repos.RoomRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientschedulingApplicationTests {
	@Autowired RoomRepository roomRepo;

	/*
	 * @Autowired DoctorRepository doctorRepository;
	 * 
	 * @Autowired PatientRepository patientRepository;
	 * 
	 * @Autowired AppointmentRepository appointmentRepository;
	 * 
	 * 
	 * @Test public void testCreateDoctor() { Doctor doctor = new Doctor();
	 * doctor.setFirstName("Maruthi"); doctor.setLastName("L");
	 * doctor.setSpeciality("All"); doctorRepository.save(doctor);
	 * //Iterable<Doctor> itr = doctorRepository.findAll();
	 * 
	 * 
	 * }
	 * 
	 * 
	 * 
	 * @Test public void testCreatePatient() {
	 * 
	 * Patient patient = new Patient(); patient.setFirstName("A");
	 * patient.setLastName("B"); patient.setPhone("444");
	 * 
	 * Insurance insurance = new Insurance();
	 * insurance.setProviderName("Blue Cross Blue Shield"); insurance.setCopay(20d);
	 * 
	 * patient.setInsurance(insurance);
	 * 
	 * Doctor doctor = doctorRepository.findOne(1L); List<Doctor> doctors =
	 * Arrays.asList(doctor); patient.setDoctors(doctors);
	 * 
	 * patientRepository.save(patient);
	 * 
	 * 
	 * }
	 */
	  
	/*
	 * @Ignore public void testCreateAppointment() {
	 * 
	 * Appointment appointment = new Appointment(); Timestamp appointmentTime = new
	 * Timestamp(new Date().getTime());
	 * appointment.setAppointmentTime(appointmentTime);
	 * appointment.setReason("I have a problem"); appointment.setStarted(true);
	 * 
	 * appointment.setPatient(patientRepository.findOne(1l));
	 * appointment.setDoctor(doctorRepository.findOne(1L));
	 * 
	 * appointmentRepository.save(appointment); }
	 */
	@Test
	public void testRoomRepo()
	{
		Room r = new Room();
		r.setRoomNum(258);
		r.setBedType("queen");
		r.setSmoking('s');
		r.setRate(100);
		r.setOccupantName("Not Occupied.");
		r.setOccupied(false);
		roomRepo.save(r);
	}
}







