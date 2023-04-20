# 基于 Spring-cloud-alibaba 的商城项目


> 项目总体结构

各模块的说明如下所示：

- shj-shop：Maven 父工程。
- shop-bean：各服务都会使用的 JavaBean 模块，包含实体类、Dto、Vo 等 JavaBean.
- shop-utils：各服务都会使用的工具类模块.
- shop-order：订单微服务，监听的端口为 9010.
- shop-product：商品微服务，监听的端口为 9020.
- shop-user：用户微服务，监听的端口为 9030.

