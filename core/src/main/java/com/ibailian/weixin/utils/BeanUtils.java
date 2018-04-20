package com.ibailian.weixin.utils;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.text.SimpleDateFormat;
import java.util.Map;


/**
 * 
* @ClassName: BeanUtils
* @Description: TODO(Map转对象  商品详情页可用)
* @author YiFei.Lu
* @date 2016年11月24日 上午11:28:56
*
 */
public class BeanUtils {
	
	private static SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	private static final Logger logger = LoggerFactory.getLogger(BeanUtils.class);
	/**
	 * 
	* @Title: converyToJavaBean
	* @Description: TODO(将一个Map装成javaBean GoodsBasicInfoTo)
	* @author YiFei.Lu
	* @param @param data
	* @param @param c
	* @param @return    设定文件
	* @return T    返回类型
	* @throws
	* @date 2016年11月24日 上午11:30:16
	 */
	public static <T> Object converyGoodsBasicInfoToJavaBean(Class<T> type, Map<String, Object> map) {
		Object obj = null;
		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(type); // 获取类属性
			obj = type.newInstance();

			// 给 JavaBean 对象的属性赋值
			PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
			for (int i = 0; i < propertyDescriptors.length; i++) {
				PropertyDescriptor descriptor = propertyDescriptors[i];
				String propertyName = descriptor.getName();

				if (map.containsKey(propertyName)) {
					//待补全 2018-04-12
					if (StringUtils.equals(propertyName, "brand")) {
						if (null != map.get(propertyName)) {
							Map maps = (Map) map.get(propertyName);
							Object[] args = new Object[1];
							args[0] = "";

							descriptor.getWriteMethod().invoke(obj, args);
						}

					} else {
						// 下面一句可以 try 起来，这样当一个属性赋值失败的时候就不会影响其他属性赋值。
						Object value = null;
						try {
							value = map.get(propertyName);
						} catch (Exception e) {
							logger.error("------>",e);
						}

						Object[] args = new Object[1];
						args[0] = value;

						descriptor.getWriteMethod().invoke(obj, args);
					}
				}
			}
		} catch (Exception e) {
			logger.error("------>",e);
		}
		return obj;
	}
}
