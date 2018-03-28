package cn.cloud.leung.rest.service;

import cn.cloud.leung.rest.model.HiveTable;
import cn.cloud.leung.rest.model.TableStrucDto;

import java.util.List;

/**
 * Created by liang.q on 2018/3/28.
 */
public interface HiveTableService {

    HiveTable findOne(String id);

    List<TableStrucDto> queryDto(String id);
}
