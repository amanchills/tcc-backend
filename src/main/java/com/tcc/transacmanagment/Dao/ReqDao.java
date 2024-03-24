package com.tcc.transacmanagment.Dao;

import com.tcc.transacmanagment.Model.ReqList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReqDao extends JpaRepository<ReqList, Integer> {
}
