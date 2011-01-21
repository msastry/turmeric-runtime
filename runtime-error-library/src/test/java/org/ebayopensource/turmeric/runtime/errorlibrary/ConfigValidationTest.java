/*******************************************************************************
 * Copyright (c) 2006-2010 eBay Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/
package org.ebayopensource.turmeric.runtime.errorlibrary;

import org.ebayopensource.turmeric.junit.AbstractTurmericTestCase;
import org.ebayopensource.turmeric.runtime.config.validation.ConfigAsserts;
import org.junit.Test;

/**
 * Test to verify the sanity of the Configurations found in the test resources.
 */
public class ConfigValidationTest extends AbstractTurmericTestCase {
    @Test
    public void testProjectConfigs() {
        ConfigAsserts.assertConfigsValid();
    }
}
