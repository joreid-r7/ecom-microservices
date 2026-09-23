/***************************************************************************
 * COPYRIGHT (C) 2012-2026, Rapid7 LLC, Boston, MA, USA.
 * All rights reserved. This material contains unpublished, copyrighted
 * work including confidential and proprietary information of Rapid7.
 **************************************************************************/
package com.ecommerce.order.client;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import com.ecommerce.order.dto.ProductResponse;

@HttpExchange
public interface ProductServiceClient {

    @GetExchange("/api/products/{id}")
    ProductResponse getProductDetails(@PathVariable String id);
}
