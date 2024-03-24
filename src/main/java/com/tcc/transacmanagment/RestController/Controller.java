package com.tcc.transacmanagment.RestController;

import com.tcc.transacmanagment.Dao.MenuRepo;
import com.tcc.transacmanagment.Dao.PurchaseRepo;
import com.tcc.transacmanagment.Dao.ReqDao;
import com.tcc.transacmanagment.Dao.SaleDao;
import com.tcc.transacmanagment.Model.Menu;
import com.tcc.transacmanagment.Model.PurchaseRecord;
import com.tcc.transacmanagment.Model.ReqList;
import com.tcc.transacmanagment.Model.SaleRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tcc")
@CrossOrigin("*")
public class Controller {
    @Autowired
    MenuRepo menuRepo;

    @Autowired
    ReqDao reqDao;

    @Autowired
    SaleDao saleDao;

    @Autowired
    PurchaseRepo purchaseRepo;

    @GetMapping ("getMenu")
    List<Menu> getMenu(){
        return menuRepo.findAll();
    }
    @GetMapping ("getReq")
    List<ReqList> getReq(){
        return reqDao.findAll();
    }
    @PostMapping("addSale")
    ResponseEntity<SaleRecord> addSale(@RequestBody SaleRecord saleRecord){
        return new ResponseEntity<>(saleDao.save(saleRecord), HttpStatus.OK);
    }

    @PostMapping("addPurchase")
    ResponseEntity<PurchaseRecord> addPurchase(@RequestBody PurchaseRecord purchaseRecord){
        return new ResponseEntity<>(purchaseRepo.save(purchaseRecord), HttpStatus.OK);
    }
    @PostMapping ("/addMenu")
    Menu addMenu(@RequestBody Menu menu){
        return menuRepo.save(menu);
    }

}
