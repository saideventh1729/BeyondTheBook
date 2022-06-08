package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.exception.ModelAddException;
import com.example.demo.exception.ModelEmptyListException;
import com.example.demo.exception.ModelNotFoundException;
import com.example.demo.model.Money;
import com.example.demo.repository.IMoney;

@Service
@Transactional
public class IMoneyServiceImpl implements IMoneyService{
	
	@Autowired
	private IMoney i;

	@Override
	public Money addMoney(Money money) {
		// TODO Auto-generated method stub
		return i.save(money);
	}

	@Override
	public void removeMoney(Integer moneyId) {
		// TODO Auto-generated method stub
		i.deleteById(moneyId);
		
	}

	@Override
	public List<Money> getAllMoney() {
		// TODO Auto-generated method stub
		return i.findAll();
	}

	@Override
	public Money updateMoney(Money money, Integer moneyId) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("deprecation")
	@Override
	public Money getMoney(Integer moneyId) {
		return i.getById(moneyId);

		// TODO Auto-generated method stub
		
	}



	
}