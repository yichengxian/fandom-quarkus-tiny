package com.j2boot.fandom.biz.dao.account;

import io.quarkus.mongodb.panache.MongoEntity;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.time.LocalDate;
import java.time.LocalDateTime;

@MongoEntity(collection = "account_entity")
public class AccountEntity extends PanacheMongoEntity {

    /**
     * 账户名
     */
    @BsonProperty("accountName")
    private String accountName;

    /**
     * 密码
     */
    @BsonProperty("password")
    private String password;

    /**
     * 昵称
     */
    @BsonProperty("nickName")
    private String nickName;

    /**
     * 头像
     */
    @BsonProperty("avatar")
    private String avatar;


    /**
     * 生日
     */
    private LocalDate birthDate;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 性别 女 0 男 1
     */
    @BsonProperty("gender")
    private Integer gender;

    /**
     *  用户状态 0 禁用 1启用
     */
    @BsonProperty("status")
    private Integer status;



}
