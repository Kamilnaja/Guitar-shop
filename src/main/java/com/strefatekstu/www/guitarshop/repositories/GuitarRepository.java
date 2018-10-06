package com.strefatekstu.www.guitarshop.repositories;

import com.strefatekstu.www.guitarshop.models.Guitar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuitarRepository extends JpaRepository<Guitar, Integer> {

}
