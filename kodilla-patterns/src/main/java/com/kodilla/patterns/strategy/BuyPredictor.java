package com.kodilla.patterns.strategy;

public sealed interface BuyPredictor permits ConservativePredictor, AggresivePredictor, BalancedPredictor {

    String predictWhatToBuy();

}
