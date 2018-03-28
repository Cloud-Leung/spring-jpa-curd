package cn.cloud.leung.rest.model;

import cn.cloud.leung.rest.util.UUIDHexGenerator;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.List;

/**
 * hive 表
 * Created by liang.q on 2017/9/21.
 */
@Getter
@Setter
@Table(name = "bi_data_hive_table")
@Entity
public class HiveTable {
    public HiveTable() {
    }

    public HiveTable(String tableName, long size) {
        this.id = UUIDHexGenerator.generate();
        this.tableName = tableName;
        this.size = size;
    }

    @Id
    private String id;

    @NotEmpty(message = "表名称不能为空!")
    private String tableName;

    private long size;

    @Transient
    private List<HiveTableStruc> strucList;

    @Override
    public String toString() {
        return "BiDataHiveSpace{" + "id='" + id + '\'' + ", tableName='" + tableName + '\'' + ", size=" + size + '}' + super.toString();
    }
}
