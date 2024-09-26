package com.demo.ServiceImpl;
import java.util.List;
import com.demo.Entity.order;
import com.demo.Service.orderService;
import com.demo.dao.orderdao;
public class orderServiceImpl {

	
	public class OrderServiceImpl implements orderService {

	    private final orderdao orderDao;

	    
	    public OrderServiceImpl(orderdao orderDao) {
	        this.orderDao = orderDao;
	    }

	    @Override
	    public void saveOrder(order order) {
	        // Business logic can be added here if needed
	        orderDao.saveOrder(order);
	    }

	    @Override
	    public order getOrder(Long orderId) {
	        // Business logic can be added here if needed
	        return orderDao.getOrder(orderId);
	    }

	    @Override
	    public void updateOrder(order order) {
	        // Business logic can be added here if needed
	        orderDao.updateOrder(order);
	    }

	    @Override
	    public void deleteOrder(Long orderId) {
	        // Business logic can be added here if needed
	        orderDao.deleteOrder(orderId);
	    }

	    @Override
	    public List<order> getAllOrders() {
	        // Business logic can be added here if needed
	        return orderDao.getAllOrders();
	    }
	}

}
