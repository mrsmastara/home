package com.youtube.play.client.local;

import com.smartgwt.client.types.ListGridFieldType;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.grid.ListGrid;
import com.smartgwt.client.widgets.grid.ListGridField;
import com.smartgwt.client.widgets.layout.HLayout;


public class YouTubePlay extends Canvas {

 

  public YouTubePlay() {
	  setWidth100();
	  setHeight100();
	  HLayout layout = new HLayout();
	  layout.setWidth100();
	  layout.setHeight100();
	  ListGrid grid = new ListGrid();
	  ListGridField f = new ListGridField();
	  f.setType(ListGridFieldType.TEXT);
	  grid.setFields(f);
	  layout.addMember(grid);
	  addChild(layout);
  }
   

}
