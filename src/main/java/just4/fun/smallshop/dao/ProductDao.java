package just4.fun.smallshop.dao;

import just4.fun.smallshop.api.dto.ProductSearchDto;
import just4.fun.smallshop.model.Test;
import just4.fun.smallshop.model.product.Product;
import zinjvi.repository.Repository;

import java.util.List;

/**
 * Created by zinchenko on 21.01.15.
 */
public interface ProductDao extends Repository<Product, Long> {

    List<Product> getBySubCategoryId(Long subCategoryId);

    List<Product> getBySubCategoryIdAndAttrValueId(Long subCategoryId, Long attributeValueId);

    List<Product> findByIds(List<Long> ids);

    List<Product> search(ProductSearchDto productSearchDto);

}
