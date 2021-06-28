import java.util.HashMap;
import java.util.Map;

public class AssetCache
{
  private static Map<String, String> hash = new HashMap<>();

  public static String get(String id)
  {
    return hash.get(id);
  }
}
