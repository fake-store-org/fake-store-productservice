package se.jensen.johanna.fakestoreproductservice.controller;

import java.util.Set;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.jensen.johanna.fakestoreproductservice.dto.ProductBatchResponse;
import se.jensen.johanna.fakestoreproductservice.service.ProductService;

@RestController
@RequestMapping("/api/internal/products")
@RequiredArgsConstructor
public class InternalProductController {

  private final ProductService productService;

  @PostMapping("/batch")
  public ResponseEntity<ProductBatchResponse> getProductBatch(@RequestBody Set<UUID> productIds) {
    return ResponseEntity.ok()
        .body(productService.getProductBatch(productIds));
  }

}
