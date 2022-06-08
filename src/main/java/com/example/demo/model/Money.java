package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "money_table")

public class Money {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "monneyid")
	private Integer moneyId;
	@Column(name = "typeofinvestment")
	private String type;
	@Column(name = "amount")
	private double amount;
	@Column(name = "dateinvested")
	private LocalDate dateinvested;
	@Column(name = "description")
	private String description;
	@Column(name = "targetdate")
	private LocalDate targetdate;
	public Money(String type, double amount, LocalDate dateinvested, String description, LocalDate targetdate) {
		super();
		this.type = type;
		this.amount = amount;
		this.dateinvested = dateinvested;
		this.description = description;
		this.targetdate = targetdate;
	}
	public long getMoneyId() {
		return moneyId;
	}
	public void setMoneyId(Integer moneyId) {
		this.moneyId = moneyId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public LocalDate getDateinvested() {
		return dateinvested;
	}
	public void setDateinvested(LocalDate dateinvested) {
		this.dateinvested = dateinvested;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getTargetdate() {
		return targetdate;
	}
	public void setTargetdate(LocalDate targetdate) {
		this.targetdate = targetdate;
	}
	public Money() {
		super();
	}
	public Money(Integer moneyId, String type, double amount, LocalDate dateinvested, String description,
			LocalDate targetdate) {
		super();
		this.moneyId = moneyId;
		this.type = type;
		this.amount = amount;
		this.dateinvested = dateinvested;
		this.description = description;
		this.targetdate = targetdate;
	}
	
	
	
}
