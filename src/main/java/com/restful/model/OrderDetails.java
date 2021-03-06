package com.restful.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * OrderDetails generated by hbm2java
 */
@Entity
@Table(name = "OrderDetails")
public class OrderDetails implements java.io.Serializable {

	private int orderDetailId;
	private Orders orders;
	private Products products;
	private int quantity;

	public OrderDetails() {
	}

	public OrderDetails(int orderDetailId, Orders orders, Products products, int quantity) {
		this.orderDetailId = orderDetailId;
		this.orders = orders;
		this.products = products;
		this.quantity = quantity;
	}

	@Id

	@Column(name = "OrderDetailID", unique = true, nullable = false)
	public int getOrderDetailId() {
		return this.orderDetailId;
	}

	public void setOrderDetailId(int orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "OrderID", nullable = false)
	public Orders getOrders() {
		return this.orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ProductID", nullable = false)
	public Products getProducts() {
		return this.products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	@Column(name = "Quantity", nullable = false)
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
