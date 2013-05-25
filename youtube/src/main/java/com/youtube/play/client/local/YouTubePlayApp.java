package com.youtube.play.client.local;
import org.jboss.errai.ioc.client.api.AfterInitialization;
import org.jboss.errai.ioc.client.api.EntryPoint;

import com.google.gwt.user.client.ui.RootPanel;

@EntryPoint
public class YouTubePlayApp {


  private YouTubePlay youTubePlayUI;

  /**
   * Builds the UI and populates the member list by making an RPC call to the server.
   * <p>
   * Note that because this method performs an RPC call to the server, it is annotated
   * with AfterInitialization rather than PostConstruct: the contract of PostConstruct
   * only guarantees that all of <em>this</em> bean's dependencies have been injected,
   * but it does not guarantee that the entire runtime environment has completed its
   * bootstrapping routine. Methods annotated with the Errai-specific AfterInitialization
   * are only called once everything is up and running, including the communication
   * channel to the server.
   */
  @AfterInitialization
  public void createUI() {
	  youTubePlayUI = new YouTubePlay();    
    RootPanel.get("youTubeApp").add(youTubePlayUI);
  }
  

}
