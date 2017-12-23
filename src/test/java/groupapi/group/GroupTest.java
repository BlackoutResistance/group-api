package groupapi.group;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GroupTest {

    private final String groupName = "groupname";
    private Group group = new Group(groupName);

    @Test
    public void newGroup() {
        assertNotNull(group);
        assertEquals(groupName, group.getName());
    }

    @Test
    public void getName() {
        assertEquals(groupName, group.getName());
    }

}