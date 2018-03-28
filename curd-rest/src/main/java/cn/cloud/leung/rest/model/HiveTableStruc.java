package cn.cloud.leung.rest.model;

import cn.cloud.leung.rest.util.UUIDHexGenerator;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * hive表结构
 * Created by liang.q on 2017/9/21.
 */
@Setter
@Getter
@Table(name = "bi_data_hive_table_struc")
@Entity
public class HiveTableStruc implements Comparable<HiveTableStruc> {

    public HiveTableStruc() {
    }

    public HiveTableStruc(String tableName, String field, String fieldType, int indexNo) {
        this.id = UUIDHexGenerator.generate();
        this.tableName = tableName;
        this.field = field;
        this.fieldType = fieldType;
        this.indexNo = indexNo;
    }

    @Id
    private String id;

    private String tableName;

    private String field;

    private String fieldType;

    private int indexNo;

    @Override
    public String toString() {
        return "BiDataHiveTableStruc{" + "id='" + id + '\'' + ", tableName='" + tableName + '\'' + ", field='" + field + '\'' + ", fieldType=" + fieldType
               + ", indexNo=" + indexNo + '}' + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HiveTableStruc struc = (HiveTableStruc) o;

        if (indexNo != struc.indexNo) return false;
        if (id != null ? !id.equals(struc.id) : struc.id != null) return false;
        if (tableName != null ? !tableName.equals(struc.tableName) : struc.tableName != null) return false;
        if (field != null ? !field.equals(struc.field) : struc.field != null) return false;
        return fieldType == struc.fieldType;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (tableName != null ? tableName.hashCode() : 0);
        result = 31 * result + (field != null ? field.hashCode() : 0);
        result = 31 * result + (fieldType != null ? fieldType.hashCode() : 0);
        result = 31 * result + indexNo;
        return result;
    }

    @Override
    public int compareTo(HiveTableStruc o) {
        return this.getIndexNo() < o.getIndexNo() ? -1 : 1;
    }
}
