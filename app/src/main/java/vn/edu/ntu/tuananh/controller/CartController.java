package vn.edu.ntu.tuananh.controller;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;


import vn.edu.ntu.tuananh.model.Product;

public class CartController extends Application implements ICartController
{
    ArrayList<Product> listProduct = new ArrayList<>();

    public CartController()
    {
        listProduct.add(new Product("Xoài cát", 60000, "Xoài cát Hòa lộc loại 1"));
        listProduct.add(new Product("Khoai lang", 45000, "Khoai lang tím giống Nhật"));
        listProduct.add(new Product("Me thái", 65000, "Me Thái lan nhập khẩu"));
        listProduct.add(new Product("Ổi", 60000, "Ổi chua"));
        listProduct.add(new Product("Mận tím", 50000, "Mận tím tây bắc"));
        listProduct.add(new Product("Táo đỏ", 60000, "Táo đỏ Mỹ"));
        listProduct.add(new Product("Sầu riêng Khánh Sơn", 90000, "Sầu riêng khánh sơn loại 1"));

    }

    @Override
    public ArrayList<Product> getListProduct() {
        return listProduct;
    }
}
