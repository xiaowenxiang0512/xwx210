package com.xwx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.xwx.mapper.DemoMapper;
import com.xwx.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	private DemoMapper mapper;
	
}
