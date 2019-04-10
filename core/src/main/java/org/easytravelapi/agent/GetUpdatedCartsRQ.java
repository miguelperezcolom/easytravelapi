package org.easytravelapi.agent;

import java.util.ArrayList;
import java.util.List;

public class GetUpdatedCartsRQ  {
    private String userId;

    private List<CartList> cartList =  new ArrayList<CartList>();

    public String getUserId() { return userId; }

    public void setUserId(String userId) { this.userId = userId; }

    public List<CartList> getCartList() { return cartList; }

    public void setCartList(List<CartList> cartList) { this.cartList = cartList; }
}
