package service;

import model.Car;
import model.RepairOrder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public enum RepairOrderService {

    INSTANCE;

    private List<RepairOrder> orders = new ArrayList<>();

    private static long NEXT_ID = 1000;

    public void addOrder(RepairOrder repairOrder) {
        repairOrder.setId(NEXT_ID++);
        repairOrder.setDateAdded(LocalDateTime.now());
        repairOrder.setDateTaken(LocalDateTime.now());
        orders.add(repairOrder);
    }

    public List <RepairOrder> getOrders (){
        return orders;
    }


}