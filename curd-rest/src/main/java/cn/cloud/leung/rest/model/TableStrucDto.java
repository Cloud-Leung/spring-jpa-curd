package cn.cloud.leung.rest.model;

import lombok.Data;
import lombok.ToString;

/**
 * Created by liang.q on 2018/3/28.
 */
@Data
@ToString
public class TableStrucDto {

    private long size;

    private String tableName;

    private String field;

    private String fieldType;

    public TableStrucDto() {
    }

    public TableStrucDto(long size, String tableName, String field, String fieldType) {
        this.size = size;
        this.tableName = tableName;
        this.field = field;
        this.fieldType = fieldType;
    }
}
