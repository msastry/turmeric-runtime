/*******************************************************************************
 * Copyright (c) 2006-2010 eBay Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/
package org.ebayopensource.turmeric.runtime.common.impl.internal.markdown;

import com.ebay.kernel.markdown.MarkdownStateSnapshot;
import com.ebay.kernel.markdown.simple.SimpleMarkdownState;

/**
 * @author ichernyshev
 */
public abstract class SOABaseMarkdownState<I extends SOABaseMarkdownStateId>
	extends SimpleMarkdownState<I>
{
	protected SOABaseMarkdownState(SOABaseMarkdownStateManager mgr, I id) {
		super(mgr, id);
	}

	protected SOABaseMarkdownState(SOABaseMarkdownStateManager mgr, I id,
		MarkdownStateSnapshot<I> modelState)
	{
		super(mgr, id);
	}
}
