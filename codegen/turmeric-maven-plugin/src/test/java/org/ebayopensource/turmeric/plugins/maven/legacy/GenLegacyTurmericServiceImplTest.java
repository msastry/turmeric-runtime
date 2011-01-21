/*******************************************************************************
 * Copyright (c) 2006-2010 eBay Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/
package org.ebayopensource.turmeric.plugins.maven.legacy;

import org.ebayopensource.turmeric.plugins.maven.BaseGenImplMojoTestCase;
import org.ebayopensource.turmeric.plugins.maven.GenImplMojo;
import org.junit.Test;

public class GenLegacyTurmericServiceImplTest extends BaseGenImplMojoTestCase {

	@Override
	public String getTestMojoDirName() {
		return "legacy/SampleTurmericServiceV1Impl";
	}

	@Test
	public void testLegacyGenImpl() throws Exception {
		GenImplMojo mojo = createMojo();
		testProjectExecuteMojo(mojo);
		assertPostCodegenRules(mojo);
	}
}
