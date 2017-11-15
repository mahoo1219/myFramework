package org.mahoo.framework;
/**
 * 提供相关配置项常量
 */
public interface ConfigConstant {
    String CONFIG_FILE = "properties";

    String JDBC_DRIVER = "myFramework.jdbc.driver";
    String JDBC_URL = "myFramework.jdbc.url";
    String JDBC_USERNAME = "myFramework.jdbc.username";
    String JDBC_PASSWORD = "myFramework.jdbc.password";

    String APP_BASE_PACKAGE = "myFramework.app.base_package";
    String APP_JSP_PATH = "myFramework.app.jsp_path";
    String APP_ASSET_PATH = "myFramework.app.asset_path";
    String APP_UPLOAD_LIMIT = "myFramework.app.upload_limit";
}
