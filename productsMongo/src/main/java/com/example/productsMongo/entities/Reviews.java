package com.example.productsMongo.entities;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@ToString

public class Reviews {

    private String userName;
    private String reviewContent;
}
