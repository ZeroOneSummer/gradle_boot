package cn.aurora.dao.pojo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created by pijiang on 2020/5/2.
 */
@Data
public class BaseEntity {
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
