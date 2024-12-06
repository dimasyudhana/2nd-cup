package service;

import java.math.BigDecimal;

import pojo.CashAccount;
import repository.TradeAccountRepository;

public class CashAccountService implements TradeAccountService {
    
    private TradeAccountRepository repository;

    public CashAccountService(TradeAccountRepository repository) {
        this.repository = repository;
    }

    public void create(CashAccount tradeAccount) {
        this.repository.create(tradeAccount);
    }

    public CashAccount get(String id) {
        return (CashAccount)this.repository.get(id);
    }

    public void update(CashAccount tradeAccount) {
        this.repository.update(tradeAccount);
    }

    public void delete(String id) {
        this.repository.delete(id);
    }

    @Override
    public void deposit(String id, BigDecimal amount) {
        CashAccount account = get(id);
        account.setCashBalance(account.getCashBalance().add(amount));
        update(account);
    }

    @Override
    public void withdraw(String id, BigDecimal amount) {
        CashAccount account = get(id);
        account.setCashBalance(account.getCashBalance().subtract(amount));
        update(account);
    }

}
