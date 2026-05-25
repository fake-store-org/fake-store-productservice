package se.jensen.johanna.fakestoreproductservice.dto;


import java.util.List;

public record ProductBatchResponse(
    List<ProductDTO> products
) {

}

