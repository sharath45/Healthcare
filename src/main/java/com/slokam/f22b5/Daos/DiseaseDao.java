package com.slokam.f22b5.Daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.f22b5.healthcare.Disease;
@Repository
public interface DiseaseDao extends JpaRepository<Disease, Integer> {

}
