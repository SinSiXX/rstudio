/*
 * TerminalPane.java
 *
 * Copyright (C) 2009-16 by RStudio, Inc.
 *
 * Unless you have received this program directly from RStudio pursuant
 * to the terms of a commercial license agreement with RStudio, then
 * this program is licensed to you under the terms of version 3 of the
 * GNU Affero General Public License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * AGPL (http://www.gnu.org/licenses/agpl-3.0.txt) for more details.
 *
 */

package org.rstudio.studio.client.workbench.views.terminal;

import org.rstudio.studio.client.workbench.ui.WorkbenchPane;

import com.google.gwt.user.client.ui.Widget;

public class TerminalPane extends WorkbenchPane
{
   protected TerminalPane(String title)
   {
      super(title);
      xterm_ = new XTermWidget();
   }

   @Override
   protected Widget createMainWidget()
   {
      return xterm_;
   }
   
   private final XTermWidget xterm_;
}
