package top.zxqs.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.zxqs.dao.TienchinChannel;

import java.util.List;

@Mapper
public interface TienchinChannelMapper {
    List<TienchinChannel> selectTienchinChannelList(TienchinChannel channel);
}
