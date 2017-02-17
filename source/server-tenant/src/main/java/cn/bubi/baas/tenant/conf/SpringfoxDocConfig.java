package cn.bubi.baas.tenant.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;

import com.google.common.base.Predicate;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.or;
import static com.google.common.collect.Lists.newArrayList;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
@ComponentScan("cn.bubi")
public class SpringfoxDocConfig {
    @Value("${spring.application.name}")
    String appTitle;
    @Value("${application.formatted-version}")
    String version;
    @Value("${spring.application.develper}")
    String developer;
    @Bean
    public Docket demoApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .genericModelSubstitutes(DeferredResult.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(false)
                .select()
                .paths(petstorePaths())
                .build()
                .apiInfo(demoApiInfo());
    }
    private Predicate<String> petstorePaths() {
        return or(
                regex("/api.*")
                );
    }
    private ApiInfo demoApiInfo() {
        Contact contact = new Contact(developer, "http://bubi.cn", developer);
        ApiInfo apiInfo = new ApiInfo(appTitle,//大标题
                appTitle,//小标题
                version,//版本
                "",
                contact,//作者
                appTitle,//链接显示文字
                ""//网站链接
        );
        return apiInfo;
    }
}