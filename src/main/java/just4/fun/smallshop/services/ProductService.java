package just4.fun.smallshop.services;

import just4.fun.smallshop.model.product.Product;
import zinjvi.service.Service;

import java.util.List;

/**
 * Created by zinchenko on 18.01.15.
 */
public interface ProductService extends Service<Product, Long> {

    List<Product> getBySubCategoryId(Long subCategoryId);

}
