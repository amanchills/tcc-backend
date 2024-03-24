package com.tcc.transacmanagment.Dao;

import com.tcc.transacmanagment.Model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepo extends JpaRepository<Menu, Integer> {
}
