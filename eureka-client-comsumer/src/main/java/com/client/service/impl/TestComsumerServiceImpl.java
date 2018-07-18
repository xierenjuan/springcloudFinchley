package com.client.service.impl;

import com.client.service.TestComsumerService;
import org.springframework.stereotype.Service;

@Service
public class TestComsumerServiceImpl implements TestComsumerService {
    @Override
    public String get(String value) {
        return value;
    }
}
