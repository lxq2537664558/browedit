package com.exnw.browedit;


import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.exnw.browedit.grflib.GrfLib;
import com.exnw.browedit.grflib.gui.MainFrame;

public class BrowEdit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Opening GRFs");
		long l = System.currentTimeMillis();
		GrfLib.addGrf("C:\\Users\\Borf\\AppData\\Local\\Ragray\\rdata.grf");
		GrfLib.addGrf("C:\\Users\\Borf\\AppData\\Local\\Ragray\\data.grf");
		System.out.println("Bench: " + (System.currentTimeMillis() - l));
		

		try {
		    // Set System L&F
	        UIManager.setLookAndFeel(
	            UIManager.getSystemLookAndFeelClassName());
	    } 
	    catch (UnsupportedLookAndFeelException e) {
	       // handle exception
	    }
	    catch (ClassNotFoundException e) {
	       // handle exception
	    }
	    catch (InstantiationException e) {
	       // handle exception
	    }
	    catch (IllegalAccessException e) {
	       // handle exception
	    }
		new MainFrame();
		
	}

}
