package cn.hongmao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cn.jasonone.him.annotation.EnableHim;

@SpringBootApplication
@MapperScan("cn.hongmao.mapper")
@EnableHim
public class RecruitWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecruitWebsiteApplication.class, args);
	}

}