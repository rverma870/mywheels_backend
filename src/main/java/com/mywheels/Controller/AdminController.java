package com.mywheels.Controller;

import java.util.List;

import com.mywheels.Helper.Test;
import com.mywheels.Model.Product;
import com.mywheels.Model.User;
import com.mywheels.Service.ProductService;
import com.mywheels.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class AdminController {
    
    @Autowired
    ProductService productService;

    @Autowired
    UserService userService;

    @Autowired
    Test test;

    @GetMapping("/admin/all" )
    public List<Product> getAlProducts(){
        return productService.getAllProduct();
    }

    @GetMapping("admin/user/getAll")
    public ResponseEntity<List<User>> getAllUser(){
        return ResponseEntity.ok().body(userService.getAllUsers());
    }
    

    @GetMapping("/product/test")
    public void getsdfAllUser(){
      System.out.println(test.getAccesskey() + " this is access key");
    }
}
