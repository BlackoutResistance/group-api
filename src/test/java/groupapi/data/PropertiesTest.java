package groupapi.data;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PropertiesTest {

    private Properties properties = new Properties("folder/properties.yml");
    private String stringVal = "value";
    private int intVal = 5;

    @Before
    public void setup() {
        properties.set("stringkey", stringVal);
        properties.set("intkey", intVal);
    }

    @Test
    public void newProperties() {
        assertNotNull(properties.getPath());
        assertNotNull(properties.getFile());
        assertNotNull(properties.getConfig());
    }

    @Test
    public void createFileWithPath() {
        Properties properties = new Properties();
        properties.createFile("folder/properties.yml");
        newProperties();
    }

    @Test
    public void createFile() {
        properties.createFile();
        newProperties();
    }

    @Test
    public void getProperty() {
        assertEquals(stringVal, properties.get("stringkey"));
        assertEquals(intVal, properties.get("intkey"));
    }

    @Test
    public void save() {
        properties.save();
    }

}