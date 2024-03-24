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
@Table(name = "purchase_record")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseRecord {
    @Id
    @GeneratedValue
    Integer seqNo;
    Integer reqId;
    String reqName;
    Integer reqPrice;
    String payType;
    Date addedDate;
}
