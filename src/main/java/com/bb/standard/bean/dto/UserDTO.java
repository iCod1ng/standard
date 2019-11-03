package com.bb.standard.bean.dto;

import com.bb.standard.bean.entity.User;
import com.google.common.base.Converter;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class UserDTO {
    private String username;

    private String email;



    /**
     * DTO转换
     * @return
     */
    public User convert(){
        UserDTOConvert userDTOConvert = new UserDTOConvert();
        User user = userDTOConvert.convert(this);
        return user;
    }

    public UserDTO convertFor(User user){
        UserDTOConvert userDTOConvert = new UserDTOConvert();
        UserDTO userDTO = userDTOConvert.reverse().convert(user);
        return userDTO;
    }



    private static class  UserDTOConvert extends Converter<UserDTO, User>{
        @Override
        protected User doForward(UserDTO userDTO) {

            User user = new User();
            BeanUtils.copyProperties(userDTO,user);
            return user;
        }

        @Override
        protected UserDTO doBackward(User user) {
            UserDTO userDTO = new UserDTO();
            BeanUtils.copyProperties(user,userDTO);
            return userDTO;
        }
    }
}
