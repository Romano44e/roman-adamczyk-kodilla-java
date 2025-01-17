package com.kodilla.patterns.strategy.predictors;

public sealed interface BuyPredictor permits ConservativePredictor, AggresivePredictor, BalancedPredictor {

    String predictWhatToBuy();

}
