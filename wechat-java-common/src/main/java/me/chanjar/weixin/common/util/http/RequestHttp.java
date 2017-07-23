package me.chanjar.weixin.common.util.http;

import me.chanjar.weixin.common.util.HttpType;

/**
 * Created by ecoolper on 2017/4/22.
 */
public interface RequestHttp<H, P> {

  /**
   * 返回httpClient
   *
   */
  H getRequestHttpClient();

  /**
   * 返回httpProxy
   *
   */
  P getRequestHttpProxy();

  HttpType getRequestType();

}
