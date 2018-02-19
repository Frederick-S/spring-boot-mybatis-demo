package springboot.mybatis.mappers;

import org.apache.ibatis.annotations.Mapper;
import springboot.mybatis.models.Book;

@Mapper
public interface BookMapper {
    Book findByPrimaryKey(Integer id);
}
