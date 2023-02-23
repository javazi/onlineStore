package com.example.onlinestore.controller;

import com.example.onlinestore.api.ProductApi;
import com.example.onlinestore.business.ProductBusiness;
import com.example.onlinestore.entity.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(ProductApi.url)
@AllArgsConstructor
@Slf4j
public class ProductController implements ProductApi {
    private ProductBusiness productBusiness;

    //
    //private final static Logger LOGGER = LoggerFactory.getLogger(ProductImplController.class.getName());
    @Override
    public ResponseEntity<ProductEntity> create(ProductEntity product) {
        ProductEntity productEntity = productBusiness.create(product);
        return new ResponseEntity<ProductEntity>(productEntity, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ProductEntity> update(ProductEntity product) {
        ProductEntity productEntity = productBusiness.update(product);
        return new ResponseEntity<ProductEntity>(productEntity, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> delete(Long id) {
        String deleteMessage = productBusiness.deleteById(id);
        return new ResponseEntity<String>(deleteMessage, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ProductEntity> find(Long id) {
        ProductEntity productEntity = productBusiness.findById(id);
        return new ResponseEntity<ProductEntity>(productEntity, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<ProductEntity>> findAll() {
        List<ProductEntity> allProducts = productBusiness.findAll();
        return new ResponseEntity<>(allProducts, HttpStatus.OK);
    }
}
