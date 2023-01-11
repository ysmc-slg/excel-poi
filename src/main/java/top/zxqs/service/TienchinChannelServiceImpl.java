package top.zxqs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zxqs.dao.TienchinChannel;
import top.zxqs.mapper.TienchinChannelMapper;

import javax.validation.Validator;
import java.util.List;

/**
 * @Author: zxq
 * @date: 2023-01-05 16:26
 */
@Service
public class TienchinChannelServiceImpl implements ITienchinChannelService {
    @Autowired
    private TienchinChannelMapper tienchinChannelMapper;
    @Autowired
    protected Validator validator;

    @Override
    public List<TienchinChannel> selectTienchinChannelList(TienchinChannel channel) {
        return tienchinChannelMapper.selectTienchinChannelList(channel);
    }
}
