package com.tcc.transacmanagment.Dao;

import com.tcc.transacmanagment.Model.PurchaseRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepo extends JpaRepository<PurchaseRecord, Integer> {
}
