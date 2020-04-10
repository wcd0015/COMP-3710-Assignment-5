package com.example.moneymanagment;

public interface IDataAccess {
    public Balance loadBalance(double bal);
    public double saveBalance(Balance balance);
}