package app.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.domain.entity.ItemPedido;

public interface ItemsPedido extends JpaRepository<ItemPedido, Integer> {
}
