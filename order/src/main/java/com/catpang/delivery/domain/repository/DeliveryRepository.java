package com.catpang.delivery.domain.repository;

import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.catpang.core.domain.repository.BaseRepository;
import com.catpang.delivery.domain.model.Delivery;

@Repository
public interface DeliveryRepository extends BaseRepository<Delivery, UUID, DeliverySearchCondition> {
	Page<Delivery> search(DeliverySearchCondition condition, Pageable pageable);

	Page<Delivery> findAllByOrderId(Pageable pageable, UUID orderId);

	Page<Delivery> findAllByOrderOwnerId(Pageable pageable, Long ownerId);

	Delivery findByIdAndOrderOwnerId(UUID deliveryId, Long userId);
}
