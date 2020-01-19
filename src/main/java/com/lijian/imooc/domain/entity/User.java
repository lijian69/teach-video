package com.lijian.imooc.domain.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author jian.li
 * @date 2020年 01月19日 17:27:56
 */

@Entity
@Data
@NoArgsConstructor
public class User {

    /**
     * 用户id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * 账户密码
     */
    @Column(nullable = false)
    private String password;

    /**
     * 邮箱
     */
    @Column(nullable = false, unique = true)
    private String email;

    /**
     * 账户昵称
     */
    @Column(nullable = true, unique = true)
    private String nickName;

    /**
     * 注册时间
     */
    @Column(nullable = false)
    private String createTime;

    /**
     * 状态
     */
    private int status;



}
