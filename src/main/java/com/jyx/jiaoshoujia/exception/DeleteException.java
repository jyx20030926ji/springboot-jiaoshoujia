package com.jyx.jiaoshoujia.exception;



import com.jyx.jiaoshoujia.iterface.MenuInterface;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DeleteException extends  RuntimeException{

    private Integer errorCode;

    private String errorMessage;


    public DeleteException(MenuInterface menuInterface)
    {
        this.errorMessage=menuInterface.getTextMessage();
        this.errorCode=menuInterface.getCodeMessage();
    }

    @Override
    public String toString() {
        return "DeleteException{" +
                "errorCode='" + errorCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}