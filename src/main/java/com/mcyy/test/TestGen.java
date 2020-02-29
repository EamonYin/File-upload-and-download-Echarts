package com.mcyy.test;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
/**
 * @Author XiaoMing
 * @create 2020/2/23 18:51
 * 利用genreatorConfig.xml逆向生成MyBatis
 */
public class TestGen {
    public static void main(String[] args) throws Exception {

        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        ConfigurationParser cp = new ConfigurationParser(warnings);
        //构造输入流对象
        InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("genreatorConfig.xml");
        Configuration config = cp.parseConfiguration(is);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }
}
