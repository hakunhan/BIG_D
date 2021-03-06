package sqa.hanu_minimart.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table (name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "INT(4) UNSIGNED ", precision = 4, updatable = false)
    private int id;
    @Column(length = 50)
    private String name;
    @Column(precision = 8, scale = 2)
    private Double price;
    @Column(columnDefinition = "INT(4) UNSIGNED")
    private int quantity;
    @Column(length = 16)
    private String category;
    @Lob
    private String picture_URL;
    @Lob
    private String description;
    @Column(precision = 3, columnDefinition = "INT(3) UNSIGNED")
    private Integer sale;
    @Enumerated(EnumType.STRING)
    @Column(length = 3)
    private ProductStatus status;
    @Column(nullable = false, updatable = false, insertable = false,
            columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime importDate;
    @Column(columnDefinition = "TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private LocalDateTime updateAt;
    private LocalDate expireDate;

    public Product(String name, double price, int quantity, String category,
                   LocalDate expireDate) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
        this.expireDate = expireDate;
        //Add default value for description
        this.description = "This product does not have description";
    }

    public Product(String name, double price, int quantity, String category,
                   LocalDate expireDate, String description) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
        this.expireDate = expireDate;
        this.description = description;
    }
    
    public Product(String name, double price, int quantity, String category,
                   LocalDate expireDate, String picture_URL, String description) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
        this.expireDate = expireDate;
        this.picture_URL = picture_URL;
        this.description = description;
    }

    public Product() {

    }

    public Product(String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPicture_URL() {
        return picture_URL;
    }

    public void setPicture_URL(String picture_URL) {
        this.picture_URL = picture_URL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    public ProductStatus getProductStatus() {
        return status;
    }

    public void setProductStatus(ProductStatus status) {
        this.status = status;
    }

    public LocalDateTime getImportDate() {
        return importDate;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", category='" + category + '\'' +
                ", picture_URL='" + picture_URL + '\'' +
                ", description='" + description + '\'' +
                ", sale=" + sale +
                ", status=" + status +
                ", importDate=" + importDate +
                ", updateAt=" + updateAt +
                ", expireDate=" + expireDate +
                '}';
    }

}
