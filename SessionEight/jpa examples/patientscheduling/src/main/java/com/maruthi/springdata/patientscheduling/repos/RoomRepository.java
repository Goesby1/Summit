package com.maruthi.springdata.patientscheduling.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.maruthi.springdata.patientscheduling.entities.Room;


public interface RoomRepository extends CrudRepository<Room, Long> {

}

