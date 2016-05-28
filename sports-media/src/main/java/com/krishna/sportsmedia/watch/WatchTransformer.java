package com.krishna.sportsmedia.watch;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

public class WatchTransformer extends AbstractMessageTransformer {

	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding)
			throws TransformerException {
		// TODO Auto-generated method stub
		
		 Path dir = Paths.get("C:/Krishna/watch");
	        try {
	        	WatchDir watchDir = new WatchDir(dir, true);
	        	
	        	watchDir.processEvents();
	        	
	        	logger.info(watchDir.getKeys());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return null;
	}

}
