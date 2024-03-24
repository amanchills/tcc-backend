package com.tcc.transacmanagment.Dao;

import com.tcc.transacmanagment.Model.SaleRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleDao extends JpaRepository<SaleRecord, Integer> {

}
