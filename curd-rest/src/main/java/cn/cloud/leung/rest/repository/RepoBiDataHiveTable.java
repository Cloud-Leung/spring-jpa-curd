package cn.cloud.leung.rest.repository;

import cn.cloud.leung.rest.model.HiveTable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by liang.q on 2018/3/28.
 */
public interface RepoBiDataHiveTable extends JpaRepository<HiveTable, String> {

}
