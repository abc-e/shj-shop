package io.shj.shop.bean;

import io.shj.shop.utils.id.SnowFlakeFactory;
import io.shj.shop.utils.psswd.PasswordUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = -1L;

    private Long id;
    private String userName;
    private String password;
    private String phone;
    private String address;

//    public User(){
//        this.id = SnowFlakeFactory.getSnowFlakeFromCache().nextId();
//        //默认密码
//        this.password = PasswordUtils.getPassword("12345");
//    }

}
