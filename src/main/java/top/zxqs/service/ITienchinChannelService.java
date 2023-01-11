package top.zxqs.service;

import top.zxqs.dao.TienchinChannel;

import java.util.List;

public interface ITienchinChannelService {
    List<TienchinChannel> selectTienchinChannelList(TienchinChannel channel);
}
