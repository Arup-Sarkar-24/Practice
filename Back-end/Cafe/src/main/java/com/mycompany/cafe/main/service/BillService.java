package com.mycompany.cafe.main.service;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.mycompany.cafe.main.POJO.Bill;

public interface BillService {

	ResponseEntity<String> generatedReport(Map<String, Object> requestMap);

	ResponseEntity<List<Bill>> getBills();

	ResponseEntity<byte[]> getPdf(Map<String, Object> requestMap);

	ResponseEntity<String> deleteBill(Integer id);

}
