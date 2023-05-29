# 基于 Spring-cloud-alibaba 的商城项目


> 项目总体结构

各模块的说明如下所示：

- shj-shop：Maven 父工程。
  - shop-bean：各服务都会使用的 JavaBean 模块，包含实体类、Dto、Vo 等 JavaBean.
  - shop-utils：各服务都会使用的工具类模块.
  - shop-user：用户微服务，监听的端口为 8060.
  - shop-product：商品微服务，监听的端口为 8070.
  - shop-order：订单微服务，监听的端口为 8090.
  - shop-gateway：网关微服务，监听的端口为 8100.

## TODO(202306)
- [x] Nacos 注册中心
- [ ] Jmeter压测
- [ ] slb软件负载均衡
- [x] open-Fegin实现RPC调用
- [ ] 服务容错
- [ ] 实现限流
- [ ] 网关
- [ ] 链路追踪
- [ ] RocketMQ
- [ ] Nacos 配置中心
- [ ] 分布式事务Seata

