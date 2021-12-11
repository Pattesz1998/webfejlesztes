package webapp.web.repository;

import webapp.web.model.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductTypeRepository extends JpaRepository<ProductType, Long> {

}