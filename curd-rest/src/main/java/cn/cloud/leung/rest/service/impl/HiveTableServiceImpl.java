package cn.cloud.leung.rest.service.impl;

import cn.cloud.leung.rest.model.HiveTable;
import cn.cloud.leung.rest.model.TableStrucDto;
import cn.cloud.leung.rest.repository.RepoBiDataHiveTable;
import cn.cloud.leung.rest.repository.RepoBiDataHiveTableStruc;
import cn.cloud.leung.rest.service.HiveTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by liang.q on 2018/3/28.
 */
@Service("hiveTableService")
public class HiveTableServiceImpl implements HiveTableService {

    @Resource
    private RepoBiDataHiveTable repoBiDataHiveTable;

    @Resource
    private RepoBiDataHiveTableStruc repoBiDataHiveTableStruc;

    @Override
    public HiveTable findOne(String id) {
        return repoBiDataHiveTable.findOne(id);
    }

    @Override
    public List<TableStrucDto> queryDto(String id) {
        return repoBiDataHiveTableStruc.queryDto(id);
    }
}
