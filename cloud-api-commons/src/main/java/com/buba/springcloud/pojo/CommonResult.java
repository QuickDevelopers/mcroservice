package com.buba.springcloud.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T data;

    //private int serverPort;


    public CommonResult(Integer code, String message) {
        this(code,message,null);
    }

}
