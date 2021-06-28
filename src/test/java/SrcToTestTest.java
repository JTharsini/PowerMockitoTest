import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(AssetCache.class)
public class SrcToTestTest
{
  SrcToTest srcToTest = new SrcToTest();

  @Test public void testSrcMethodToTest()
  {
    PowerMockito.mockStatic(AssetCache.class);
    PowerMockito.when(AssetCache.get("10")).thenReturn("20");
    final String s = srcToTest.srcMethodToTest("10");
    assertEquals("20*", s);
  }
}
