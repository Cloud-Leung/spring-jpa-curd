package cn.cloud.leung.rest.repository;

import cn.cloud.leung.rest.model.HiveTableStruc;
import cn.cloud.leung.rest.model.TableStrucDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by liang.q on 2018/3/28.
 */
public interface RepoBiDataHiveTableStruc extends JpaRepository<HiveTableStruc, String> {

    @Query(value = "SELECT NEW cn.cloud.leung.rest.model.TableStrucDto(ta.size, st.tableName, st.field, st.fieldType) FROM HiveTable ta , HiveTableStruc st  WHERE  ta.tableName = st.tableName and ta.id = ?1")
    List<TableStrucDto> queryDto(String id);

}
