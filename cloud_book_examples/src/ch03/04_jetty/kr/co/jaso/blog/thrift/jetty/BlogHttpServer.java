package kr.co.jaso.blog.thrift.jetty;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.mortbay.jetty.Connector;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.nio.SelectChannelConnector;
import org.mortbay.jetty.webapp.WebAppContext;
import org.mortbay.thread.QueuedThreadPool;

public class BlogHttpServer {
  private Server webServer;
  private Connector listener;
  private WebAppContext webAppContext;
  private Logger logger = Logger.getLogger(this.getClass());
  
  public BlogHttpServer(String webContextPath, int port) throws IOException {
    listener = new SelectChannelConnector();
    listener.setPort(port);

    webServer = new Server();
    webServer.addConnector(listener);
    webServer.setThreadPool(new QueuedThreadPool());

    File userDir = new File(System.getProperty("user.dir"));
    logger.debug("userDir:"+userDir);
    logger.debug("userDir.getCanonicalPath:"+userDir.getCanonicalPath());
    
    webAppContext = new WebAppContext(webContextPath, "/");
    webAppContext.setDefaultsDescriptor(userDir.getCanonicalPath() + "/" + webContextPath + "/etc/webdefault.xml");
    webAppContext.addServlet(BlogServlet.class, "/blog");
    
    webServer.addHandler(webAppContext);
  }

  public void start() throws IOException {
    try {
      listener.open();
      webServer.start();
    } catch (Exception e) {
      throw new IOException("Error BlogHttpServer", e);
    }
  }
}
