package com.shop.accounts.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.accounts.service.TxrService;

@RestController
@RequestMapping(value = "/v1/api/txr")
public class TxrController {

	@Autowired
	private TxrService txrService;

	@PostMapping
	public TxrResponse doTxr(@RequestBody TxrRequest request) {
		txrService.txr(request.getAmount(), request.getFromAccNum(), request.getToAccNum());
		TxrResponse response = new TxrResponse();
		response.setStatus("Txr success");
		return response;
	}

}
