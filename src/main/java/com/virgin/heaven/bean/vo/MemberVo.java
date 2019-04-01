package com.virgin.heaven.bean.vo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class MemberVo implements Serializable {
    private static final long serialVersionUID = -8752074091028411074L;
    private String memberPhone;
    private String memberName;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
}
