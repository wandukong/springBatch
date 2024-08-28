package springbatch.batch.chunk.processor;

import org.modelmapper.ModelMapper;
import org.springframework.batch.item.ItemProcessor;
import springbatch.batch.domain.Product;
import springbatch.batch.domain.ProductVO;


public class FileItemProcessor implements ItemProcessor<ProductVO, Product> {

    @Override
    public Product process(ProductVO item) throws Exception {

        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(item, Product.class);
    }
}
