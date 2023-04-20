-- haha.shop_user definition

CREATE TABLE `shop_user` (
                             `id` bigint unsigned NOT NULL AUTO_INCREMENT,
                             `user_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                             `password` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                             `phone` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                             `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                             `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
                             `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                             PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- haha.shop_product definition

CREATE TABLE `shop_product` (
                                `id` bigint unsigned NOT NULL AUTO_INCREMENT,
                                `pro_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                                `pro_price` decimal(10,2) DEFAULT NULL,
                                `pro_stock` int unsigned DEFAULT NULL,
                                `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
                                `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                                PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- haha.shop_order definition

CREATE TABLE `shop_order` (
                              `id` bigint unsigned NOT NULL AUTO_INCREMENT,
                              `user_id` bigint DEFAULT NULL,
                              `user_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                              `phone` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                              `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                              `total_price` decimal(10,2) DEFAULT NULL,
                              `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
                              `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                              PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- haha.shop_order_item definition

CREATE TABLE `shop_order_item` (
                                   `id` bigint unsigned NOT NULL AUTO_INCREMENT,
                                   `order_id` bigint DEFAULT NULL,
                                   `pro_id` bigint DEFAULT NULL,
                                   `pro_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                                   `pro_price` decimal(10,2) DEFAULT NULL,
                                   `number` int unsigned DEFAULT NULL,
                                   `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
                                   `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                                   PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;