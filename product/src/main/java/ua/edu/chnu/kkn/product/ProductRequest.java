package ua.edu.chnu.kkn.product;

import java.math.BigDecimal;

public record ProductRequest(String name, String description, BigDecimal price) {
}
