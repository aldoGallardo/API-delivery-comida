package pe.edu.upao.apideliverycomida.models;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order {
    private String id;
    private String customerName;
    private String customerEmail;
    private String status;
    private LocalDateTime creationTime;
    private LocalDateTime estimatedDeliveryTime;
    private ArrayList<Food> items;

    public Order() {
    }
    public Order(String id, String customerName, String customerEmail, String status, LocalDateTime creationTime, LocalDateTime estimatedDeliveryTime, ArrayList<Food> items) {
        this.id = id;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.status = status;
        this.creationTime = creationTime;
        this.estimatedDeliveryTime = estimatedDeliveryTime;
        this.items = items;
    }

    public Order(String id, String status, LocalDateTime creationTime, LocalDateTime estimatedDeliveryTime, ArrayList<Food> items) {
        this.id = id;
        this.status = status;
        this.creationTime = creationTime;
        this.estimatedDeliveryTime = estimatedDeliveryTime;
        this.items = items;
    }

    public String getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public LocalDateTime getEstimatedDeliveryTime() {
        return estimatedDeliveryTime;
    }

    public ArrayList<Food> getItems() {
        return items;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public void setEstimatedDeliveryTime(LocalDateTime estimatedDeliveryTime) {
        this.estimatedDeliveryTime = estimatedDeliveryTime;
    }

    public void setItems(ArrayList<Food> items) {
        this.items = items;
    }
}
