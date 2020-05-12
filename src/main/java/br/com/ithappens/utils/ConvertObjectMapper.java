package br.com.ithappens.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class ConvertObjectMapper {
    private static ObjectMapper objectMapper = new ObjectMapper();

    public static String convertToString(Object object){

        String string = null;
        try {
            string = objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return string;
    }

    public static String convertListToString(List<Object> list){
        String string = null;
        for (Object object : list)
            string += convertToString(object);

        return string;
    }
}
