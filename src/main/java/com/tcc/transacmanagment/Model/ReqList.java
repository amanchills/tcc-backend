package com.tcc.transacmanagment.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "Reqlist")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ReqList {
    @Id
    @GeneratedValue
    Integer reqId;
    String reqName;
    String payType;
    Integer reqPrice;
    Date addedDate;


}
