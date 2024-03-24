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
@Table(name = "sale_record")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SaleRecord {
    @Id
    @GeneratedValue
    Integer seqNo;
    Integer itemId;
    String itemName;
    Integer itemPrice;
    String payType;
    Date addedDate;
}
