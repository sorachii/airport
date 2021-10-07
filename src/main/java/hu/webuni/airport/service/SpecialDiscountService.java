package hu.webuni.airport.service;

import org.springframework.stereotype.Service;

@Service
public class SpecialDiscountService implements DiscountService {

    @Override
    public int getDiscountPercent(int totalPrice) {
        return totalPrice > 10000 ? 15 : 10;
    }
}
