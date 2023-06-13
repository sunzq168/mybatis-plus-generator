package com.sun.zq;

import com.github.davidfantasy.mybatisplus.generatorui.GeneratorConfig;
import com.github.davidfantasy.mybatisplus.generatorui.MybatisPlusToolsApplication;
import com.github.davidfantasy.mybatisplus.generatorui.mbp.NameConverter;

/**
 * @author: sunzheng
 * @date: 2023-06-13
 * @description:
 */
public class GeneratorMain {
    public static void main(String[] args) {
        GeneratorConfig config = GeneratorConfig.builder()
                .jdbcUrl("jdbc:mysql://106.14.65.203:3306/test?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8")
                .userName("root")
                .password("Vspn@root123!")
                .driverClassName("com.mysql.cj.jdbc.Driver")
                // 如果需要修改各类生成文件的默认命名规则，可自定义一个NameConverter的实现类,覆盖相应的名称转换方法
                .nameConverter(new NameConverter() {
                    // 自定义Service类文件名规则
                    @Override
                    public String serviceNameConvert(String entityName) {
                        return this.entityNameConvert(entityName) + "Service";
                    }

                    // 自定义Controller类文件名规则
                    @Override
                    public String controllerNameConvert(String entityName) {
                        return NameConverter.super.controllerNameConvert(entityName + "Controller");
                    }
                })
                .basePackage("com.sun.zq.mapper")
                //.tablePrefix("t_")
                //.tableName("t_user")
                .port(8080)
                .build();
        MybatisPlusToolsApplication.run(config);


    }
}
