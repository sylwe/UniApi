//package com.swlodyga.pgsSpringBoot.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@EnableResourceServer
//public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
//    @Autowired
//    private ResourceServerTokenServices tokenServices;
//
//    @Value("${security.jwt.resource-ids}")
//    private String resourceIds;
//
//    @Override
//    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
//        resources.resourceId(resourceIds).tokenServices(tokenServices);
//    }
//
//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http
//                .requestMatchers()
//                .and()
//                .authorizeRequests()
//                .antMatchers("/actuator/**", "/api-docs/**").permitAll()
//                .antMatchers("/springjwt/**" ).authenticated();
//    }
//}