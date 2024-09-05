package org.example.repository;

import org.example.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

    @Query(value = "SELECT * FROM mysql.product u WHERE u.id =:orderId", nativeQuery = true)
//    List<User> findAllActiveUsersNative();
/*    @Query(
            nativeQuery = true,
            value = "SELECT pr.id, pr.name, pr.description, pr.price, pr.imageURl " +
                    "FROM mysql.product pr join mysql.orders or ON or.id = pr.id WHERE pr.id =:orderID"
    )*/


    Optional<Product> findProductByOrderId(@Param("orderId") int orderId);

/*    @Query(value = "SELECT * FROM mysql.product", nativeQuery = true)
    Optional<List<Product>> findAllProducts();*/


}
