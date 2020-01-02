package com.imaginedragons.believer.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2020-01-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "es_student",type = "student", shards = 5, replicas = 0)
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
     @TableId(value="id",type = IdType.AUTO)//设置ID自增
     @Id
     @Field(type = FieldType.Integer)
    private Integer id;
    @Field(type = FieldType.Keyword)
    private String name;
    @Field(type=FieldType.Keyword)
    private String sex;
    @Field(type = FieldType.Integer)
    private Integer age;
    @Field(type=FieldType.Text,analyzer = "ik_smart")
    private String book;
    @Field(type=FieldType.Text,analyzer = "ik_smart")
    private String address;


}
