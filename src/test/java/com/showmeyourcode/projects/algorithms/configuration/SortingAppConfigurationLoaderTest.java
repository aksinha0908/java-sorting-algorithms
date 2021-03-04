package com.showmeyourcode.projects.algorithms.configuration;

import com.showmeyourcode.projects.algorithms.exception.CannotLoadAppPropertiesException;
import com.showmeyourcode.projects.algorithms.model.SortingAppConfiguration;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortingAppConfigurationLoaderTest {

    @Test
    void should_loadAppSettings_when_fileExists() throws CannotLoadAppPropertiesException {
        var expectedConfig = new SortingAppConfiguration(1000, 10000);
        SortingAppConfigurationLoader classUnderTest = new SortingAppConfigurationLoader("application.properties");
        var config = classUnderTest.getConfig();

        assertEquals(expectedConfig, config);
    }
}
