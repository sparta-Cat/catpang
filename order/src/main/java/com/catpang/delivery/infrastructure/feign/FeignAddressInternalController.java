package com.catpang.delivery.infrastructure.feign;

import java.util.UUID;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.catpang.core.application.dto.AddressDto;
import com.catpang.core.application.response.ApiResponse;
import com.catpang.core.presentation.controller.AddressInternalController;

@FeignClient(name = "address-service")
public interface FeignAddressInternalController extends AddressInternalController {

	@GetMapping("/api/v1/internal/address/{id}")
	ApiResponse<AddressDto.Result> getAddress(@PathVariable UUID id);
}

