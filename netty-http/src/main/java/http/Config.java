package http;

/**
 * Created by i311352 on 2/13/2017.
 */
public class Config {
    public Integer getBacklog() {
        return 128;
    }

    public Integer getPort() {
        return 9999;
    }

    public Integer getClientMaxBodySize() {
        return 1024*1024*10;
    }

    public Integer getTaskThreadPoolSize() {
        return 30;
    }

    public Integer getEventLoopThreadCount() {
        return 1;
    }
}
