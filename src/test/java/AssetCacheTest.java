import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

@RunWith(PowerMockRunner.class)
@PrepareForTest(AssetCache.class)
public class AssetCacheTest
{
  private static Map<String, String> myHash;

  @Before public void setUp()
  {
    myHash = new HashMap<>();
    myHash.put("10", "20");
  }

  @Test public void testGet()
  {
    Whitebox.setInternalState(AssetCache.class, "hash", myHash);
    final String s = AssetCache.get("10");
    assertEquals("20", s);
  }
}
