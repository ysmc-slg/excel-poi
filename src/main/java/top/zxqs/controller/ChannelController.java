package top.zxqs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import top.zxqs.utils.ExcelUtil;
import top.zxqs.dao.TienchinChannel;
import top.zxqs.service.ITienchinChannelService;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Author: zxq
 * @date: 2023-01-05 16:20
 */
@RestController
public class ChannelController {
    @Autowired
    private ITienchinChannelService channelService;

    @GetMapping("/channelList")
    public List<TienchinChannel> channelList(TienchinChannel channel){


        List<TienchinChannel> channelList = channelService.selectTienchinChannelList(channel);

        return channelList;
    }

    @PostMapping("/importTemplate")
    public void importTemplate(HttpServletResponse response) {
        ExcelUtil<TienchinChannel> util = new ExcelUtil<TienchinChannel>(TienchinChannel.class);
        util.importTemplateExcel(response, "渠道数据");
    }

    @PostMapping("/export")
    public void export(HttpServletResponse response, TienchinChannel user) {
        List<TienchinChannel> list = channelService.selectTienchinChannelList(user);
        ExcelUtil<TienchinChannel> util = new ExcelUtil<TienchinChannel>(TienchinChannel.class);
        util.exportExcel(response, list, "渠道数据");
    }

    @PostMapping("/importData")
    public String importData(MultipartFile file, boolean updateSupport) throws Exception {
        ExcelUtil<TienchinChannel> util = new ExcelUtil<TienchinChannel>(TienchinChannel.class);
        List<TienchinChannel> userList = util.importExcel(file.getInputStream());
//        String operName = getUsername();
//        String message = userService.importUser(userList, updateSupport, operName);
        return "df";
    }
}
