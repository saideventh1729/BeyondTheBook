package com.example.demo.controller;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Money;
import com.example.demo.service.IMoneyService;

import io.swagger.annotations.Api;



@Api(value = "Swagger2DemoRestController")
@RestController
public class MoneyController {
	@Autowired
	private IMoneyService imoneyservice;
	// get all money details
	@GetMapping("/money")
	public ResponseEntity getAllMoney (){
		return ResponseEntity.ok().body(imoneyservice.getAllMoney());
	}
	
	@GetMapping("/money/{moneyId}")
	public ResponseEntity getMoney (@PathVariable Integer moneyId){
		return ResponseEntity.ok().body(imoneyservice.getMoney(moneyId));
	}
	
	@DeleteMapping("/delete/{moneyId}")
	public HttpStatus deleteMoney(@PathVariable Integer moneyId) {
		 this.imoneyservice.removeMoney(moneyId);
		 return HttpStatus.OK;
		
	}
	
	@PostMapping("/addmoney")
	public ResponseEntity<Money> addMoney(@RequestBody Money money) {
		return ResponseEntity.ok().body(this.imoneyservice.addMoney(money));
	}
	

	
	
	}


