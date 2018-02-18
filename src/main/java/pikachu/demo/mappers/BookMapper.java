package pikachu.demo.mappers;

import org.apache.ibatis.annotations.Mapper;
import pikachu.demo.models.Book;

@Mapper
public interface BookMapper {
    Book findByPrimaryKey(Integer id);
}
