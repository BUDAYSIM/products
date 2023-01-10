package com.product.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
 import java.util.List;
 import java.util.Map;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "ProductInfo")
public class Product {

    @Transient
    public static final String SEQUENCE_NAME = "user_sequence";

    @Id
    private int productId;
 
    private String productType;
    
    private String productName;

    private String category;

    private double price;

    private String description;

}
