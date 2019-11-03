package com.bb.standard;

import com.bb.standard.bean.dto.UserDTO;
import com.bb.standard.bean.entity.User;
import org.junit.Test;

public class WithouContextTest {


    @Test
    public  void convertToUser(){

        UserDTO userDTO = getUserDto();
        User user = userDTO.convert();
        System.out.println(user);

    }


    public  void convertTODto(){
        User user = getUser();
        UserDTO userDTO = new UserDTO();
        System.out.println(userDTO.convertFor(user));
    }







    private static  User getUser(){
        User user = new User();
        user.setUsername("bb");
        user.setEmail("bbintheforest@gamil.com");
        user.setPassword("pass");
        return user;
    }

    private static UserDTO getUserDto(){
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername("CC");
        userDTO.setEmail("random@qq.com");
        return userDTO;
    }

}
