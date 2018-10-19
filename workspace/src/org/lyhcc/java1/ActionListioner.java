package org.lyhcc.java1;

import java.awt.event.ActionEvent;
import java.util.EventListener;

public interface ActionListioner extends EventListener{
	public abstract void actionPerformed(ActionEvent e);
}
